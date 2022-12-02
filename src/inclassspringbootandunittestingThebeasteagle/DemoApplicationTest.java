package inclassspringbootandunittestingThebeasteagle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoApplicationTest { 
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testGetContent() {
		Greeting greeting = new Greeting(1, "Test");
		assertEquals("Test", greeting.getContent());
	}

}
