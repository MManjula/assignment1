package com.training.junit.testsquare;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.junit.square.Square;
import com.training.junit.square.myexception.MaxValueException;

/**
 * 
 * @author MManjula
 *
 */
public class TestSquare {
	private Square<Object> number;

	/**
	 * creates object before each run case
	 */
	@Before
	public void setUp() {
		number = new Square<Object>();
	}

	/**
	 * test for positive integer input
	 * 
	 */
	@Test
	public void testPositiveWholeNumber() throws MaxValueException {
		assertEquals(25, number.square(5), 0.02);

	}

	/**
	 * 
	 * test for negative integer input
	 */
	@Test
	public void testNegativeWholeNumber() throws MaxValueException {
		assertEquals(36, number.square(-6), 0.02);
	}

	/**
	 * 
	 * test for positive decimal input
	 */
	@Test
	public void testPositiveDecimal() throws MaxValueException {
		assertEquals(0.49, number.square(0.7), 0.02);
	}

	/**
	 * 
	 * test for negative decimal
	 */
	@Test
	public void testNegativeDecimal() throws MaxValueException {
		assertEquals(0.0064, number.square(-0.08), 0.02);
	}


	@After
	public void tearDown() {
		number = null;
	}

}
