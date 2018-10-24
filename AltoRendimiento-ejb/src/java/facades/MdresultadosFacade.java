/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdresultados;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdresultadosFacade extends AbstractFacade<Mdresultados> implements MdresultadosFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdresultadosFacade() {
        super(Mdresultados.class);
    }

    @Override
    public List<Mdresultados> getListBySector(boolean x) {
        try {
            return  em.createQuery("SELECT f from Mdresultados f WHERE f.convencional =:x order by f.division")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré Mdresultados de sector: "+x+" Error: " + e.getMessage());
            return null;
        }
    }
    
}
