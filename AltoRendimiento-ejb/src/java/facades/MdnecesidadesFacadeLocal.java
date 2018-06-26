/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdnecesidades;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdnecesidadesFacadeLocal {

    void create(Mdnecesidades mdnecesidades);

    void edit(Mdnecesidades mdnecesidades);

    void remove(Mdnecesidades mdnecesidades);

    Mdnecesidades find(Object id);

    List<Mdnecesidades> findAll();

    List<Mdnecesidades> findRange(int[] range);

    int count();
    
    public boolean modificarDatos(Mdnecesidades x);
    public boolean guardarDatos(Mdnecesidades x);
    public List<Mdnecesidades> getListByCreator(int x);
    public List<Mdnecesidades> getListByGral(int x);
    
}
