/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvdp;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Leonardo
 */
@Stateless
public class MdcvdpFacade extends AbstractFacade<Mdcvdp> implements MdcvdpFacadeLocal {
    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdcvdpFacade() {
        super(Mdcvdp.class);
    }

    @Override
    public boolean guardarDatos(Mdcvdp x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new MDCV Info Socioeconomica "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean modificarDatos(Mdcvdp x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar MDCV Info Socioeconomica "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public Mdcvdp buscarXpersona(int x) {
        try{
            return (Mdcvdp) em.createQuery("SELECT dp FROM Mdcvdp dp WHERE dp.persona.iddep  =:x")
                    .setParameter("x", x)
                    .getSingleResult();
        }catch(Exception e){
            
            System.out.println("Error al buscar dp info socio ec de "+x+" error"+e.getMessage());
            return new Mdcvdp();
        }
    }
    
}
