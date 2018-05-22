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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "mdpersonast")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdpersonast.findAll", query = "SELECT m FROM Mdpersonast m")
    , @NamedQuery(name = "Mdpersonast.findByIddep", query = "SELECT m FROM Mdpersonast m WHERE m.iddep = :iddep")
    , @NamedQuery(name = "Mdpersonast.findByDepcedula", query = "SELECT m FROM Mdpersonast m WHERE m.depcedula = :depcedula")
    , @NamedQuery(name = "Mdpersonast.findByIdsexo", query = "SELECT m FROM Mdpersonast m WHERE m.idsexo = :idsexo")
    , @NamedQuery(name = "Mdpersonast.findByDepnombre", query = "SELECT m FROM Mdpersonast m WHERE m.depnombre = :depnombre")
    , @NamedQuery(name = "Mdpersonast.findByDepapellido", query = "SELECT m FROM Mdpersonast m WHERE m.depapellido = :depapellido")
    , @NamedQuery(name = "Mdpersonast.findByDepresultados", query = "SELECT m FROM Mdpersonast m WHERE m.depresultados = :depresultados")
    , @NamedQuery(name = "Mdpersonast.findByDepproyeccion", query = "SELECT m FROM Mdpersonast m WHERE m.depproyeccion = :depproyeccion")
    , @NamedQuery(name = "Mdpersonast.findByDepnovedad", query = "SELECT m FROM Mdpersonast m WHERE m.depnovedad = :depnovedad")
    , @NamedQuery(name = "Mdpersonast.findByDepprueba", query = "SELECT m FROM Mdpersonast m WHERE m.depprueba = :depprueba")
    , @NamedQuery(name = "Mdpersonast.findByOrgid", query = "SELECT m FROM Mdpersonast m WHERE m.orgid = :orgid")
    , @NamedQuery(name = "Mdpersonast.findByIddeporte", query = "SELECT m FROM Mdpersonast m WHERE m.iddeporte = :iddeporte")
    , @NamedQuery(name = "Mdpersonast.findByIddis", query = "SELECT m FROM Mdpersonast m WHERE m.iddis = :iddis")
    , @NamedQuery(name = "Mdpersonast.findByIdprorep", query = "SELECT m FROM Mdpersonast m WHERE m.idprorep = :idprorep")
    , @NamedQuery(name = "Mdpersonast.findByIdconv", query = "SELECT m FROM Mdpersonast m WHERE m.idconv = :idconv")
    , @NamedQuery(name = "Mdpersonast.findByDepdob", query = "SELECT m FROM Mdpersonast m WHERE m.depdob = :depdob")
    , @NamedQuery(name = "Mdpersonast.findByIdprov", query = "SELECT m FROM Mdpersonast m WHERE m.idprov = :idprov")
    , @NamedQuery(name = "Mdpersonast.findByIdcreador", query = "SELECT m FROM Mdpersonast m WHERE m.idcreador = :idcreador")
    , @NamedQuery(name = "Mdpersonast.findByIdetnia", query = "SELECT m FROM Mdpersonast m WHERE m.idetnia = :idetnia")
    , @NamedQuery(name = "Mdpersonast.findByIdpais", query = "SELECT m FROM Mdpersonast m WHERE m.idpais = :idpais")
    , @NamedQuery(name = "Mdpersonast.findByIdciudad", query = "SELECT m FROM Mdpersonast m WHERE m.idciudad = :idciudad")})
public class Mdpersonast implements Serializable {

    @Column(name = "aprobado")
    private Boolean aprobado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<Mdcvdp> mdcvdpList;

    @Column(name = "idanosproy")
    private Integer idanosproy;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<Mdcvfa> mdcvfaList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddep")
    private Integer iddep;
    @Size(max = 15)
    @Column(name = "depcedula")
    private String depcedula;
    @Basic(optional = false)
    @Column(name = "idsexo")
    private int idsexo;
    @Size(max = 100)
    @Column(name = "depnombre")
    private String depnombre;
    @Size(max = 100)
    @Column(name = "depapellido")
    private String depapellido;
    @Size(max = 255)
    @Column(name = "depresultados")
    private String depresultados;
    @Size(max = 255)
    @Column(name = "depproyeccion")
    private String depproyeccion;
    @Size(max = 255)
    @Column(name = "depnovedad")
    private String depnovedad;
    @Size(max = 255)
    @Column(name = "depprueba")
    private String depprueba;
    @Basic(optional = false)
    @NotNull
    @Column(name = "orgid")
    private int orgid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddeporte")
    private int iddeporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddis")
    private int iddis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idprorep")
    private int idprorep;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idconv")
    private int idconv;
    @Column(name = "depdob")
    @Temporal(TemporalType.DATE)
    private Date depdob;
    @Size(max = 2147483647)
    @Column(name = "idprov")
    private String idprov;
    @Column(name = "idcreador")
    private Integer idcreador;
    @Size(max = 2147483647)
    @Column(name = "idetnia")
    private String idetnia;
    @Size(max = 2147483647)
    @Column(name = "idpais")
    private String idpais;
    @Size(max = 2147483647)
    @Column(name = "idciudad")
    private String idciudad;

    public Mdpersonast() {
    }

    public Mdpersonast(Integer iddep) {
        this.iddep = iddep;
    }

    public Mdpersonast(Integer iddep, int idsexo, int orgid, int iddeporte, int iddis, int idprorep, int idconv) {
        this.iddep = iddep;
        this.idsexo = idsexo;
        this.orgid = orgid;
        this.iddeporte = iddeporte;
        this.iddis = iddis;
        this.idprorep = idprorep;
        this.idconv = idconv;
    }

    public Integer getIddep() {
        return iddep;
    }

    public void setIddep(Integer iddep) {
        this.iddep = iddep;
    }

    public String getDepcedula() {
        return depcedula;
    }

    public void setDepcedula(String depcedula) {
        this.depcedula = depcedula;
    }

    public int getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(int idsexo) {
        this.idsexo = idsexo;
    }

    public String getDepnombre() {
        return depnombre;
    }

    public void setDepnombre(String depnombre) {
        this.depnombre = depnombre;
    }

    public String getDepapellido() {
        return depapellido;
    }

    public void setDepapellido(String depapellido) {
        this.depapellido = depapellido;
    }

    public String getDepresultados() {
        return depresultados;
    }

    public void setDepresultados(String depresultados) {
        this.depresultados = depresultados;
    }

    public String getDepproyeccion() {
        return depproyeccion;
    }

    public void setDepproyeccion(String depproyeccion) {
        this.depproyeccion = depproyeccion;
    }

    public String getDepnovedad() {
        return depnovedad;
    }

    public void setDepnovedad(String depnovedad) {
        this.depnovedad = depnovedad;
    }

    public String getDepprueba() {
        return depprueba;
    }

    public void setDepprueba(String depprueba) {
        this.depprueba = depprueba;
    }

    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    public int getIddeporte() {
        return iddeporte;
    }

    public void setIddeporte(int iddeporte) {
        this.iddeporte = iddeporte;
    }

    public int getIddis() {
        return iddis;
    }

    public void setIddis(int iddis) {
        this.iddis = iddis;
    }

    public int getIdprorep() {
        return idprorep;
    }

    public void setIdprorep(int idprorep) {
        this.idprorep = idprorep;
    }

    public int getIdconv() {
        return idconv;
    }

    public void setIdconv(int idconv) {
        this.idconv = idconv;
    }

    public Date getDepdob() {
        return depdob;
    }

    public void setDepdob(Date depdob) {
        this.depdob = depdob;
    }

    public String getIdprov() {
        return idprov;
    }

    public void setIdprov(String idprov) {
        this.idprov = idprov;
    }

    public Integer getIdcreador() {
        return idcreador;
    }

    public void setIdcreador(Integer idcreador) {
        this.idcreador = idcreador;
    }

    public String getIdetnia() {
        return idetnia;
    }

    public void setIdetnia(String idetnia) {
        this.idetnia = idetnia;
    }

    public String getIdpais() {
        return idpais;
    }

    public void setIdpais(String idpais) {
        this.idpais = idpais;
    }

    public String getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(String idciudad) {
        this.idciudad = idciudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddep != null ? iddep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdpersonast)) {
            return false;
        }
        Mdpersonast other = (Mdpersonast) object;
        if ((this.iddep == null && other.iddep != null) || (this.iddep != null && !this.iddep.equals(other.iddep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdpersonast[ iddep=" + iddep + " ]";
    }

    @XmlTransient
    public List<Mdcvfa> getMdcvfaList() {
        return mdcvfaList;
    }

    public void setMdcvfaList(List<Mdcvfa> mdcvfaList) {
        this.mdcvfaList = mdcvfaList;
    }

    public Integer getIdanosproy() {
        return idanosproy;
    }

    public void setIdanosproy(Integer idanosproy) {
        this.idanosproy = idanosproy;
    }

    @XmlTransient
    public List<Mdcvdp> getMdcvdpList() {
        return mdcvdpList;
    }

    public void setMdcvdpList(List<Mdcvdp> mdcvdpList) {
        this.mdcvdpList = mdcvdpList;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }
    
}
