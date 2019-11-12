package com.training.junit.Armstrong.myexception;

public class NumberOutOfRangeException extends Exception {

	public NumberOutOfRangeException() {
	}

	public NumberOutOfRangeException(String message) {
		super(message);
	}
}
