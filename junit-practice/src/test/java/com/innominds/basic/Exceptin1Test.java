package com.innominds.basic;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Exceptin1Test {
	
	@Test(expected=ArithmeticException.class)
	public void testDivisionWithException() {
		
		int i=1/0;
		System.out.println("division test");
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	//@Test
	public void testEmptyList() {
		//System.out.println("-IndexOutOfBoundsException test>");
		new ArrayList().get(0);
		System.out.println("-IndexOutOfBoundsException test>");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Test started");
	
	}
	@After
	public void afterTest() {
		System.out.println("test Ended");
	}
}
