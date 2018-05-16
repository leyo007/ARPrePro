/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Leonardo
 */
@Local
public interface MdcvieFacadeLocal {

    void create(Mdcvie mdcvie);

    void edit(Mdcvie mdcvie);

    void remove(Mdcvie mdcvie);

    Mdcvie find(Object id);

    List<Mdcvie> findAll();

    List<Mdcvie> findRange(int[] range);

    int count();
    
    public boolean guardarDatos(Mdcvie x);
    public boolean modificarDatos(Mdcvie x);
    public Mdcvie buscarXpersona(int x);
    
}
