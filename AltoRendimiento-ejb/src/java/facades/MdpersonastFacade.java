/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdpersonast;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdpersonastFacade extends AbstractFacade<Mdpersonast> implements MdpersonastFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdpersonastFacade() {
        super(Mdpersonast.class);
    }

    @Override
    public boolean guardarDatos(Mdpersonast x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new Persona "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean modificarDatos(Mdpersonast x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar Persona "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public List<Mdpersonast> findByPerfil(int x) {
        try {
              return  em.createQuery("SELECT p from Mdpersonast p WHERE p.idcreador =:x")
                      .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré las personas del perfil: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean findById(String x) {
       
        try {
               em.createQuery("SELECT p FROM Mdpersonast p WHERE p.depcedula =:us")
                    .setParameter("us", x)                    
                    .getSingleResult();
               return true;
               
        } catch (Exception e) {
            System.out.println("Error, deportista no registrado: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Mdpersonast> findByCodFed(int x) {
        try {
              return  em.createQuery("SELECT p from Mdpersonast p WHERE p.federacion =:x")
                      .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré las personas de la federación: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Mdpersonast findById(int x) {
        try {
              return (Mdpersonast) em.createQuery("SELECT p from Mdpersonast p WHERE p.iddep =:x")
                      .setParameter("x", x)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Error, no encontré las personas del registro IESS: "+x+" Error: " + e.getMessage());
            return new Mdpersonast();
        }
    }
    
     
  
    
}
