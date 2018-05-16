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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "mdincentivost")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdincentivost.findAll", query = "SELECT m FROM Mdincentivost m")
    , @NamedQuery(name = "Mdincentivost.findByIdincentivo", query = "SELECT m FROM Mdincentivost m WHERE m.idincentivo = :idincentivo")
    , @NamedQuery(name = "Mdincentivost.findByIncvalortotal", query = "SELECT m FROM Mdincentivost m WHERE m.incvalortotal = :incvalortotal")
    , @NamedQuery(name = "Mdincentivost.findByIdmes", query = "SELECT m FROM Mdincentivost m WHERE m.idmes = :idmes")
    , @NamedQuery(name = "Mdincentivost.findByIncvalormensual", query = "SELECT m FROM Mdincentivost m WHERE m.incvalormensual = :incvalormensual")
    , @NamedQuery(name = "Mdincentivost.findByIdcatpro", query = "SELECT m FROM Mdincentivost m WHERE m.idcatpro = :idcatpro")
    , @NamedQuery(name = "Mdincentivost.findByIdcatactual", query = "SELECT m FROM Mdincentivost m WHERE m.idcatactual = :idcatactual")
    , @NamedQuery(name = "Mdincentivost.findByIdedad", query = "SELECT m FROM Mdincentivost m WHERE m.idedad = :idedad")
    , @NamedQuery(name = "Mdincentivost.findByIddep", query = "SELECT m FROM Mdincentivost m WHERE m.iddep = :iddep")
    , @NamedQuery(name = "Mdincentivost.findByIdestado", query = "SELECT m FROM Mdincentivost m WHERE m.idestado = :idestado")})
public class Mdincentivost implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idincentivo")
    private Integer idincentivo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "incvalortotal")
    private Float incvalortotal;
    @Column(name = "idmes")
    private Integer idmes;
    @Column(name = "incvalormensual")
    private Float incvalormensual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcatpro")
    private int idcatpro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcatactual")
    private int idcatactual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idedad")
    private int idedad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddep")
    private int iddep;
    @Column(name = "idestado")
    private Boolean idestado;

    public Mdincentivost() {
    }

    public Mdincentivost(Integer idincentivo) {
        this.idincentivo = idincentivo;
    }

    public Mdincentivost(Integer idincentivo, int idcatpro, int idcatactual, int idedad, int iddep) {
        this.idincentivo = idincentivo;
        this.idcatpro = idcatpro;
        this.idcatactual = idcatactual;
        this.idedad = idedad;
        this.iddep = iddep;
    }

    public Integer getIdincentivo() {
        return idincentivo;
    }

    public void setIdincentivo(Integer idincentivo) {
        this.idincentivo = idincentivo;
    }

    public Float getIncvalortotal() {
        return incvalortotal;
    }

    public void setIncvalortotal(Float incvalortotal) {
        this.incvalortotal = incvalortotal;
    }

    public Integer getIdmes() {
        return idmes;
    }

    public void setIdmes(Integer idmes) {
        this.idmes = idmes;
    }

    public Float getIncvalormensual() {
        return incvalormensual;
    }

    public void setIncvalormensual(Float incvalormensual) {
        this.incvalormensual = incvalormensual;
    }

    public int getIdcatpro() {
        return idcatpro;
    }

    public void setIdcatpro(int idcatpro) {
        this.idcatpro = idcatpro;
    }

    public int getIdcatactual() {
        return idcatactual;
    }

    public void setIdcatactual(int idcatactual) {
        this.idcatactual = idcatactual;
    }

    public int getIdedad() {
        return idedad;
    }

    public void setIdedad(int idedad) {
        this.idedad = idedad;
    }

    public int getIddep() {
        return iddep;
    }

    public void setIddep(int iddep) {
        this.iddep = iddep;
    }

    public Boolean getIdestado() {
        return idestado;
    }

    public void setIdestado(Boolean idestado) {
        this.idestado = idestado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idincentivo != null ? idincentivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdincentivost)) {
            return false;
        }
        Mdincentivost other = (Mdincentivost) object;
        if ((this.idincentivo == null && other.idincentivo != null) || (this.idincentivo != null && !this.idincentivo.equals(other.idincentivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdincentivost[ idincentivo=" + idincentivo + " ]";
    }
    
}
