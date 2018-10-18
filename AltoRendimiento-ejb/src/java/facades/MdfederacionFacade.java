/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdfederacion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdfederacionFacade extends AbstractFacade<Mdfederacion> implements MdfederacionFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdfederacionFacade() {
        super(Mdfederacion.class);
    }

    @Override
    public Mdfederacion buscarXid(int x) {
        try{
            return (Mdfederacion) em.createQuery("SELECT dp FROM Mdfederacion dp WHERE dp.id  =:x")
                    .setParameter("x", x)
                    .getSingleResult();
        }catch(Exception e){
            
            System.out.println("Error al buscar federación con id de "+x+" error"+e.getMessage());
            return new Mdfederacion();
        }
    }

    @Override
    public List<Mdfederacion> getListBySector(boolean x) {
        try {
            return  em.createQuery("SELECT f from Mdfederacion f WHERE f.sector =:x")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré federaciones de sector: "+x+" Error: " + e.getMessage());
            return null;
        }
    }
    
}
