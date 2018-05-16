/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvfa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Leonardo
 */
@Stateless
public class MdcvfaFacade extends AbstractFacade<Mdcvfa> implements MdcvfaFacadeLocal {
    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdcvfaFacade() {
        super(Mdcvfa.class);
    }

    @Override
    public boolean guardarDatos(Mdcvfa x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new MDCV FOrmacion academica "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean modificarDatos(Mdcvfa x) {
         try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar MDCV Formacion academica "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public Mdcvfa buscarXpersona(int x) {
        try{
            return (Mdcvfa) em.createQuery("SELECT fa FROM Mdcvfa fa WHERE fa.persona.iddep  =:x")
                    .setParameter("x", x)
                    .getSingleResult();
        }catch(Exception e){
            
            System.out.println("Error al buscar Formación Académica de "+x+" error"+e.getMessage());
            return new Mdcvfa();
        }
    }
    
}
