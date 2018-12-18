/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.CommunicationException;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.security.auth.login.AccountException;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;

public class ActiveDirectoryAuthentication {

	private static final String CONTEXT_FACTORY_CLASS = "com.sun.jndi.ldap.LdapCtxFactory";

	private String ldapServerUrls[];

	private int lastLdapUrlIndex;

	private final String domainName;

	public ActiveDirectoryAuthentication(String domainName) {
		this.domainName = domainName.toUpperCase();
                System.out.println("domainName: "+domainName);
		try {
			ldapServerUrls = nsLookup(domainName);
		} catch (Exception e) {
			                 System.out.println("Error al buscar usuario 1: "+e.getMessage());
		}
		lastLdapUrlIndex = 0;
	}

	public String authenticate(String username, String password) throws LoginException {
            System.out.println("");
		if (ldapServerUrls == null || ldapServerUrls.length == 0) {
			throw new AccountException("Unable to find ldap servers");
		}
		if (username == null || password == null || username.trim().length() == 0 || password.trim().length() == 0) {
			throw new FailedLoginException("Username or password is empty");
		}
		int retryCount = 0;
		int currentLdapUrlIndex = lastLdapUrlIndex;
		do {
			retryCount++;
			try {
				Hashtable<Object, Object> env = new Hashtable<Object, Object>();
				env.put(Context.INITIAL_CONTEXT_FACTORY, CONTEXT_FACTORY_CLASS);
				env.put(Context.PROVIDER_URL, ldapServerUrls[currentLdapUrlIndex]);
				env.put(Context.SECURITY_PRINCIPAL, username + "@" + domainName);
				env.put(Context.SECURITY_CREDENTIALS, password);
				DirContext ctx = new InitialDirContext(env);
				ctx.close();
				lastLdapUrlIndex = currentLdapUrlIndex;
				return "registrado";
			} catch (CommunicationException exp) {
				// TODO you can replace with log4j or slf4j API
                                System.out.println("Error al buscar usuario 2: "+exp.getMessage());
				// if the exception of type communication we can assume the AD
				// is not reachable hence retry can be attempted with next
				// available AD
				if (retryCount < ldapServerUrls.length) {
					currentLdapUrlIndex++;
					if (currentLdapUrlIndex == ldapServerUrls.length) {
						currentLdapUrlIndex = 0;
					}
					continue;
				}
				return "No Registrado";
			} catch (Throwable throwable) {
				System.out.println("Error al buscar usuarios 3: "+throwable.getMessage());
				return throwable.getMessage();
			}
		} while (true);
	}

	private static String[] nsLookup(String argDomain) throws Exception {
		try {
			Hashtable<Object, Object> env = new Hashtable<Object, Object>();
			env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.dns.DnsContextFactory");
			env.put("java.naming.provider.url", "dns:");
			DirContext ctx = new InitialDirContext(env);
			Attributes attributes = ctx
					.getAttributes(String.format("_ldap._tcp.%s", argDomain), new String[] { "srv" });
			// try thrice to get the KDC servers before throwing error
			for (int i = 0; i < 3; i++) {
				Attribute a = attributes.get("srv");
				if (a != null) {
					List<String> domainServers = new ArrayList<String>();
					NamingEnumeration<?> enumeration = a.getAll();
					while (enumeration.hasMoreElements()) {
						String srvAttr = (String) enumeration.next();
						// the value are in space separated 0) priority 1)
						// weight 2) port 3) server
						String values[] = srvAttr.toString().split(" ");
						domainServers.add(String.format("ldap://%s:%s", values[3], values[2]));
                                                for (String value : values) {
                                                    System.out.println("Valores: "+value);
                                                
                                            }
					}
					String domainServersArray[] = new String[domainServers.size()];
					domainServers.toArray(domainServersArray);
					return domainServersArray;
				}
			}
			throw new Exception("Unable to find srv attribute for the domain " + argDomain);
		} catch (NamingException exp) {
			throw new Exception("Error while performing nslookup. Root Cause: " + exp.getMessage(), exp);
		}
	}
}
    
