/**
 * 
 */
package com.fj.ramirez.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fj.ramirez.dao.AbstractHibernate4CatalogsDaoImpl;
import com.fj.ramirez.dao.CatProductosDao;
import com.fj.ramirez.entities.CatPlazos;
import com.fj.ramirez.entities.CatProductos;

import lombok.extern.log4j.Log4j;

/**
 * @author framirez21
 *
 */
@Log4j
@Repository
public class CatProductosDaoImpl extends AbstractHibernate4CatalogsDaoImpl<CatProductos, Integer> implements CatProductosDao	{

	@Override
	public CatProductos findById(Integer pk) throws Exception {
		return getHibernateTemplate().load(CatProductos.class, pk);
	}

	@Override
	public List<CatProductos> listAll() throws Exception {
		return getHibernateTemplate().loadAll(CatProductos.class);
	}

}
