package WebElements;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Runs before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Runs after each test");
	}

	@Test
	public void test1() {
		System.out.println("Execute test2");
	}
	
	@Test
	public void test2() {
		System.out.println("Execute test1");
	}

}
