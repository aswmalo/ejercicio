/**
 * 
 */
package com.fj.ramirez.dao;

import java.io.Serializable;
import java.util.Collection;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import lombok.extern.log4j.Log4j;

/**
 * @author framirez21
 *
 */
@Log4j
public abstract class AbstractHibernate4DaoImpl<T, PK extends Serializable> extends HibernateDaoSupport implements GenericDao<T, PK> {
	
	@Autowired
	protected void anyMethodName(SessionFactory sessionFactory) { 
		 setSessionFactory(sessionFactory);
		 log.debug(sessionFactory.toString());
	 }

	@Override
	public T save(T entity) throws DataAccessException {
		return (T) getHibernateTemplate().save(entity);
	}

	@Override
	public void update(T entity) throws DataAccessException {
		getHibernateTemplate().update(entity);	
		
	}

	@Override
	public void delete(T entity) throws DataAccessException {
		getHibernateTemplate().delete(entity);	
		
	}

	@Override
	public void saveAll(Collection<T> entities) throws DataAccessException {
		for (T t : entities) {
			getHibernateTemplate().save(t);
		}	
	}

	@Override
	public void saveOrUpdate(T entity) throws DataAccessException {
		getHibernateTemplate().saveOrUpdate(entity);
		
	}

	

	@Override
	public void delete(PK pk) throws Exception {
		getHibernateTemplate().delete(findById(pk));
	}

}
