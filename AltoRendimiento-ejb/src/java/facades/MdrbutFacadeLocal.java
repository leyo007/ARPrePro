/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdrbut;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdrbutFacadeLocal {

    void create(Mdrbut mdrbut);

    void edit(Mdrbut mdrbut);

    void remove(Mdrbut mdrbut);

    Mdrbut find(Object id);

    List<Mdrbut> findAll();

    List<Mdrbut> findRange(int[] range);

    int count();
    
}
