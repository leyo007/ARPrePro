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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "mdcvie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdcvie.findAll", query = "SELECT m FROM Mdcvie m")
    , @NamedQuery(name = "Mdcvie.findById", query = "SELECT m FROM Mdcvie m WHERE m.id = :id")
    , @NamedQuery(name = "Mdcvie.findByNombres", query = "SELECT m FROM Mdcvie m WHERE m.nombres = :nombres")
    , @NamedQuery(name = "Mdcvie.findByPassport", query = "SELECT m FROM Mdcvie m WHERE m.passport = :passport")
    , @NamedQuery(name = "Mdcvie.findByDob", query = "SELECT m FROM Mdcvie m WHERE m.dob = :dob")
    , @NamedQuery(name = "Mdcvie.findByGenero", query = "SELECT m FROM Mdcvie m WHERE m.genero = :genero")
    , @NamedQuery(name = "Mdcvie.findByEtnia", query = "SELECT m FROM Mdcvie m WHERE m.etnia = :etnia")
    , @NamedQuery(name = "Mdcvie.findByEstcivl", query = "SELECT m FROM Mdcvie m WHERE m.estcivl = :estcivl")
    , @NamedQuery(name = "Mdcvie.findByPais", query = "SELECT m FROM Mdcvie m WHERE m.pais = :pais")
    , @NamedQuery(name = "Mdcvie.findByProv", query = "SELECT m FROM Mdcvie m WHERE m.prov = :prov")
    , @NamedQuery(name = "Mdcvie.findByCiudad", query = "SELECT m FROM Mdcvie m WHERE m.ciudad = :ciudad")
    , @NamedQuery(name = "Mdcvie.findByNacionalidad", query = "SELECT m FROM Mdcvie m WHERE m.nacionalidad = :nacionalidad")
    , @NamedQuery(name = "Mdcvie.findByProvres", query = "SELECT m FROM Mdcvie m WHERE m.provres = :provres")
    , @NamedQuery(name = "Mdcvie.findByCiudadres", query = "SELECT m FROM Mdcvie m WHERE m.ciudadres = :ciudadres")
    , @NamedQuery(name = "Mdcvie.findByContraproy", query = "SELECT m FROM Mdcvie m WHERE m.contraproy = :contraproy")
    , @NamedQuery(name = "Mdcvie.findByContrafdp", query = "SELECT m FROM Mdcvie m WHERE m.contrafdp = :contrafdp")
    , @NamedQuery(name = "Mdcvie.findByTipocontra", query = "SELECT m FROM Mdcvie m WHERE m.tipocontra = :tipocontra")
    , @NamedQuery(name = "Mdcvie.findByLvlinst", query = "SELECT m FROM Mdcvie m WHERE m.lvlinst = :lvlinst")
    , @NamedQuery(name = "Mdcvie.findByEsp", query = "SELECT m FROM Mdcvie m WHERE m.esp = :esp")
    , @NamedQuery(name = "Mdcvie.findByIngresoar", query = "SELECT m FROM Mdcvie m WHERE m.ingresoar = :ingresoar")
    , @NamedQuery(name = "Mdcvie.findByDir", query = "SELECT m FROM Mdcvie m WHERE m.dir = :dir")
    , @NamedQuery(name = "Mdcvie.findByTdet", query = "SELECT m FROM Mdcvie m WHERE m.tdet = :tdet")
    , @NamedQuery(name = "Mdcvie.findByTcalent", query = "SELECT m FROM Mdcvie m WHERE m.tcalent = :tcalent")
    , @NamedQuery(name = "Mdcvie.findByTcamiseta", query = "SELECT m FROM Mdcvie m WHERE m.tcamiseta = :tcamiseta")
    , @NamedQuery(name = "Mdcvie.findByTshort", query = "SELECT m FROM Mdcvie m WHERE m.tshort = :tshort")
    , @NamedQuery(name = "Mdcvie.findByTmedias", query = "SELECT m FROM Mdcvie m WHERE m.tmedias = :tmedias")
    , @NamedQuery(name = "Mdcvie.findByTcalzado", query = "SELECT m FROM Mdcvie m WHERE m.tcalzado = :tcalzado")
    , @NamedQuery(name = "Mdcvie.findByCi", query = "SELECT m FROM Mdcvie m WHERE m.ci = :ci")
    , @NamedQuery(name = "Mdcvie.findByApellidos", query = "SELECT m FROM Mdcvie m WHERE m.apellidos = :apellidos")})
public class Mdcvie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 2147483647)
    @Column(name = "passport")
    private String passport;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "genero")
    private Boolean genero;
    @Size(max = 2147483647)
    @Column(name = "etnia")
    private String etnia;
    @Size(max = 2147483647)
    @Column(name = "estcivl")
    private String estcivl;
    @Size(max = 2147483647)
    @Column(name = "pais")
    private String pais;
    @Size(max = 2147483647)
    @Column(name = "prov")
    private String prov;
    @Size(max = 2147483647)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 2147483647)
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Size(max = 2147483647)
    @Column(name = "provres")
    private String provres;
    @Size(max = 2147483647)
    @Column(name = "ciudadres")
    private String ciudadres;
    @Column(name = "contraproy")
    private Boolean contraproy;
    @Column(name = "contrafdp")
    private Boolean contrafdp;
    @Size(max = 2147483647)
    @Column(name = "tipocontra")
    private String tipocontra;
    @Size(max = 2147483647)
    @Column(name = "lvlinst")
    private String lvlinst;
    @Size(max = 2147483647)
    @Column(name = "esp")
    private String esp;
    @Column(name = "ingresoar")
    private Integer ingresoar;
    @Size(max = 2147483647)
    @Column(name = "dir")
    private String dir;
    @Size(max = 2147483647)
    @Column(name = "tdet")
    private String tdet;
    @Size(max = 2147483647)
    @Column(name = "tcalent")
    private String tcalent;
    @Size(max = 2147483647)
    @Column(name = "tcamiseta")
    private String tcamiseta;
    @Size(max = 2147483647)
    @Column(name = "tshort")
    private String tshort;
    @Size(max = 2147483647)
    @Column(name = "tmedias")
    private String tmedias;
    @Size(max = 2147483647)
    @Column(name = "tcalzado")
    private String tcalzado;
    @Size(max = 2147483647)
    @Column(name = "ci")
    private String ci;
    @Size(max = 2147483647)
    @Column(name = "apellidos")
    private String apellidos;
    @JoinColumn(name = "persona", referencedColumnName = "iddep")
    @ManyToOne(optional = false)
    private Mdpersonast persona;

    public Mdcvie() {
    }

    public Mdcvie(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Boolean getGenero() {
        return genero;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getEstcivl() {
        return estcivl;
    }

    public void setEstcivl(String estcivl) {
        this.estcivl = estcivl;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getProvres() {
        return provres;
    }

    public void setProvres(String provres) {
        this.provres = provres;
    }

    public String getCiudadres() {
        return ciudadres;
    }

    public void setCiudadres(String ciudadres) {
        this.ciudadres = ciudadres;
    }

    public Boolean getContraproy() {
        return contraproy;
    }

    public void setContraproy(Boolean contraproy) {
        this.contraproy = contraproy;
    }

    public Boolean getContrafdp() {
        return contrafdp;
    }

    public void setContrafdp(Boolean contrafdp) {
        this.contrafdp = contrafdp;
    }

    public String getTipocontra() {
        return tipocontra;
    }

    public void setTipocontra(String tipocontra) {
        this.tipocontra = tipocontra;
    }

    public String getLvlinst() {
        return lvlinst;
    }

    public void setLvlinst(String lvlinst) {
        this.lvlinst = lvlinst;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public Integer getIngresoar() {
        return ingresoar;
    }

    public void setIngresoar(Integer ingresoar) {
        this.ingresoar = ingresoar;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTdet() {
        return tdet;
    }

    public void setTdet(String tdet) {
        this.tdet = tdet;
    }

    public String getTcalent() {
        return tcalent;
    }

    public void setTcalent(String tcalent) {
        this.tcalent = tcalent;
    }

    public String getTcamiseta() {
        return tcamiseta;
    }

    public void setTcamiseta(String tcamiseta) {
        this.tcamiseta = tcamiseta;
    }

    public String getTshort() {
        return tshort;
    }

    public void setTshort(String tshort) {
        this.tshort = tshort;
    }

    public String getTmedias() {
        return tmedias;
    }

    public void setTmedias(String tmedias) {
        this.tmedias = tmedias;
    }

    public String getTcalzado() {
        return tcalzado;
    }

    public void setTcalzado(String tcalzado) {
        this.tcalzado = tcalzado;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Mdpersonast getPersona() {
        return persona;
    }

    public void setPersona(Mdpersonast persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdcvie)) {
            return false;
        }
        Mdcvie other = (Mdcvie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdcvie[ id=" + id + " ]";
    }
    
}
