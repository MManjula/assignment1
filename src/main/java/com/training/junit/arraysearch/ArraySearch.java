package com.training.junit.arraysearch;

import com.training.junit.arraysearch.myexception.InvalidElementSearchException;

public class ArraySearch {

	static int array[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };

	public static Boolean search(int element) throws InvalidElementSearchException {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element)
				return true;
		}

		throw new InvalidElementSearchException("Invalid Input");

	}

}
