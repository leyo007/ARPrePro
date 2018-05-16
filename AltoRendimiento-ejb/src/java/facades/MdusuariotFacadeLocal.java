/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdusuariot;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdusuariotFacadeLocal {

    void create(Mdusuariot mdusuariot);

    void edit(Mdusuariot mdusuariot);

    void remove(Mdusuariot mdusuariot);

    Mdusuariot find(Object id);

    List<Mdusuariot> findAll();

    List<Mdusuariot> findRange(int[] range);

    int count();
    public Mdusuariot findThisUser(String user, String pwd);
}
