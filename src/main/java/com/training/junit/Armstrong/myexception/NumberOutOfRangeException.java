package com.training.junit.Armstrong.myexception;

/**
 * 
 * @author MManjula
 *
 */
public class NumberOutOfRangeException extends Exception {

	public NumberOutOfRangeException() {
	}

	/**
	 * 
	 * @param message
	 */
	public NumberOutOfRangeException(String message) {
		super(message);
	}
}
