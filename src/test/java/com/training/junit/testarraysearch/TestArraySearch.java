package com.training.junit.testarraysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.arraysearch.ArraySearch;
import com.training.junit.arraysearch.myexception.InvalidElementSearchException;

public class TestArraySearch {

	@Test
	public void testSearchingOfElement() throws InvalidElementSearchException {
		assertEquals(true, ArraySearch.search(19));
	}

	@Test(expected = InvalidElementSearchException.class)
	public void testElementNotFound() throws InvalidElementSearchException {
		ArraySearch.search(96);
	}

}
