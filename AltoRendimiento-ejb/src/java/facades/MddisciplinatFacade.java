/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mddeportest;
import entities.Mddisciplinat;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MddisciplinatFacade extends AbstractFacade<Mddisciplinat> implements MddisciplinatFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MddisciplinatFacade() {
        super(Mddisciplinat.class);
    }

    @Override
    public List<Mddisciplinat> findByDeporte(Mddeportest x) {
        try {
              return  em.createQuery("SELECT d from Mddisciplinat d WHERE d.iddeporte=:x")
                      .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré las diciplinas de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Mddisciplinat findSingleByDeporte(Mddeportest x) {
        try {
              return (Mddisciplinat) em.createQuery("SELECT d FROM Mddisciplinat d WHERE d.iddis =:us")
                    .setParameter("us", x)
                    
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Error, no se encuentra la diciplina: " + e.getMessage());
            return new Mddisciplinat();
        }
    }
    
}
