/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jason
 */
@Entity
@Table(name = "registro_admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroAdmin.findAll", query = "SELECT r FROM RegistroAdmin r"),
    @NamedQuery(name = "RegistroAdmin.findById", query = "SELECT r FROM RegistroAdmin r WHERE r.id = :id"),
    @NamedQuery(name = "RegistroAdmin.findByNombre", query = "SELECT r FROM RegistroAdmin r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "RegistroAdmin.findByApellido", query = "SELECT r FROM RegistroAdmin r WHERE r.apellido = :apellido"),
    @NamedQuery(name = "RegistroAdmin.findByUserName", query = "SELECT r FROM RegistroAdmin r WHERE r.userName = :userName"),
    @NamedQuery(name = "RegistroAdmin.findByPassword", query = "SELECT r FROM RegistroAdmin r WHERE r.password = :password")})
public class RegistroAdmin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "user_name")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Password")
    private String password;

    public RegistroAdmin() {
    }

    public RegistroAdmin(Integer id) {
        this.id = id;
    }

    public RegistroAdmin(Integer id, String nombre, String apellido, String userName, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        if (!(object instanceof RegistroAdmin)) {
            return false;
        }
        RegistroAdmin other = (RegistroAdmin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.RegistroAdmin[ id=" + id + " ]";
    }
    
}
