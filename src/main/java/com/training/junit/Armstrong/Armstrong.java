package com.training.junit.Armstrong;

import com.training.junit.Armstrong.myexception.NumberOutOfRangeException;

public class Armstrong {

	public static boolean isArmstrong(int number) throws NumberOutOfRangeException {
		int rem, result = 0;
		if(number<0)
			throw new NumberOutOfRangeException("The number is out of range");
		while (number != 0) {
			rem = number % 10;
			result = result + (rem * rem * rem);
			number /= 10;
		}
		return true;
	}

}
