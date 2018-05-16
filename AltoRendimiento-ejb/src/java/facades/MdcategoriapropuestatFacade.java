/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcategoriapropuestat;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdcategoriapropuestatFacade extends AbstractFacade<Mdcategoriapropuestat> implements MdcategoriapropuestatFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdcategoriapropuestatFacade() {
        super(Mdcategoriapropuestat.class);
    }

    @Override
    public boolean guardarDatos(Mdcategoriapropuestat x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new Categoria Propuesta "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean modificarDatos(Mdcategoriapropuestat x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar Categoria Propuesta "+e.getMessage());
            return false;
            
        }
    }
    
}
