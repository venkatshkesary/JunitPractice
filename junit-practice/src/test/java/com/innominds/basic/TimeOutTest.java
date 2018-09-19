package com.innominds.basic;

import org.junit.Test;

public class TimeOutTest {
	int count=1;
	
	@Test
	public void test1() {
		System.out.println("hello");
		
	}
	@Test(timeout=100)
	public void test2() {
		while(count<=1000) {
			System.out.println("test 2 while--------->"+count++);
			
		}
		//System.out.println("hello");
		
	}

}
