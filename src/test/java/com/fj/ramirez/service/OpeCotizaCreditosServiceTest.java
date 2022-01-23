/**
 * 
 */
package com.fj.ramirez.service;

import static org.junit.Assert.fail;

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
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeCotizaCreditosServiceImpl#update(com.fj.ramirez.dto.OpeCotizaCreditosDto)}.
	 */
	@Ignore
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

}
