/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fj.ramirez.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ccerrillo
 */
@Entity
@Table(name = "cat_plazos")
@NamedQueries({
    @NamedQuery(name = "CatPlazos.findAll", query = "SELECT c FROM CatPlazos c")})
public class CatPlazos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "numero_semanas")
    private Integer numeroSemanas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tasa_normal")
    private BigDecimal tasaNormal;
    @Column(name = "tasa_puntual")
    private BigDecimal tasaPuntual;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdPlazos", fetch = FetchType.LAZY)
    private Set<OpeCotizaCreditos> opeCotizaCreditosSet;

    public CatPlazos() {
    }

    public CatPlazos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroSemanas() {
        return numeroSemanas;
    }

    public void setNumeroSemanas(Integer numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

    public BigDecimal getTasaNormal() {
        return tasaNormal;
    }

    public void setTasaNormal(BigDecimal tasaNormal) {
        this.tasaNormal = tasaNormal;
    }

    public BigDecimal getTasaPuntual() {
        return tasaPuntual;
    }

    public void setTasaPuntual(BigDecimal tasaPuntual) {
        this.tasaPuntual = tasaPuntual;
    }

    public Set<OpeCotizaCreditos> getOpeCotizaCreditosSet() {
        return opeCotizaCreditosSet;
    }

    public void setOpeCotizaCreditosSet(Set<OpeCotizaCreditos> opeCotizaCreditosSet) {
        this.opeCotizaCreditosSet = opeCotizaCreditosSet;
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
        if (!(object instanceof CatPlazos)) {
            return false;
        }
        CatPlazos other = (CatPlazos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fj.ramirez.entities.CatPlazos[ id=" + id + " ]";
    }
    
}
