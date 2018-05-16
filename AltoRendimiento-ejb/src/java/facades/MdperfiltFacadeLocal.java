/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Mdperfilt;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lvillavicencio
 */
@Local
public interface MdperfiltFacadeLocal {

    void create(Mdperfilt mdperfilt);

    void edit(Mdperfilt mdperfilt);

    void remove(Mdperfilt mdperfilt);

    Mdperfilt find(Object id);

    List<Mdperfilt> findAll();

    List<Mdperfilt> findRange(int[] range);

    int count();
    
}
