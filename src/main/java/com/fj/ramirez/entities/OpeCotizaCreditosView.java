/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fj.ramirez.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author ccerrillo
 */
@Entity
@Table(name = "ope_cotiza_creditos_view")
@NamedQueries({
    @NamedQuery(name = "OpeCotizaCreditosView.findAll", query = "SELECT o FROM OpeCotizaCreditosView o")})
public class OpeCotizaCreditosView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "sku")
    private String sku;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "numero_cotizacion")
    private String numeroCotizacion;
    @Column(name = "numero_semanas")
    private Integer numeroSemanas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tasa_normal")
    private BigDecimal tasaNormal;
    @Column(name = "tasa_puntual")
    private BigDecimal tasaPuntual;

    public OpeCotizaCreditosView() {
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCotizacion() {
        return numeroCotizacion;
    }

    public void setNumeroCotizacion(String numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
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
    
}
