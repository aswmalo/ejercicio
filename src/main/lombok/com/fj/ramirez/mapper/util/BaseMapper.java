/**
 * 
 */
package com.fj.ramirez.mapper.util;

import org.modelmapper.MappingException;

/**
 * @author framirez21
 *
 */
public interface BaseMapper <DTO, ENTITY> {
	
	/**
	 * 
	 * @param source
	 * @return
	 * @throws MappingException
	 */
	DTO entityToDto(ENTITY source) throws MappingException;
	/**
	 * 
	 * @param source
	 * @return
	 * @throws MappingException
	 */
	ENTITY dtoToEntity(DTO source) throws MappingException;

}
