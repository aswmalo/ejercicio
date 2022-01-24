/**
 * 
 */
package com.fj.ramirez.controller.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.fj.ramirez.controller.CatPlazoController;
import com.fj.ramirez.dto.CatPlazosDto;
import com.fj.ramirez.service.CatPlazosService;
import com.fj.ramirez.service.ServiceException;

import lombok.Data;
import lombok.Setter;

/**
 * @author ccerrillo
 *
 */
@Data
@ViewScoped
@ManagedBean(name = "catPlazoController")
public class CatPlazoControllerImpl implements CatPlazoController {
	
	@Setter
	@ManagedProperty(value = "#{catPlazosService}")
	private CatPlazosService catPlazosService;

	@Override
	public List<CatPlazosDto> listAll() {
		List<CatPlazosDto> items = new ArrayList<CatPlazosDto>();
		
		try {
			items = catPlazosService.listAll();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return items;
	}

	@Override
	public CatPlazosDto findById(Integer id) {
		CatPlazosDto dto = null;
		try {
			 dto=catPlazosService.findById(id);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public void saveOrUpdate(CatPlazosDto dto) {
		// TODO Auto-generated method stub

	}

}
