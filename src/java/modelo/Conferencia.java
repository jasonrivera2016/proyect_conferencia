/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jason
 */
@Entity
@Table(name = "conferencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conferencia.findAll", query = "SELECT c FROM Conferencia c"),
    @NamedQuery(name = "Conferencia.findById", query = "SELECT c FROM Conferencia c WHERE c.id = :id"),
    @NamedQuery(name = "Conferencia.findByNombreConferencia", query = "SELECT c FROM Conferencia c WHERE c.nombreConferencia = :nombreConferencia"),
    @NamedQuery(name = "Conferencia.findByNombreExpositor", query = "SELECT c FROM Conferencia c WHERE c.nombreExpositor = :nombreExpositor"),
    @NamedQuery(name = "Conferencia.findByCapacidad", query = "SELECT c FROM Conferencia c WHERE c.capacidad = :capacidad"),
    @NamedQuery(name = "Conferencia.findByFechaHora", query = "SELECT c FROM Conferencia c WHERE c.fechaHora = :fechaHora"),
    @NamedQuery(name = "Conferencia.findByCosto", query = "SELECT c FROM Conferencia c WHERE c.costo = :costo"),
    @NamedQuery(name = "Conferencia.findBySala", query = "SELECT c FROM Conferencia c WHERE c.sala = :sala")})
public class Conferencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_conferencia")
    private String nombreConferencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre_expositor")
    private String nombreExpositor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "capacidad")
    private int capacidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo")
    private int costo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sala")
    private int sala;

    public Conferencia() {
    }

    public Conferencia(Integer id) {
        this.id = id;
    }

    public Conferencia(Integer id, String nombreConferencia, String nombreExpositor, int capacidad, Date fechaHora, String descripcion, int costo, int sala) {
        this.id = id;
        this.nombreConferencia = nombreConferencia;
        this.nombreExpositor = nombreExpositor;
        this.capacidad = capacidad;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
        this.costo = costo;
        this.sala = sala;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreConferencia() {
        return nombreConferencia;
    }

    public void setNombreConferencia(String nombreConferencia) {
        this.nombreConferencia = nombreConferencia;
    }

    public String getNombreExpositor() {
        return nombreExpositor;
    }

    public void setNombreExpositor(String nombreExpositor) {
        this.nombreExpositor = nombreExpositor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
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
        if (!(object instanceof Conferencia)) {
            return false;
        }
        Conferencia other = (Conferencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Conferencia[ id=" + id + " ]";
    }
    
}
