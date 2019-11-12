package com.training.junit.square;

import com.training.junit.square.myexception.MaxValueException;

public class Square<T> {

	public double square(double num) throws MaxValueException {
		if (num > Double.MAX_VALUE) {
			throw new MaxValueException("The size of number is exceeding.");
		}
		return (double) num * num;
	}

}
