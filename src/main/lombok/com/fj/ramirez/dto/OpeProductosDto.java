/**
 * 
 */
package com.fj.ramirez.dto;

import lombok.Data;

/**
 * @author framirez21
 *
 */
@Data
public class OpeProductosDto extends AbstractBaseDto {
		
	private static final long serialVersionUID = 1L;
	
	private Integer skuId;
	private String nombre;
	private String descripcion;
	private Integer precio;
	;
	
	
}
