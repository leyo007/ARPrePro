/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdincentivoshistt;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdincentivoshisttFacade extends AbstractFacade<Mdincentivoshistt> implements MdincentivoshisttFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdincentivoshisttFacade() {
        super(Mdincentivoshistt.class);
    }

    @Override
    public boolean modificarDatos(Mdincentivoshistt x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar Categoría Fucnional Deporte "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public boolean guardarDatos(Mdincentivoshistt x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new IncentivoHistorico "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public List<Mdincentivoshistt> getListByCI(String x) {
        try {
            return  em.createQuery("SELECT h from Mdincentivoshistt h WHERE h.inchcedula =:x")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré los HistoIncen de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Mdincentivoshistt findLastApro(String x) {
        try {
              return (Mdincentivoshistt) em.createQuery("select t from Mdincentivoshistt t where t.inchcedula=:x order by t.idhisinc desc")
                      .setParameter("x", x)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Error, no encontré Incentivo Historico: "+x+" Error: " + e.getMessage());
            return new Mdincentivoshistt();
        }
    }
    
}
