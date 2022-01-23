/**
 * 
 */
package com.fj.ramirez.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.model.SelectItem;

import com.fj.ramirez.dto.OpeCotizaCreditosDto;

/**
 * @author ccerrillo
 *
 */
public interface OpeCotizaCreditoController extends Serializable {
	
	OpeCotizaCreditosDto cotizar(OpeCotizaCreditosDto dto);
	
	
	List<SelectItem> getPlazos();
	
	List<SelectItem> getProductosBySKU(String sku);

}
