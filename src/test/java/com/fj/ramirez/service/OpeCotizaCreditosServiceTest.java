/**
 * 
 */
package com.fj.ramirez.service;

import static org.junit.Assert.fail;

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

import com.fj.ramirez.dto.OpeCotizaCreditosDto;

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
public class OpeCotizaCreditosServiceTest {
	
	
	@Autowired
	private OpeCotizaCreditosService service;
	
	@Resource
	private PodamFactory factory;
	
	private OpeCotizaCreditosDto dto;
	
	@Before
	public void setUp() throws Exception {
		this.dto = factory.manufacturePojo(OpeCotizaCreditosDto.class);
	}

	
	@After
	public void tearDown() throws Exception {
		this.dto = null;
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeCotizaCreditosServiceImpl#findById(java.lang.Integer)}.
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
	 * Test method for {@link com.fj.ramirez.service.impl.OpeCotizaCreditosServiceImpl#listAll()}.
	 */
	
	@Test
	public void testListAll() {
		try {
			for(OpeCotizaCreditosDto opeCotiza : service.listAll()) {
				log.info(opeCotiza);
			}
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeCotizaCreditosServiceImpl#save(com.fj.ramirez.dto.OpeCotizaCreditosDto)}.
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
	 * Test method for {@link com.fj.ramirez.service.impl.OpeCotizaCreditosServiceImpl#update(com.fj.ramirez.dto.OpeCotizaCreditosDto)}.
	 */
	@Ignore
	@Test
	public void testUpdate() {
		try {
			OpeCotizaCreditosDto dto = service.findById(1);
			service.update(dto);
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeCotizaCreditosServiceImpl#delete(com.fj.ramirez.dto.OpeCotizaCreditosDto)}.
	 */
	@Ignore
	@Test
	public void testDeleteOpeCotizaCreditosDto() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeCotizaCreditosServiceImpl#saveAll(java.util.Collection)}.
	 */
	@Ignore
	@Test
	public void testSaveAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeCotizaCreditosServiceImpl#saveOrUpdate(com.fj.ramirez.dto.OpeCotizaCreditosDto)}.
	 */
	@Ignore
	@Test
	public void testSaveOrUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeCotizaCreditosServiceImpl#delete(java.lang.Integer)}.
	 */
	@Ignore
	@Test
	public void testDeleteInteger() {
		try {
			service.delete(1);
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		}
	}

}
