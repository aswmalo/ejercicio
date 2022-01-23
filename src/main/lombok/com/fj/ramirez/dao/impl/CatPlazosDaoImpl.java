/**
 * 
 */
package com.fj.ramirez.dao.impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.fj.ramirez.dao.AbstractHibernate4CatalogsDaoImpl;
import com.fj.ramirez.dao.CatPlazosDao;
import com.fj.ramirez.entities.CatPlazos;

import lombok.extern.log4j.Log4j;

/**
 * @author framirez21
 *
 */
@Log4j
@Repository
public class CatPlazosDaoImpl extends AbstractHibernate4CatalogsDaoImpl<CatPlazos, Integer> implements CatPlazosDao {

	@Override
	public CatPlazos findById(Integer pk) throws Exception {
		return getHibernateTemplate().load(CatPlazos.class, pk);
	}

	@Override
	public List<CatPlazos> listAll() throws Exception {
		return getHibernateTemplate().loadAll(CatPlazos.class);
	}

}
