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

import com.fj.ramirez.dao.OpeCotizaCreditosDao;
import com.fj.ramirez.dto.OpeCotizaCreditosDto;
import com.fj.ramirez.entities.CatPlazos;
import com.fj.ramirez.entities.OpeCotizaCreditos;
import com.fj.ramirez.service.OpeCotizaCreditosService;
import com.fj.ramirez.service.ServiceException;

import lombok.extern.log4j.Log4j;

/**
 * @author framirez21
 *
 */
@Log4j
@Service
public class OpeCotizaCreditosServiceImpl implements OpeCotizaCreditosService {
	
	
	@Autowired
	private OpeCotizaCreditosDao dao;

	@Override
	public OpeCotizaCreditosDto findById(Integer id) throws ServiceException {
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
	public List<OpeCotizaCreditosDto> listAll() throws ServiceException {

		List<OpeCotizaCreditosDto>result = new ArrayList<OpeCotizaCreditosDto>();
		try {
			for (OpeCotizaCreditos cotiza : dao.listAll()) {
				result.add(entityToDto(cotiza));
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
	public OpeCotizaCreditosDto save(OpeCotizaCreditosDto dto) throws ServiceException {
		OpeCotizaCreditos entity = dtoToEntity(dto);
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
	public void update(OpeCotizaCreditosDto dto) throws ServiceException {
		try {
			dao.update(dtoToEntity(dto));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(OpeCotizaCreditosDto dto) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(Collection<OpeCotizaCreditosDto> dtos) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdate(OpeCotizaCreditosDto dto) throws ServiceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Integer id) throws ServiceException {
		try {
			dao.delete(id);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
		}
	}

}
