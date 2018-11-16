/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdevento;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvillavicencio
 */
@Stateless
public class MdeventoFacade extends AbstractFacade<Mdevento> implements MdeventoFacadeLocal {

    @PersistenceContext(unitName = "AltoRendimiento-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MdeventoFacade() {
        super(Mdevento.class);
    }

    @Override
    public boolean guardarDatos(Mdevento x) {
        try {
                em.persist(x);
                return true;
        } catch (Exception e) {
            System.out.println("Error al crear new Evento "+e.getMessage());
            return false;
            
        }
    }

    @Override
    public List<Mdevento> getListByCreator(int x) {
        System.out.println("Buscar eventos by creador");
        try {
            return  em.createQuery("SELECT e from Mdevento e WHERE e.creador =:x")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré los Eventos de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean modificarDatos(Mdevento x) {
        try {
            em.merge(x);
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar Categoría Fucnional Deporte "+e.getMessage());
            return false;
            
        }

    }

    @Override
    public List<Mdevento> duplicateRows(int delegaciones, Mdevento padre) {
        List<Mdevento> resultado=new ArrayList<>();
        Mdevento row=new Mdevento();
        int nextId=findAll().size();
        
       try {
            
            for (int i = 0; i < delegaciones; i++) { 
                System.out.println("findAll().size(): "+findAll().size());
                row.setId(padre.getId()+1+i); 
                row.setEvento(padre.getEvento()+" Delegación");
                row.setDelegacion(padre.getId());
                em.persist(row);
            }
            
              return  em.createQuery("SELECT p Mdevento p WHERE p.delegacion=:x").setParameter("x", padre.getId())
                    .getResultList();
        } catch (Exception ex) {
            System.out.println("Error, no realicé las duplicaciones: " + ex.getMessage());
            return null;
        }
    }

    @Override
    public List<Mdevento> getListBySector(String x) {
        try {
            return  em.createQuery("SELECT e from Mdevento e WHERE e.sector =:x")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré los Eventos de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Mdevento> getListByFed(int x) {
        System.out.println("Buscar eventos by fed");
        try {
            return  em.createQuery("SELECT e from Mdevento e WHERE e.codfed =:x")
                    .setParameter("x", x)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error, no encontré los Eventos de: "+x+" Error: " + e.getMessage());
            return null;
        }
    }


    
}
