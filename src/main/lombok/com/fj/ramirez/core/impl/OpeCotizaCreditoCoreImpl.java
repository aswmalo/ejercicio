/**
 * 
 */
package com.fj.ramirez.core.impl;

import java.math.BigDecimal;

import org.apache.commons.math3.util.MathUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fj.ramirez.core.OpeCotizaCreditoCore;
import com.fj.ramirez.dto.CatPlazosDto;
import com.fj.ramirez.dto.CatProductosDto;
import com.fj.ramirez.dto.OpeCotizaCreditosDto;
import com.fj.ramirez.service.CatPlazosService;
import com.fj.ramirez.service.CatProductosService;
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

	@Override
	public OpeCotizaCreditosDto cotiza(OpeCotizaCreditosDto dto) {
		BigDecimal abonoNormal;
		BigDecimal abonoPuntual;
		
		;
		try {
			CatProductosDto proDto = productosService.findById(dto.getFkIdProductos());
			CatPlazosDto plaDto = plazosService.findById(dto.getFkIdPlazos());
			BigDecimal dividendoNormal = proDto.getPrecio().multiply(plaDto.getTasaNormal()).add( proDto.getPrecio())  ;
			BigDecimal divisorNormal =new BigDecimal(plaDto.getNumeroSemanas());	
			abonoNormal = dividendoNormal.divide(divisorNormal);
		
			BigDecimal dividendoPuntual = proDto.getPrecio().multiply(plaDto.getTasaPuntual()).add( proDto.getPrecio());
			BigDecimal divisorPuntual = new BigDecimal(plaDto.getNumeroSemanas());	
			abonoPuntual = dividendoPuntual.divide(divisorPuntual);
			dto.setCalculateNormal(abonoNormal);
			dto.setCalculatePuntual(abonoPuntual);
			log.info(dto.toString());
		
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		return dto;
	}

}