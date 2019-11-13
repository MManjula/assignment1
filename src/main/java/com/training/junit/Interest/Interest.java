package com.training.junit.Interest;

/**
 * 
 * @author MManjula
 *
 */
public class Interest {
	/**
	 * 
	 * @param principal
	 * @param time
	 * @param rate
	 * @return the simple interest
	 */
	public static double calSimpleInterest(double principal, double time, double rate) {
		double simpleInterest = (principal * time * rate) / 100;
		return simpleInterest;
	}

	/**
	 * 
	 * @param principal
	 * @param time
	 * @param rate
	 * @return the compound interest
	 */
	public static double calCompoundInterest(double principal, double time, double rate) {
		double compoundInterest = principal * Math.pow(1 + rate / 100.0, time);
		return compoundInterest;

	}
}
