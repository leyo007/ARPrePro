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
@Table(name = "mdconvocatoriat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdconvocatoriat.findAll", query = "SELECT m FROM Mdconvocatoriat m")
    , @NamedQuery(name = "Mdconvocatoriat.findByIdconv", query = "SELECT m FROM Mdconvocatoriat m WHERE m.idconv = :idconv")
    , @NamedQuery(name = "Mdconvocatoriat.findByCondescripcion", query = "SELECT m FROM Mdconvocatoriat m WHERE m.condescripcion = :condescripcion")})
public class Mdconvocatoriat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idconv")
    private Integer idconv;
    @Size(max = 255)
    @Column(name = "condescripcion")
    private String condescripcion;

    public Mdconvocatoriat() {
    }

    public Mdconvocatoriat(Integer idconv) {
        this.idconv = idconv;
    }

    public Integer getIdconv() {
        return idconv;
    }

    public void setIdconv(Integer idconv) {
        this.idconv = idconv;
    }

    public String getCondescripcion() {
        return condescripcion;
    }

    public void setCondescripcion(String condescripcion) {
        this.condescripcion = condescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconv != null ? idconv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdconvocatoriat)) {
            return false;
        }
        Mdconvocatoriat other = (Mdconvocatoriat) object;
        if ((this.idconv == null && other.idconv != null) || (this.idconv != null && !this.idconv.equals(other.idconv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdconvocatoriat[ idconv=" + idconv + " ]";
    }
    
}
