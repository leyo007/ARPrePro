/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdpersonast;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdpersonastFacadeLocal {

    void create(Mdpersonast mdpersonast);

    void edit(Mdpersonast mdpersonast);

    void remove(Mdpersonast mdpersonast);

    Mdpersonast find(Object id);

    List<Mdpersonast> findAll();

    List<Mdpersonast> findRange(int[] range);

    int count();
    public List<Mdpersonast>findByPerfil(int x);
    public boolean guardarDatos(Mdpersonast x);
    public boolean modificarDatos(Mdpersonast x);
    public boolean findById(String x);
    public List<Mdpersonast> findByCodFed(int x);
    public Mdpersonast findById(int x);
    public Mdpersonast findByCi(String x);
    public List<Mdpersonast> findBySector(boolean x);
    
}
