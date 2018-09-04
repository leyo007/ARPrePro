/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdreportes;
import entities.Mdusuariot;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdreportesFacadeLocal {

    void create(Mdreportes mdreportes);

    void edit(Mdreportes mdreportes);

    void remove(Mdreportes mdreportes);

    Mdreportes find(Object id);

    List<Mdreportes> findAll();

    List<Mdreportes> findRange(int[] range);

    int count();
    
   
    public List<Mdreportes> getReportsByCreator(Mdusuariot x);
    public List<Mdreportes> getReportsByType(String x,Mdusuariot y );
    public List<Mdreportes> getAllReportsByType(String x);
    
    public boolean guardarDatos(Mdreportes x);
    public boolean modificarDatos(Mdreportes x);
    
}
