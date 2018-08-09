/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdhonorarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdhonorariosFacadeLocal {

    void create(Mdhonorarios mdhonorarios);

    void edit(Mdhonorarios mdhonorarios);

    void remove(Mdhonorarios mdhonorarios);

    Mdhonorarios find(Object id);

    List<Mdhonorarios> findAll();

    List<Mdhonorarios> findRange(int[] range);

    int count();
    
    public boolean modificarDatos(Mdhonorarios x);
    public boolean guardarDatos(Mdhonorarios x);
    public List<Mdhonorarios> getListByCreator(int x);
    
}
