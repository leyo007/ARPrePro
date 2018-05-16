/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcategoriapropuestat;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdcategoriapropuestatFacadeLocal {

    void create(Mdcategoriapropuestat mdcategoriapropuestat);

    void edit(Mdcategoriapropuestat mdcategoriapropuestat);

    void remove(Mdcategoriapropuestat mdcategoriapropuestat);

    Mdcategoriapropuestat find(Object id);

    List<Mdcategoriapropuestat> findAll();

    List<Mdcategoriapropuestat> findRange(int[] range);

    int count();
    
    public boolean guardarDatos(Mdcategoriapropuestat x);
    public boolean modificarDatos(Mdcategoriapropuestat x);
    
}
