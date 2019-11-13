package com.training.junit.testinterest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.Interest.Interest;

/**
 * 
 * @author MManjula
 *
 */
public class TestInterest {
	/**
	 * tests the calculated simple interest
	 */
	@Test
	public void testSimpleInterest() {
		assertEquals(3600, Interest.calSimpleInterest(12000, 5, 6), 0.02);
	}

	/**
	 * tests the calculated compound interest
	 */
	@Test
	public void testCompountInterest() {
		assertEquals(1333.09, Interest.calCompoundInterest(1200, 2, 5.4), 0.02);
	}

}
