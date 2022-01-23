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
public class CatProductosDto extends AbstractBaseDto {
		
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nombre;
	private String descripcion;
	private BigDecimal precio;
	private String sku;
	
	
}
