package com.innominds.basic;



import org.junit.Test;
import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

public class Exception1Test2 {
	
	@Test
	public void testDivisionException() {
		try {
            int i = 1 / 0;
            fail(); //remember this line, else 'may' false positive
        } catch (ArithmeticException e) {
            assertThat(e.getMessage(), is("/ by zero"));
			//assert others
        }
	}

	@Test
	public void testEmptyList() {
		try {
			new ArrayList().get(0);
			fail();
			
		}catch (IndexOutOfBoundsException e) {
			assertThat(e.getMessage(), is("Index: 0, Size: 0"));
			// TODO: handle exception
		}
	}
}
