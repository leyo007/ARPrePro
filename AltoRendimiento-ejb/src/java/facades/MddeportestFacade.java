/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mddeportest;
import entities.Mddisciplinat;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MddeportestFacade extends AbstractFacade<Mddeportest> implements MddeportestFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MddeportestFacade() {
        super(Mddeportest.class);
    }

    @Override
    public List<Mddisciplinat> getAllDiciplina(int x) {
        try {
              return em.createQuery("SELECT i FROM Mddisciplinat i WHERE i.iddeporte.iddeporte =:us")
                    .setParameter("us", x)                   
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, filtro lista diciplinas: " + e.getMessage());
            return null;
        }
    }
    
}
