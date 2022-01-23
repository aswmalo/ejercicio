/**
 * 
 */
package com.fj.ramirez.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.fj.ramirez.entities.CatProductos;

/**
 * @author framirez21
 *
 */
public interface CatProductosDao extends CatalogsDao<CatProductos, Integer> {

	List<CatProductos> searchProductsBySKU(String sku) throws DataAccessException;

}
