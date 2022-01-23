/**
 * 
 */
package com.fj.ramirez.service;

import org.modelmapper.MappingException;
import org.modelmapper.ModelMapper;

import com.fj.ramirez.dto.CatProductosDto;
import com.fj.ramirez.entities.CatProductos;
import com.fj.ramirez.mapper.util.BaseMapper;

/**
 * @author framirez21
 *
 */
public interface CatProductosService extends GenericService<CatProductosDto, CatProductos, Integer>, BaseMapper<CatProductosDto, CatProductos> {

	@Override
	default CatProductosDto entityToDto(CatProductos source) throws MappingException {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(source, CatProductosDto.class);
	}
	@Override
	default CatProductos dtoToEntity(CatProductosDto source) throws MappingException {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(source, CatProductos.class);
	}
	void delete(Integer id) throws ServiceException;
}
