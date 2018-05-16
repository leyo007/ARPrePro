/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvie;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Leonardo
 */
@Stateless
public class MdcvieFacade extends AbstractFacade<Mdcvie> implements MdcvieFacadeLocal {
    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdcvieFacade() {
        super(Mdcvie.class);
    }

    @Override
    public boolean guardarDatos(Mdcvie x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new MDCV Info Entrenador "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean modificarDatos(Mdcvie x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar MDCV Info Entrenador "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public Mdcvie buscarXpersona(int x) {
        try{
            return (Mdcvie) em.createQuery("SELECT ie FROM Mdcvie ie WHERE ie.persona.iddep  =:x")
                    .setParameter("x", x)
                    .getSingleResult();
        }catch(Exception e){
            
            System.out.println("Error al buscar Inf Entrenador de "+x+" error"+e.getMessage());
            return new Mdcvie();
        }
    }
    
}
