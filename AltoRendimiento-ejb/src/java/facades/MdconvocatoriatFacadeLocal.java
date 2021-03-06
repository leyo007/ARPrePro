/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdconvocatoriat;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdconvocatoriatFacadeLocal {

    void create(Mdconvocatoriat mdconvocatoriat);

    void edit(Mdconvocatoriat mdconvocatoriat);

    void remove(Mdconvocatoriat mdconvocatoriat);

    Mdconvocatoriat find(Object id);

    List<Mdconvocatoriat> findAll();

    List<Mdconvocatoriat> findRange(int[] range);

    int count();
    
}
