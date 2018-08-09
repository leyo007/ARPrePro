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
@Table(name = "mdhonorarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdhonorarios.findAll", query = "SELECT m FROM Mdhonorarios m")
    , @NamedQuery(name = "Mdhonorarios.findById", query = "SELECT m FROM Mdhonorarios m WHERE m.id = :id")
    , @NamedQuery(name = "Mdhonorarios.findByTipo", query = "SELECT m FROM Mdhonorarios m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "Mdhonorarios.findByConvocatoria", query = "SELECT m FROM Mdhonorarios m WHERE m.convocatoria = :convocatoria")
    , @NamedQuery(name = "Mdhonorarios.findByCi", query = "SELECT m FROM Mdhonorarios m WHERE m.ci = :ci")
    , @NamedQuery(name = "Mdhonorarios.findByNombres", query = "SELECT m FROM Mdhonorarios m WHERE m.nombres = :nombres")
    , @NamedQuery(name = "Mdhonorarios.findByDob", query = "SELECT m FROM Mdhonorarios m WHERE m.dob = :dob")
    , @NamedQuery(name = "Mdhonorarios.findBySexo", query = "SELECT m FROM Mdhonorarios m WHERE m.sexo = :sexo")
    , @NamedQuery(name = "Mdhonorarios.findByCargo", query = "SELECT m FROM Mdhonorarios m WHERE m.cargo = :cargo")
    , @NamedQuery(name = "Mdhonorarios.findByNivel", query = "SELECT m FROM Mdhonorarios m WHERE m.nivel = :nivel")
    , @NamedQuery(name = "Mdhonorarios.findByValor", query = "SELECT m FROM Mdhonorarios m WHERE m.valor = :valor")
    , @NamedQuery(name = "Mdhonorarios.findByMeses", query = "SELECT m FROM Mdhonorarios m WHERE m.meses = :meses")
    , @NamedQuery(name = "Mdhonorarios.findByCincoxmil", query = "SELECT m FROM Mdhonorarios m WHERE m.cincoxmil = :cincoxmil")
    , @NamedQuery(name = "Mdhonorarios.findByTotal", query = "SELECT m FROM Mdhonorarios m WHERE m.total = :total")
    , @NamedQuery(name = "Mdhonorarios.findByFechai", query = "SELECT m FROM Mdhonorarios m WHERE m.fechai = :fechai")
    , @NamedQuery(name = "Mdhonorarios.findByFechaf", query = "SELECT m FROM Mdhonorarios m WHERE m.fechaf = :fechaf")
    , @NamedQuery(name = "Mdhonorarios.findByCreador", query = "SELECT m FROM Mdhonorarios m WHERE m.creador = :creador")
    , @NamedQuery(name = "Mdhonorarios.findByModificador", query = "SELECT m FROM Mdhonorarios m WHERE m.modificador = :modificador")
    , @NamedQuery(name = "Mdhonorarios.findByNacionalidad", query = "SELECT m FROM Mdhonorarios m WHERE m.nacionalidad = :nacionalidad")})
public class Mdhonorarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tipo")
    private Integer tipo;
    @Size(max = 2147483647)
    @Column(name = "convocatoria")
    private String convocatoria;
    @Size(max = 2147483647)
    @Column(name = "ci")
    private String ci;
    @Size(max = 2147483647)
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "sexo")
    private Integer sexo;
    @Size(max = 2147483647)
    @Column(name = "cargo")
    private String cargo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "nivel")
    private Double nivel;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "meses")
    private Integer meses;
    @Column(name = "cincoxmil")
    private Double cincoxmil;
    @Column(name = "total")
    private Double total;
    @Column(name = "fechai")
    @Temporal(TemporalType.DATE)
    private Date fechai;
    @Column(name = "fechaf")
    @Temporal(TemporalType.DATE)
    private Date fechaf;
    @Basic(optional = false)
    @Column(name = "creador")
    private int creador;
    @Basic(optional = false)
    @Column(name = "modificador")
    private int modificador;
    @Size(max = 2147483647)
    @Column(name = "nacionalidad")
    private String nacionalidad;

    public Mdhonorarios() {
    }

    public Mdhonorarios(Integer id) {
        this.id = id;
    }

    public Mdhonorarios(Integer id, int creador, int modificador) {
        this.id = id;
        this.creador = creador;
        this.modificador = modificador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(String convocatoria) {
        this.convocatoria = convocatoria;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getNivel() {
        return nivel;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    public Double getCincoxmil() {
        return cincoxmil;
    }

    public void setCincoxmil(Double cincoxmil) {
        this.cincoxmil = cincoxmil;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFechai() {
        return fechai;
    }

    public void setFechai(Date fechai) {
        this.fechai = fechai;
    }

    public Date getFechaf() {
        return fechaf;
    }

    public void setFechaf(Date fechaf) {
        this.fechaf = fechaf;
    }

    public int getCreador() {
        return creador;
    }

    public void setCreador(int creador) {
        this.creador = creador;
    }

    public int getModificador() {
        return modificador;
    }

    public void setModificador(int modificador) {
        this.modificador = modificador;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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
        if (!(object instanceof Mdhonorarios)) {
            return false;
        }
        Mdhonorarios other = (Mdhonorarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdhonorarios[ id=" + id + " ]";
    }
    
}
