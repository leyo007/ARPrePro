/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvfa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Leonardo
 */
@Local
public interface MdcvfaFacadeLocal {

    void create(Mdcvfa mdcvfa);

    void edit(Mdcvfa mdcvfa);

    void remove(Mdcvfa mdcvfa);

    Mdcvfa find(Object id);

    List<Mdcvfa> findAll();

    List<Mdcvfa> findRange(int[] range);

    int count();
    
    
    public boolean guardarDatos(Mdcvfa x);
    public boolean modificarDatos(Mdcvfa x);
    public Mdcvfa buscarXpersona(int x);
}
