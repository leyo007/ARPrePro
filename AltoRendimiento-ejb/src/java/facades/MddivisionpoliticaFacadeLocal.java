/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mddivisionpolitica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MddivisionpoliticaFacadeLocal {

    void create(Mddivisionpolitica mddivisionpolitica);

    void edit(Mddivisionpolitica mddivisionpolitica);

    void remove(Mddivisionpolitica mddivisionpolitica);

    Mddivisionpolitica find(Object id);

    List<Mddivisionpolitica> findAll();

    List<Mddivisionpolitica> findRange(int[] range);

    int count();
    
    public List<Mddivisionpolitica> getProv();
    public List<Mddivisionpolitica> getCiudades();
    public List<Mddivisionpolitica> getCiudades(int pv);
    
    
}
