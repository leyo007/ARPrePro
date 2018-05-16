/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdusuariot;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdusuariotFacade extends AbstractFacade<Mdusuariot> implements MdusuariotFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdusuariotFacade() {
        super(Mdusuariot.class);
    }

    @Override
    public Mdusuariot findThisUser(String user, String pwd) {
        try {
              return (Mdusuariot) em.createQuery("SELECT u FROM Mdusuariot u WHERE u.usunombre =:us and u.usuclave =:pw")
                    .setParameter("us", user)
                    .setParameter("pw", pwd)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Error, datos erroneos: " + e.getMessage());
            return new Mdusuariot();
        }
    }
    
}
