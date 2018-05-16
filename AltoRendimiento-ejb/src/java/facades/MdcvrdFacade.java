/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvrd;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Leonardo
 */
@Stateless
public class MdcvrdFacade extends AbstractFacade<Mdcvrd> implements MdcvrdFacadeLocal {
    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdcvrdFacade() {
        super(Mdcvrd.class);
    }

    @Override
    public boolean guardarDatos(Mdcvrd x) {
       try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new MDCV Resultados Deportios "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean modificarDatos(Mdcvrd x) {
         try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar MDCV Resultados Deportios "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public List<Mdcvrd> getListByPersona(int x) {
        try {
              return em.createQuery("SELECT rd FROM Mdcvrd rd WHERE rd.persona=:us")
                    .setParameter("us", x)                   
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, filtro lista Historico Entrenadores: " + e.getMessage());
            return null;
        }
    }
    
}
