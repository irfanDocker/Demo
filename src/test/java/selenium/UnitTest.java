package selenium;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTest {
	
	@Test
	public void methodA() {
		int a = 5;
		int b = 4;
		assertEquals("Expected 9", 9 , a+b);
	}
	
	@Test
	public void methodB() {
		int a = 5;
		int b = 4;
		assertEquals("Expected 1", 1 , a-b);
	}
	
	@Test
	public void methodC() {
		int a = 5;
		int b = 4;
		assertEquals("Expected 20", 20 , a*b);
	}
	
	
}
