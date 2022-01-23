/**
 * 
 */
package com.fj.ramirez.managed;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import com.fj.ramirez.controller.OpeCotizaCreditoController;
import com.fj.ramirez.dto.OpeCotizaCreditosDto;

import lombok.Data;

/**
 * @author ccerrillo
 *
 */
@Data
@ViewScoped
@ManagedBean
public class OpeCotizaCreditoMb implements Serializable {
	
	
	private OpeCotizaCreditosDto dto;
	
	private String skusearch;

	@ManagedProperty(value = "#{opeCotizaCreditoController}")
	private OpeCotizaCreditoController opeCotizaCreditoController;
	private List<SelectItem> plazos;
	private List<SelectItem> productos;
	
	
	
	
	public void init() {
		setPlazos(opeCotizaCreditoController.getPlazos());
	}
	
	
	
	public void cotizar(OpeCotizaCreditosDto dto) {
		this.dto = opeCotizaCreditoController.cotizar(dto);
	}
	
	
	public void searProductBySKU(String SKU) {
		productos = opeCotizaCreditoController.getProductosBySKU(SKU);
	}

}
