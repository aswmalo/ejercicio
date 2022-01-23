/**
 * 
 */
package com.fj.ramirez.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.fj.ramirez.mapper.util.ItemToSelect;

/**
 * @author framirez21
 *
 */
public interface CatalogsDao<T,PK extends Serializable> extends GenericDao<T, Integer> {
	
	List<ItemToSelect> listItemsFromCatalog(T clazz) throws DataAccessException;
	
	List<ItemToSelect> listItemsFromCatalog(T clazz, String columnPArent, Integer PK) throws DataAccessException;
	
	List<T> listAllEnabled(T catAcademicLevelDto) throws DataAccessException;


}
