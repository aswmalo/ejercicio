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
public class CatPlazosDto extends AbstractBaseDto{
	private static final long serialVersionUID = 1L;
	
	private Integer idPlazo;
	private String tipo;
	private Integer value;
	
}
