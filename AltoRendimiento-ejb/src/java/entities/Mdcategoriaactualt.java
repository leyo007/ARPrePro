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
@Table(name = "mdcategoriaactualt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdcategoriaactualt.findAll", query = "SELECT m FROM Mdcategoriaactualt m")
    , @NamedQuery(name = "Mdcategoriaactualt.findByIdcatactual", query = "SELECT m FROM Mdcategoriaactualt m WHERE m.idcatactual = :idcatactual")
    , @NamedQuery(name = "Mdcategoriaactualt.findByCatdescripcion", query = "SELECT m FROM Mdcategoriaactualt m WHERE m.catdescripcion = :catdescripcion")
    , @NamedQuery(name = "Mdcategoriaactualt.findByNumrbu", query = "SELECT m FROM Mdcategoriaactualt m WHERE m.numrbu = :numrbu")})
public class Mdcategoriaactualt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcatactual")
    private Integer idcatactual;
    @Size(max = 100)
    @Column(name = "catdescripcion")
    private String catdescripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "numrbu")
    private Float numrbu;

    public Mdcategoriaactualt() {
    }

    public Mdcategoriaactualt(Integer idcatactual) {
        this.idcatactual = idcatactual;
    }

    public Integer getIdcatactual() {
        return idcatactual;
    }

    public void setIdcatactual(Integer idcatactual) {
        this.idcatactual = idcatactual;
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
        hash += (idcatactual != null ? idcatactual.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdcategoriaactualt)) {
            return false;
        }
        Mdcategoriaactualt other = (Mdcategoriaactualt) object;
        if ((this.idcatactual == null && other.idcatactual != null) || (this.idcatactual != null && !this.idcatactual.equals(other.idcatactual))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdcategoriaactualt[ idcatactual=" + idcatactual + " ]";
    }
    
}
