/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdpersonast;
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
    
     
  
    
}
