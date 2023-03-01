package n1exercici1;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

class AppTest {

	
	@Test
	public void testSize() {
		int sizeEsperado = 12;
		int sizeReal= App.creacionArray().size();
		assertEquals(sizeEsperado, sizeReal); 
	}
	
	@Test
	public void testNula() {
		
		assertNotNull(App.creacionArray().size());
				
	}
	
	@Test
	public void testPsocion() {
		
		assertEquals("Agosto", App.creacionArray().get(7)); 
		
	}

}
