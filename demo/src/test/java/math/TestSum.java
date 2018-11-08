package math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSum {

	static Sum sumObj=null;
	
	@Before
	public void before(){
		System.out.println("***********is before**************");
	}
	
	@After
	public void after(){
		System.out.println("***********is after**************");
	}
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("***********is before class**************");
		sumObj=new Sum();
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("***********is after class**************");
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}

	@Test
	public void sum3numbers() {
		
		assertEquals(sumObj.sum(new int[]{1,2,3,4}), 6);
		assertTrue(sumObj.sum(new int[]{1,2,3,4}) ==6);
		assertFalse(sumObj.sum(new int[]{1,2,3,4}) ==7);
		assertNotEquals(sumObj.sum(new int[]{1,2,3,4}), 60);
	}
	
	@Test
	public void sum3numbersError() {
		
		
		assertEquals(sumObj.sum(new int[]{1,2,3,4}), 60);
	}

}
