/**
 * 
 */
package com.fj.ramirez.controller.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import com.fj.ramirez.controller.CatPlazoController;
import com.fj.ramirez.dto.CatPlazosDto;

/**
 * @author ccerrillo
 *
 */
public class CatPlazoControllerImpl implements CatPlazoController {

	@Override
	public List<CatPlazosDto> listAll() {
		List<CatPlazosDto> items = new ArrayList<CatPlazosDto>();
		
		return items;
	}

	@Override
	public CatPlazosDto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(CatPlazosDto dto) {
		// TODO Auto-generated method stub

	}

}
