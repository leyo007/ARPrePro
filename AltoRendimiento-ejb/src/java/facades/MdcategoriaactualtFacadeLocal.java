/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcategoriaactualt;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdcategoriaactualtFacadeLocal {

    void create(Mdcategoriaactualt mdcategoriaactualt);

    void edit(Mdcategoriaactualt mdcategoriaactualt);

    void remove(Mdcategoriaactualt mdcategoriaactualt);

    Mdcategoriaactualt find(Object id);

    List<Mdcategoriaactualt> findAll();

    List<Mdcategoriaactualt> findRange(int[] range);

    int count();
    
}
