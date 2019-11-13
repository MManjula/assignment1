package com.training.junit.square;

import com.training.junit.square.myexception.MaxValueException;

/**
 * 
 * @author MManjula
 *
 * @param <T>
 */
public class Square<T> {
	/**
	 * 
	 * @param num
	 * @return the square of the number entered by the user
	 * @throws MaxValueException if the number is out of range
	 */
	public double square(double num) throws MaxValueException {
		if (num > Double.MAX_VALUE) {
			throw new MaxValueException("The size of number is exceeding.");
		}
		return (double) num * num;
	}

}
