/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcodigos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdcodigosFacade extends AbstractFacade<Mdcodigos> implements MdcodigosFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdcodigosFacade() {
        super(Mdcodigos.class);
    }

    @Override
    public boolean modificarDatos(Mdcodigos x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar el Còdigo: "+x.getNombre()+" Error"+e.getMessage());
            return false;
            
        }
    }

    
}
