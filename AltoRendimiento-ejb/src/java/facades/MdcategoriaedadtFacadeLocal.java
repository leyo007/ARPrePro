/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcategoriaedadt;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdcategoriaedadtFacadeLocal {

    void create(Mdcategoriaedadt mdcategoriaedadt);

    void edit(Mdcategoriaedadt mdcategoriaedadt);

    void remove(Mdcategoriaedadt mdcategoriaedadt);

    Mdcategoriaedadt find(Object id);

    List<Mdcategoriaedadt> findAll();

    List<Mdcategoriaedadt> findRange(int[] range);

    int count();
    
}
