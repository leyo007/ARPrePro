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
@Table(name = "mdmest")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdmest.findAll", query = "SELECT m FROM Mdmest m")
    , @NamedQuery(name = "Mdmest.findByIdmes", query = "SELECT m FROM Mdmest m WHERE m.idmes = :idmes")
    , @NamedQuery(name = "Mdmest.findByMesnombre", query = "SELECT m FROM Mdmest m WHERE m.mesnombre = :mesnombre")})
public class Mdmest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmes")
    private Integer idmes;
    @Size(max = 15)
    @Column(name = "mesnombre")
    private String mesnombre;

    public Mdmest() {
    }

    public Mdmest(Integer idmes) {
        this.idmes = idmes;
    }

    public Integer getIdmes() {
        return idmes;
    }

    public void setIdmes(Integer idmes) {
        this.idmes = idmes;
    }

    public String getMesnombre() {
        return mesnombre;
    }

    public void setMesnombre(String mesnombre) {
        this.mesnombre = mesnombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmes != null ? idmes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdmest)) {
            return false;
        }
        Mdmest other = (Mdmest) object;
        if ((this.idmes == null && other.idmes != null) || (this.idmes != null && !this.idmes.equals(other.idmes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdmest[ idmes=" + idmes + " ]";
    }
    
}
