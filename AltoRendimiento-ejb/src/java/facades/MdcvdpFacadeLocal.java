/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvdp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Leonardo
 */
@Local
public interface MdcvdpFacadeLocal {

    void create(Mdcvdp mdcvdp);

    void edit(Mdcvdp mdcvdp);

    void remove(Mdcvdp mdcvdp);

    Mdcvdp find(Object id);

    List<Mdcvdp> findAll();

    List<Mdcvdp> findRange(int[] range);

    int count();
    
    public boolean guardarDatos(Mdcvdp x);
    public boolean modificarDatos(Mdcvdp x);
    public Mdcvdp buscarXpersona(int x);
    
}
