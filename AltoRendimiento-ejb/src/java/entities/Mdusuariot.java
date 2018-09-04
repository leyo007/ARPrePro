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
@Table(name = "mdusuariot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdusuariot.findAll", query = "SELECT m FROM Mdusuariot m")
    , @NamedQuery(name = "Mdusuariot.findByIdusuario", query = "SELECT m FROM Mdusuariot m WHERE m.idusuario = :idusuario")
    , @NamedQuery(name = "Mdusuariot.findByUsunombre", query = "SELECT m FROM Mdusuariot m WHERE m.usunombre = :usunombre")
    , @NamedQuery(name = "Mdusuariot.findByUsuclave", query = "SELECT m FROM Mdusuariot m WHERE m.usuclave = :usuclave")
    , @NamedQuery(name = "Mdusuariot.findByUsumail", query = "SELECT m FROM Mdusuariot m WHERE m.usumail = :usumail")
    , @NamedQuery(name = "Mdusuariot.findByUsuestado", query = "SELECT m FROM Mdusuariot m WHERE m.usuestado = :usuestado")
    , @NamedQuery(name = "Mdusuariot.findByUsucedula", query = "SELECT m FROM Mdusuariot m WHERE m.usucedula = :usucedula")
    , @NamedQuery(name = "Mdusuariot.findByIdacticode", query = "SELECT m FROM Mdusuariot m WHERE m.idacticode = :idacticode")
    , @NamedQuery(name = "Mdusuariot.findByIndexistindb", query = "SELECT m FROM Mdusuariot m WHERE m.indexistindb = :indexistindb")
    , @NamedQuery(name = "Mdusuariot.findByUsunombres", query = "SELECT m FROM Mdusuariot m WHERE m.usunombres = :usunombres")
    , @NamedQuery(name = "Mdusuariot.findByUsuapellidos", query = "SELECT m FROM Mdusuariot m WHERE m.usuapellidos = :usuapellidos")
    , @NamedQuery(name = "Mdusuariot.findByUsuedad", query = "SELECT m FROM Mdusuariot m WHERE m.usuedad = :usuedad")
    , @NamedQuery(name = "Mdusuariot.findByUsusexo", query = "SELECT m FROM Mdusuariot m WHERE m.ususexo = :ususexo")
    , @NamedQuery(name = "Mdusuariot.findByUsufecnac", query = "SELECT m FROM Mdusuariot m WHERE m.usufecnac = :usufecnac")
    , @NamedQuery(name = "Mdusuariot.findByInstitucion", query = "SELECT m FROM Mdusuariot m WHERE m.institucion = :institucion")
    , @NamedQuery(name = "Mdusuariot.findByCodinst", query = "SELECT m FROM Mdusuariot m WHERE m.codinst = :codinst")
    , @NamedQuery(name = "Mdusuariot.findByEntrenador", query = "SELECT m FROM Mdusuariot m WHERE m.entrenador = :entrenador")})
public class Mdusuariot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuario")
    private Integer idusuario;
    @Size(max = 100)
    @Column(name = "usunombre")
    private String usunombre;
    @Size(max = 100)
    @Column(name = "usuclave")
    private String usuclave;
    @Size(max = 100)
    @Column(name = "usumail")
    private String usumail;
    @Size(max = 255)
    @Column(name = "usuestado")
    private String usuestado;
    @Size(max = 10)
    @Column(name = "usucedula")
    private String usucedula;
    @Column(name = "idacticode")
    private Integer idacticode;
    @Size(max = 100)
    @Column(name = "indexistindb")
    private String indexistindb;
    @Size(max = 100)
    @Column(name = "usunombres")
    private String usunombres;
    @Size(max = 100)
    @Column(name = "usuapellidos")
    private String usuapellidos;
    @Column(name = "usuedad")
    private Integer usuedad;
    @Size(max = 10)
    @Column(name = "ususexo")
    private String ususexo;
    @Column(name = "usufecnac")
    @Temporal(TemporalType.DATE)
    private Date usufecnac;
    @Size(max = 2147483647)
    @Column(name = "institucion")
    private String institucion;
    @Basic(optional = false)
    @Column(name = "codinst")
    private int codinst;
    @Column(name = "entrenador")
    private Boolean entrenador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cargadox")
    private List<Mdreportes> mdreportesList;

    public Mdusuariot() {
    }

    public Mdusuariot(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Mdusuariot(Integer idusuario, int codinst) {
        this.idusuario = idusuario;
        this.codinst = codinst;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsunombre() {
        return usunombre;
    }

    public void setUsunombre(String usunombre) {
        this.usunombre = usunombre;
    }

    public String getUsuclave() {
        return usuclave;
    }

    public void setUsuclave(String usuclave) {
        this.usuclave = usuclave;
    }

    public String getUsumail() {
        return usumail;
    }

    public void setUsumail(String usumail) {
        this.usumail = usumail;
    }

    public String getUsuestado() {
        return usuestado;
    }

    public void setUsuestado(String usuestado) {
        this.usuestado = usuestado;
    }

    public String getUsucedula() {
        return usucedula;
    }

    public void setUsucedula(String usucedula) {
        this.usucedula = usucedula;
    }

    public Integer getIdacticode() {
        return idacticode;
    }

    public void setIdacticode(Integer idacticode) {
        this.idacticode = idacticode;
    }

    public String getIndexistindb() {
        return indexistindb;
    }

    public void setIndexistindb(String indexistindb) {
        this.indexistindb = indexistindb;
    }

    public String getUsunombres() {
        return usunombres;
    }

    public void setUsunombres(String usunombres) {
        this.usunombres = usunombres;
    }

    public String getUsuapellidos() {
        return usuapellidos;
    }

    public void setUsuapellidos(String usuapellidos) {
        this.usuapellidos = usuapellidos;
    }

    public Integer getUsuedad() {
        return usuedad;
    }

    public void setUsuedad(Integer usuedad) {
        this.usuedad = usuedad;
    }

    public String getUsusexo() {
        return ususexo;
    }

    public void setUsusexo(String ususexo) {
        this.ususexo = ususexo;
    }

    public Date getUsufecnac() {
        return usufecnac;
    }

    public void setUsufecnac(Date usufecnac) {
        this.usufecnac = usufecnac;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public int getCodinst() {
        return codinst;
    }

    public void setCodinst(int codinst) {
        this.codinst = codinst;
    }

    public Boolean getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Boolean entrenador) {
        this.entrenador = entrenador;
    }

    @XmlTransient
    public List<Mdreportes> getMdreportesList() {
        return mdreportesList;
    }

    public void setMdreportesList(List<Mdreportes> mdreportesList) {
        this.mdreportesList = mdreportesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdusuariot)) {
            return false;
        }
        Mdusuariot other = (Mdusuariot) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdusuariot[ idusuario=" + idusuario + " ]";
    }
    
}
