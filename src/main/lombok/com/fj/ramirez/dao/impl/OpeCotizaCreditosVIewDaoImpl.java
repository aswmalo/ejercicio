/**
 * 
 */
package com.fj.ramirez.dao.impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.fj.ramirez.dao.AbstractHibernate4DaoImpl;
import com.fj.ramirez.dao.OpeCotizaCreditosVIewDao;
import com.fj.ramirez.entities.OpeCotizaCreditos;
import com.fj.ramirez.entities.OpeCotizaCreditosView;

import lombok.extern.log4j.Log4j;

/**
 * @author framirez21
 *
 */
@Log4j
@Repository
public class OpeCotizaCreditosVIewDaoImpl extends AbstractHibernate4DaoImpl<OpeCotizaCreditosView, Integer> implements OpeCotizaCreditosVIewDao{
	
	@Override
	public OpeCotizaCreditosView findById(Integer pk) throws Exception {
		return getHibernateTemplate().load(OpeCotizaCreditosView.class, pk);
	}

	@Override
	public List<OpeCotizaCreditosView> listAll() throws Exception {
		return getHibernateTemplate().loadAll(OpeCotizaCreditosView.class);
	}

	@Override
	public List<OpeCotizaCreditosView> searchCotiza(OpeCotizaCreditos criteria) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
