package com.bah.poc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.bah.poc.service.PersistenceManager;

@RunWith(SpringRunner.class)
public class CustomAnnotationTest {

	@Test
	public void testValidEmployee() throws Exception {
		PersistenceManager manager = new PersistenceManager();
		manager.deleteEntity("sku");
	}
}
