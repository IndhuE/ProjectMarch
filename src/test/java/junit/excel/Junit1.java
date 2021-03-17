package junit.excel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit1 {
	@BeforeClass
	public static void tC1() {
		System.out.println("before class");
	}
	@Before
	public void tC2() {
		System.out.println("before");
	}
	@After
	public void tC3() {
		System.out.println("after");
	}
	@AfterClass
	public static void tC4() {
		System.out.println("after class");
	}
	@Test
	public void tC5() {
		System.out.println("test1");
	}
	@Test
	public void tC6() {
		System.out.println("test2");
	}
	@Test
	public void tC7() {
		System.out.println("test3");
	}
}
