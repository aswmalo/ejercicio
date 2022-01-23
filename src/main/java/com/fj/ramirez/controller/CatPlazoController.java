/**
 * 
 */
package com.fj.ramirez.controller;

import java.io.Serializable;
import java.util.List;

import com.fj.ramirez.dto.CatPlazosDto;



/**
 * @author ccerrillo
 *
 */
public interface CatPlazoController extends Serializable {
	
	List<CatPlazosDto> listAll();
	
	CatPlazosDto findById(Integer id);
	
	
	void saveOrUpdate(CatPlazosDto dto);

}
