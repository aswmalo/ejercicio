/**
 * 
 */
package com.fj.ramirez.dto;

import java.math.BigDecimal;

import javax.persistence.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author framirez21
 *
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class CatPlazosDto extends AbstractBaseDto{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
    private Integer numeroSemanas;
    private BigDecimal tasaNormal;
    private BigDecimal tasaPuntual;
	
}
