/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcvdr;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Leonardo
 */
@Local
public interface MdcvdrFacadeLocal {

    void create(Mdcvdr mdcvdr);

    void edit(Mdcvdr mdcvdr);

    void remove(Mdcvdr mdcvdr);

    Mdcvdr find(Object id);

    List<Mdcvdr> findAll();

    List<Mdcvdr> findRange(int[] range);

    int count();
    
    public boolean guardarDatos(Mdcvdr x);
    public boolean modificarDatos(Mdcvdr x);
    public Mdcvdr buscarXpersona(int x);
    
    public List<Mdcvdr> getListByPersona(int x);
    
}
