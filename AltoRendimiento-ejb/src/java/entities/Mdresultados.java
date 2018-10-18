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
@Table(name = "mdresultados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdresultados.findAll", query = "SELECT m FROM Mdresultados m")
    , @NamedQuery(name = "Mdresultados.findById", query = "SELECT m FROM Mdresultados m WHERE m.id = :id")
    , @NamedQuery(name = "Mdresultados.findByDivision", query = "SELECT m FROM Mdresultados m WHERE m.division = :division")
    , @NamedQuery(name = "Mdresultados.findByEdad", query = "SELECT m FROM Mdresultados m WHERE m.edad = :edad")
    , @NamedQuery(name = "Mdresultados.findByPrograma", query = "SELECT m FROM Mdresultados m WHERE m.programa = :programa")
    , @NamedQuery(name = "Mdresultados.findByOlimpomundial", query = "SELECT m FROM Mdresultados m WHERE m.olimpomundial = :olimpomundial")
    , @NamedQuery(name = "Mdresultados.findByRanking", query = "SELECT m FROM Mdresultados m WHERE m.ranking = :ranking")
    , @NamedQuery(name = "Mdresultados.findByPanasudaboli", query = "SELECT m FROM Mdresultados m WHERE m.panasudaboli = :panasudaboli")
    , @NamedQuery(name = "Mdresultados.findByCampa", query = "SELECT m FROM Mdresultados m WHERE m.campa = :campa")
    , @NamedQuery(name = "Mdresultados.findByProjuegos", query = "SELECT m FROM Mdresultados m WHERE m.projuegos = :projuegos")
    , @NamedQuery(name = "Mdresultados.findByProcampa", query = "SELECT m FROM Mdresultados m WHERE m.procampa = :procampa")
    , @NamedQuery(name = "Mdresultados.findByTipo", query = "SELECT m FROM Mdresultados m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "Mdresultados.findByConvencional", query = "SELECT m FROM Mdresultados m WHERE m.convencional = :convencional")})
public class Mdresultados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "division")
    private Integer division;
    @Size(max = 2147483647)
    @Column(name = "edad")
    private String edad;
    @Size(max = 2147483647)
    @Column(name = "programa")
    private String programa;
    @Size(max = 2147483647)
    @Column(name = "olimpomundial")
    private String olimpomundial;
    @Size(max = 2147483647)
    @Column(name = "ranking")
    private String ranking;
    @Size(max = 2147483647)
    @Column(name = "panasudaboli")
    private String panasudaboli;
    @Size(max = 2147483647)
    @Column(name = "campa")
    private String campa;
    @Size(max = 2147483647)
    @Column(name = "projuegos")
    private String projuegos;
    @Size(max = 2147483647)
    @Column(name = "procampa")
    private String procampa;
    @Size(max = 2147483647)
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "convencional")
    private Boolean convencional;

    public Mdresultados() {
    }

    public Mdresultados(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDivision() {
        return division;
    }

    public void setDivision(Integer division) {
        this.division = division;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getOlimpomundial() {
        return olimpomundial;
    }

    public void setOlimpomundial(String olimpomundial) {
        this.olimpomundial = olimpomundial;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getPanasudaboli() {
        return panasudaboli;
    }

    public void setPanasudaboli(String panasudaboli) {
        this.panasudaboli = panasudaboli;
    }

    public String getCampa() {
        return campa;
    }

    public void setCampa(String campa) {
        this.campa = campa;
    }

    public String getProjuegos() {
        return projuegos;
    }

    public void setProjuegos(String projuegos) {
        this.projuegos = projuegos;
    }

    public String getProcampa() {
        return procampa;
    }

    public void setProcampa(String procampa) {
        this.procampa = procampa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getConvencional() {
        return convencional;
    }

    public void setConvencional(Boolean convencional) {
        this.convencional = convencional;
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
        if (!(object instanceof Mdresultados)) {
            return false;
        }
        Mdresultados other = (Mdresultados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdresultados[ id=" + id + " ]";
    }
    
}
