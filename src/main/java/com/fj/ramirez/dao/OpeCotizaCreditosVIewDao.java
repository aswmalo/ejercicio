/**
 * 
 */
package com.fj.ramirez.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.fj.ramirez.entities.OpeCotizaCreditos;
import com.fj.ramirez.entities.OpeCotizaCreditosView;

/**
 * @author framirez21
 *
 */
public interface OpeCotizaCreditosVIewDao extends GenericDao<OpeCotizaCreditosView, Integer> {
	
	
	List<OpeCotizaCreditosView> searchCotiza(OpeCotizaCreditos criteria) throws DataAccessException;
	
	
}
