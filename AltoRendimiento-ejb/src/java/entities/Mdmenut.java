/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "mdmenut")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdmenut.findAll", query = "SELECT m FROM Mdmenut m")
    , @NamedQuery(name = "Mdmenut.findByIdmenu", query = "SELECT m FROM Mdmenut m WHERE m.idmenu = :idmenu")
    , @NamedQuery(name = "Mdmenut.findByMennombre", query = "SELECT m FROM Mdmenut m WHERE m.mennombre = :mennombre")
    , @NamedQuery(name = "Mdmenut.findByMenlink", query = "SELECT m FROM Mdmenut m WHERE m.menlink = :menlink")
    , @NamedQuery(name = "Mdmenut.findByMendescripcion", query = "SELECT m FROM Mdmenut m WHERE m.mendescripcion = :mendescripcion")
    , @NamedQuery(name = "Mdmenut.findByIdmodulo", query = "SELECT m FROM Mdmenut m WHERE m.idmodulo = :idmodulo")})
public class Mdmenut implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmenu")
    private Integer idmenu;
    @Size(max = 100)
    @Column(name = "mennombre")
    private String mennombre;
    @Size(max = 100)
    @Column(name = "menlink")
    private String menlink;
    @Size(max = 255)
    @Column(name = "mendescripcion")
    private String mendescripcion;
    @Basic(optional = false)
    @Column(name = "idmodulo")
    private int idmodulo;

    public Mdmenut() {
    }

    public Mdmenut(Integer idmenu) {
        this.idmenu = idmenu;
    }

    public Mdmenut(Integer idmenu, int idmodulo) {
        this.idmenu = idmenu;
        this.idmodulo = idmodulo;
    }

    public Integer getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(Integer idmenu) {
        this.idmenu = idmenu;
    }

    public String getMennombre() {
        return mennombre;
    }

    public void setMennombre(String mennombre) {
        this.mennombre = mennombre;
    }

    public String getMenlink() {
        return menlink;
    }

    public void setMenlink(String menlink) {
        this.menlink = menlink;
    }

    public String getMendescripcion() {
        return mendescripcion;
    }

    public void setMendescripcion(String mendescripcion) {
        this.mendescripcion = mendescripcion;
    }

    public int getIdmodulo() {
        return idmodulo;
    }

    public void setIdmodulo(int idmodulo) {
        this.idmodulo = idmodulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmenu != null ? idmenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdmenut)) {
            return false;
        }
        Mdmenut other = (Mdmenut) object;
        if ((this.idmenu == null && other.idmenu != null) || (this.idmenu != null && !this.idmenu.equals(other.idmenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdmenut[ idmenu=" + idmenu + " ]";
    }
    
}
