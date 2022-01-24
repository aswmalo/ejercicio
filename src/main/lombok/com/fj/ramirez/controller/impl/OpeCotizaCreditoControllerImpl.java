/**
 * 
 */
package com.fj.ramirez.controller.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import com.fj.ramirez.controller.OpeCotizaCreditoController;
import com.fj.ramirez.core.OpeCotizaCreditoCore;
import com.fj.ramirez.dto.OpeCotizaCreditoViewDto;
import com.fj.ramirez.dto.OpeCotizaCreditosDto;
import com.fj.ramirez.entities.OpeCotizaCreditosView;
import com.fj.ramirez.service.CatPlazosService;
import com.fj.ramirez.service.CatProductosService;
import com.fj.ramirez.service.ServiceException;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

/**
 * @author ccerrillo
 *
 */
@Log4j
@ViewScoped
@ManagedBean
public class OpeCotizaCreditoControllerImpl implements OpeCotizaCreditoController {
	
	@Setter
	@ManagedProperty(value = "#{opeCotizaCreditoCore}")
	private OpeCotizaCreditoCore opeCotizaCreditoCore;
	
	@Setter
	@ManagedProperty(value = "#{catPlazosService}")
	private CatPlazosService catPlazosService;
	
	@Setter
	@ManagedProperty(value = "#{catProductoService}")
	private CatProductosService catProductoService;

	@Override
	public OpeCotizaCreditosDto cotizar(OpeCotizaCreditosDto dto) {
		return opeCotizaCreditoCore.cotiza(dto);
	}

	@Override
	public List<SelectItem> getPlazos() {
		List<SelectItem> items = new ArrayList<SelectItem>();
		try {
			catPlazosService.listAll().forEach(item -> {
				items.add(new SelectItem(item.getId(), item.getNumeroSemanas()+""));
			});
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		}
		return items;
	}

	@Override
	public List<SelectItem> getProductosBySKU(String sku) {
		List<SelectItem> items = new ArrayList<SelectItem>();
//		try {
			catProductoService.searchProductsBySKU(sku).forEach(item -> {
				items.add(new SelectItem(item.getId(), item.getNombre()+""));
			});
//		} catch (ServiceException e) {
//			log.error(e);
//			e.printStackTrace();
//		}
		return items;
	}

	@Override
	public List<OpeCotizaCreditoViewDto> listCotizaciones() {
		return opeCotizaCreditoCore.listCotizaciones();
	}

}
