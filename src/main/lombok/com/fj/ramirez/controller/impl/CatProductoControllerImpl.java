/**
 * 
 */
package com.fj.ramirez.controller.impl;

import java.util.ArrayList;
import java.util.List;

import com.fj.ramirez.controller.CatProductoController;
import com.fj.ramirez.dto.CatPlazosDto;
import com.fj.ramirez.dto.CatProductosDto;
import com.fj.ramirez.entities.CatProductos;

/**
 * @author ccerrillo
 *
 */
public class CatProductoControllerImpl implements CatProductoController {

	@Override
	public List<CatProductosDto> listAll() {
		List<CatProductosDto> items = new ArrayList<CatProductosDto>();
		
		return items;
	}

	@Override
	public CatProductos findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(CatProductos dto) {
		// TODO Auto-generated method stub

	}

}
