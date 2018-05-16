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
@Table(name = "mdcategoriaedadt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdcategoriaedadt.findAll", query = "SELECT m FROM Mdcategoriaedadt m")
    , @NamedQuery(name = "Mdcategoriaedadt.findByIdedad", query = "SELECT m FROM Mdcategoriaedadt m WHERE m.idedad = :idedad")
    , @NamedQuery(name = "Mdcategoriaedadt.findByCatedaddescripcion", query = "SELECT m FROM Mdcategoriaedadt m WHERE m.catedaddescripcion = :catedaddescripcion")})
public class Mdcategoriaedadt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idedad")
    private Integer idedad;
    @Size(max = 255)
    @Column(name = "catedaddescripcion")
    private String catedaddescripcion;

    public Mdcategoriaedadt() {
    }

    public Mdcategoriaedadt(Integer idedad) {
        this.idedad = idedad;
    }

    public Integer getIdedad() {
        return idedad;
    }

    public void setIdedad(Integer idedad) {
        this.idedad = idedad;
    }

    public String getCatedaddescripcion() {
        return catedaddescripcion;
    }

    public void setCatedaddescripcion(String catedaddescripcion) {
        this.catedaddescripcion = catedaddescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idedad != null ? idedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdcategoriaedadt)) {
            return false;
        }
        Mdcategoriaedadt other = (Mdcategoriaedadt) object;
        if ((this.idedad == null && other.idedad != null) || (this.idedad != null && !this.idedad.equals(other.idedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdcategoriaedadt[ idedad=" + idedad + " ]";
    }
    
}
