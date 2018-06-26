/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "mddeportest")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mddeportest.findAll", query = "SELECT m FROM Mddeportest m")
    , @NamedQuery(name = "Mddeportest.findByIddeporte", query = "SELECT m FROM Mddeportest m WHERE m.iddeporte = :iddeporte")
    , @NamedQuery(name = "Mddeportest.findByDepdescripcion", query = "SELECT m FROM Mddeportest m WHERE m.depdescripcion = :depdescripcion")
    , @NamedQuery(name = "Mddeportest.findByDepestado", query = "SELECT m FROM Mddeportest m WHERE m.depestado = :depestado")
    , @NamedQuery(name = "Mddeportest.findByAd", query = "SELECT m FROM Mddeportest m WHERE m.ad = :ad")
    , @NamedQuery(name = "Mddeportest.findBySector", query = "SELECT m FROM Mddeportest m WHERE m.sector = :sector")
    , @NamedQuery(name = "Mddeportest.findByCfd", query = "SELECT m FROM Mddeportest m WHERE m.cfd = :cfd")})
public class Mddeportest implements Serializable {
    @Basic(optional = false)
    @Column(name = "fedcod")
    private int fedcod;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddeporte")
    private Integer iddeporte;
    @Size(max = 255)
    @Column(name = "depdescripcion")
    private String depdescripcion;
    @Size(max = 255)
    @Column(name = "depestado")
    private String depestado;
    @Size(max = 2147483647)
    @Column(name = "ad")
    private String ad;
    @Column(name = "sector")
    private Boolean sector;
    @Basic(optional = false)
    @Column(name = "cfd")
    private int cfd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddeporte")
    private List<Mddisciplinat> mddisciplinatList;

    public Mddeportest() {
    }

    public Mddeportest(Integer iddeporte) {
        this.iddeporte = iddeporte;
    }

    public Mddeportest(Integer iddeporte, int cfd) {
        this.iddeporte = iddeporte;
        this.cfd = cfd;
    }

    public Integer getIddeporte() {
        return iddeporte;
    }

    public void setIddeporte(Integer iddeporte) {
        this.iddeporte = iddeporte;
    }

    public String getDepdescripcion() {
        return depdescripcion;
    }

    public void setDepdescripcion(String depdescripcion) {
        this.depdescripcion = depdescripcion;
    }

    public String getDepestado() {
        return depestado;
    }

    public void setDepestado(String depestado) {
        this.depestado = depestado;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Boolean getSector() {
        return sector;
    }

    public void setSector(Boolean sector) {
        this.sector = sector;
    }

    public int getCfd() {
        return cfd;
    }

    public void setCfd(int cfd) {
        this.cfd = cfd;
    }

    @XmlTransient
    public List<Mddisciplinat> getMddisciplinatList() {
        return mddisciplinatList;
    }

    public void setMddisciplinatList(List<Mddisciplinat> mddisciplinatList) {
        this.mddisciplinatList = mddisciplinatList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddeporte != null ? iddeporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mddeportest)) {
            return false;
        }
        Mddeportest other = (Mddeportest) object;
        if ((this.iddeporte == null && other.iddeporte != null) || (this.iddeporte != null && !this.iddeporte.equals(other.iddeporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mddeportest[ iddeporte=" + iddeporte + " ]";
    }

    public int getFedcod() {
        return fedcod;
    }

    public void setFedcod(int fedcod) {
        this.fedcod = fedcod;
    }
    
}
