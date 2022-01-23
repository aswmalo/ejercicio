/**
 * 
 */
package com.fj.ramirez.service;

import org.modelmapper.MappingException;
import org.modelmapper.ModelMapper;

import com.fj.ramirez.dto.CatPlazosDto;
import com.fj.ramirez.entities.CatPlazos;
import com.fj.ramirez.entities.CatProductos;
import com.fj.ramirez.mapper.util.BaseMapper;

/**
 * @author framirez21
 *
 */
public interface CatPlazosService extends GenericService<CatPlazosDto, CatPlazos, Integer>, BaseMapper<CatPlazosDto, CatPlazos> {

	@Override
	default CatPlazos dtoToEntity(CatPlazosDto source) throws MappingException {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(source, CatPlazos.class);
	}
	@Override
	default CatPlazosDto entityToDto(CatPlazos source) throws MappingException {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(source, CatPlazosDto.class);
	}
	void delete(Integer id) throws ServiceException;
}
