package com.training.junit.armstrongwithinrange;

import com.training.junit.armstrongwithinrange.myexception.InputOutOfRangeException;

public class FindArmstrong {

	public static boolean calculateArmstrong(int input) throws InputOutOfRangeException {
		int length = 0, temp = 0, result = 0;
		if (input >= 100 && input <= 999) {
			while (input != 0) {
				input = input / 10;
				++length;
			}

			while (input != 0) {
				temp = input % 10;
				result = result + (int) Math.pow(temp, length);
				input /= 10;
			}

			if (result == input)
				return true;
			else
				return false;
		} else
			throw new InputOutOfRangeException("The input is out of range.");

	}

}
