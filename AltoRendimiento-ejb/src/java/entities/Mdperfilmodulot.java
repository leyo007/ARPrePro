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
@Table(name = "mdperfilmodulot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdperfilmodulot.findAll", query = "SELECT m FROM Mdperfilmodulot m")
    , @NamedQuery(name = "Mdperfilmodulot.findByIdpermod", query = "SELECT m FROM Mdperfilmodulot m WHERE m.idpermod = :idpermod")})
public class Mdperfilmodulot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpermod")
    private Integer idpermod;
    @JoinColumn(name = "idmodulo", referencedColumnName = "idmodulo")
    @ManyToOne(optional = false)
    private Mdmodulot idmodulo;
    @JoinColumn(name = "idperfil", referencedColumnName = "idperfil")
    @ManyToOne(optional = false)
    private Mdperfilt idperfil;

    public Mdperfilmodulot() {
    }

    public Mdperfilmodulot(Integer idpermod) {
        this.idpermod = idpermod;
    }

    public Integer getIdpermod() {
        return idpermod;
    }

    public void setIdpermod(Integer idpermod) {
        this.idpermod = idpermod;
    }

    public Mdmodulot getIdmodulo() {
        return idmodulo;
    }

    public void setIdmodulo(Mdmodulot idmodulo) {
        this.idmodulo = idmodulo;
    }

    public Mdperfilt getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(Mdperfilt idperfil) {
        this.idperfil = idperfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpermod != null ? idpermod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdperfilmodulot)) {
            return false;
        }
        Mdperfilmodulot other = (Mdperfilmodulot) object;
        if ((this.idpermod == null && other.idpermod != null) || (this.idpermod != null && !this.idpermod.equals(other.idpermod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdperfilmodulot[ idpermod=" + idpermod + " ]";
    }
    
}
