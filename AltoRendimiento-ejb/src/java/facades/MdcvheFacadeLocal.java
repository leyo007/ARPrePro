/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvhe;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Leonardo
 */
@Local
public interface MdcvheFacadeLocal {

    void create(Mdcvhe mdcvhe);

    void edit(Mdcvhe mdcvhe);

    void remove(Mdcvhe mdcvhe);

    Mdcvhe find(Object id);

    List<Mdcvhe> findAll();

    List<Mdcvhe> findRange(int[] range);

    int count();
    
    public boolean guardarDatos(Mdcvhe x);
    public boolean modificarDatos(Mdcvhe x);
    
    public List<Mdcvhe> getListByPersona(int x);
    
}
