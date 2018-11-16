/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdclafundep;
import entities.Mddeportest;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdclafundepFacade extends AbstractFacade<Mdclafundep> implements MdclafundepFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdclafundepFacade() {
        super(Mdclafundep.class);
    }

    @Override
    public boolean guardarDatos(Mdclafundep x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new ClaFunDep "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean modificarDatos(Mdclafundep x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar Categoría Fucnional Deporte "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public List<Mdclafundep> findByDeporte(Mddeportest x) {
        try {
            return  em.createQuery("SELECT c from Mdclafundep c WHERE c.iddeporte=:x")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré las CatFunDep de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Mdclafundep> findOrdered() {
        try {
            return  em.createQuery("SELECT f from Mdclafundep f WHERE order by f.nombre")
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré Mdclafundep en orden:  Error: " + e.getMessage());
            return null;
        }
    }
    
}
