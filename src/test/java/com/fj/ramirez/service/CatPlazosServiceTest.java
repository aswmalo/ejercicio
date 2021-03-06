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

import com.fj.ramirez.dto.CatPlazosDto;

import lombok.extern.log4j.Log4j;
import uk.co.jemos.podam.api.PodamFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({ TransactionalTestExecutionListener.class, DependencyInjectionTestExecutionListener.class })
@ContextConfiguration(locations = { "classpath:application-context-test.xml" })
@Log4j
public class CatPlazosServiceTest {
	
	@Autowired
	private CatPlazosService service;
	
	@Resource
	private PodamFactory factory;
	
	private CatPlazosDto dto;
	
	@Before
	public void setUp() throws Exception {
		this.dto = factory.manufacturePojo(CatPlazosDto.class);
	}

	
	@After
	public void tearDown() throws Exception {
		this.dto = null;
	}

	@Ignore
	@Test
	public void testFindById() {
		try {
			log.info(service.findById(0).toString());
		}catch (ServiceException e) {
			log.error(e);
		}
	}

	@Ignore
	@Test
	public void testListAll() {
		try {
			for(CatPlazosDto plazo : service.listAll()) {
				log.info(plazo);
			}
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		}
	}
	
	@Ignore
	@Test
	public void testSave() {
		
		log.info("*******************SAVE***PLAZOS");
		try {
			this.dto.setId(null);
			log.info(dto.toString());
			service.save(dto);
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		}
	}

	
	@Test
	public void testUpdate() {
		try {
			CatPlazosDto dto = service.findById(1);
			dto.setNumeroSemanas(2);
			service.update(dto);
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void testDelete() {
		try {
			service.delete(1);
		} catch (ServiceException e) {
			log.error(e);
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void testSaveAll() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testSaveOrUpdate() {
		fail("Not yet implemented");
	}
	
}
