package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	public void test() {
		//assertEquals(1,1);
		boolean condn = true;
		assertEquals(true, condn);
		assertTrue(condn);
		assertFalse(condn);
		assertArrayEquals(expected, actuals);
	}

}
