/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "md_organizaciones_t")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MdOrganizacionesT.findAll", query = "SELECT m FROM MdOrganizacionesT m")
    , @NamedQuery(name = "MdOrganizacionesT.findByIdOrg", query = "SELECT m FROM MdOrganizacionesT m WHERE m.idOrg = :idOrg")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgCodigo", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgCodigo = :orgCodigo")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgNombre", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgNombre = :orgNombre")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgCalle1", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgCalle1 = :orgCalle1")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgInterseccion", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgInterseccion = :orgInterseccion")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgNumCasa", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgNumCasa = :orgNumCasa")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgTelefono", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgTelefono = :orgTelefono")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgEmail", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgEmail = :orgEmail")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgRuc", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgRuc = :orgRuc")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgCreador", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgCreador = :orgCreador")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgProvincia", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgProvincia = :orgProvincia")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgCanton", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgCanton = :orgCanton")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrParroquia", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orParroquia = :orParroquia")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgFecIngreso", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgFecIngreso = :orgFecIngreso")
    , @NamedQuery(name = "MdOrganizacionesT.findByOrgFecSalida", query = "SELECT m FROM MdOrganizacionesT m WHERE m.orgFecSalida = :orgFecSalida")
    , @NamedQuery(name = "MdOrganizacionesT.findByIdTipo", query = "SELECT m FROM MdOrganizacionesT m WHERE m.idTipo = :idTipo")
    , @NamedQuery(name = "MdOrganizacionesT.findByIdUsuario", query = "SELECT m FROM MdOrganizacionesT m WHERE m.idUsuario = :idUsuario")})
public class MdOrganizacionesT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_org")
    private Integer idOrg;
    @Size(max = 255)
    @Column(name = "org_codigo")
    private String orgCodigo;
    @Size(max = 100)
    @Column(name = "org_nombre")
    private String orgNombre;
    @Size(max = 200)
    @Column(name = "org_calle1")
    private String orgCalle1;
    @Size(max = 100)
    @Column(name = "org_interseccion")
    private String orgInterseccion;
    @Size(max = 10)
    @Column(name = "org_num_casa")
    private String orgNumCasa;
    @Size(max = 15)
    @Column(name = "org_telefono")
    private String orgTelefono;
    @Size(max = 100)
    @Column(name = "org_email")
    private String orgEmail;
    @Size(max = 15)
    @Column(name = "org_ruc")
    private String orgRuc;
    @Size(max = 100)
    @Column(name = "org_creador")
    private String orgCreador;
    @Column(name = "org_provincia")
    private Integer orgProvincia;
    @Column(name = "org_canton")
    private Integer orgCanton;
    @Column(name = "or_parroquia")
    private Integer orParroquia;
    @Column(name = "org_fec_ingreso")
    @Temporal(TemporalType.DATE)
    private Date orgFecIngreso;
    @Column(name = "org_fec_salida")
    @Temporal(TemporalType.DATE)
    private Date orgFecSalida;
    @Column(name = "id_tipo")
    private Integer idTipo;
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @JoinColumn(name = "id_org", referencedColumnName = "id_org", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private MdUsuarioOrgT mdUsuarioOrgT;

    public MdOrganizacionesT() {
    }

    public MdOrganizacionesT(Integer idOrg) {
        this.idOrg = idOrg;
    }

    public Integer getIdOrg() {
        return idOrg;
    }

    public void setIdOrg(Integer idOrg) {
        this.idOrg = idOrg;
    }

    public String getOrgCodigo() {
        return orgCodigo;
    }

    public void setOrgCodigo(String orgCodigo) {
        this.orgCodigo = orgCodigo;
    }

    public String getOrgNombre() {
        return orgNombre;
    }

    public void setOrgNombre(String orgNombre) {
        this.orgNombre = orgNombre;
    }

    public String getOrgCalle1() {
        return orgCalle1;
    }

    public void setOrgCalle1(String orgCalle1) {
        this.orgCalle1 = orgCalle1;
    }

    public String getOrgInterseccion() {
        return orgInterseccion;
    }

    public void setOrgInterseccion(String orgInterseccion) {
        this.orgInterseccion = orgInterseccion;
    }

    public String getOrgNumCasa() {
        return orgNumCasa;
    }

    public void setOrgNumCasa(String orgNumCasa) {
        this.orgNumCasa = orgNumCasa;
    }

    public String getOrgTelefono() {
        return orgTelefono;
    }

    public void setOrgTelefono(String orgTelefono) {
        this.orgTelefono = orgTelefono;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getOrgRuc() {
        return orgRuc;
    }

    public void setOrgRuc(String orgRuc) {
        this.orgRuc = orgRuc;
    }

    public String getOrgCreador() {
        return orgCreador;
    }

    public void setOrgCreador(String orgCreador) {
        this.orgCreador = orgCreador;
    }

    public Integer getOrgProvincia() {
        return orgProvincia;
    }

    public void setOrgProvincia(Integer orgProvincia) {
        this.orgProvincia = orgProvincia;
    }

    public Integer getOrgCanton() {
        return orgCanton;
    }

    public void setOrgCanton(Integer orgCanton) {
        this.orgCanton = orgCanton;
    }

    public Integer getOrParroquia() {
        return orParroquia;
    }

    public void setOrParroquia(Integer orParroquia) {
        this.orParroquia = orParroquia;
    }

    public Date getOrgFecIngreso() {
        return orgFecIngreso;
    }

    public void setOrgFecIngreso(Date orgFecIngreso) {
        this.orgFecIngreso = orgFecIngreso;
    }

    public Date getOrgFecSalida() {
        return orgFecSalida;
    }

    public void setOrgFecSalida(Date orgFecSalida) {
        this.orgFecSalida = orgFecSalida;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public MdUsuarioOrgT getMdUsuarioOrgT() {
        return mdUsuarioOrgT;
    }

    public void setMdUsuarioOrgT(MdUsuarioOrgT mdUsuarioOrgT) {
        this.mdUsuarioOrgT = mdUsuarioOrgT;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrg != null ? idOrg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdOrganizacionesT)) {
            return false;
        }
        MdOrganizacionesT other = (MdOrganizacionesT) object;
        if ((this.idOrg == null && other.idOrg != null) || (this.idOrg != null && !this.idOrg.equals(other.idOrg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.MdOrganizacionesT[ idOrg=" + idOrg + " ]";
    }
    
}
