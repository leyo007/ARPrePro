/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "mdrolest")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdrolest.findAll", query = "SELECT m FROM Mdrolest m")
    , @NamedQuery(name = "Mdrolest.findByIdrol", query = "SELECT m FROM Mdrolest m WHERE m.idrol = :idrol")
    , @NamedQuery(name = "Mdrolest.findByRolcodigo", query = "SELECT m FROM Mdrolest m WHERE m.rolcodigo = :rolcodigo")
    , @NamedQuery(name = "Mdrolest.findByRolnombre", query = "SELECT m FROM Mdrolest m WHERE m.rolnombre = :rolnombre")
    , @NamedQuery(name = "Mdrolest.findByRoldescripcion", query = "SELECT m FROM Mdrolest m WHERE m.roldescripcion = :roldescripcion")
    , @NamedQuery(name = "Mdrolest.findByRolfeccreacion", query = "SELECT m FROM Mdrolest m WHERE m.rolfeccreacion = :rolfeccreacion")
    , @NamedQuery(name = "Mdrolest.findByRolestado", query = "SELECT m FROM Mdrolest m WHERE m.rolestado = :rolestado")})
public class Mdrolest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrol")
    private Integer idrol;
    @Size(max = 100)
    @Column(name = "rolcodigo")
    private String rolcodigo;
    @Size(max = 255)
    @Column(name = "rolnombre")
    private String rolnombre;
    @Size(max = 255)
    @Column(name = "roldescripcion")
    private String roldescripcion;
    @Column(name = "rolfeccreacion")
    @Temporal(TemporalType.DATE)
    private Date rolfeccreacion;
    @Size(max = 255)
    @Column(name = "rolestado")
    private String rolestado;
    @JoinColumn(name = "idmodulo", referencedColumnName = "idmodulo")
    @ManyToOne(optional = false)
    private Mdmodulot idmodulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idrol")
    private List<Mdrolusuariot> mdrolusuariotList;

    public Mdrolest() {
    }

    public Mdrolest(Integer idrol) {
        this.idrol = idrol;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public String getRolcodigo() {
        return rolcodigo;
    }

    public void setRolcodigo(String rolcodigo) {
        this.rolcodigo = rolcodigo;
    }

    public String getRolnombre() {
        return rolnombre;
    }

    public void setRolnombre(String rolnombre) {
        this.rolnombre = rolnombre;
    }

    public String getRoldescripcion() {
        return roldescripcion;
    }

    public void setRoldescripcion(String roldescripcion) {
        this.roldescripcion = roldescripcion;
    }

    public Date getRolfeccreacion() {
        return rolfeccreacion;
    }

    public void setRolfeccreacion(Date rolfeccreacion) {
        this.rolfeccreacion = rolfeccreacion;
    }

    public String getRolestado() {
        return rolestado;
    }

    public void setRolestado(String rolestado) {
        this.rolestado = rolestado;
    }

    public Mdmodulot getIdmodulo() {
        return idmodulo;
    }

    public void setIdmodulo(Mdmodulot idmodulo) {
        this.idmodulo = idmodulo;
    }

    @XmlTransient
    public List<Mdrolusuariot> getMdrolusuariotList() {
        return mdrolusuariotList;
    }

    public void setMdrolusuariotList(List<Mdrolusuariot> mdrolusuariotList) {
        this.mdrolusuariotList = mdrolusuariotList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrol != null ? idrol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdrolest)) {
            return false;
        }
        Mdrolest other = (Mdrolest) object;
        if ((this.idrol == null && other.idrol != null) || (this.idrol != null && !this.idrol.equals(other.idrol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdrolest[ idrol=" + idrol + " ]";
    }
    
}
