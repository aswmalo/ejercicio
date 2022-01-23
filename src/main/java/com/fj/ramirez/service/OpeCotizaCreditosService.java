/**
 * 
 */
package com.fj.ramirez.service;

import org.modelmapper.MappingException;
import org.modelmapper.ModelMapper;

import com.fj.ramirez.dto.CatProductosDto;
import com.fj.ramirez.dto.OpeCotizaCreditosDto;
import com.fj.ramirez.entities.CatProductos;
import com.fj.ramirez.entities.OpeCotizaCreditos;
import com.fj.ramirez.mapper.util.BaseMapper;

/**
 * @author framirez21
 *
 */
public interface OpeCotizaCreditosService extends GenericService<OpeCotizaCreditosDto, OpeCotizaCreditos, Integer>, BaseMapper<OpeCotizaCreditosDto, OpeCotizaCreditos> {

	@Override
	default OpeCotizaCreditos dtoToEntity(OpeCotizaCreditosDto source) throws MappingException {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(source, OpeCotizaCreditos.class);
	}
	@Override
	default OpeCotizaCreditosDto entityToDto(OpeCotizaCreditos source) throws MappingException {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(source, OpeCotizaCreditosDto.class);
	}
	
	void delete(Integer id) throws ServiceException;
}
