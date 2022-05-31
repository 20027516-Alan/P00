import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

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
	public void testAdd() {
		//fail("Not yet implemented");
		int a =1234;
		int b=8765;
		Calculator cal=new Calculator();
		int actual=cal.add(a, b);
		int expected=9999;
		assertEquals(expected,actual);
	}
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a =1234;
		int b=4;
		Calculator cal=new Calculator();
		int actual=cal.subtract(a, b);
		int expected=1230;
		assertEquals(expected,actual);
	}
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a =80;
		int b=2;
		Calculator cal=new Calculator();
		int actual=cal.divide(a, b);
		int expected=40;
		assertEquals(expected,actual);
	}
	@Test
	public void testmultiplication() {
		//fail("Not yet implemented");
		int a =25;
		int b=2;
		Calculator cal=new Calculator();
		int actual=cal.Multiplication(a, b);
		int expected=50;
		assertEquals(expected,actual);
	}
}
