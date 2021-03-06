/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdusuarioperfilt;
import entities.Mdusuariot;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdusuarioperfiltFacadeLocal {

    void create(Mdusuarioperfilt mdusuarioperfilt);

    void edit(Mdusuarioperfilt mdusuarioperfilt);

    void remove(Mdusuarioperfilt mdusuarioperfilt);

    Mdusuarioperfilt find(Object id);

    List<Mdusuarioperfilt> findAll();

    List<Mdusuarioperfilt> findRange(int[] range);

    int count();
    
    public Mdusuarioperfilt findThisUser(Mdusuariot u);
    public boolean guardarDatos(Mdusuarioperfilt x);
    public boolean modificarDatos(Mdusuarioperfilt x);
}
