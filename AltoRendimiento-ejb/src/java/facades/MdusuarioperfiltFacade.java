/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdusuarioperfilt;
import entities.Mdusuariot;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdusuarioperfiltFacade extends AbstractFacade<Mdusuarioperfilt> implements MdusuarioperfiltFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdusuarioperfiltFacade() {
        super(Mdusuarioperfilt.class);
    }

    @Override
    public Mdusuarioperfilt findThisUser(Mdusuariot u) {
        try {
              return (Mdusuarioperfilt) em.createQuery("SELECT u FROM Mdusuarioperfilt u WHERE u.idusuario =:us")
                    .setParameter("us", u)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Error, no encuentro UsuarioPerfil: " + e.getMessage());
            return new Mdusuarioperfilt();
        }
    }
    
}
