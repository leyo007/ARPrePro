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
@Table(name = "mdperfilt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdperfilt.findAll", query = "SELECT m FROM Mdperfilt m")
    , @NamedQuery(name = "Mdperfilt.findByIdperfil", query = "SELECT m FROM Mdperfilt m WHERE m.idperfil = :idperfil")
    , @NamedQuery(name = "Mdperfilt.findByPercodigo", query = "SELECT m FROM Mdperfilt m WHERE m.percodigo = :percodigo")
    , @NamedQuery(name = "Mdperfilt.findByPernombre", query = "SELECT m FROM Mdperfilt m WHERE m.pernombre = :pernombre")
    , @NamedQuery(name = "Mdperfilt.findByPerdescripcion", query = "SELECT m FROM Mdperfilt m WHERE m.perdescripcion = :perdescripcion")
    , @NamedQuery(name = "Mdperfilt.findByPerfeccreacion", query = "SELECT m FROM Mdperfilt m WHERE m.perfeccreacion = :perfeccreacion")
    , @NamedQuery(name = "Mdperfilt.findByPerestado", query = "SELECT m FROM Mdperfilt m WHERE m.perestado = :perestado")})
public class Mdperfilt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idperfil")
    private Integer idperfil;
    @Size(max = 100)
    @Column(name = "percodigo")
    private String percodigo;
    @Size(max = 100)
    @Column(name = "pernombre")
    private String pernombre;
    @Size(max = 255)
    @Column(name = "perdescripcion")
    private String perdescripcion;
    @Column(name = "perfeccreacion")
    @Temporal(TemporalType.DATE)
    private Date perfeccreacion;
    @Size(max = 255)
    @Column(name = "perestado")
    private String perestado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idperfil")
    private List<Mdusuarioperfilt> mdusuarioperfiltList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idperfil")
    private List<Mdperfilmodulot> mdperfilmodulotList;

    public Mdperfilt() {
    }

    public Mdperfilt(Integer idperfil) {
        this.idperfil = idperfil;
    }

    public Integer getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(Integer idperfil) {
        this.idperfil = idperfil;
    }

    public String getPercodigo() {
        return percodigo;
    }

    public void setPercodigo(String percodigo) {
        this.percodigo = percodigo;
    }

    public String getPernombre() {
        return pernombre;
    }

    public void setPernombre(String pernombre) {
        this.pernombre = pernombre;
    }

    public String getPerdescripcion() {
        return perdescripcion;
    }

    public void setPerdescripcion(String perdescripcion) {
        this.perdescripcion = perdescripcion;
    }

    public Date getPerfeccreacion() {
        return perfeccreacion;
    }

    public void setPerfeccreacion(Date perfeccreacion) {
        this.perfeccreacion = perfeccreacion;
    }

    public String getPerestado() {
        return perestado;
    }

    public void setPerestado(String perestado) {
        this.perestado = perestado;
    }

    @XmlTransient
    public List<Mdusuarioperfilt> getMdusuarioperfiltList() {
        return mdusuarioperfiltList;
    }

    public void setMdusuarioperfiltList(List<Mdusuarioperfilt> mdusuarioperfiltList) {
        this.mdusuarioperfiltList = mdusuarioperfiltList;
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
        hash += (idperfil != null ? idperfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdperfilt)) {
            return false;
        }
        Mdperfilt other = (Mdperfilt) object;
        if ((this.idperfil == null && other.idperfil != null) || (this.idperfil != null && !this.idperfil.equals(other.idperfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdperfilt[ idperfil=" + idperfil + " ]";
    }
    
}
