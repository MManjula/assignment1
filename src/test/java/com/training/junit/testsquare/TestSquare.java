package com.training.junit.testsquare;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.junit.square.Square;
import com.training.junit.square.myexception.MaxValueException;

public class TestSquare {
	private Square<Object> number;

	@Before
	public void setUp() {
		number = new Square<Object>();
	}

	@Test
	public void testPositiveWholeNumber() throws MaxValueException {
		assertEquals(25, number.square(5), 0.02);

	}

	@Test
	public void testNegativeWholeNumber() throws MaxValueException {
		assertEquals(36, number.square(-6), 0.02);
	}

	@Test
	public void testPositiveDecimal() throws MaxValueException {
		assertEquals(0.49, number.square(0.7), 0.02);
	}

	@Test
	public void testNegativeDecimal() throws MaxValueException {
		assertEquals(0.0064, number.square(-0.08), 0.02);
	}

	@After
	public void tearDown() {
		number = null;
	}

}
