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
@Table(name = "mdincentivoshistt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdincentivoshistt.findAll", query = "SELECT m FROM Mdincentivoshistt m")
    , @NamedQuery(name = "Mdincentivoshistt.findByIdhisinc", query = "SELECT m FROM Mdincentivoshistt m WHERE m.idhisinc = :idhisinc")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchcedula", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchcedula = :inchcedula")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchdeporte", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchdeporte = :inchdeporte")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchdisciplina", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchdisciplina = :inchdisciplina")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchconvocatoria", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchconvocatoria = :inchconvocatoria")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchgenero", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchgenero = :inchgenero")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchcatedad", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchcatedad = :inchcatedad")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchnombre", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchnombre = :inchnombre")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchapellido", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchapellido = :inchapellido")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchprovincia", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchprovincia = :inchprovincia")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchprueba", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchprueba = :inchprueba")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchresultados", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchresultados = :inchresultados")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchproyeccion", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchproyeccion = :inchproyeccion")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchcatactual", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchcatactual = :inchcatactual")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchnovedad", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchnovedad = :inchnovedad")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchcatprop", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchcatprop = :inchcatprop")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchvmensual", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchvmensual = :inchvmensual")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchnmes", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchnmes = :inchnmes")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchtotal", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchtotal = :inchtotal")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchfechaini", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchfechaini = :inchfechaini")
    , @NamedQuery(name = "Mdincentivoshistt.findByInchfechafin", query = "SELECT m FROM Mdincentivoshistt m WHERE m.inchfechafin = :inchfechafin")
    , @NamedQuery(name = "Mdincentivoshistt.findByPerid", query = "SELECT m FROM Mdincentivoshistt m WHERE m.perid = :perid")})
public class Mdincentivoshistt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhisinc")
    private Integer idhisinc;
    @Size(max = 100)
    @Column(name = "inchcedula")
    private String inchcedula;
    @Size(max = 100)
    @Column(name = "inchdeporte")
    private String inchdeporte;
    @Size(max = 100)
    @Column(name = "inchdisciplina")
    private String inchdisciplina;
    @Size(max = 100)
    @Column(name = "inchconvocatoria")
    private String inchconvocatoria;
    @Size(max = 5)
    @Column(name = "inchgenero")
    private String inchgenero;
    @Size(max = 100)
    @Column(name = "inchcatedad")
    private String inchcatedad;
    @Size(max = 100)
    @Column(name = "inchnombre")
    private String inchnombre;
    @Size(max = 100)
    @Column(name = "inchapellido")
    private String inchapellido;
    @Size(max = 255)
    @Column(name = "inchprovincia")
    private String inchprovincia;
    @Size(max = 255)
    @Column(name = "inchprueba")
    private String inchprueba;
    @Size(max = 255)
    @Column(name = "inchresultados")
    private String inchresultados;
    @Size(max = 255)
    @Column(name = "inchproyeccion")
    private String inchproyeccion;
    @Size(max = 50)
    @Column(name = "inchcatactual")
    private String inchcatactual;
    @Size(max = 50)
    @Column(name = "inchnovedad")
    private String inchnovedad;
    @Size(max = 50)
    @Column(name = "inchcatprop")
    private String inchcatprop;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "inchvmensual")
    private Float inchvmensual;
    @Column(name = "inchnmes")
    private Integer inchnmes;
    @Column(name = "inchtotal")
    private Float inchtotal;
    @Column(name = "inchfechaini")
    @Temporal(TemporalType.DATE)
    private Date inchfechaini;
    @Column(name = "inchfechafin")
    @Temporal(TemporalType.DATE)
    private Date inchfechafin;
    @Basic(optional = false)
    @Column(name = "perid")
    private int perid;

    public Mdincentivoshistt() {
    }

    public Mdincentivoshistt(Integer idhisinc) {
        this.idhisinc = idhisinc;
    }

    public Mdincentivoshistt(Integer idhisinc, int perid) {
        this.idhisinc = idhisinc;
        this.perid = perid;
    }

    public Integer getIdhisinc() {
        return idhisinc;
    }

    public void setIdhisinc(Integer idhisinc) {
        this.idhisinc = idhisinc;
    }

    public String getInchcedula() {
        return inchcedula;
    }

    public void setInchcedula(String inchcedula) {
        this.inchcedula = inchcedula;
    }

    public String getInchdeporte() {
        return inchdeporte;
    }

    public void setInchdeporte(String inchdeporte) {
        this.inchdeporte = inchdeporte;
    }

    public String getInchdisciplina() {
        return inchdisciplina;
    }

    public void setInchdisciplina(String inchdisciplina) {
        this.inchdisciplina = inchdisciplina;
    }

    public String getInchconvocatoria() {
        return inchconvocatoria;
    }

    public void setInchconvocatoria(String inchconvocatoria) {
        this.inchconvocatoria = inchconvocatoria;
    }

    public String getInchgenero() {
        return inchgenero;
    }

    public void setInchgenero(String inchgenero) {
        this.inchgenero = inchgenero;
    }

    public String getInchcatedad() {
        return inchcatedad;
    }

    public void setInchcatedad(String inchcatedad) {
        this.inchcatedad = inchcatedad;
    }

    public String getInchnombre() {
        return inchnombre;
    }

    public void setInchnombre(String inchnombre) {
        this.inchnombre = inchnombre;
    }

    public String getInchapellido() {
        return inchapellido;
    }

    public void setInchapellido(String inchapellido) {
        this.inchapellido = inchapellido;
    }

    public String getInchprovincia() {
        return inchprovincia;
    }

    public void setInchprovincia(String inchprovincia) {
        this.inchprovincia = inchprovincia;
    }

    public String getInchprueba() {
        return inchprueba;
    }

    public void setInchprueba(String inchprueba) {
        this.inchprueba = inchprueba;
    }

    public String getInchresultados() {
        return inchresultados;
    }

    public void setInchresultados(String inchresultados) {
        this.inchresultados = inchresultados;
    }

    public String getInchproyeccion() {
        return inchproyeccion;
    }

    public void setInchproyeccion(String inchproyeccion) {
        this.inchproyeccion = inchproyeccion;
    }

    public String getInchcatactual() {
        return inchcatactual;
    }

    public void setInchcatactual(String inchcatactual) {
        this.inchcatactual = inchcatactual;
    }

    public String getInchnovedad() {
        return inchnovedad;
    }

    public void setInchnovedad(String inchnovedad) {
        this.inchnovedad = inchnovedad;
    }

    public String getInchcatprop() {
        return inchcatprop;
    }

    public void setInchcatprop(String inchcatprop) {
        this.inchcatprop = inchcatprop;
    }

    public Float getInchvmensual() {
        return inchvmensual;
    }

    public void setInchvmensual(Float inchvmensual) {
        this.inchvmensual = inchvmensual;
    }

    public Integer getInchnmes() {
        return inchnmes;
    }

    public void setInchnmes(Integer inchnmes) {
        this.inchnmes = inchnmes;
    }

    public Float getInchtotal() {
        return inchtotal;
    }

    public void setInchtotal(Float inchtotal) {
        this.inchtotal = inchtotal;
    }

    public Date getInchfechaini() {
        return inchfechaini;
    }

    public void setInchfechaini(Date inchfechaini) {
        this.inchfechaini = inchfechaini;
    }

    public Date getInchfechafin() {
        return inchfechafin;
    }

    public void setInchfechafin(Date inchfechafin) {
        this.inchfechafin = inchfechafin;
    }

    public int getPerid() {
        return perid;
    }

    public void setPerid(int perid) {
        this.perid = perid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhisinc != null ? idhisinc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mdincentivoshistt)) {
            return false;
        }
        Mdincentivoshistt other = (Mdincentivoshistt) object;
        if ((this.idhisinc == null && other.idhisinc != null) || (this.idhisinc != null && !this.idhisinc.equals(other.idhisinc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdincentivoshistt[ idhisinc=" + idhisinc + " ]";
    }
    
}
