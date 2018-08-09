/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdhonorarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdhonorariosFacade extends AbstractFacade<Mdhonorarios> implements MdhonorariosFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdhonorariosFacade() {
        super(Mdhonorarios.class);
    }

    @Override
    public boolean modificarDatos(Mdhonorarios x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar Honorario "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean guardarDatos(Mdhonorarios x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new Honorario "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public List<Mdhonorarios> getListByCreator(int x) {
        
        try {
            return  em.createQuery("SELECT e from Mdhonorarios e WHERE e.creador =:x")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré los Honorarios de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }
    
}
