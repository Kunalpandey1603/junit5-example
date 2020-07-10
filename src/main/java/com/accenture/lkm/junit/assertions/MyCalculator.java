package com.accenture.lkm.junit.assertions;

public class MyCalculator {
	public int getSum(int a, int b) {

		return a + b;
	}

	public int getDifference(int a, int b) {
		return a - b;
	}

	public double getProduct(double a, double b) {
		return a * b;
	}

	public double getQuotient(double a, double b) {
		System.out.println(a + " " + b);
		return a / b;
	}

	public int getStringLength(String sinput) {
		return sinput.length();
	}
}
