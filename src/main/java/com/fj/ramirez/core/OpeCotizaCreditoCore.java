/**
 * 
 */
package com.fj.ramirez.core;

import java.util.List;

import com.fj.ramirez.dto.OpeCotizaCreditoViewDto;
import com.fj.ramirez.dto.OpeCotizaCreditosDto;
import com.fj.ramirez.entities.OpeCotizaCreditosView;

/**
 * @author framirez21
 *
 */
public interface OpeCotizaCreditoCore {
	
	
	OpeCotizaCreditosDto cotiza(OpeCotizaCreditosDto dto);

	List<OpeCotizaCreditoViewDto> listCotizaciones() ;

//	List<OpeCotizaCreditosView> listAll();
}
