/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdperfilt;
import entities.Mdusuariot;
import java.util.List;
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

    @Override
    public List<Mdusuariot> getUserByType(Mdperfilt x) {
        //By Perfil
        
        System.out.println("x: "+x.getIdperfil());
                
         try {
            //return  em.createQuery("SELECT u from Mdusuariot u join Mdusuarioperfilt pu on (u.idusuario=pu.idusuario) and pu.idperfil=:x")
            return  em.createQuery("SELECT u from Mdusuariot u left join Mdusuarioperfilt up where up.idperfil=:x ")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré usuarios con perfil de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }
    
}
