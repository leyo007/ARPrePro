/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdcodigos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdcodigosFacadeLocal {

    void create(Mdcodigos mdcodigos);

    void edit(Mdcodigos mdcodigos);

    void remove(Mdcodigos mdcodigos);

    Mdcodigos find(Object id);

    List<Mdcodigos> findAll();

    List<Mdcodigos> findRange(int[] range);

    int count();
    
    public boolean modificarDatos(Mdcodigos x);
    
}
