package com.training.junit.Interest;

public class Interest {

	public static double calSimpleInterest(double principal, double time, double rate) {
		double simpleInterest = (principal * time * rate) / 100;
		return simpleInterest;
	}

	public static double calCompoundInterest(double principal, double time, double rate) {
		double compoundInterest = principal * Math.pow(1 + rate / 100.0, time);
		return compoundInterest;

	}
}
