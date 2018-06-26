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
public interface MddeportestFacadeLocal {

    void create(Mddeportest mddeportest);

    void edit(Mddeportest mddeportest);

    void remove(Mddeportest mddeportest);

    Mddeportest find(Object id);

    List<Mddeportest> findAll();

    List<Mddeportest> findRange(int[] range);

    int count();
    
    public List<Mddisciplinat> getAllDiciplina(int x);
    public List<Mddisciplinat> getAllDiciplinaByDesc(String x);
    public List<Mddeportest> getDepByFed(int x);
    
    
}
