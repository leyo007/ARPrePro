/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdincentivost;
import entities.Mdpersonast;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdincentivostFacadeLocal {

    void create(Mdincentivost mdincentivost);

    void edit(Mdincentivost mdincentivost);

    void remove(Mdincentivost mdincentivost);

    Mdincentivost find(Object id);

    List<Mdincentivost> findAll();

    List<Mdincentivost> findRange(int[] range);

    int count();
    
    public boolean guardarDatos(Mdincentivost x);
    public boolean modificarDatos(Mdincentivost x);
    
    public Mdincentivost buscaXpersona(Mdpersonast p);
    
}
