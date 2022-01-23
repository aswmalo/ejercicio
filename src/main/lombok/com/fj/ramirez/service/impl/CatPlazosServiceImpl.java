/**
 * 
 */
package com.fj.ramirez.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fj.ramirez.dao.CatPlazosDao;
import com.fj.ramirez.dto.CatPlazosDto;
import com.fj.ramirez.entities.CatPlazos;
import com.fj.ramirez.service.CatPlazosService;
import com.fj.ramirez.service.ServiceException;

import lombok.extern.log4j.Log4j;

/**
 * @author framirez21
 *
 */
@Log4j
@Service("catPlazosService")
public class CatPlazosServiceImpl implements CatPlazosService {

	@Autowired
	private CatPlazosDao dao;
	
	@Override
	public CatPlazosDto findById(Integer id) throws ServiceException {
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
	public List<CatPlazosDto> listAll() throws ServiceException {
		List<CatPlazosDto>result = new ArrayList<CatPlazosDto>();
		try {
			for (CatPlazos plazos : dao.listAll()) {
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
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public CatPlazosDto save(CatPlazosDto dto) throws ServiceException {
		CatPlazos entity = dtoToEntity(dto);
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
	public void update(CatPlazosDto dto) throws ServiceException {
		try {
			dao.update(dtoToEntity(dto));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(CatPlazosDto dto) throws ServiceException {
		// TODO Auto-generated method stub
	}

	@Override
	public void saveAll(Collection<CatPlazosDto> dtos) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdate(CatPlazosDto dto) throws ServiceException {
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

}
