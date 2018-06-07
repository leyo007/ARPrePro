/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdevento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdeventoFacade extends AbstractFacade<Mdevento> implements MdeventoFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdeventoFacade() {
        super(Mdevento.class);
    }

    @Override
    public boolean guardarDatos(Mdevento x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new Evento "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public List<Mdevento> getListByCreator(int x) {
        try {
            return  em.createQuery("SELECT e from Mdevento e WHERE e.creador =:x")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré los Eventos de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean modificarDatos(Mdevento x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar Categoría Fucnional Deporte "+e.getMessage());
            return false;
            
        }

    }
    
}
