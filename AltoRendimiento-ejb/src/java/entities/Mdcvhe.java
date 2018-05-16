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
@Table(name = "mdcvhe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdcvhe.findAll", query = "SELECT m FROM Mdcvhe m")
    , @NamedQuery(name = "Mdcvhe.findById", query = "SELECT m FROM Mdcvhe m WHERE m.id = :id")
    , @NamedQuery(name = "Mdcvhe.findByAno", query = "SELECT m FROM Mdcvhe m WHERE m.ano = :ano")
    , @NamedQuery(name = "Mdcvhe.findByNombres", query = "SELECT m FROM Mdcvhe m WHERE m.nombres = :nombres")
    , @NamedQuery(name = "Mdcvhe.findByNacionalidad", query = "SELECT m FROM Mdcvhe m WHERE m.nacionalidad = :nacionalidad")
    , @NamedQuery(name = "Mdcvhe.findByClub", query = "SELECT m FROM Mdcvhe m WHERE m.club = :club")
    , @NamedQuery(name = "Mdcvhe.findByTelf", query = "SELECT m FROM Mdcvhe m WHERE m.telf = :telf")
    , @NamedQuery(name = "Mdcvhe.findByPersona", query = "SELECT m FROM Mdcvhe m WHERE m.persona = :persona")})
public class Mdcvhe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ano")
    private Integer ano;
    @Size(max = 2147483647)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 2147483647)
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Size(max = 2147483647)
    @Column(name = "club")
    private String club;
    @Column(name = "telf")
    private Integer telf;
    @Basic(optional = false)
    @Column(name = "persona")
    private int persona;

    public Mdcvhe() {
    }

    public Mdcvhe(Integer id) {
        this.id = id;
    }

    public Mdcvhe(Integer id, int persona) {
        this.id = id;
        this.persona = persona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Integer getTelf() {
        return telf;
    }

    public void setTelf(Integer telf) {
        this.telf = telf;
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
        if (!(object instanceof Mdcvhe)) {
            return false;
        }
        Mdcvhe other = (Mdcvhe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdcvhe[ id=" + id + " ]";
    }
    
}
