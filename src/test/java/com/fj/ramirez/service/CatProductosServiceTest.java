/**
 * 
 */
package com.fj.ramirez.service;

import static org.junit.Assert.fail;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.fj.ramirez.dto.CatProductosDto;

import lombok.extern.log4j.Log4j;
import uk.co.jemos.podam.api.PodamFactory;

/**
 * @author framirez21
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({ TransactionalTestExecutionListener.class, DependencyInjectionTestExecutionListener.class })
@ContextConfiguration(locations = { "classpath:application-context-test.xml" })
@Log4j
public class CatProductosServiceTest {

	@Autowired
	private CatProductosService service;
	
	@Resource
	private PodamFactory factory;
	
	private CatProductosDto dto;
	

	
	@Before
	public void setUp() throws Exception {
		this.dto = factory.manufacturePojo(CatProductosDto.class);
	}

	
	@After
	public void tearDown() throws Exception {
		this.dto = null;
	}
	/**
	 * Test method for {@link com.fj.ramirez.service.impl.CatProductosServiceImpl#findById(java.lang.Integer)}.
	 */
	@Ignore
	@Test
	public void testFindById() {
		try {
			log.info(service.findById(0).toString());
		}catch (ServiceException e) {
			log.error(e);
		}
	}
	/**
	 * Test method for {@link com.fj.ramirez.service.impl.CatProductosServiceImpl#listAll()}.
	 */
	@Ignore
	@Test
	public void testListAll() {

		try {
			for(CatProductosDto plazo : service.listAll()) {
				log.info(plazo);
			}
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		
		}
		
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.CatProductosServiceImpl#save(com.fj.ramirez.dto.CatProductosDto)}.
	 */
	@Ignore
	@Test
	public void testSave() {
		log.info("*******************SAVE***PRODUCTOS");
		try {
			this.dto.setId(null);
			log.info(dto.toString());
			service.save(dto);
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.CatProductosServiceImpl#update(com.fj.ramirez.dto.CatProductosDto)}.
	 */
	@Ignore
	@Test
	public void testUpdate() {

		try {
			CatProductosDto dto = service.findById(1);
			service.update(dto);
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.CatProductosServiceImpl#delete(com.fj.ramirez.dto.CatProductosDto)}.
	 */
	
	@Test
	public void testDelete() {
		try {
			service.delete(1);
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.CatProductosServiceImpl#saveAll(java.util.Collection)}.
	 */
	@Ignore
	@Test
	public void testSaveAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.CatProductosServiceImpl#saveOrUpdate(com.fj.ramirez.dto.CatProductosDto)}.
	 */
	@Ignore
	@Test
	public void testSaveOrUpdate() {
		fail("Not yet implemented");
	}

}
