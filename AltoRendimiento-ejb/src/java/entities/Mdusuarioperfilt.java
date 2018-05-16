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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "mdusuarioperfilt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdusuarioperfilt.findAll", query = "SELECT m FROM Mdusuarioperfilt m")
    , @NamedQuery(name = "Mdusuarioperfilt.findByIdusuarioxperfil", query = "SELECT m FROM Mdusuarioperfilt m WHERE m.idusuarioxperfil = :idusuarioxperfil")
    , @NamedQuery(name = "Mdusuarioperfilt.findByDefecto", query = "SELECT m FROM Mdusuarioperfilt m WHERE m.defecto = :defecto")})
public class Mdusuarioperfilt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuarioxperfil")
    private Integer idusuarioxperfil;
    @Basic(optional = false)
    @Column(name = "defecto")
    private int defecto;
    @JoinColumn(name = "idperfil", referencedColumnName = "idperfil")
    @ManyToOne(optional = false)
    private Mdperfilt idperfil;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Mdusuariot idusuario;

    public Mdusuarioperfilt() {
    }

    public Mdusuarioperfilt(Integer idusuarioxperfil) {
        this.idusuarioxperfil = idusuarioxperfil;
    }

    public Mdusuarioperfilt(Integer idusuarioxperfil, int defecto) {
        this.idusuarioxperfil = idusuarioxperfil;
        this.defecto = defecto;
    }

    public Integer getIdusuarioxperfil() {
        return idusuarioxperfil;
    }

    public void setIdusuarioxperfil(Integer idusuarioxperfil) {
        this.idusuarioxperfil = idusuarioxperfil;
    }

    public int getDefecto() {
        return defecto;
    }

    public void setDefecto(int defecto) {
        this.defecto = defecto;
    }

    public Mdperfilt getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(Mdperfilt idperfil) {
        this.idperfil = idperfil;
    }

    public Mdusuariot getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Mdusuariot idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuarioxperfil != null ? idusuarioxperfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdusuarioperfilt)) {
            return false;
        }
        Mdusuarioperfilt other = (Mdusuarioperfilt) object;
        if ((this.idusuarioxperfil == null && other.idusuarioxperfil != null) || (this.idusuarioxperfil != null && !this.idusuarioxperfil.equals(other.idusuarioxperfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdusuarioperfilt[ idusuarioxperfil=" + idusuarioxperfil + " ]";
    }
    
}
