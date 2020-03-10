import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMultiply() {
		
		MyClass temp = new MyClass();
		
		// int result = temp.multiply(3, 3);
		int result = temp.multiply(4, 3);
		
		assertEquals(12, result);

	}

	@Test(expected=IllegalArgumentException.class)
	public void testMultiply2() {
		
		MyClass temp = new MyClass();
		
		temp.multiply(1000, 2);
	}

}
