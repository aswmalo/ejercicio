/**
 * 
 */
package com.fj.ramirez.controller;

import java.io.Serializable;
import java.util.List;

import com.fj.ramirez.dto.CatProductosDto;
import com.fj.ramirez.entities.CatProductos;

/**
 * @author ccerrillo
 *
 */
public interface CatProductoController extends Serializable {

	List<CatProductosDto> listAll();
	
	CatProductos findById(Integer id);
	
	
	void saveOrUpdate(CatProductos dto);
	
	
}
