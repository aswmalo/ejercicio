/**
 * 
 */
package com.fj.ramirez.core.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.aspectj.apache.bcel.classfile.CodeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fj.ramirez.core.OpeCotizaCreditoCore;
import com.fj.ramirez.dto.CatPlazosDto;
import com.fj.ramirez.dto.CatProductosDto;
import com.fj.ramirez.dto.OpeCotizaCreditoViewDto;
import com.fj.ramirez.dto.OpeCotizaCreditosDto;
import com.fj.ramirez.service.CatPlazosService;
import com.fj.ramirez.service.CatProductosService;
import com.fj.ramirez.service.OpeCotizaCreditosService;
import com.fj.ramirez.service.ServiceException;

import lombok.extern.log4j.Log4j;

/**
 * @author framirez21
 *
 */
@Log4j
@Component("opeCotizaCreditoCore")
public class OpeCotizaCreditoCoreImpl implements OpeCotizaCreditoCore {
	
	
	@Autowired
	private CatProductosService productosService;
	@Autowired
	private CatPlazosService plazosService;
	@Autowired
	private OpeCotizaCreditosService service;

	@Override
	public OpeCotizaCreditosDto cotiza(OpeCotizaCreditosDto dto) {
		BigDecimal abonoNormal;
		BigDecimal abonoPuntual;
		
		;
		try {
			CatProductosDto proDto = productosService.findById(dto.getFkIdProductos());
			CatPlazosDto plaDto = plazosService.findById(dto.getFkIdPlazos());
			abonoNormal = ((proDto.getPrecio().multiply(plaDto.getTasaNormal())).add(proDto.getPrecio()));
			log.info(abonoNormal);
			abonoNormal = new BigDecimal(abonoNormal.longValue()/plaDto.getNumeroSemanas());
			
			
			
			abonoPuntual = ((proDto.getPrecio().multiply(plaDto.getTasaPuntual())).add(proDto.getPrecio()));
			log.info(abonoPuntual);
			abonoPuntual = new BigDecimal(abonoPuntual.longValue()/plaDto.getNumeroSemanas());
			dto.setCalculateNormal(abonoNormal);
			dto.setCalculatePuntual(abonoPuntual);
			log.info(dto.toString());
		
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		return dto;
	}

	@Override
	public List<OpeCotizaCreditoViewDto> listCotizaciones() {
		List<OpeCotizaCreditoViewDto> result = new ArrayList<OpeCotizaCreditoViewDto>();
		try {
			result =  service.listCotizaciones();
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
			
		}
		return result;
	}



}
