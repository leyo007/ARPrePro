/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdperfilmodulot;
import entities.Mdperfilt;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdperfilmodulotFacadeLocal {

    void create(Mdperfilmodulot mdperfilmodulot);

    void edit(Mdperfilmodulot mdperfilmodulot);

    void remove(Mdperfilmodulot mdperfilmodulot);

    Mdperfilmodulot find(Object id);

    List<Mdperfilmodulot> findAll();

    List<Mdperfilmodulot> findRange(int[] range);

    int count();
    
    public Mdperfilmodulot findModulo(Mdperfilt x);
    
}
