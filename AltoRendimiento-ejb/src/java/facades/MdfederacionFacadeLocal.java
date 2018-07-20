/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdfederacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdfederacionFacadeLocal {

    void create(Mdfederacion mdfederacion);

    void edit(Mdfederacion mdfederacion);

    void remove(Mdfederacion mdfederacion);

    Mdfederacion find(Object id);

    List<Mdfederacion> findAll();

    List<Mdfederacion> findRange(int[] range);

    int count();
    
    public Mdfederacion buscarXid(int x);
    
}
