/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdmodulot;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdmodulotFacadeLocal {

    void create(Mdmodulot mdmodulot);

    void edit(Mdmodulot mdmodulot);

    void remove(Mdmodulot mdmodulot);

    Mdmodulot find(Object id);

    List<Mdmodulot> findAll();

    List<Mdmodulot> findRange(int[] range);

    int count();
    
}
