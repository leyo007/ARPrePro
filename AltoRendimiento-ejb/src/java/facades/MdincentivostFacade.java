/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdincentivost;
import entities.Mdpersonast;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdincentivostFacade extends AbstractFacade<Mdincentivost> implements MdincentivostFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdincentivostFacade() {
        super(Mdincentivost.class);
    }

    @Override
    public boolean guardarDatos(Mdincentivost x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new Persona "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean modificarDatos(Mdincentivost x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar Persona "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public Mdincentivost buscaXpersona(Mdpersonast p) {
        
        System.out.println("Perosna incentivo join: "+p.getIddep());
         try {
              return (Mdincentivost) em.createQuery("SELECT i FROM Mdincentivost i JOIN Mdpersonast p ON i.iddep=p.iddep AND i.iddep=:us")
                    .setParameter("us", p.getIddep())
                    
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Error, datos erroneos: " + e.getMessage());
            return new Mdincentivost();
        }
    }
    
}
