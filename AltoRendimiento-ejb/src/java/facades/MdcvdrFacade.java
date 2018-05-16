/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvdr;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Leonardo
 */
@Stateless
public class MdcvdrFacade extends AbstractFacade<Mdcvdr> implements MdcvdrFacadeLocal {
    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdcvdrFacade() {
        super(Mdcvdr.class);
    }

    @Override
    public boolean guardarDatos(Mdcvdr x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new MDCV Distinciones recibidas "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean modificarDatos(Mdcvdr x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar MDCV Distinciones recibidas "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public Mdcvdr buscarXpersona(int x) {
        try{
            return (Mdcvdr) em.createQuery("SELECT dr FROM Mdcvdr dr WHERE dr.persona=:x")
                    .setParameter("x", x)
                    .getSingleResult();
        }catch(Exception e){
            
            System.out.println("Error al buscar Distinciones recibidas de "+x+" error"+e.getMessage());
            return new Mdcvdr();
        }
    }

    @Override
    public List<Mdcvdr> getListByPersona(int x) {
        try {
              return em.createQuery("SELECT dr FROM Mdcvdr dr WHERE dr.persona=:us")
                    .setParameter("us", x)                   
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, filtro lista Distinciones recibidas: " + e.getMessage());
            return null;
        }
    }
    
}
