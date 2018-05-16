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
@Table(name = "mddisciplinat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mddisciplinat.findAll", query = "SELECT m FROM Mddisciplinat m")
    , @NamedQuery(name = "Mddisciplinat.findByIddis", query = "SELECT m FROM Mddisciplinat m WHERE m.iddis = :iddis")
    , @NamedQuery(name = "Mddisciplinat.findByDisdescripcion", query = "SELECT m FROM Mddisciplinat m WHERE m.disdescripcion = :disdescripcion")})
public class Mddisciplinat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddis")
    private Integer iddis;
    @Size(max = 100)
    @Column(name = "disdescripcion")
    private String disdescripcion;
    @JoinColumn(name = "iddeporte", referencedColumnName = "iddeporte")
    @ManyToOne(optional = false)
    private Mddeportest iddeporte;

    public Mddisciplinat() {
    }

    public Mddisciplinat(Integer iddis) {
        this.iddis = iddis;
    }

    public Integer getIddis() {
        return iddis;
    }

    public void setIddis(Integer iddis) {
        this.iddis = iddis;
    }

    public String getDisdescripcion() {
        return disdescripcion;
    }

    public void setDisdescripcion(String disdescripcion) {
        this.disdescripcion = disdescripcion;
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
        hash += (iddis != null ? iddis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mddisciplinat)) {
            return false;
        }
        Mddisciplinat other = (Mddisciplinat) object;
        if ((this.iddis == null && other.iddis != null) || (this.iddis != null && !this.iddis.equals(other.iddis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mddisciplinat[ iddis=" + iddis + " ]";
    }
    
}
