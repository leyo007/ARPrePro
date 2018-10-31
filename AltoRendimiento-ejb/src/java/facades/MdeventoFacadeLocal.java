/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdevento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdeventoFacadeLocal {

    void create(Mdevento mdevento);

    void edit(Mdevento mdevento);

    void remove(Mdevento mdevento);

    Mdevento find(Object id);

    List<Mdevento> findAll();

    List<Mdevento> findRange(int[] range);

    int count();
    
    public boolean modificarDatos(Mdevento x);
    public boolean guardarDatos(Mdevento x);
    public List<Mdevento> getListByCreator(int x);
    public List<Mdevento> duplicateRows(int delegaciones, Mdevento padre);
    
}
