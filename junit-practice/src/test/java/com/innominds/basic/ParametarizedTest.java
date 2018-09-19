package com.innominds.basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


@RunWith(value=Parameterized.class)
public class ParametarizedTest {
	
	private int numA;
	private int numB;
	private int exp;
	
	public ParametarizedTest(int numA,int numB,int exp) {
		System.out.println(numA+"  "+numB+" "+exp);
		this.numA=numA;
		this.numB=numB;
		this.exp=exp;
	}

	@Parameters(name="{index}: testAdd({0}+{1}) = {2}")
	public static List<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{1,1,2},
			{3,44,47},
			{-5,10,5}
			
		}
		);
				
	}
	
	@Test
	public void test_addTwoNums() {
		//assertThat(MathUtils.add(numA, numB), is(exp));
		System.out.println("fomr test");
		assertEquals(exp,MathUtils.add(numA, numB));
	}
}
