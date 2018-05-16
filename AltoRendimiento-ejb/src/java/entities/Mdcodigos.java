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
@Table(name = "mdcodigos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdcodigos.findAll", query = "SELECT m FROM Mdcodigos m")
    , @NamedQuery(name = "Mdcodigos.findById", query = "SELECT m FROM Mdcodigos m WHERE m.id = :id")
    , @NamedQuery(name = "Mdcodigos.findByNombre", query = "SELECT m FROM Mdcodigos m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Mdcodigos.findByValor", query = "SELECT m FROM Mdcodigos m WHERE m.valor = :valor")
    , @NamedQuery(name = "Mdcodigos.findByActivo", query = "SELECT m FROM Mdcodigos m WHERE m.activo = :activo")})
public class Mdcodigos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Float valor;
    @Column(name = "activo")
    private Boolean activo;

    public Mdcodigos() {
    }

    public Mdcodigos(Integer id) {
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

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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
        if (!(object instanceof Mdcodigos)) {
            return false;
        }
        Mdcodigos other = (Mdcodigos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdcodigos[ id=" + id + " ]";
    }
    
}
