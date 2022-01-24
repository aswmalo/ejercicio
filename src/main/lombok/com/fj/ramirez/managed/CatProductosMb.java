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

import com.fj.ramirez.controller.CatProductoController;
import com.fj.ramirez.dto.CatProductosDto;

import lombok.Data;
import lombok.Setter;

/**
 * @author framirez21
 *
 */
@Data
@ViewScoped
@ManagedBean
public class CatProductosMb implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Setter
	@ManagedProperty(value ="#{catProductoController}")
	private CatProductoController catProductoController;

	private List<CatProductosDto> productos;
	private CatProductosDto dto;
	
	
	@PostConstruct
	public void init() {
		this.dto = new CatProductosDto();
		this.setProductos(catProductoController.listAll());
	}
	
}
