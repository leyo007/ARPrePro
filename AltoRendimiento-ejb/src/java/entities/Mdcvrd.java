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
@Table(name = "mdcvrd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdcvrd.findAll", query = "SELECT m FROM Mdcvrd m")
    , @NamedQuery(name = "Mdcvrd.findById", query = "SELECT m FROM Mdcvrd m WHERE m.id = :id")
    , @NamedQuery(name = "Mdcvrd.findByEvento", query = "SELECT m FROM Mdcvrd m WHERE m.evento = :evento")
    , @NamedQuery(name = "Mdcvrd.findByFecha", query = "SELECT m FROM Mdcvrd m WHERE m.fecha = :fecha")
    , @NamedQuery(name = "Mdcvrd.findByLugar", query = "SELECT m FROM Mdcvrd m WHERE m.lugar = :lugar")
    , @NamedQuery(name = "Mdcvrd.findByPrueba", query = "SELECT m FROM Mdcvrd m WHERE m.prueba = :prueba")
    , @NamedQuery(name = "Mdcvrd.findByUbicacion", query = "SELECT m FROM Mdcvrd m WHERE m.ubicacion = :ubicacion")
    , @NamedQuery(name = "Mdcvrd.findByNumatle", query = "SELECT m FROM Mdcvrd m WHERE m.numatle = :numatle")
    , @NamedQuery(name = "Mdcvrd.findByNpaises", query = "SELECT m FROM Mdcvrd m WHERE m.npaises = :npaises")
    , @NamedQuery(name = "Mdcvrd.findByMarca", query = "SELECT m FROM Mdcvrd m WHERE m.marca = :marca")
    , @NamedQuery(name = "Mdcvrd.findByPersona", query = "SELECT m FROM Mdcvrd m WHERE m.persona = :persona")})
public class Mdcvrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "evento")
    private String evento;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 2147483647)
    @Column(name = "lugar")
    private String lugar;
    @Size(max = 2147483647)
    @Column(name = "prueba")
    private String prueba;
    @Size(max = 2147483647)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Column(name = "numatle")
    private Integer numatle;
    @Column(name = "npaises")
    private Integer npaises;
    @Column(name = "marca")
    @Temporal(TemporalType.TIME)
    private Date marca;
    @Basic(optional = false)
    @Column(name = "persona")
    private int persona;

    public Mdcvrd() {
    }

    public Mdcvrd(Integer id) {
        this.id = id;
    }

    public Mdcvrd(Integer id, int persona) {
        this.id = id;
        this.persona = persona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getNumatle() {
        return numatle;
    }

    public void setNumatle(Integer numatle) {
        this.numatle = numatle;
    }

    public Integer getNpaises() {
        return npaises;
    }

    public void setNpaises(Integer npaises) {
        this.npaises = npaises;
    }

    public Date getMarca() {
        return marca;
    }

    public void setMarca(Date marca) {
        this.marca = marca;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
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
        if (!(object instanceof Mdcvrd)) {
            return false;
        }
        Mdcvrd other = (Mdcvrd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdcvrd[ id=" + id + " ]";
    }
    
}
