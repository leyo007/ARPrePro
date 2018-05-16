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
@Table(name = "mdcategoriapropuestat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdcategoriapropuestat.findAll", query = "SELECT m FROM Mdcategoriapropuestat m")
    , @NamedQuery(name = "Mdcategoriapropuestat.findByIdcatpro", query = "SELECT m FROM Mdcategoriapropuestat m WHERE m.idcatpro = :idcatpro")
    , @NamedQuery(name = "Mdcategoriapropuestat.findByCatdescripcion", query = "SELECT m FROM Mdcategoriapropuestat m WHERE m.catdescripcion = :catdescripcion")
    , @NamedQuery(name = "Mdcategoriapropuestat.findByNumrbu", query = "SELECT m FROM Mdcategoriapropuestat m WHERE m.numrbu = :numrbu")})
public class Mdcategoriapropuestat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcatpro")
    private Integer idcatpro;
    @Size(max = 100)
    @Column(name = "catdescripcion")
    private String catdescripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "numrbu")
    private Float numrbu;

    public Mdcategoriapropuestat() {
    }

    public Mdcategoriapropuestat(Integer idcatpro) {
        this.idcatpro = idcatpro;
    }

    public Integer getIdcatpro() {
        return idcatpro;
    }

    public void setIdcatpro(Integer idcatpro) {
        this.idcatpro = idcatpro;
    }

    public String getCatdescripcion() {
        return catdescripcion;
    }

    public void setCatdescripcion(String catdescripcion) {
        this.catdescripcion = catdescripcion;
    }

    public Float getNumrbu() {
        return numrbu;
    }

    public void setNumrbu(Float numrbu) {
        this.numrbu = numrbu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcatpro != null ? idcatpro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdcategoriapropuestat)) {
            return false;
        }
        Mdcategoriapropuestat other = (Mdcategoriapropuestat) object;
        if ((this.idcatpro == null && other.idcatpro != null) || (this.idcatpro != null && !this.idcatpro.equals(other.idcatpro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdcategoriapropuestat[ idcatpro=" + idcatpro + " ]";
    }
    
}
