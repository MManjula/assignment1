package com.training.junit.testarmstrongwithinrange;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.armstrongwithinrange.FindArmstrong;
import com.training.junit.armstrongwithinrange.myexception.InputOutOfRangeException;

public class TestArmstrongWithinRange {
	/**
	 * Method to test calculateArmstrong() method of FindArmstrong class within
	 * range
	 * 
	 * @throws InputOutOfRangeException
	 */
	@Test
	public void testArmstrongWithinRange() throws InputOutOfRangeException {
		assertEquals(true, FindArmstrong.calculateArmstrong(153));
	}

	/**
	 * Method to test calculateArmstrong() method of ArmstrongFinder class for
	 * invalid armstrong integer within range
	 * 
	 * @throws InputOutOfRangeException
	 * 
	 */
	@Test
	public void tesIntegerWithinRangeButNotArmstrong() throws InputOutOfRangeException {
		assertEquals(true, FindArmstrong.calculateArmstrong(100));
	}

	/**
	 * Method to test calculateArmstrong() method of FindArmstrong class for
	 * out-of-range input
	 * 
	 * @throws InputOutOfRangeException
	 * 
	 */
	@Test(expected = InputOutOfRangeException.class)
	public void testArmstrongOutOfRange() throws InputOutOfRangeException {
		FindArmstrong.calculateArmstrong(1634);
	}

}
