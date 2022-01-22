/**
 * 
 */
package com.fj.ramirez.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author framirez21
 *
 */
public interface GenericService<DTO, ENTITY, ID extends Serializable> {
	

	/**
	 * 
	 * @param class1
	 * @param pk
	 * @return
	 * @throws ServiceException
	 */
	DTO findById(ID id) throws ServiceException;
	
	/**
	 * 
	 * @param entitiy
	 * @return
	 * @throws ServiceException
	 */
	List<DTO> listAll() throws ServiceException;
	
	/**
	 * 
	 * @param entity
	 * @return
	 * @throws ServiceException
	 */
	DTO save(DTO dto) throws ServiceException;
	
	/**
	 * 
	 * @param entity
	 * @throws ServiceException
	 */
	void update(DTO dto) throws ServiceException;
	
	/**
	 * 
	 * @param entity
	 * @throws ServiceException
	 */
	void delete(DTO dto) throws ServiceException;
	
	/**
	 * 
	 * @param entities
	 * @throws ServiceException
	 */
	void saveAll(Collection<DTO> dtos) throws ServiceException;
	
	/**
	 * 
	 * @param entity
	 * @throws ServiceException
	 */
	void saveOrUpdate(DTO dto) throws  ServiceException;

}
