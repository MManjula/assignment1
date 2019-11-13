package com.training.junit.arraysearch.myexception;

/**
 * 
 * @author MManjula
 *
 */
public class InvalidElementSearchException extends Exception {

	public InvalidElementSearchException() {
	}

	/**
	 * 
	 * @param message
	 */
	public InvalidElementSearchException(String message) {
		super(message);
	}

}
