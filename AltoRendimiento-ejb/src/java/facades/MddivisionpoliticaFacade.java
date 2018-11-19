/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mddivisionpolitica;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MddivisionpoliticaFacade extends AbstractFacade<Mddivisionpolitica> implements MddivisionpoliticaFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MddivisionpoliticaFacade() {
        super(Mddivisionpolitica.class);
    }

    @Override
    public List<Mddivisionpolitica> getProv() {
        try {
              return  em.createQuery("SELECT p FROM Mddivisionpolitica p where p.idprovinciaorgdep  !=0 and p.idcantonorgdep = 0 order by p.nombredivpol")
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré todas las provincias: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Mddivisionpolitica> getCiudades() {
        try {
              return  em.createQuery("SELECT c from Mddivisionpolitica c WHERE c.idcantonorgdep != 0 and c.idparroquiaorgdep = 0")
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré todas las ciudades: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Mddivisionpolitica> getCiudades(int pv) {
        try {
              return  em.createQuery("SELECT cxp from Mddivisionpolitica cxp where cxp.idcantonorgdep != 0 and "
                      + "cxp.idparroquiaorgdep = 0 and cxp.idprovinciaorgdep =:pd")
                    .setParameter("pd",pv)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré las ciudades de provincia: "+pv+"  Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Mddivisionpolitica getProvSingle(int x) {
        try{
            return (Mddivisionpolitica) em.createQuery("SELECT pv FROM Mddivisionpolitica pv WHERE pv.idparroquiaorgdep=0 and pv.idcantonorgdep=0 and pv.iddivpol =:x")
                    .setParameter("x", x)
                    .getSingleResult();
        }catch(Exception e){
            
            System.out.println("Error al buscar una Provincia de "+x+" error"+e.getMessage());
            return new Mddivisionpolitica();
        }
    }
    
}
