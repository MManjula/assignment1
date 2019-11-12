package com.training.junit.testArmstrong;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.Armstrong.myexception.NumberOutOfRangeException;
import com.training.junit.Armstrong.*;
public class TestArmstrong {

	@Test
	public void testIsArmstrong() throws NumberOutOfRangeException {
		assertEquals(true, Armstrong.isArmstrong(153));
	}

	@Test
	public void testIsNotArmstrong() throws NumberOutOfRangeException {
		assertEquals(true, Armstrong.isArmstrong(297));
	}

}
