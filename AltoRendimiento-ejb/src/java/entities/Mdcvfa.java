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
@Table(name = "mdcvfa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mdcvfa.findAll", query = "SELECT m FROM Mdcvfa m")
    , @NamedQuery(name = "Mdcvfa.findById", query = "SELECT m FROM Mdcvfa m WHERE m.id = :id")
    , @NamedQuery(name = "Mdcvfa.findByLvlinst", query = "SELECT m FROM Mdcvfa m WHERE m.lvlinst = :lvlinst")
    , @NamedQuery(name = "Mdcvfa.findByTitulo", query = "SELECT m FROM Mdcvfa m WHERE m.titulo = :titulo")
    , @NamedQuery(name = "Mdcvfa.findByInsti", query = "SELECT m FROM Mdcvfa m WHERE m.insti = :insti")
    , @NamedQuery(name = "Mdcvfa.findByEstudia", query = "SELECT m FROM Mdcvfa m WHERE m.estudia = :estudia")
    , @NamedQuery(name = "Mdcvfa.findByLvlactual", query = "SELECT m FROM Mdcvfa m WHERE m.lvlactual = :lvlactual")
    , @NamedQuery(name = "Mdcvfa.findByEsp", query = "SELECT m FROM Mdcvfa m WHERE m.esp = :esp")
    , @NamedQuery(name = "Mdcvfa.findByPeriod", query = "SELECT m FROM Mdcvfa m WHERE m.period = :period")
    , @NamedQuery(name = "Mdcvfa.findByAnosemesact", query = "SELECT m FROM Mdcvfa m WHERE m.anosemesact = :anosemesact")
    , @NamedQuery(name = "Mdcvfa.findByInstact", query = "SELECT m FROM Mdcvfa m WHERE m.instact = :instact")
    , @NamedQuery(name = "Mdcvfa.findByTipo", query = "SELECT m FROM Mdcvfa m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "Mdcvfa.findByModal", query = "SELECT m FROM Mdcvfa m WHERE m.modal = :modal")
    , @NamedQuery(name = "Mdcvfa.findByProvciu", query = "SELECT m FROM Mdcvfa m WHERE m.provciu = :provciu")})
public class Mdcvfa implements Serializable {

    @Size(max = 2147483647)
    @Column(name = "dir")
    private String dir;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "lvlinst")
    private String lvlinst;
    @Size(max = 2147483647)
    @Column(name = "titulo")
    private String titulo;
    @Size(max = 2147483647)
    @Column(name = "insti")
    private String insti;
    @Column(name = "estudia")
    private Boolean estudia;
    @Size(max = 2147483647)
    @Column(name = "lvlactual")
    private String lvlactual;
    @Size(max = 2147483647)
    @Column(name = "esp")
    private String esp;
    @Size(max = 2147483647)
    @Column(name = "period")
    private String period;
    @Size(max = 2147483647)
    @Column(name = "anosemesact")
    private String anosemesact;
    @Size(max = 2147483647)
    @Column(name = "instact")
    private String instact;
    @Size(max = 2147483647)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 2147483647)
    @Column(name = "modal")
    private String modal;
    @Size(max = 2147483647)
    @Column(name = "provciu")
    private String provciu;
    @JoinColumn(name = "persona", referencedColumnName = "iddep")
    @ManyToOne(optional = false)
    private Mdpersonast persona;

    public Mdcvfa() {
    }

    public Mdcvfa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLvlinst() {
        return lvlinst;
    }

    public void setLvlinst(String lvlinst) {
        this.lvlinst = lvlinst;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInsti() {
        return insti;
    }

    public void setInsti(String insti) {
        this.insti = insti;
    }

    public Boolean getEstudia() {
        return estudia;
    }

    public void setEstudia(Boolean estudia) {
        this.estudia = estudia;
    }

    public String getLvlactual() {
        return lvlactual;
    }

    public void setLvlactual(String lvlactual) {
        this.lvlactual = lvlactual;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getAnosemesact() {
        return anosemesact;
    }

    public void setAnosemesact(String anosemesact) {
        this.anosemesact = anosemesact;
    }

    public String getInstact() {
        return instact;
    }

    public void setInstact(String instact) {
        this.instact = instact;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getProvciu() {
        return provciu;
    }

    public void setProvciu(String provciu) {
        this.provciu = provciu;
    }

    public Mdpersonast getPersona() {
        return persona;
    }

    public void setPersona(Mdpersonast persona) {
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
        if (!(object instanceof Mdcvfa)) {
            return false;
        }
        Mdcvfa other = (Mdcvfa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mdcvfa[ id=" + id + " ]";
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
    
}
