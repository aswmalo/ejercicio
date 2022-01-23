/**
 * 
 */
package com.fj.ramirez.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fj.ramirez.dao.CatProductosDao;
import com.fj.ramirez.dto.CatProductosDto;
import com.fj.ramirez.entities.CatPlazos;
import com.fj.ramirez.entities.CatProductos;
import com.fj.ramirez.service.CatProductosService;
import com.fj.ramirez.service.ServiceException;

import lombok.extern.log4j.Log4j;

/**
 * @author framirez21
 *
 */
@Log4j
@Service("catProductosService")
public class CatProductosServiceImpl  implements CatProductosService {

	@Autowired
	private CatProductosDao dao;
	
	@Override
	public CatProductosDto findById(Integer id) throws ServiceException {
		try {
			log.debug(id);
			return entityToDto(dao.findById(id));
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			throw new ServiceException(e);
		}
	}

	@Override
	public List<CatProductosDto> listAll() throws ServiceException {
		List<CatProductosDto>result = new ArrayList<CatProductosDto>();
		try {
			for (CatProductos plazos : dao.listAll()) {
				result.add(entityToDto(plazos));
			}
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			throw new ServiceException(e);
		}
		return result;
	}

	@Override
	@Transactional
	public CatProductosDto save(CatProductosDto dto) throws ServiceException {
		CatProductos entity = dtoToEntity(dto);
		try {
			dao.save(entity);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entityToDto(entity);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void update(CatProductosDto dto) throws ServiceException {
		try {
			dao.update(dtoToEntity(dto));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(CatProductosDto dto) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(Collection<CatProductosDto> dtos) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdate(CatProductosDto dto) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(Integer id) throws ServiceException {
		try {
			dao.delete(id);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
		}
	}		
	public List<CatProductosDto> searchProductsBySKU(String sku) throws DataAccessException {
		List<CatProductosDto>result = new ArrayList<CatProductosDto>();
		try {
			for (CatProductos plazos : dao.searchProductsBySKU(sku)) {
				result.add(entityToDto(plazos));
			}
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			
		}
		return result;
	}



}
