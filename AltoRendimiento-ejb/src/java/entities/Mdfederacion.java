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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "mdfederacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdfederacion.findAll", query = "SELECT m FROM Mdfederacion m")
    , @NamedQuery(name = "Mdfederacion.findById", query = "SELECT m FROM Mdfederacion m WHERE m.id = :id")
    , @NamedQuery(name = "Mdfederacion.findByNombre", query = "SELECT m FROM Mdfederacion m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Mdfederacion.findByTipo", query = "SELECT m FROM Mdfederacion m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "Mdfederacion.findBySector", query = "SELECT m FROM Mdfederacion m WHERE m.sector = :sector")
    , @NamedQuery(name = "Mdfederacion.findByDeporte", query = "SELECT m FROM Mdfederacion m WHERE m.deporte = :deporte")
    , @NamedQuery(name = "Mdfederacion.findByEstado", query = "SELECT m FROM Mdfederacion m WHERE m.estado = :estado")
    , @NamedQuery(name = "Mdfederacion.findByNomdep", query = "SELECT m FROM Mdfederacion m WHERE m.nomdep = :nomdep")
    , @NamedQuery(name = "Mdfederacion.findByAd", query = "SELECT m FROM Mdfederacion m WHERE m.ad = :ad")})
public class Mdfederacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "sector")
    private Boolean sector;
    @Column(name = "deporte")
    private Boolean deporte;
    @Column(name = "estado")
    private Boolean estado;
    @Size(max = 2147483647)
    @Column(name = "nomdep")
    private String nomdep;
    @Size(max = 2147483647)
    @Column(name = "ad")
    private String ad;

    public Mdfederacion() {
    }

    public Mdfederacion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getSector() {
        return sector;
    }

    public void setSector(Boolean sector) {
        this.sector = sector;
    }

    public Boolean getDeporte() {
        return deporte;
    }

    public void setDeporte(Boolean deporte) {
        this.deporte = deporte;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getNomdep() {
        return nomdep;
    }

    public void setNomdep(String nomdep) {
        this.nomdep = nomdep;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
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
        if (!(object instanceof Mdfederacion)) {
            return false;
        }
        Mdfederacion other = (Mdfederacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdfederacion[ id=" + id + " ]";
    }
    
}
