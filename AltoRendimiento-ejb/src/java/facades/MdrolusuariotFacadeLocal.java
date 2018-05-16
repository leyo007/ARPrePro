/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdrolusuariot;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdrolusuariotFacadeLocal {

    void create(Mdrolusuariot mdrolusuariot);

    void edit(Mdrolusuariot mdrolusuariot);

    void remove(Mdrolusuariot mdrolusuariot);

    Mdrolusuariot find(Object id);

    List<Mdrolusuariot> findAll();

    List<Mdrolusuariot> findRange(int[] range);

    int count();
    
}
