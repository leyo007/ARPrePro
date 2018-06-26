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
@Table(name = "mdnecesidades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdnecesidades.findAll", query = "SELECT m FROM Mdnecesidades m")
    , @NamedQuery(name = "Mdnecesidades.findById", query = "SELECT m FROM Mdnecesidades m WHERE m.id = :id")
    , @NamedQuery(name = "Mdnecesidades.findByCreador", query = "SELECT m FROM Mdnecesidades m WHERE m.creador = :creador")
    , @NamedQuery(name = "Mdnecesidades.findByDeporte", query = "SELECT m FROM Mdnecesidades m WHERE m.deporte = :deporte")
    , @NamedQuery(name = "Mdnecesidades.findByDisciplina", query = "SELECT m FROM Mdnecesidades m WHERE m.disciplina = :disciplina")
    , @NamedQuery(name = "Mdnecesidades.findByTipo", query = "SELECT m FROM Mdnecesidades m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "Mdnecesidades.findByArticulo", query = "SELECT m FROM Mdnecesidades m WHERE m.articulo = :articulo")
    , @NamedQuery(name = "Mdnecesidades.findByCantidad", query = "SELECT m FROM Mdnecesidades m WHERE m.cantidad = :cantidad")
    , @NamedQuery(name = "Mdnecesidades.findByValor", query = "SELECT m FROM Mdnecesidades m WHERE m.valor = :valor")
    , @NamedQuery(name = "Mdnecesidades.findByTotal", query = "SELECT m FROM Mdnecesidades m WHERE m.total = :total")
    , @NamedQuery(name = "Mdnecesidades.findBySector", query = "SELECT m FROM Mdnecesidades m WHERE m.sector = :sector")
    , @NamedQuery(name = "Mdnecesidades.findByAprobada", query = "SELECT m FROM Mdnecesidades m WHERE m.aprobada = :aprobada")})
public class Mdnecesidades implements Serializable {

    @Column(name = "padre")
    private Integer padre;
    @Column(name = "iddep")
    private Integer iddep;

    @Size(max = 2147483647)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 2147483647)
    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "tipo")
    private Boolean tipo;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "creador")
    private int creador;
    @Size(max = 2147483647)
    @Column(name = "deporte")
    private String deporte;
    @Size(max = 2147483647)
    @Column(name = "disciplina")
    private String disciplina;
    @Size(max = 2147483647)
    @Column(name = "articulo")
    private String articulo;
    @Column(name = "cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Double valor;
    @Column(name = "total")
    private Double total;
    @Size(max = 2147483647)
    @Column(name = "sector")
    private String sector;
    @Column(name = "aprobada")
    private Boolean aprobada;

    public Mdnecesidades() {
    }

    public Mdnecesidades(Integer id) {
        this.id = id;
    }

    public Mdnecesidades(Integer id, int creador) {
        this.id = id;
        this.creador = creador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCreador() {
        return creador;
    }

    public void setCreador(int creador) {
        this.creador = creador;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }


    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Boolean getAprobada() {
        return aprobada;
    }

    public void setAprobada(Boolean aprobada) {
        this.aprobada = aprobada;
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
        if (!(object instanceof Mdnecesidades)) {
            return false;
        }
        Mdnecesidades other = (Mdnecesidades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdnecesidades[ id=" + id + " ]";
    }

    public Boolean getTipo() {
        return tipo;
    }

    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getPadre() {
        return padre;
    }

    public void setPadre(Integer padre) {
        this.padre = padre;
    }

    public Integer getIddep() {
        return iddep;
    }

    public void setIddep(Integer iddep) {
        this.iddep = iddep;
    }
    
}
