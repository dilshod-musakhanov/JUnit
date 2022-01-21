package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
	
	@BeforeEach
	public void before() {
		System.out.println("Before");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After");
	}
	
	@AfterAll
	public static void  afterAll() {
		System.out.println("afterClass");
	}
	
	@BeforeAll
	public static void  beforeAll() {
		System.out.println("beforeClass");
	}
	
	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sum_with1numbers() {
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] {3}));
	}
}


/*
// usage without Before & After
// usual way

public class MyMathTest {
	//MyMath.sum
	//1,2,3 =>
	@Test
	public void sum_with3numbers() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {1,2,3});
		//check that result is 6
		//assertEquals(expected, actual);
		assertEquals(6, result);
	}
	@Test
	public void sum_with1numbers() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {3});
		//check that result is 3
		//assertEquals(expected, actual);
		assertEquals(3, result);
	}
} 
 
 
// shortened way

public class MyMathTest {
	MyMath myMath = new MyMath();
	@Test
	public void sum_with3numbers() {
		int result = myMath.sum(new int[] {1,2,3});
		assertEquals(6, result);
	}
	@Test
	public void sum_with1numbers() {
		int result = myMath.sum(new int[] {3});
		assertEquals(3, result);
	}
}


// more shortened way

public class MyMathTest {
	MyMath myMath = new MyMath();
	@Test
	public void sum_with3numbers() {
	//to inline click on result and CTRL+1 =>(inline to local variable) 
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	@Test
	public void sum_with1numbers() {
		assertEquals(3, myMath.sum(new int[] {3}));
	}
}
*/