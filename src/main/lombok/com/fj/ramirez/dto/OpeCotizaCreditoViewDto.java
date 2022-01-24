/**
 * 
 */
package com.fj.ramirez.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author framirez21
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class OpeCotizaCreditoViewDto extends AbstractBaseDto  {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
    private String sku;
    private String nombre;
    private String numeroCotizacion;
    private Integer numeroSemanas;
    private BigDecimal tasaNormal;
    private BigDecimal tasaPuntual;
}
