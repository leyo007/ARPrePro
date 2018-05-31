/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdclafundep;
import entities.Mddeportest;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdclafundepFacadeLocal {

    void create(Mdclafundep mdclafundep);

    void edit(Mdclafundep mdclafundep);

    void remove(Mdclafundep mdclafundep);

    Mdclafundep find(Object id);

    List<Mdclafundep> findAll();

    List<Mdclafundep> findRange(int[] range);

    int count();
    
    public boolean guardarDatos(Mdclafundep x);
    public boolean modificarDatos(Mdclafundep x);
    public List<Mdclafundep> findByDeporte(Mddeportest x);
    
}
