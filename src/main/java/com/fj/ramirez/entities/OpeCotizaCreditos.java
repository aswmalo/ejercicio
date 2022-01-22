/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fj.ramirez.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ccerrillo
 */
@Entity
@Table(name = "ope_cotiza_creditos")
@NamedQueries({
    @NamedQuery(name = "OpeCotizaCreditos.findAll", query = "SELECT o FROM OpeCotizaCreditos o")})
public class OpeCotizaCreditos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "numero_cotizacion")
    private String numeroCotizacion;
    @JoinColumn(name = "fk_id_plazos", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CatPlazos fkIdPlazos;
    @JoinColumn(name = "fk_id_productos", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CatProductos fkIdProductos;

    public OpeCotizaCreditos() {
    }

    public OpeCotizaCreditos(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroCotizacion() {
        return numeroCotizacion;
    }

    public void setNumeroCotizacion(String numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
    }

    public CatPlazos getFkIdPlazos() {
        return fkIdPlazos;
    }

    public void setFkIdPlazos(CatPlazos fkIdPlazos) {
        this.fkIdPlazos = fkIdPlazos;
    }

    public CatProductos getFkIdProductos() {
        return fkIdProductos;
    }

    public void setFkIdProductos(CatProductos fkIdProductos) {
        this.fkIdProductos = fkIdProductos;
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
        if (!(object instanceof OpeCotizaCreditos)) {
            return false;
        }
        OpeCotizaCreditos other = (OpeCotizaCreditos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fj.ramirez.entities.OpeCotizaCreditos[ id=" + id + " ]";
    }
    
}
