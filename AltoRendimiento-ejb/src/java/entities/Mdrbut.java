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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "mdrbut")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdrbut.findAll", query = "SELECT m FROM Mdrbut m")
    , @NamedQuery(name = "Mdrbut.findByIdrbu", query = "SELECT m FROM Mdrbut m WHERE m.idrbu = :idrbu")
    , @NamedQuery(name = "Mdrbut.findByRbumonto", query = "SELECT m FROM Mdrbut m WHERE m.rbumonto = :rbumonto")
    , @NamedQuery(name = "Mdrbut.findByIdcatpro", query = "SELECT m FROM Mdrbut m WHERE m.idcatpro = :idcatpro")})
public class Mdrbut implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrbu")
    private Integer idrbu;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "rbumonto")
    private Float rbumonto;
    @Basic(optional = false)
    @Column(name = "idcatpro")
    private int idcatpro;

    public Mdrbut() {
    }

    public Mdrbut(Integer idrbu) {
        this.idrbu = idrbu;
    }

    public Mdrbut(Integer idrbu, int idcatpro) {
        this.idrbu = idrbu;
        this.idcatpro = idcatpro;
    }

    public Integer getIdrbu() {
        return idrbu;
    }

    public void setIdrbu(Integer idrbu) {
        this.idrbu = idrbu;
    }

    public Float getRbumonto() {
        return rbumonto;
    }

    public void setRbumonto(Float rbumonto) {
        this.rbumonto = rbumonto;
    }

    public int getIdcatpro() {
        return idcatpro;
    }

    public void setIdcatpro(int idcatpro) {
        this.idcatpro = idcatpro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrbu != null ? idrbu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdrbut)) {
            return false;
        }
        Mdrbut other = (Mdrbut) object;
        if ((this.idrbu == null && other.idrbu != null) || (this.idrbu != null && !this.idrbu.equals(other.idrbu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdrbut[ idrbu=" + idrbu + " ]";
    }
    
}
