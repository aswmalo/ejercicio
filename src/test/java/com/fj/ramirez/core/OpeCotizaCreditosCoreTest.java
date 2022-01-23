package com.fj.ramirez.core;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
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

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({ TransactionalTestExecutionListener.class, DependencyInjectionTestExecutionListener.class })
@ContextConfiguration(locations = { "classpath:application-context-test.xml" })
@Log4j
public class OpeCotizaCreditosCoreTest {

	
	@Autowired
	private OpeCotizaCreditoCore core;
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCotiza() {
		OpeCotizaCreditosDto dto = new OpeCotizaCreditosDto();
		dto.setFkIdPlazos(2);
		dto.setFkIdProductos(0);
		
		log.info(core.cotiza(dto).toString());
	}

}
