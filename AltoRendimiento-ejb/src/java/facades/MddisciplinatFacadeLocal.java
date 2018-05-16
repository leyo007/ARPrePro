/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mddeportest;
import entities.Mddisciplinat;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MddisciplinatFacadeLocal {

    void create(Mddisciplinat mddisciplinat);

    void edit(Mddisciplinat mddisciplinat);

    void remove(Mddisciplinat mddisciplinat);

    Mddisciplinat find(Object id);

    List<Mddisciplinat> findAll();

    List<Mddisciplinat> findRange(int[] range);

    int count();
    
    public List<Mddisciplinat> findByDeporte(Mddeportest x);
    public Mddisciplinat findSingleByDeporte(Mddeportest x);
    
}
