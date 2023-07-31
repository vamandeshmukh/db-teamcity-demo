package com.db.demo.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

	Calc calc = new Calc();

	// positive test case
	@Test
	public void testAddNums() {
		assertEquals(15, calc.addNums(10, 5));
	}

	// another positive test case
	@Test
	public void testAddNums2() {
		assertEquals(20, calc.addNums(10, 10));
	}

	// negative test case
	@Test
	public void testAddNums3() {
		assertNotEquals(20, calc.addNums(10, 5));
	}

	// another negative test case
	@Test
	public void testAddNums4() {
		assertNotEquals(10, calc.addNums(10, 5));
	}

	// another negative test case
	@Test
	public void testAddNums5() {
		assertNotEquals(11, calc.addNums(10, 5));
	}
}
