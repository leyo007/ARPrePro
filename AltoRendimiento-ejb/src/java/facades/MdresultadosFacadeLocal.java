/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdresultados;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdresultadosFacadeLocal {

    void create(Mdresultados mdresultados);

    void edit(Mdresultados mdresultados);

    void remove(Mdresultados mdresultados);

    Mdresultados find(Object id);

    List<Mdresultados> findAll();

    List<Mdresultados> findRange(int[] range);

    int count();
    
    public List<Mdresultados> getListBySector(boolean x);
}
