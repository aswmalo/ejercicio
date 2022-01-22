/**
 * 
 */
package com.fj.ramirez.service;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.fj.ramirez.dto.OpeProductosDto;

import lombok.extern.log4j.Log4j;

/**
 * @author framirez21
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({ TransactionalTestExecutionListener.class, DependencyInjectionTestExecutionListener.class })
@ContextConfiguration(locations = { "classpath:application-context-services-test.xml" })
@Log4j
public class OpeProductosServiceTest {

	@Autowired
	private OpeProductosService service;
	
	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeProductosServiceImpl#findById(java.lang.Integer)}.
	 */
	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeProductosServiceImpl#listAll()}.
	 */
	@Test
	public void testListAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeProductosServiceImpl#save(com.fj.ramirez.dto.OpeProductosDto)}.
	 */
	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeProductosServiceImpl#update(com.fj.ramirez.dto.OpeProductosDto)}.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeProductosServiceImpl#delete(com.fj.ramirez.dto.OpeProductosDto)}.
	 */
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeProductosServiceImpl#saveAll(java.util.Collection)}.
	 */
	@Test
	public void testSaveAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeProductosServiceImpl#saveOrUpdate(com.fj.ramirez.dto.OpeProductosDto)}.
	 */
	@Test
	public void testSaveOrUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeProductosServiceImpl#entityToDto(ENTITY)}.
	 */
	@Test
	public void testEntityToDto() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.fj.ramirez.service.impl.OpeProductosServiceImpl#dtoToEntity(OpeProductosDto)}.
	 */
	@Test
	public void testDtoToEntity() {
		fail("Not yet implemented");
	}

}
