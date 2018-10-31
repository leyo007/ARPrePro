/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Mdpersonast;
import facades.MdpersonastFacadeLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@FacesConverter(value = "atletaConverter")
public class ConverterGral implements Converter {

    MdpersonastFacadeLocal mdpersonastFacade = lookupMdpersonastFacadeLocal();
  @Override
  public Object getAsObject(FacesContext fc, UIComponent comp, String value) {
      Mdpersonast e = mdpersonastFacade.findByCi(value);
      return e;
  }

  @Override
  public String getAsString(FacesContext fc, UIComponent comp, Object value) {
      if(value != null) {
            return ((Mdpersonast) value).getDepcedula();
        }
        else {
            return null;
        }
  }

    private MdpersonastFacadeLocal lookupMdpersonastFacadeLocal() {
        try {
            Context c = new InitialContext();
             System.out.println("MdpersonastFacadeLocal: "+c.getNameInNamespace());
            return (MdpersonastFacadeLocal) c.lookup("java:global/AltoRendimiento/AltoRendimiento-ejb/MdpersonastFacade!facades.MdpersonastFacadeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
