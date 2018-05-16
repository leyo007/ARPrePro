/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdperfilmodulot;
import entities.Mdperfilt;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdperfilmodulotFacade extends AbstractFacade<Mdperfilmodulot> implements MdperfilmodulotFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdperfilmodulotFacade() {
        super(Mdperfilmodulot.class);
    }

    @Override
    public Mdperfilmodulot findModulo(Mdperfilt x) {
        try {
              return (Mdperfilmodulot) em.createQuery("SELECT pm FROM Mdperfilmodulot pm WHERE pm.idperfil =:ip")
                      
                    .setParameter("ip", x)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Error, MdPerfilModuloT no encontrado con: "+x+" Error: " + e.getMessage());
            return new Mdperfilmodulot();
        }
    }
    
}
