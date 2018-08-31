/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdreportes;
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
public class MdreportesFacade extends AbstractFacade<Mdreportes> implements MdreportesFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdreportesFacade() {
        super(Mdreportes.class);
    }

    @Override
    public List<Mdreportes> getReportsByCreator(Mdusuariot x) {
        try {
            return  em.createQuery("SELECT r from Mdreportes r where r.cargadox.idusuario  =:x ")
                    .setParameter("x", x.getIdusuario())
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré usuarios con perfil de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Mdreportes> getReportsByType(String x) {
        try {
            return  em.createQuery("SELECT r from Mdreportes r where r.tipo like  '%:x%' ")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré usuarios con perfil de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean guardarDatos(Mdreportes x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new User "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean modificarDatos(Mdreportes x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar user "+e.getMessage());
            return false;
            
        }
    }
    
}
