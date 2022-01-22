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

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({ TransactionalTestExecutionListener.class, DependencyInjectionTestExecutionListener.class })
@ContextConfiguration(locations = { "classpath:application-context-services-test.xml" })
@Log4j
public class CatPlazosServiceTest {
	
	@Autowired
	private CatPlazosService service;

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testListAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveOrUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testEntityToDto() {
		fail("Not yet implemented");
	}

	@Test
	public void testDtoToEntity() {
		fail("Not yet implemented");
	}

}
