/**
 * 
 */
package com.fj.ramirez.mapper.util;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author framirez21
 *
 */
public class ItemToSelect implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "value")
	private Integer value;
	@Column(name = "label")
	private String label;
	@Column(name = "description")
	private String description;
	@Column(name = "url_image")
	private String urlImage;
	@Column(name = "parent")
	private Integer parent;
}
