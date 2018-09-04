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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "mdreportes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdreportes.findAll", query = "SELECT m FROM Mdreportes m")
    , @NamedQuery(name = "Mdreportes.findById", query = "SELECT m FROM Mdreportes m WHERE m.id = :id")
    , @NamedQuery(name = "Mdreportes.findByArchivo", query = "SELECT m FROM Mdreportes m WHERE m.archivo = :archivo")
    , @NamedQuery(name = "Mdreportes.findByFechacarga", query = "SELECT m FROM Mdreportes m WHERE m.fechacarga = :fechacarga")
    , @NamedQuery(name = "Mdreportes.findByTitulo", query = "SELECT m FROM Mdreportes m WHERE m.titulo = :titulo")
    , @NamedQuery(name = "Mdreportes.findByMesano", query = "SELECT m FROM Mdreportes m WHERE m.mesano = :mesano")
    , @NamedQuery(name = "Mdreportes.findByTipo", query = "SELECT m FROM Mdreportes m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "Mdreportes.findByArchivado", query = "SELECT m FROM Mdreportes m WHERE m.archivado = :archivado")
    , @NamedQuery(name = "Mdreportes.findByPertenece", query = "SELECT m FROM Mdreportes m WHERE m.pertenece = :pertenece")})
public class Mdreportes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "archivo")
    private String archivo;
    @Column(name = "fechacarga")
    @Temporal(TemporalType.DATE)
    private Date fechacarga;
    @Size(max = 2147483647)
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "mesano")
    @Temporal(TemporalType.DATE)
    private Date mesano;
    @Size(max = 2147483647)
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "archivado")
    private Boolean archivado;
    @Basic(optional = false)
    @Column(name = "pertenece")
    private int pertenece;
    @JoinColumn(name = "cargadox", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Mdusuariot cargadox;

    public Mdreportes() {
    }

    public Mdreportes(Integer id) {
        this.id = id;
    }

    public Mdreportes(Integer id, int pertenece) {
        this.id = id;
        this.pertenece = pertenece;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public Date getFechacarga() {
        return fechacarga;
    }

    public void setFechacarga(Date fechacarga) {
        this.fechacarga = fechacarga;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getMesano() {
        return mesano;
    }

    public void setMesano(Date mesano) {
        this.mesano = mesano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getArchivado() {
        return archivado;
    }

    public void setArchivado(Boolean archivado) {
        this.archivado = archivado;
    }

    public int getPertenece() {
        return pertenece;
    }

    public void setPertenece(int pertenece) {
        this.pertenece = pertenece;
    }

    public Mdusuariot getCargadox() {
        return cargadox;
    }

    public void setCargadox(Mdusuariot cargadox) {
        this.cargadox = cargadox;
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
        if (!(object instanceof Mdreportes)) {
            return false;
        }
        Mdreportes other = (Mdreportes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdreportes[ id=" + id + " ]";
    }
    
}
