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
public class CotizacionViewDto extends AbstractBaseDto {
	private static final long serialVersionUID = 1L;
	
	private Integer skuId;
    private Integer idPalzo;
}
