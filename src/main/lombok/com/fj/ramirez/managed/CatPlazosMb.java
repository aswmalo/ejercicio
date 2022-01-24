/**
 * 
 */
package com.fj.ramirez.managed;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.fj.ramirez.controller.CatPlazoController;
import com.fj.ramirez.dto.CatPlazosDto;

import lombok.Data;
import lombok.Setter;

/**
 * @author framirez21
 *
 */
@Data
@ViewScoped
@ManagedBean
public class CatPlazosMb implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Setter
	@ManagedProperty(value = "#{catPlazoController}")
	private CatPlazoController catPlazoController;

	private List<CatPlazosDto> plazos;
	private CatPlazosDto dto;
	
	
	@PostConstruct
	public void init() {
		this.dto = new CatPlazosDto();
		this.setPlazos(catPlazoController.listAll());
	}
}
