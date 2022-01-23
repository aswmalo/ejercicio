/**
 * 
 */
package com.fj.ramirez.dao;

import java.io.Serializable;
import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.dao.DataAccessException;

import com.fj.ramirez.mapper.util.ItemToSelect;

import lombok.extern.log4j.Log4j;

/**
 * @author framirez21
 *
 */
@Log4j
public abstract class AbstractHibernate4CatalogsDaoImpl<T, PK extends Serializable> extends AbstractHibernate4DaoImpl<T, Integer> implements CatalogsDao<T, Integer> {
	
	@Override
	public List<ItemToSelect> listItemsFromCatalog(T clazz) throws DataAccessException {
		Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(clazz.getClass());
		criteria.setProjection(Projections.projectionList()
					.add(Projections.property("id").as("value"))
					.add(Projections.property("name").as("label"))
				);
		criteria.addOrder(Order.asc("name"));
		criteria.setResultTransformer(Transformers.aliasToBean(ItemToSelect.class));
		return criteria.list();
	}

	@Override
	public List<ItemToSelect> listItemsFromCatalog(T clazz, String columnParent, Integer PK) throws DataAccessException {
		Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(clazz.getClass());
		criteria.setProjection(Projections.projectionList()
				.add(Projections.property("id").as("value"))
				.add(Projections.property("name").as("label"))
			);
		criteria.add(Restrictions.eq(columnParent, PK));
		criteria.addOrder(Order.asc("name"));
		criteria.setResultTransformer(Transformers.aliasToBean(ItemToSelect.class));
		return criteria.list();
	}
	
	@Override	
	public List<T> listAllEnabled(T clazz) throws DataAccessException {
		Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(clazz.getClass());
		criteria.add(Restrictions.eq("enabled", true));
		return criteria.list();
	}
}