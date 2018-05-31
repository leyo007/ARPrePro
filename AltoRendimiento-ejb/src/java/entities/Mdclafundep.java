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
@Table(name = "mdclafundep")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdclafundep.findAll", query = "SELECT m FROM Mdclafundep m")
    , @NamedQuery(name = "Mdclafundep.findById", query = "SELECT m FROM Mdclafundep m WHERE m.id = :id")
    , @NamedQuery(name = "Mdclafundep.findByNombre", query = "SELECT m FROM Mdclafundep m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Mdclafundep.findByEstado", query = "SELECT m FROM Mdclafundep m WHERE m.estado = :estado")})
public class Mdclafundep implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "estado")
    private Boolean estado;
    @JoinColumn(name = "iddeporte", referencedColumnName = "iddeporte")
    @ManyToOne(optional = false)
    private Mddeportest iddeporte;

    public Mdclafundep() {
    }

    public Mdclafundep(Integer id) {
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Mddeportest getIddeporte() {
        return iddeporte;
    }

    public void setIddeporte(Mddeportest iddeporte) {
        this.iddeporte = iddeporte;
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
        if (!(object instanceof Mdclafundep)) {
            return false;
        }
        Mdclafundep other = (Mdclafundep) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdclafundep[ id=" + id + " ]";
    }
    
}
