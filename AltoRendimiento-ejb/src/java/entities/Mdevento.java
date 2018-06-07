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
@Table(name = "mdevento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdevento.findAll", query = "SELECT m FROM Mdevento m")
    , @NamedQuery(name = "Mdevento.findById", query = "SELECT m FROM Mdevento m WHERE m.id = :id")
    , @NamedQuery(name = "Mdevento.findByDeporte", query = "SELECT m FROM Mdevento m WHERE m.deporte = :deporte")
    , @NamedQuery(name = "Mdevento.findByDisciplina", query = "SELECT m FROM Mdevento m WHERE m.disciplina = :disciplina")
    , @NamedQuery(name = "Mdevento.findByEvento", query = "SELECT m FROM Mdevento m WHERE m.evento = :evento")
    , @NamedQuery(name = "Mdevento.findBySede", query = "SELECT m FROM Mdevento m WHERE m.sede = :sede")
    , @NamedQuery(name = "Mdevento.findByTipo", query = "SELECT m FROM Mdevento m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "Mdevento.findByFechai", query = "SELECT m FROM Mdevento m WHERE m.fechai = :fechai")
    , @NamedQuery(name = "Mdevento.findByFechaf", query = "SELECT m FROM Mdevento m WHERE m.fechaf = :fechaf")
    , @NamedQuery(name = "Mdevento.findByNument", query = "SELECT m FROM Mdevento m WHERE m.nument = :nument")
    , @NamedQuery(name = "Mdevento.findByNumatl", query = "SELECT m FROM Mdevento m WHERE m.numatl = :numatl")
    , @NamedQuery(name = "Mdevento.findByNumdias", query = "SELECT m FROM Mdevento m WHERE m.numdias = :numdias")
    , @NamedQuery(name = "Mdevento.findByNumpax", query = "SELECT m FROM Mdevento m WHERE m.numpax = :numpax")
    , @NamedQuery(name = "Mdevento.findByValoja", query = "SELECT m FROM Mdevento m WHERE m.valoja = :valoja")
    , @NamedQuery(name = "Mdevento.findByValimen", query = "SELECT m FROM Mdevento m WHERE m.valimen = :valimen")
    , @NamedQuery(name = "Mdevento.findByVuesc", query = "SELECT m FROM Mdevento m WHERE m.vuesc = :vuesc")
    , @NamedQuery(name = "Mdevento.findByVhidra", query = "SELECT m FROM Mdevento m WHERE m.vhidra = :vhidra")
    , @NamedQuery(name = "Mdevento.findByVtransaereo", query = "SELECT m FROM Mdevento m WHERE m.vtransaereo = :vtransaereo")
    , @NamedQuery(name = "Mdevento.findByVtransterr", query = "SELECT m FROM Mdevento m WHERE m.vtransterr = :vtransterr")
    , @NamedQuery(name = "Mdevento.findByVexcequi", query = "SELECT m FROM Mdevento m WHERE m.vexcequi = :vexcequi")
    , @NamedQuery(name = "Mdevento.findByVtaxaereo", query = "SELECT m FROM Mdevento m WHERE m.vtaxaereo = :vtaxaereo")
    , @NamedQuery(name = "Mdevento.findByVsegviaje", query = "SELECT m FROM Mdevento m WHERE m.vsegviaje = :vsegviaje")
    , @NamedQuery(name = "Mdevento.findByVbonodep", query = "SELECT m FROM Mdevento m WHERE m.vbonodep = :vbonodep")
    , @NamedQuery(name = "Mdevento.findByVinsc", query = "SELECT m FROM Mdevento m WHERE m.vinsc = :vinsc")
    , @NamedQuery(name = "Mdevento.findByVvisa", query = "SELECT m FROM Mdevento m WHERE m.vvisa = :vvisa")
    , @NamedQuery(name = "Mdevento.findByVfondoem", query = "SELECT m FROM Mdevento m WHERE m.vfondoem = :vfondoem")
    , @NamedQuery(name = "Mdevento.findByVespdep", query = "SELECT m FROM Mdevento m WHERE m.vespdep = :vespdep")
    , @NamedQuery(name = "Mdevento.findByTotal", query = "SELECT m FROM Mdevento m WHERE m.total = :total")
    , @NamedQuery(name = "Mdevento.findBySector", query = "SELECT m FROM Mdevento m WHERE m.sector = :sector")
    , @NamedQuery(name = "Mdevento.findByAd", query = "SELECT m FROM Mdevento m WHERE m.ad = :ad")
    , @NamedQuery(name = "Mdevento.findByVtranscear", query = "SELECT m FROM Mdevento m WHERE m.vtranscear = :vtranscear")
    , @NamedQuery(name = "Mdevento.findByCreador", query = "SELECT m FROM Mdevento m WHERE m.creador = :creador")})
public class Mdevento implements Serializable {

    @Size(max = 2147483647)
    @Column(name = "tipomacro")
    private String tipomacro;

    @Column(name = "aprobado")
    private Boolean aprobado;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "deporte")
    private String deporte;
    @Size(max = 2147483647)
    @Column(name = "disciplina")
    private String disciplina;
    @Size(max = 2147483647)
    @Column(name = "evento")
    private String evento;
    @Size(max = 2147483647)
    @Column(name = "sede")
    private String sede;
    @Size(max = 2147483647)
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "fechai")
    @Temporal(TemporalType.DATE)
    private Date fechai;
    @Column(name = "fechaf")
    @Temporal(TemporalType.DATE)
    private Date fechaf;
    @Column(name = "nument")
    private Integer nument;
    @Column(name = "numatl")
    private Integer numatl;
    @Column(name = "numdias")
    private Integer numdias;
    @Column(name = "numpax")
    private Integer numpax;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valoja")
    private Double valoja;
    @Column(name = "valimen")
    private Double valimen;
    @Column(name = "vuesc")
    private Double vuesc;
    @Column(name = "vhidra")
    private Double vhidra;
    @Column(name = "vtransaereo")
    private Double vtransaereo;
    @Column(name = "vtransterr")
    private Double vtransterr;
    @Column(name = "vexcequi")
    private Double vexcequi;
    @Column(name = "vtaxaereo")
    private Double vtaxaereo;
    @Column(name = "vsegviaje")
    private Double vsegviaje;
    @Column(name = "vbonodep")
    private Double vbonodep;
    @Column(name = "vinsc")
    private Double vinsc;
    @Column(name = "vvisa")
    private Double vvisa;
    @Column(name = "vfondoem")
    private Double vfondoem;
    @Column(name = "vespdep")
    private Double vespdep;
    @Column(name = "total")
    private Double total;
    @Size(max = 2147483647)
    @Column(name = "sector")
    private String sector;
    @Size(max = 2147483647)
    @Column(name = "ad")
    private String ad;
    @Column(name = "vtranscear")
    private Double vtranscear;
    @Basic(optional = false)
    @Column(name = "creador")
    private int creador;

    public Mdevento() {
    }

    public Mdevento(Integer id) {
        this.id = id;
    }

    public Mdevento(Integer id, int creador) {
        this.id = id;
        this.creador = creador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public Integer getNument() {
        return nument;
    }

    public void setNument(Integer nument) {
        this.nument = nument;
    }

    public Integer getNumatl() {
        return numatl;
    }

    public void setNumatl(Integer numatl) {
        this.numatl = numatl;
    }

    public Integer getNumdias() {
        return numdias;
    }

    public void setNumdias(Integer numdias) {
        this.numdias = numdias;
    }

    public Integer getNumpax() {
        return numpax;
    }

    public void setNumpax(Integer numpax) {
        this.numpax = numpax;
    }

    public Double getValoja() {
        return valoja;
    }

    public void setValoja(Double valoja) {
        this.valoja = valoja;
    }

    public Double getValimen() {
        return valimen;
    }

    public void setValimen(Double valimen) {
        this.valimen = valimen;
    }

    public Double getVuesc() {
        return vuesc;
    }

    public void setVuesc(Double vuesc) {
        this.vuesc = vuesc;
    }

    public Double getVhidra() {
        return vhidra;
    }

    public void setVhidra(Double vhidra) {
        this.vhidra = vhidra;
    }

    public Double getVtransaereo() {
        return vtransaereo;
    }

    public void setVtransaereo(Double vtransaereo) {
        this.vtransaereo = vtransaereo;
    }

    public Double getVtransterr() {
        return vtransterr;
    }

    public void setVtransterr(Double vtransterr) {
        this.vtransterr = vtransterr;
    }

    public Double getVexcequi() {
        return vexcequi;
    }

    public void setVexcequi(Double vexcequi) {
        this.vexcequi = vexcequi;
    }

    public Double getVtaxaereo() {
        return vtaxaereo;
    }

    public void setVtaxaereo(Double vtaxaereo) {
        this.vtaxaereo = vtaxaereo;
    }

    public Double getVsegviaje() {
        return vsegviaje;
    }

    public void setVsegviaje(Double vsegviaje) {
        this.vsegviaje = vsegviaje;
    }

    public Double getVbonodep() {
        return vbonodep;
    }

    public void setVbonodep(Double vbonodep) {
        this.vbonodep = vbonodep;
    }

    public Double getVinsc() {
        return vinsc;
    }

    public void setVinsc(Double vinsc) {
        this.vinsc = vinsc;
    }

    public Double getVvisa() {
        return vvisa;
    }

    public void setVvisa(Double vvisa) {
        this.vvisa = vvisa;
    }

    public Double getVfondoem() {
        return vfondoem;
    }

    public void setVfondoem(Double vfondoem) {
        this.vfondoem = vfondoem;
    }

    public Double getVespdep() {
        return vespdep;
    }

    public void setVespdep(Double vespdep) {
        this.vespdep = vespdep;
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

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Double getVtranscear() {
        return vtranscear;
    }

    public void setVtranscear(Double vtranscear) {
        this.vtranscear = vtranscear;
    }

    public int getCreador() {
        return creador;
    }

    public void setCreador(int creador) {
        this.creador = creador;
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
        if (!(object instanceof Mdevento)) {
            return false;
        }
        Mdevento other = (Mdevento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdevento[ id=" + id + " ]";
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public String getTipomacro() {
        return tipomacro;
    }

    public void setTipomacro(String tipomacro) {
        this.tipomacro = tipomacro;
    }
    
}
