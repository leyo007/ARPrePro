/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lvillavicencio
 */
@Entity
@Table(name = "md_usuario_org_t")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MdUsuarioOrgT.findAll", query = "SELECT m FROM MdUsuarioOrgT m")
    , @NamedQuery(name = "MdUsuarioOrgT.findByIdUsuOrg", query = "SELECT m FROM MdUsuarioOrgT m WHERE m.idUsuOrg = :idUsuOrg")
    , @NamedQuery(name = "MdUsuarioOrgT.findByIdOrg", query = "SELECT m FROM MdUsuarioOrgT m WHERE m.idOrg = :idOrg")
    , @NamedQuery(name = "MdUsuarioOrgT.findByIdUsuario", query = "SELECT m FROM MdUsuarioOrgT m WHERE m.idUsuario = :idUsuario")})
public class MdUsuarioOrgT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usu_org")
    private Integer idUsuOrg;
    @Basic(optional = false)
    @Column(name = "id_org")
    private int idOrg;
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private int idUsuario;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "mdUsuarioOrgT")
    private MdOrganizacionesT mdOrganizacionesT;

    public MdUsuarioOrgT() {
    }

    public MdUsuarioOrgT(Integer idUsuOrg) {
        this.idUsuOrg = idUsuOrg;
    }

    public MdUsuarioOrgT(Integer idUsuOrg, int idOrg, int idUsuario) {
        this.idUsuOrg = idUsuOrg;
        this.idOrg = idOrg;
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuOrg() {
        return idUsuOrg;
    }

    public void setIdUsuOrg(Integer idUsuOrg) {
        this.idUsuOrg = idUsuOrg;
    }

    public int getIdOrg() {
        return idOrg;
    }

    public void setIdOrg(int idOrg) {
        this.idOrg = idOrg;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public MdOrganizacionesT getMdOrganizacionesT() {
        return mdOrganizacionesT;
    }

    public void setMdOrganizacionesT(MdOrganizacionesT mdOrganizacionesT) {
        this.mdOrganizacionesT = mdOrganizacionesT;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuOrg != null ? idUsuOrg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdUsuarioOrgT)) {
            return false;
        }
        MdUsuarioOrgT other = (MdUsuarioOrgT) object;
        if ((this.idUsuOrg == null && other.idUsuOrg != null) || (this.idUsuOrg != null && !this.idUsuOrg.equals(other.idUsuOrg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.MdUsuarioOrgT[ idUsuOrg=" + idUsuOrg + " ]";
    }
    
}
