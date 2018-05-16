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
@Table(name = "mdrolusuariot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdrolusuariot.findAll", query = "SELECT m FROM Mdrolusuariot m")
    , @NamedQuery(name = "Mdrolusuariot.findByIdrolxusuario", query = "SELECT m FROM Mdrolusuariot m WHERE m.idrolxusuario = :idrolxusuario")})
public class Mdrolusuariot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrolxusuario")
    private Integer idrolxusuario;
    @JoinColumn(name = "idrol", referencedColumnName = "idrol")
    @ManyToOne(optional = false)
    private Mdrolest idrol;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Mdusuariot idusuario;

    public Mdrolusuariot() {
    }

    public Mdrolusuariot(Integer idrolxusuario) {
        this.idrolxusuario = idrolxusuario;
    }

    public Integer getIdrolxusuario() {
        return idrolxusuario;
    }

    public void setIdrolxusuario(Integer idrolxusuario) {
        this.idrolxusuario = idrolxusuario;
    }

    public Mdrolest getIdrol() {
        return idrol;
    }

    public void setIdrol(Mdrolest idrol) {
        this.idrol = idrol;
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
        hash += (idrolxusuario != null ? idrolxusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdrolusuariot)) {
            return false;
        }
        Mdrolusuariot other = (Mdrolusuariot) object;
        if ((this.idrolxusuario == null && other.idrolxusuario != null) || (this.idrolxusuario != null && !this.idrolxusuario.equals(other.idrolxusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdrolusuariot[ idrolxusuario=" + idrolxusuario + " ]";
    }
    
}
