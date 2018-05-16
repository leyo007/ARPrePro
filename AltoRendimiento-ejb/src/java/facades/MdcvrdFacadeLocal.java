/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvrd;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Leonardo
 */
@Local
public interface MdcvrdFacadeLocal {

    void create(Mdcvrd mdcvrd);

    void edit(Mdcvrd mdcvrd);

    void remove(Mdcvrd mdcvrd);

    Mdcvrd find(Object id);

    List<Mdcvrd> findAll();

    List<Mdcvrd> findRange(int[] range);

    int count();
    
     public boolean guardarDatos(Mdcvrd x);
    public boolean modificarDatos(Mdcvrd x);
    
    public List<Mdcvrd> getListByPersona(int x);
    
}
