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
public interface OpeCotizaCreditosDao extends GenericDao<OpeCotizaCreditos, Integer> {

	List<OpeCotizaCreditosView> listCotizaciones();
	
	
//	List<OpeCotizaCreditosView> searchCotiza(OpeCotizaCreditos criteria) throws DataAccessException;
	
	
}
