/**
 * 
 */
package com.fj.ramirez.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fj.ramirez.dao.AbstractHibernate4DaoImpl;
import com.fj.ramirez.dao.OpeCotizaCreditosDao;
import com.fj.ramirez.entities.OpeCotizaCreditos;

import lombok.extern.log4j.Log4j;

/**
 * @author framirez21
 *
 */
@Log4j
@Repository
public class OpeCotizaCreditosDaoImpl extends AbstractHibernate4DaoImpl<OpeCotizaCreditos, Integer> implements OpeCotizaCreditosDao{

	@Override
	public OpeCotizaCreditos findById(Integer pk) throws Exception {
		return getHibernateTemplate().load(OpeCotizaCreditos.class, pk);
	}

	@Override
	public List<OpeCotizaCreditos> listAll() throws Exception {
		return getHibernateTemplate().loadAll(OpeCotizaCreditos.class);
	}

}
