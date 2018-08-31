/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdmenut;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdmenutFacade extends AbstractFacade<Mdmenut> implements MdmenutFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdmenutFacade() {
        super(Mdmenut.class);
    }

    @Override
    public List<Mdmenut> getAllBymodulo(int m) {
         try {
              return  em.createQuery("SELECT m FROM Mdmenut m WHERE m.idmodulo =:pd")
                    .setParameter("pd",m)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré menus con módulo: "+ m+" Error: "+ e.getMessage());
            return null;
        }
    }

    @Override
    public List<Mdmenut> getAllBymoduloCoach(int m) {
        try {
              return  em.createQuery("SELECT m FROM Mdmenut m WHERE m.idmodulo =:pd and m.mennombre like '%Repositorio%'")
                    .setParameter("pd",m)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré menus con módulo: "+ m+" Error: "+ e.getMessage());
            return null;
        }
    }
    
}
