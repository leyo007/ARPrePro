/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import beans.SessionBean;
import java.io.IOException;
import java.util.ResourceBundle;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Admin
 */
@ManagedBean
@NoneScoped
public class Renderizador {
    private ExternalContext externalContext;

    /**
     * Creates a new instance of Renderizador
     */
    public Renderizador() {
    }

    /**
     * Verifica el estado de la sesion de usuario.
     *
     * @return el estado
     * @throws IOException
     */
    public boolean validarEstado(String Apellido) throws IOException {
        boolean obj = true;
        try {
            ExternalContext contexto = FacesContext.getCurrentInstance().getExternalContext();
            //SesionController sesion = (SesionController) contexto.getSessionMap().get("sesionController");
            HttpSession session = SessionBean.getSession();
            String strPathContext = ((ServletContext) contexto.getContext()).getContextPath();
            strPathContext = strPathContext + "/login.jsf";            
            //entidadesControladores entidades=new En;
            System.out.println("contexto-->" +contexto);
            System.out.println("sessiooon-->" +session);
            System.out.println("url link-->" + strPathContext);
            //System.out.println("valida el usuario autenticado--->" + session.);
            System.out.println("usuario 2-->" +Apellido);
            if (session != null) {
                if (!Apellido.equals("")) {
                    obj = false;
                } else {
                    contexto.redirect(strPathContext);
                }
            } else {
                contexto.redirect(strPathContext);
            }
        } catch (Exception e) {
            System.out.println("Errorrrrrrr");
            System.err.println("Eror al intentar redireccionar:");
            cerrarSesion();
        }
        return obj;
    }
    
    /**
     * Redirecciona al inicio
     *
     * @throws IOException
     */
    public void cerrarSesion() throws IOException {
        ExternalContext contexto = FacesContext.getCurrentInstance().getExternalContext();
        String strPathContext = ((ServletContext) contexto.getContext()).getContextPath();
        strPathContext = strPathContext + "/";
         try {
            //contexto.getSessionMap().remove("sesionController");
            HttpSession session = SessionBean.getSession();
            session.invalidate();
            contexto.redirect(strPathContext);

        } catch (IOException e) {
            System.err.println("Error:" + e.getMessage());
            contexto.redirect(strPathContext);
        }
    }
    public void reload() throws IOException {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
    }
    public void irAInicio() throws IOException {
        ExternalContext contexto = FacesContext.getCurrentInstance().getExternalContext();
        String strPathContext = ((ServletContext) contexto.getContext()).getContextPath();
        
        System.out.println("contexto: "+contexto);
        System.out.println("strPathContext: "+strPathContext);
        
        try {
            contexto.redirect(strPathContext);
        } catch (IOException e) {
            System.err.println("Error:" + e.getMessage());
            contexto.redirect(strPathContext + "/");
        }
    }

    public String getTiempoMonitor() {
        String strTiempo = "60000";//valor por defecto  consulta  de Configuracion.ConfiguracionGeneral
        try {
            ResourceBundle recurso = ResourceBundle.getBundle("Configuracion.ConfiguracionGeneral");
            strTiempo = recurso.getString("tiempoSesion");
        } catch (Exception e) {
            System.err.println("Error al obtener el Tiempo de duracion de sesion:" + e.getMessage());
        }
        return strTiempo;
    }

    public ExternalContext getExternalContext() {
        FacesContext context = FacesContext.getCurrentInstance();
        externalContext = context.getExternalContext();
        return externalContext;
    }

    public void setExternalContext(ExternalContext externalContext) {
        this.externalContext = externalContext;
    }
    
}
