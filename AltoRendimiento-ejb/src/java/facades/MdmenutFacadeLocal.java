/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdmenut;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdmenutFacadeLocal {

    void create(Mdmenut mdmenut);

    void edit(Mdmenut mdmenut);

    void remove(Mdmenut mdmenut);

    Mdmenut find(Object id);

    List<Mdmenut> findAll();

    List<Mdmenut> findRange(int[] range);

    int count();
    
    public List<Mdmenut> getAllBymodulo(int m);
    public List<Mdmenut> getAllBymoduloCoach(int m);
    
}
