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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "mdcvdp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdcvdp.findAll", query = "SELECT m FROM Mdcvdp m")
    , @NamedQuery(name = "Mdcvdp.findById", query = "SELECT m FROM Mdcvdp m WHERE m.id = :id")
    , @NamedQuery(name = "Mdcvdp.findByVivecon", query = "SELECT m FROM Mdcvdp m WHERE m.vivecon = :vivecon")
    , @NamedQuery(name = "Mdcvdp.findByEstcivil", query = "SELECT m FROM Mdcvdp m WHERE m.estcivil = :estcivil")
    , @NamedQuery(name = "Mdcvdp.findByHijos", query = "SELECT m FROM Mdcvdp m WHERE m.hijos = :hijos")
    , @NamedQuery(name = "Mdcvdp.findByHerma", query = "SELECT m FROM Mdcvdp m WHERE m.herma = :herma")
    , @NamedQuery(name = "Mdcvdp.findByProvres", query = "SELECT m FROM Mdcvdp m WHERE m.provres = :provres")
    , @NamedQuery(name = "Mdcvdp.findByCiudres", query = "SELECT m FROM Mdcvdp m WHERE m.ciudres = :ciudres")
    , @NamedQuery(name = "Mdcvdp.findByTipovivienda", query = "SELECT m FROM Mdcvdp m WHERE m.tipovivienda = :tipovivienda")
    , @NamedQuery(name = "Mdcvdp.findByTelfijo", query = "SELECT m FROM Mdcvdp m WHERE m.telfijo = :telfijo")
    , @NamedQuery(name = "Mdcvdp.findByTelfmovil", query = "SELECT m FROM Mdcvdp m WHERE m.telfmovil = :telfmovil")
    , @NamedQuery(name = "Mdcvdp.findByDir", query = "SELECT m FROM Mdcvdp m WHERE m.dir = :dir")
    , @NamedQuery(name = "Mdcvdp.findByMail", query = "SELECT m FROM Mdcvdp m WHERE m.mail = :mail")
    , @NamedQuery(name = "Mdcvdp.findByLvlse", query = "SELECT m FROM Mdcvdp m WHERE m.lvlse = :lvlse")
    , @NamedQuery(name = "Mdcvdp.findByAnoproyecto", query = "SELECT m FROM Mdcvdp m WHERE m.anoproyecto = :anoproyecto")
    , @NamedQuery(name = "Mdcvdp.findByAnoinicio", query = "SELECT m FROM Mdcvdp m WHERE m.anoinicio = :anoinicio")
    , @NamedQuery(name = "Mdcvdp.findByAnoendeporte", query = "SELECT m FROM Mdcvdp m WHERE m.anoendeporte = :anoendeporte")
    , @NamedQuery(name = "Mdcvdp.findByTcalen", query = "SELECT m FROM Mdcvdp m WHERE m.tcalen = :tcalen")
    , @NamedQuery(name = "Mdcvdp.findByTcami", query = "SELECT m FROM Mdcvdp m WHERE m.tcami = :tcami")
    , @NamedQuery(name = "Mdcvdp.findByTshort", query = "SELECT m FROM Mdcvdp m WHERE m.tshort = :tshort")
    , @NamedQuery(name = "Mdcvdp.findByTmedias", query = "SELECT m FROM Mdcvdp m WHERE m.tmedias = :tmedias")
    , @NamedQuery(name = "Mdcvdp.findByTcalzado", query = "SELECT m FROM Mdcvdp m WHERE m.tcalzado = :tcalzado")})
public class Mdcvdp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "vivecon")
    private String vivecon;
    @Size(max = 2147483647)
    @Column(name = "estcivil")
    private String estcivil;
    @Column(name = "hijos")
    private Integer hijos;
    @Column(name = "herma")
    private Integer herma;
    @Size(max = 2147483647)
    @Column(name = "provres")
    private String provres;
    @Size(max = 2147483647)
    @Column(name = "ciudres")
    private String ciudres;
    @Size(max = 2147483647)
    @Column(name = "tipovivienda")
    private String tipovivienda;
    @Column(name = "telfijo")
    private Integer telfijo;
    @Column(name = "telfmovil")
    private Integer telfmovil;
    @Size(max = 2147483647)
    @Column(name = "dir")
    private String dir;
    @Size(max = 2147483647)
    @Column(name = "mail")
    private String mail;
    @Size(max = 2147483647)
    @Column(name = "lvlse")
    private String lvlse;
    @Column(name = "anoproyecto")
    private Integer anoproyecto;
    @Column(name = "anoinicio")
    private Integer anoinicio;
    @Column(name = "anoendeporte")
    private Integer anoendeporte;
    @Size(max = 2147483647)
    @Column(name = "tcalen")
    private String tcalen;
    @Size(max = 2147483647)
    @Column(name = "tcami")
    private String tcami;
    @Size(max = 2147483647)
    @Column(name = "tshort")
    private String tshort;
    @Size(max = 2147483647)
    @Column(name = "tmedias")
    private String tmedias;
    @Size(max = 2147483647)
    @Column(name = "tcalzado")
    private String tcalzado;
    @JoinColumn(name = "persona", referencedColumnName = "iddep")
    @ManyToOne(optional = false)
    private Mdpersonast persona;

    public Mdcvdp() {
    }

    public Mdcvdp(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVivecon() {
        return vivecon;
    }

    public void setVivecon(String vivecon) {
        this.vivecon = vivecon;
    }

    public String getEstcivil() {
        return estcivil;
    }

    public void setEstcivil(String estcivil) {
        this.estcivil = estcivil;
    }

    public Integer getHijos() {
        return hijos;
    }

    public void setHijos(Integer hijos) {
        this.hijos = hijos;
    }

    public Integer getHerma() {
        return herma;
    }

    public void setHerma(Integer herma) {
        this.herma = herma;
    }

    public String getProvres() {
        return provres;
    }

    public void setProvres(String provres) {
        this.provres = provres;
    }

    public String getCiudres() {
        return ciudres;
    }

    public void setCiudres(String ciudres) {
        this.ciudres = ciudres;
    }

    public String getTipovivienda() {
        return tipovivienda;
    }

    public void setTipovivienda(String tipovivienda) {
        this.tipovivienda = tipovivienda;
    }

    public Integer getTelfijo() {
        return telfijo;
    }

    public void setTelfijo(Integer telfijo) {
        this.telfijo = telfijo;
    }

    public Integer getTelfmovil() {
        return telfmovil;
    }

    public void setTelfmovil(Integer telfmovil) {
        this.telfmovil = telfmovil;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLvlse() {
        return lvlse;
    }

    public void setLvlse(String lvlse) {
        this.lvlse = lvlse;
    }

    public Integer getAnoproyecto() {
        return anoproyecto;
    }

    public void setAnoproyecto(Integer anoproyecto) {
        this.anoproyecto = anoproyecto;
    }

    public Integer getAnoinicio() {
        return anoinicio;
    }

    public void setAnoinicio(Integer anoinicio) {
        this.anoinicio = anoinicio;
    }

    public Integer getAnoendeporte() {
        return anoendeporte;
    }

    public void setAnoendeporte(Integer anoendeporte) {
        this.anoendeporte = anoendeporte;
    }

    public String getTcalen() {
        return tcalen;
    }

    public void setTcalen(String tcalen) {
        this.tcalen = tcalen;
    }

    public String getTcami() {
        return tcami;
    }

    public void setTcami(String tcami) {
        this.tcami = tcami;
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
        if (!(object instanceof Mdcvdp)) {
            return false;
        }
        Mdcvdp other = (Mdcvdp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdcvdp[ id=" + id + " ]";
    }
    
}
