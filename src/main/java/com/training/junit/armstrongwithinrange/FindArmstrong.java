package com.training.junit.armstrongwithinrange;

import com.training.junit.armstrongwithinrange.myexception.InputOutOfRangeException;

/**
 * 
 * @author MMannjula
 *
 */
public class FindArmstrong {
	/**
	 * 
	 * @param input
	 * @return true the integer if it is a palindrome and false when it is not a
	 *         palindrome
	 * @throws InputOutOfRangeException when the input is below 100 and above 999
	 */
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
