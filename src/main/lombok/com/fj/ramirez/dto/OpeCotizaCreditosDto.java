/**
 * 
 */
package com.fj.ramirez.dto;

import java.math.BigDecimal;

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
public class OpeCotizaCreditosDto extends AbstractBaseDto {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
    private String numeroCotizacion;
    private Integer fkIdPlazos;
    private Integer fkIdProductos;
    private BigDecimal calculateNormal;
    private BigDecimal calculatePuntual;
    
    
   
}
