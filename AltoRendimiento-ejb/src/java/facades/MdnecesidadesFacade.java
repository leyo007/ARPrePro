/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdfederacion;
import entities.Mdnecesidades;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdnecesidadesFacade extends AbstractFacade<Mdnecesidades> implements MdnecesidadesFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdnecesidadesFacade() {
        super(Mdnecesidades.class);
    }

    @Override
    public boolean guardarDatos(Mdnecesidades x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new Necesidad "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public List<Mdnecesidades> getListByCreator(int x) {
        try {
            return  em.createQuery("SELECT n from Mdnecesidades n WHERE n.creador =:x")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré necesidades de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean modificarDatos(Mdnecesidades x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar Necesidades "+e.getMessage());
            return false;
            
        }

    }

    @Override
    public List<Mdnecesidades> getListByGral(int x) {
        System.out.println("getListByGral: "+x);
        try {
            return  em.createQuery("SELECT n from Mdnecesidades n WHERE n.padre =:x")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré necesidades individuales de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Mdnecesidades> getListByFede(int x) {
        System.out.println("getListByFede deporte: "+x);
        try {
            return  em.createQuery("SELECT n from Mdnecesidades n WHERE n.iddep =:x")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré necesidades individuales de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }
    MdfederacionFacade fede;
    @Override
    public List<Mdnecesidades> getListBySector(boolean x) {
        System.out.println("getListBySector S/N: "+x);
        String y="";
       if(x)
           y="CONVENCIONAL";
                   else
           y="DISCAPACIDAD";
        try {
            
                return em.createQuery("SELECT n from Mdnecesidades n WHERE n.sector =:x")
                    .setParameter("x", y)
                    .getResultList();
                    
            
            
            
        } catch (Exception e) {
            System.out.println("Error, no encontré necesidades del sector: "+x+" Error: " + e.getMessage());
            return null;
        }
    }
    
}
