/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdincentivoshistt;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdincentivoshisttFacadeLocal {

    void create(Mdincentivoshistt mdincentivoshistt);

    void edit(Mdincentivoshistt mdincentivoshistt);

    void remove(Mdincentivoshistt mdincentivoshistt);

    Mdincentivoshistt find(Object id);

    List<Mdincentivoshistt> findAll();

    List<Mdincentivoshistt> findRange(int[] range);

    int count();
    
}
