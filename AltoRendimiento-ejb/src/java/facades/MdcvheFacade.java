/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvhe;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Leonardo
 */
@Stateless
public class MdcvheFacade extends AbstractFacade<Mdcvhe> implements MdcvheFacadeLocal {
    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdcvheFacade() {
        super(Mdcvhe.class);
    }

    @Override
    public boolean guardarDatos(Mdcvhe x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new MDCV Historico Entrenador "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean modificarDatos(Mdcvhe x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar MDCV Historico Entrenador "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public List<Mdcvhe> getListByPersona(int x) {
        try {
              return em.createQuery("SELECT he FROM Mdcvhe he WHERE he.persona=:us")
                    .setParameter("us", x)                   
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, filtro lista Historico Entrenadores: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
}
