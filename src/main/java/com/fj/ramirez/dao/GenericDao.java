/**
 * 
 */
package com.fj.ramirez.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.dao.DataAccessException;

/**
 * @author framirez21
 *
 */
public interface GenericDao<T, PK extends Serializable> {

	/**
	 * 
	 * @param class1
	 * @param pk
	 * @return
	 * @throws Exception
	 */
	T findById(PK pk) throws Exception;
	
	/**
	 * 
	 * @param entitiy
	 * @return
	 * @throws Exception
	 */
	List<T> listAll() throws Exception;
	
	/**
	 * 
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	T save(T entity) throws Exception;
	
	/**
	 * 
	 * @param entity
	 * @throws Exception
	 */
	void update(T entity) throws Exception;
	
	/**
	 * 
	 * @param entity
	 * @throws Exception
	 */
	void delete(T entity) throws Exception;
	
	/**
	 * 
	 * @param entities
	 * @throws Exception
	 */
	void saveAll(Collection<T> entities) throws Exception;
	
	/**
	 * 
	 * @param entity
	 * @throws Exception
	 */
	void saveOrUpdate(T entity) throws  Exception;
	
	void delete(PK pk) throws Exception;
}