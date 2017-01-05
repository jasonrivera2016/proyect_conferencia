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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "registro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r"),
    @NamedQuery(name = "Registro.findById", query = "SELECT r FROM Registro r WHERE r.id = :id"),
    @NamedQuery(name = "Registro.findByNombre", query = "SELECT r FROM Registro r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Registro.findByApellido", query = "SELECT r FROM Registro r WHERE r.apellido = :apellido"),
    @NamedQuery(name = "Registro.findByDomicilio", query = "SELECT r FROM Registro r WHERE r.domicilio = :domicilio"),
    @NamedQuery(name = "Registro.findByTelefonoContacto", query = "SELECT r FROM Registro r WHERE r.telefonoContacto = :telefonoContacto"),
    @NamedQuery(name = "Registro.findByNombreConferencia", query = "SELECT r FROM Registro r WHERE r.nombreConferencia = :nombreConferencia"),
    @NamedQuery(name = "Registro.findByCorreo", query = "SELECT r FROM Registro r WHERE r.correo = :correo")})
public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "domicilio")
    private String domicilio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono_contacto")
    private String telefonoContacto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre_conferencia")
    private String nombreConferencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "correo")
    private String correo;

    public Registro() {
    }

    public Registro(Integer id) {
        this.id = id;
    }

    public Registro(Integer id, String nombre, String apellido, String domicilio, String telefonoContacto, String nombreConferencia, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefonoContacto = telefonoContacto;
        this.nombreConferencia = nombreConferencia;
        this.correo = correo;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getNombreConferencia() {
        return nombreConferencia;
    }

    public void setNombreConferencia(String nombreConferencia) {
        this.nombreConferencia = nombreConferencia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Registro[ id=" + id + " ]";
    }
    
}
