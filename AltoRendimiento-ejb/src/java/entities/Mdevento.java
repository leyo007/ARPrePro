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
    , @NamedQuery(name = "Mdevento.findByCreador", query = "SELECT m FROM Mdevento m WHERE m.creador = :creador")
    , @NamedQuery(name = "Mdevento.findByAprobado", query = "SELECT m FROM Mdevento m WHERE m.aprobado = :aprobado")
    , @NamedQuery(name = "Mdevento.findByTipomacro", query = "SELECT m FROM Mdevento m WHERE m.tipomacro = :tipomacro")
    , @NamedQuery(name = "Mdevento.findByVtransaereointer", query = "SELECT m FROM Mdevento m WHERE m.vtransaereointer = :vtransaereointer")
    , @NamedQuery(name = "Mdevento.findByVtransterrinter", query = "SELECT m FROM Mdevento m WHERE m.vtransterrinter = :vtransterrinter")
    , @NamedQuery(name = "Mdevento.findByTradextras", query = "SELECT m FROM Mdevento m WHERE m.tradextras = :tradextras")
    , @NamedQuery(name = "Mdevento.findByGastosbanca", query = "SELECT m FROM Mdevento m WHERE m.gastosbanca = :gastosbanca")
    , @NamedQuery(name = "Mdevento.findByReuniotaller", query = "SELECT m FROM Mdevento m WHERE m.reuniotaller = :reuniotaller")
    , @NamedQuery(name = "Mdevento.findByActualizacioncono", query = "SELECT m FROM Mdevento m WHERE m.actualizacioncono = :actualizacioncono")
    , @NamedQuery(name = "Mdevento.findByLicencias", query = "SELECT m FROM Mdevento m WHERE m.licencias = :licencias")
    , @NamedQuery(name = "Mdevento.findByValojap", query = "SELECT m FROM Mdevento m WHERE m.valojap = :valojap")
    , @NamedQuery(name = "Mdevento.findByValojad", query = "SELECT m FROM Mdevento m WHERE m.valojad = :valojad")
    , @NamedQuery(name = "Mdevento.findByValimenp", query = "SELECT m FROM Mdevento m WHERE m.valimenp = :valimenp")
    , @NamedQuery(name = "Mdevento.findByValimend", query = "SELECT m FROM Mdevento m WHERE m.valimend = :valimend")
    , @NamedQuery(name = "Mdevento.findByVhidrap", query = "SELECT m FROM Mdevento m WHERE m.vhidrap = :vhidrap")
    , @NamedQuery(name = "Mdevento.findByVhidrad", query = "SELECT m FROM Mdevento m WHERE m.vhidrad = :vhidrad")
    , @NamedQuery(name = "Mdevento.findByVtransaereop", query = "SELECT m FROM Mdevento m WHERE m.vtransaereop = :vtransaereop")
    , @NamedQuery(name = "Mdevento.findByVtransaereod", query = "SELECT m FROM Mdevento m WHERE m.vtransaereod = :vtransaereod")
    , @NamedQuery(name = "Mdevento.findByVtransaereointerp", query = "SELECT m FROM Mdevento m WHERE m.vtransaereointerp = :vtransaereointerp")
    , @NamedQuery(name = "Mdevento.findByVtransaereointerd", query = "SELECT m FROM Mdevento m WHERE m.vtransaereointerd = :vtransaereointerd")
    , @NamedQuery(name = "Mdevento.findByVexcequip", query = "SELECT m FROM Mdevento m WHERE m.vexcequip = :vexcequip")
    , @NamedQuery(name = "Mdevento.findByVexcequid", query = "SELECT m FROM Mdevento m WHERE m.vexcequid = :vexcequid")
    , @NamedQuery(name = "Mdevento.findByVtaxaereop", query = "SELECT m FROM Mdevento m WHERE m.vtaxaereop = :vtaxaereop")
    , @NamedQuery(name = "Mdevento.findByVtaxaereod", query = "SELECT m FROM Mdevento m WHERE m.vtaxaereod = :vtaxaereod")
    , @NamedQuery(name = "Mdevento.findByVsegviajep", query = "SELECT m FROM Mdevento m WHERE m.vsegviajep = :vsegviajep")
    , @NamedQuery(name = "Mdevento.findByVsegviajed", query = "SELECT m FROM Mdevento m WHERE m.vsegviajed = :vsegviajed")
    , @NamedQuery(name = "Mdevento.findByVtransterrp", query = "SELECT m FROM Mdevento m WHERE m.vtransterrp = :vtransterrp")
    , @NamedQuery(name = "Mdevento.findByVtransterrd", query = "SELECT m FROM Mdevento m WHERE m.vtransterrd = :vtransterrd")
    , @NamedQuery(name = "Mdevento.findByVtransterrinterp", query = "SELECT m FROM Mdevento m WHERE m.vtransterrinterp = :vtransterrinterp")
    , @NamedQuery(name = "Mdevento.findByVtransterrinterd", query = "SELECT m FROM Mdevento m WHERE m.vtransterrinterd = :vtransterrinterd")
    , @NamedQuery(name = "Mdevento.findByVbonodepp", query = "SELECT m FROM Mdevento m WHERE m.vbonodepp = :vbonodepp")
    , @NamedQuery(name = "Mdevento.findByVbonodepd", query = "SELECT m FROM Mdevento m WHERE m.vbonodepd = :vbonodepd")
    , @NamedQuery(name = "Mdevento.findByVinscp", query = "SELECT m FROM Mdevento m WHERE m.vinscp = :vinscp")
    , @NamedQuery(name = "Mdevento.findByVinscd", query = "SELECT m FROM Mdevento m WHERE m.vinscd = :vinscd")
    , @NamedQuery(name = "Mdevento.findByVvisap", query = "SELECT m FROM Mdevento m WHERE m.vvisap = :vvisap")
    , @NamedQuery(name = "Mdevento.findByVvisad", query = "SELECT m FROM Mdevento m WHERE m.vvisad = :vvisad")
    , @NamedQuery(name = "Mdevento.findByVfondoemp", query = "SELECT m FROM Mdevento m WHERE m.vfondoemp = :vfondoemp")
    , @NamedQuery(name = "Mdevento.findByVfondoemd", query = "SELECT m FROM Mdevento m WHERE m.vfondoemd = :vfondoemd")
    , @NamedQuery(name = "Mdevento.findByTradextrasp", query = "SELECT m FROM Mdevento m WHERE m.tradextrasp = :tradextrasp")
    , @NamedQuery(name = "Mdevento.findByTradextrasd", query = "SELECT m FROM Mdevento m WHERE m.tradextrasd = :tradextrasd")
    , @NamedQuery(name = "Mdevento.findByGastosbancap", query = "SELECT m FROM Mdevento m WHERE m.gastosbancap = :gastosbancap")
    , @NamedQuery(name = "Mdevento.findByGastosbancad", query = "SELECT m FROM Mdevento m WHERE m.gastosbancad = :gastosbancad")
    , @NamedQuery(name = "Mdevento.findByReuniotallerp", query = "SELECT m FROM Mdevento m WHERE m.reuniotallerp = :reuniotallerp")
    , @NamedQuery(name = "Mdevento.findByReuniotallerd", query = "SELECT m FROM Mdevento m WHERE m.reuniotallerd = :reuniotallerd")
    , @NamedQuery(name = "Mdevento.findByActualizacionconop", query = "SELECT m FROM Mdevento m WHERE m.actualizacionconop = :actualizacionconop")
    , @NamedQuery(name = "Mdevento.findByActualizacionconod", query = "SELECT m FROM Mdevento m WHERE m.actualizacionconod = :actualizacionconod")
    , @NamedQuery(name = "Mdevento.findByLicenciasp", query = "SELECT m FROM Mdevento m WHERE m.licenciasp = :licenciasp")
    , @NamedQuery(name = "Mdevento.findByLicenciasd", query = "SELECT m FROM Mdevento m WHERE m.licenciasd = :licenciasd")
    , @NamedQuery(name = "Mdevento.findByVespdepp", query = "SELECT m FROM Mdevento m WHERE m.vespdepp = :vespdepp")
    , @NamedQuery(name = "Mdevento.findByVespdepd", query = "SELECT m FROM Mdevento m WHERE m.vespdepd = :vespdepd")
    , @NamedQuery(name = "Mdevento.findByAtletas", query = "SELECT m FROM Mdevento m WHERE m.atletas = :atletas")
    , @NamedQuery(name = "Mdevento.findByEntrenadores", query = "SELECT m FROM Mdevento m WHERE m.entrenadores = :entrenadores")
    , @NamedQuery(name = "Mdevento.findByDelegacion", query = "SELECT m FROM Mdevento m WHERE m.delegacion = :delegacion")
    , @NamedQuery(name = "Mdevento.findByCodigo", query = "SELECT m FROM Mdevento m WHERE m.codigo = :codigo")})
public class Mdevento implements Serializable {

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
    @Column(name = "aprobado")
    private Boolean aprobado;
    @Size(max = 2147483647)
    @Column(name = "tipomacro")
    private String tipomacro;
    @Column(name = "vtransaereointer")
    private Double vtransaereointer;
    @Column(name = "vtransterrinter")
    private Double vtransterrinter;
    @Column(name = "tradextras")
    private Double tradextras;
    @Column(name = "gastosbanca")
    private Double gastosbanca;
    @Column(name = "reuniotaller")
    private Double reuniotaller;
    @Column(name = "actualizacioncono")
    private Double actualizacioncono;
    @Column(name = "licencias")
    private Double licencias;
    @Column(name = "valojap")
    private Integer valojap;
    @Column(name = "valojad")
    private Integer valojad;
    @Column(name = "valimenp")
    private Integer valimenp;
    @Column(name = "valimend")
    private Integer valimend;
    @Column(name = "vhidrap")
    private Integer vhidrap;
    @Column(name = "vhidrad")
    private Integer vhidrad;
    @Column(name = "vtransaereop")
    private Integer vtransaereop;
    @Column(name = "vtransaereod")
    private Integer vtransaereod;
    @Column(name = "vtransaereointerp")
    private Integer vtransaereointerp;
    @Column(name = "vtransaereointerd")
    private Integer vtransaereointerd;
    @Column(name = "vexcequip")
    private Integer vexcequip;
    @Column(name = "vexcequid")
    private Integer vexcequid;
    @Column(name = "vtaxaereop")
    private Integer vtaxaereop;
    @Column(name = "vtaxaereod")
    private Integer vtaxaereod;
    @Column(name = "vsegviajep")
    private Integer vsegviajep;
    @Column(name = "vsegviajed")
    private Integer vsegviajed;
    @Column(name = "vtransterrp")
    private Integer vtransterrp;
    @Column(name = "vtransterrd")
    private Integer vtransterrd;
    @Column(name = "vtransterrinterp")
    private Integer vtransterrinterp;
    @Column(name = "vtransterrinterd")
    private Integer vtransterrinterd;
    @Column(name = "vbonodepp")
    private Integer vbonodepp;
    @Column(name = "vbonodepd")
    private Integer vbonodepd;
    @Column(name = "vinscp")
    private Integer vinscp;
    @Column(name = "vinscd")
    private Integer vinscd;
    @Column(name = "vvisap")
    private Integer vvisap;
    @Column(name = "vvisad")
    private Integer vvisad;
    @Column(name = "vfondoemp")
    private Integer vfondoemp;
    @Column(name = "vfondoemd")
    private Integer vfondoemd;
    @Column(name = "tradextrasp")
    private Integer tradextrasp;
    @Column(name = "tradextrasd")
    private Integer tradextrasd;
    @Column(name = "gastosbancap")
    private Integer gastosbancap;
    @Column(name = "gastosbancad")
    private Integer gastosbancad;
    @Column(name = "reuniotallerp")
    private Integer reuniotallerp;
    @Column(name = "reuniotallerd")
    private Integer reuniotallerd;
    @Column(name = "actualizacionconop")
    private Integer actualizacionconop;
    @Column(name = "actualizacionconod")
    private Integer actualizacionconod;
    @Column(name = "licenciasp")
    private Integer licenciasp;
    @Column(name = "licenciasd")
    private Integer licenciasd;
    @Column(name = "vespdepp")
    private Integer vespdepp;
    @Column(name = "vespdepd")
    private Integer vespdepd;
    @Size(max = 2147483647)
    @Column(name = "atletas")
    private String atletas;
    @Size(max = 2147483647)
    @Column(name = "entrenadores")
    private String entrenadores;
    @Column(name = "delegacion")
    private Integer delegacion;
    @Basic(optional = false)
    @Column(name = "codigo")
    private int codigo;

    public Mdevento() {
    }

    public Mdevento(Integer id) {
        this.id = id;
    }

    public Mdevento(Integer id, int creador, int codigo) {
        this.id = id;
        this.creador = creador;
        this.codigo = codigo;
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

    public Double getVtransaereointer() {
        return vtransaereointer;
    }

    public void setVtransaereointer(Double vtransaereointer) {
        this.vtransaereointer = vtransaereointer;
    }

    public Double getVtransterrinter() {
        return vtransterrinter;
    }

    public void setVtransterrinter(Double vtransterrinter) {
        this.vtransterrinter = vtransterrinter;
    }

    public Double getTradextras() {
        return tradextras;
    }

    public void setTradextras(Double tradextras) {
        this.tradextras = tradextras;
    }

    public Double getGastosbanca() {
        return gastosbanca;
    }

    public void setGastosbanca(Double gastosbanca) {
        this.gastosbanca = gastosbanca;
    }

    public Double getReuniotaller() {
        return reuniotaller;
    }

    public void setReuniotaller(Double reuniotaller) {
        this.reuniotaller = reuniotaller;
    }

    public Double getActualizacioncono() {
        return actualizacioncono;
    }

    public void setActualizacioncono(Double actualizacioncono) {
        this.actualizacioncono = actualizacioncono;
    }

    public Double getLicencias() {
        return licencias;
    }

    public void setLicencias(Double licencias) {
        this.licencias = licencias;
    }

    public Integer getValojap() {
        return valojap;
    }

    public void setValojap(Integer valojap) {
        this.valojap = valojap;
    }

    public Integer getValojad() {
        return valojad;
    }

    public void setValojad(Integer valojad) {
        this.valojad = valojad;
    }

    public Integer getValimenp() {
        return valimenp;
    }

    public void setValimenp(Integer valimenp) {
        this.valimenp = valimenp;
    }

    public Integer getValimend() {
        return valimend;
    }

    public void setValimend(Integer valimend) {
        this.valimend = valimend;
    }

    public Integer getVhidrap() {
        return vhidrap;
    }

    public void setVhidrap(Integer vhidrap) {
        this.vhidrap = vhidrap;
    }

    public Integer getVhidrad() {
        return vhidrad;
    }

    public void setVhidrad(Integer vhidrad) {
        this.vhidrad = vhidrad;
    }

    public Integer getVtransaereop() {
        return vtransaereop;
    }

    public void setVtransaereop(Integer vtransaereop) {
        this.vtransaereop = vtransaereop;
    }

    public Integer getVtransaereod() {
        return vtransaereod;
    }

    public void setVtransaereod(Integer vtransaereod) {
        this.vtransaereod = vtransaereod;
    }

    public Integer getVtransaereointerp() {
        return vtransaereointerp;
    }

    public void setVtransaereointerp(Integer vtransaereointerp) {
        this.vtransaereointerp = vtransaereointerp;
    }

    public Integer getVtransaereointerd() {
        return vtransaereointerd;
    }

    public void setVtransaereointerd(Integer vtransaereointerd) {
        this.vtransaereointerd = vtransaereointerd;
    }

    public Integer getVexcequip() {
        return vexcequip;
    }

    public void setVexcequip(Integer vexcequip) {
        this.vexcequip = vexcequip;
    }

    public Integer getVexcequid() {
        return vexcequid;
    }

    public void setVexcequid(Integer vexcequid) {
        this.vexcequid = vexcequid;
    }

    public Integer getVtaxaereop() {
        return vtaxaereop;
    }

    public void setVtaxaereop(Integer vtaxaereop) {
        this.vtaxaereop = vtaxaereop;
    }

    public Integer getVtaxaereod() {
        return vtaxaereod;
    }

    public void setVtaxaereod(Integer vtaxaereod) {
        this.vtaxaereod = vtaxaereod;
    }

    public Integer getVsegviajep() {
        return vsegviajep;
    }

    public void setVsegviajep(Integer vsegviajep) {
        this.vsegviajep = vsegviajep;
    }

    public Integer getVsegviajed() {
        return vsegviajed;
    }

    public void setVsegviajed(Integer vsegviajed) {
        this.vsegviajed = vsegviajed;
    }

    public Integer getVtransterrp() {
        return vtransterrp;
    }

    public void setVtransterrp(Integer vtransterrp) {
        this.vtransterrp = vtransterrp;
    }

    public Integer getVtransterrd() {
        return vtransterrd;
    }

    public void setVtransterrd(Integer vtransterrd) {
        this.vtransterrd = vtransterrd;
    }

    public Integer getVtransterrinterp() {
        return vtransterrinterp;
    }

    public void setVtransterrinterp(Integer vtransterrinterp) {
        this.vtransterrinterp = vtransterrinterp;
    }

    public Integer getVtransterrinterd() {
        return vtransterrinterd;
    }

    public void setVtransterrinterd(Integer vtransterrinterd) {
        this.vtransterrinterd = vtransterrinterd;
    }

    public Integer getVbonodepp() {
        return vbonodepp;
    }

    public void setVbonodepp(Integer vbonodepp) {
        this.vbonodepp = vbonodepp;
    }

    public Integer getVbonodepd() {
        return vbonodepd;
    }

    public void setVbonodepd(Integer vbonodepd) {
        this.vbonodepd = vbonodepd;
    }

    public Integer getVinscp() {
        return vinscp;
    }

    public void setVinscp(Integer vinscp) {
        this.vinscp = vinscp;
    }

    public Integer getVinscd() {
        return vinscd;
    }

    public void setVinscd(Integer vinscd) {
        this.vinscd = vinscd;
    }

    public Integer getVvisap() {
        return vvisap;
    }

    public void setVvisap(Integer vvisap) {
        this.vvisap = vvisap;
    }

    public Integer getVvisad() {
        return vvisad;
    }

    public void setVvisad(Integer vvisad) {
        this.vvisad = vvisad;
    }

    public Integer getVfondoemp() {
        return vfondoemp;
    }

    public void setVfondoemp(Integer vfondoemp) {
        this.vfondoemp = vfondoemp;
    }

    public Integer getVfondoemd() {
        return vfondoemd;
    }

    public void setVfondoemd(Integer vfondoemd) {
        this.vfondoemd = vfondoemd;
    }

    public Integer getTradextrasp() {
        return tradextrasp;
    }

    public void setTradextrasp(Integer tradextrasp) {
        this.tradextrasp = tradextrasp;
    }

    public Integer getTradextrasd() {
        return tradextrasd;
    }

    public void setTradextrasd(Integer tradextrasd) {
        this.tradextrasd = tradextrasd;
    }

    public Integer getGastosbancap() {
        return gastosbancap;
    }

    public void setGastosbancap(Integer gastosbancap) {
        this.gastosbancap = gastosbancap;
    }

    public Integer getGastosbancad() {
        return gastosbancad;
    }

    public void setGastosbancad(Integer gastosbancad) {
        this.gastosbancad = gastosbancad;
    }

    public Integer getReuniotallerp() {
        return reuniotallerp;
    }

    public void setReuniotallerp(Integer reuniotallerp) {
        this.reuniotallerp = reuniotallerp;
    }

    public Integer getReuniotallerd() {
        return reuniotallerd;
    }

    public void setReuniotallerd(Integer reuniotallerd) {
        this.reuniotallerd = reuniotallerd;
    }

    public Integer getActualizacionconop() {
        return actualizacionconop;
    }

    public void setActualizacionconop(Integer actualizacionconop) {
        this.actualizacionconop = actualizacionconop;
    }

    public Integer getActualizacionconod() {
        return actualizacionconod;
    }

    public void setActualizacionconod(Integer actualizacionconod) {
        this.actualizacionconod = actualizacionconod;
    }

    public Integer getLicenciasp() {
        return licenciasp;
    }

    public void setLicenciasp(Integer licenciasp) {
        this.licenciasp = licenciasp;
    }

    public Integer getLicenciasd() {
        return licenciasd;
    }

    public void setLicenciasd(Integer licenciasd) {
        this.licenciasd = licenciasd;
    }

    public Integer getVespdepp() {
        return vespdepp;
    }

    public void setVespdepp(Integer vespdepp) {
        this.vespdepp = vespdepp;
    }

    public Integer getVespdepd() {
        return vespdepd;
    }

    public void setVespdepd(Integer vespdepd) {
        this.vespdepd = vespdepd;
    }

    public String getAtletas() {
        return atletas;
    }

    public void setAtletas(String atletas) {
        this.atletas = atletas;
    }

    public String getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(String entrenadores) {
        this.entrenadores = entrenadores;
    }

    public Integer getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(Integer delegacion) {
        this.delegacion = delegacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
}
