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
@Table(name = "mdmodulot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdmodulot.findAll", query = "SELECT m FROM Mdmodulot m")
    , @NamedQuery(name = "Mdmodulot.findByIdmodulo", query = "SELECT m FROM Mdmodulot m WHERE m.idmodulo = :idmodulo")
    , @NamedQuery(name = "Mdmodulot.findByModcodigo", query = "SELECT m FROM Mdmodulot m WHERE m.modcodigo = :modcodigo")
    , @NamedQuery(name = "Mdmodulot.findByModnombre", query = "SELECT m FROM Mdmodulot m WHERE m.modnombre = :modnombre")
    , @NamedQuery(name = "Mdmodulot.findByModdescripcioncio", query = "SELECT m FROM Mdmodulot m WHERE m.moddescripcioncio = :moddescripcioncio")
    , @NamedQuery(name = "Mdmodulot.findByModestado", query = "SELECT m FROM Mdmodulot m WHERE m.modestado = :modestado")
    , @NamedQuery(name = "Mdmodulot.findByModfeccreacion", query = "SELECT m FROM Mdmodulot m WHERE m.modfeccreacion = :modfeccreacion")})
public class Mdmodulot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmodulo")
    private Integer idmodulo;
    @Size(max = 100)
    @Column(name = "modcodigo")
    private String modcodigo;
    @Size(max = 100)
    @Column(name = "modnombre")
    private String modnombre;
    @Size(max = 200)
    @Column(name = "moddescripcioncio")
    private String moddescripcioncio;
    @Size(max = 255)
    @Column(name = "modestado")
    private String modestado;
    @Column(name = "modfeccreacion")
    @Temporal(TemporalType.DATE)
    private Date modfeccreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmodulo")
    private List<Mdrolest> mdrolestList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmodulo")
    private List<Mdperfilmodulot> mdperfilmodulotList;

    public Mdmodulot() {
    }

    public Mdmodulot(Integer idmodulo) {
        this.idmodulo = idmodulo;
    }

    public Integer getIdmodulo() {
        return idmodulo;
    }

    public void setIdmodulo(Integer idmodulo) {
        this.idmodulo = idmodulo;
    }

    public String getModcodigo() {
        return modcodigo;
    }

    public void setModcodigo(String modcodigo) {
        this.modcodigo = modcodigo;
    }

    public String getModnombre() {
        return modnombre;
    }

    public void setModnombre(String modnombre) {
        this.modnombre = modnombre;
    }

    public String getModdescripcioncio() {
        return moddescripcioncio;
    }

    public void setModdescripcioncio(String moddescripcioncio) {
        this.moddescripcioncio = moddescripcioncio;
    }

    public String getModestado() {
        return modestado;
    }

    public void setModestado(String modestado) {
        this.modestado = modestado;
    }

    public Date getModfeccreacion() {
        return modfeccreacion;
    }

    public void setModfeccreacion(Date modfeccreacion) {
        this.modfeccreacion = modfeccreacion;
    }

    @XmlTransient
    public List<Mdrolest> getMdrolestList() {
        return mdrolestList;
    }

    public void setMdrolestList(List<Mdrolest> mdrolestList) {
        this.mdrolestList = mdrolestList;
    }

    @XmlTransient
    public List<Mdperfilmodulot> getMdperfilmodulotList() {
        return mdperfilmodulotList;
    }

    public void setMdperfilmodulotList(List<Mdperfilmodulot> mdperfilmodulotList) {
        this.mdperfilmodulotList = mdperfilmodulotList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmodulo != null ? idmodulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdmodulot)) {
            return false;
        }
        Mdmodulot other = (Mdmodulot) object;
        if ((this.idmodulo == null && other.idmodulo != null) || (this.idmodulo != null && !this.idmodulo.equals(other.idmodulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdmodulot[ idmodulo=" + idmodulo + " ]";
    }
    
}
