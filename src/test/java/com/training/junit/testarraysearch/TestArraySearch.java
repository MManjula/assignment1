package com.training.junit.testarraysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.arraysearch.ArraySearch;
import com.training.junit.arraysearch.myexception.InvalidElementSearchException;

/**
 * 
 * @author MManjula
 *
 */
public class TestArraySearch {
	/**
	 * 
	 * @throws InvalidElementSearchException if the element is not present in array
	 */
	@Test
	public void testSearchingOfElement() throws InvalidElementSearchException {
		assertEquals(true, ArraySearch.search(19));
	}

	/**
	 * 
	 * @throws InvalidElementSearchException if the element is not present in array
	 */
	@Test(expected = InvalidElementSearchException.class)
	public void testElementNotFound() throws InvalidElementSearchException {
		ArraySearch.search(96);
	}

}
