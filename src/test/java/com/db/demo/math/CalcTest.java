package com.db.demo.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

	Calc calc = new Calc();

	@Test
	public void testAddNums() {
		assertEquals(15, calc.addNums(10, 5));
	}

	@Test
	public void testAddNums2() {
		assertEquals(20, calc.addNums(10, 10));
	}
}
