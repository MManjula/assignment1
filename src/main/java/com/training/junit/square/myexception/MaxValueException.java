package com.training.junit.square.myexception;

/**
 * 
 * @author MManjula
 *
 */
public class MaxValueException extends Exception {

	public MaxValueException() {
	}

	/**
	 * 
	 * @param message
	 */
	public MaxValueException(String message) {
		super(message);
	}

}
