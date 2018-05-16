/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdmest;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdmestFacadeLocal {

    void create(Mdmest mdmest);

    void edit(Mdmest mdmest);

    void remove(Mdmest mdmest);

    Mdmest find(Object id);

    List<Mdmest> findAll();

    List<Mdmest> findRange(int[] range);

    int count();
    
}
