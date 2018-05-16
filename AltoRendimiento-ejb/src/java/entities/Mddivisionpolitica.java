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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "mddivisionpolitica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mddivisionpolitica.findAll", query = "SELECT m FROM Mddivisionpolitica m")
    , @NamedQuery(name = "Mddivisionpolitica.findByIddivpol", query = "SELECT m FROM Mddivisionpolitica m WHERE m.iddivpol = :iddivpol")
    , @NamedQuery(name = "Mddivisionpolitica.findByIdzona", query = "SELECT m FROM Mddivisionpolitica m WHERE m.idzona = :idzona")
    , @NamedQuery(name = "Mddivisionpolitica.findByDivdistrito", query = "SELECT m FROM Mddivisionpolitica m WHERE m.divdistrito = :divdistrito")
    , @NamedQuery(name = "Mddivisionpolitica.findByDivcircuito", query = "SELECT m FROM Mddivisionpolitica m WHERE m.divcircuito = :divcircuito")
    , @NamedQuery(name = "Mddivisionpolitica.findByIdprovinciaorgdep", query = "SELECT m FROM Mddivisionpolitica m WHERE m.idprovinciaorgdep = :idprovinciaorgdep")
    , @NamedQuery(name = "Mddivisionpolitica.findByIdcantonorgdep", query = "SELECT m FROM Mddivisionpolitica m WHERE m.idcantonorgdep = :idcantonorgdep")
    , @NamedQuery(name = "Mddivisionpolitica.findByIdparroquiaorgdep", query = "SELECT m FROM Mddivisionpolitica m WHERE m.idparroquiaorgdep = :idparroquiaorgdep")
    , @NamedQuery(name = "Mddivisionpolitica.findByNombredivpol", query = "SELECT m FROM Mddivisionpolitica m WHERE m.nombredivpol = :nombredivpol")
    , @NamedQuery(name = "Mddivisionpolitica.findByIdzonamindep", query = "SELECT m FROM Mddivisionpolitica m WHERE m.idzonamindep = :idzonamindep")
    , @NamedQuery(name = "Mddivisionpolitica.findByHabilitada", query = "SELECT m FROM Mddivisionpolitica m WHERE m.habilitada = :habilitada")})
public class Mddivisionpolitica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddivpol")
    private Integer iddivpol;
    @Column(name = "idzona")
    private Integer idzona;
    @Column(name = "divdistrito")
    private Integer divdistrito;
    @Column(name = "divcircuito")
    private Integer divcircuito;
    @Column(name = "idprovinciaorgdep")
    private Integer idprovinciaorgdep;
    @Column(name = "idcantonorgdep")
    private Integer idcantonorgdep;
    @Column(name = "idparroquiaorgdep")
    private Integer idparroquiaorgdep;
    @Size(max = 255)
    @Column(name = "nombredivpol")
    private String nombredivpol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idzonamindep")
    private int idzonamindep;
    @Column(name = "habilitada")
    private Boolean habilitada;

    public Mddivisionpolitica() {
    }

    public Mddivisionpolitica(Integer iddivpol) {
        this.iddivpol = iddivpol;
    }

    public Mddivisionpolitica(Integer iddivpol, int idzonamindep) {
        this.iddivpol = iddivpol;
        this.idzonamindep = idzonamindep;
    }

    public Integer getIddivpol() {
        return iddivpol;
    }

    public void setIddivpol(Integer iddivpol) {
        this.iddivpol = iddivpol;
    }

    public Integer getIdzona() {
        return idzona;
    }

    public void setIdzona(Integer idzona) {
        this.idzona = idzona;
    }

    public Integer getDivdistrito() {
        return divdistrito;
    }

    public void setDivdistrito(Integer divdistrito) {
        this.divdistrito = divdistrito;
    }

    public Integer getDivcircuito() {
        return divcircuito;
    }

    public void setDivcircuito(Integer divcircuito) {
        this.divcircuito = divcircuito;
    }

    public Integer getIdprovinciaorgdep() {
        return idprovinciaorgdep;
    }

    public void setIdprovinciaorgdep(Integer idprovinciaorgdep) {
        this.idprovinciaorgdep = idprovinciaorgdep;
    }

    public Integer getIdcantonorgdep() {
        return idcantonorgdep;
    }

    public void setIdcantonorgdep(Integer idcantonorgdep) {
        this.idcantonorgdep = idcantonorgdep;
    }

    public Integer getIdparroquiaorgdep() {
        return idparroquiaorgdep;
    }

    public void setIdparroquiaorgdep(Integer idparroquiaorgdep) {
        this.idparroquiaorgdep = idparroquiaorgdep;
    }

    public String getNombredivpol() {
        return nombredivpol;
    }

    public void setNombredivpol(String nombredivpol) {
        this.nombredivpol = nombredivpol;
    }

    public int getIdzonamindep() {
        return idzonamindep;
    }

    public void setIdzonamindep(int idzonamindep) {
        this.idzonamindep = idzonamindep;
    }

    public Boolean getHabilitada() {
        return habilitada;
    }

    public void setHabilitada(Boolean habilitada) {
        this.habilitada = habilitada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddivpol != null ? iddivpol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mddivisionpolitica)) {
            return false;
        }
        Mddivisionpolitica other = (Mddivisionpolitica) object;
        if ((this.iddivpol == null && other.iddivpol != null) || (this.iddivpol != null && !this.iddivpol.equals(other.iddivpol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mddivisionpolitica[ iddivpol=" + iddivpol + " ]";
    }
    
}
