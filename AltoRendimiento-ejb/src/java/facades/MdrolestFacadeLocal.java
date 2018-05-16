/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdrolest;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdrolestFacadeLocal {

    void create(Mdrolest mdrolest);

    void edit(Mdrolest mdrolest);

    void remove(Mdrolest mdrolest);

    Mdrolest find(Object id);

    List<Mdrolest> findAll();

    List<Mdrolest> findRange(int[] range);

    int count();
    
}
