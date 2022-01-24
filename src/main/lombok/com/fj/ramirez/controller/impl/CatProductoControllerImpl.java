/**
 * 
 */
package com.fj.ramirez.controller.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.fj.ramirez.controller.CatProductoController;
import com.fj.ramirez.dto.CatProductosDto;
import com.fj.ramirez.entities.CatProductos;
import com.fj.ramirez.service.CatProductosService;
import com.fj.ramirez.service.ServiceException;

import lombok.Data;
import lombok.Setter;

/**
 * @author ccerrillo
 *
 */
@Data
@ViewScoped
@ManagedBean(name = "catProductoController")
public class CatProductoControllerImpl implements CatProductoController {

	@Setter
	@ManagedProperty(value = "#{catProductosService}")
	private CatProductosService catProductosService;
	
	@Override
	public List<CatProductosDto> listAll() {
		List<CatProductosDto> items = new ArrayList<CatProductosDto>();
		
		try {
			items= catProductosService.listAll();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return items;
	}

	@Override
	public CatProductosDto findById(Integer id) {
		CatProductosDto dto = null;
		try {
			dto =catProductosService.findById(id);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public void saveOrUpdate(CatProductos dto) {
		// TODO Auto-generated method stub

	}

}
