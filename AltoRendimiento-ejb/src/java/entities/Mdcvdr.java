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
@Table(name = "mdcvdr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdcvdr.findAll", query = "SELECT m FROM Mdcvdr m")
    , @NamedQuery(name = "Mdcvdr.findById", query = "SELECT m FROM Mdcvdr m WHERE m.id = :id")
    , @NamedQuery(name = "Mdcvdr.findByDistinciones", query = "SELECT m FROM Mdcvdr m WHERE m.distinciones = :distinciones")
    , @NamedQuery(name = "Mdcvdr.findByTipo", query = "SELECT m FROM Mdcvdr m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "Mdcvdr.findByEntidad", query = "SELECT m FROM Mdcvdr m WHERE m.entidad = :entidad")
    , @NamedQuery(name = "Mdcvdr.findByPersona", query = "SELECT m FROM Mdcvdr m WHERE m.persona = :persona")
    , @NamedQuery(name = "Mdcvdr.findByFecha", query = "SELECT m FROM Mdcvdr m WHERE m.fecha = :fecha")})
public class Mdcvdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "distinciones")
    private String distinciones;
    @Size(max = 2147483647)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 2147483647)
    @Column(name = "entidad")
    private String entidad;
    @Basic(optional = false)
    @Column(name = "persona")
    private int persona;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Mdcvdr() {
    }

    public Mdcvdr(Integer id) {
        this.id = id;
    }

    public Mdcvdr(Integer id, int persona) {
        this.id = id;
        this.persona = persona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        if (!(object instanceof Mdcvdr)) {
            return false;
        }
        Mdcvdr other = (Mdcvdr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdcvdr[ id=" + id + " ]";
    }
    
}
