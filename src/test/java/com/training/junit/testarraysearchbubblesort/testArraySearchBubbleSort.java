package com.training.junit.testarraysearchbubblesort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.training.junit.arraysearchbubblesort.ArraySearchBubbleSort;

public class testArraySearchBubbleSort {

	@Test
	public void testSearchElementUsingBubbleSort() {
		int array[] = ArraySearchBubbleSort.bubbleSort();
		int expectedArray[] = { 1, 5, 6, 7, 12, 15, 19, 23, 26, 35, 37, 47, 52, 78, 86 };
		assertArrayEquals(expectedArray, array);
	}

}
