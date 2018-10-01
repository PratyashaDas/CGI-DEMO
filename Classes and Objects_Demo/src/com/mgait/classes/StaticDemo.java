package com.mgait.classes;

public class StaticDemo {

	public static double fahrenheitToCelcius(double fahrenheit) {
		double celsius = (5.0 / 9.0) * (fahrenheit - 32);
		return celsius;
	}

	public static int max(int one, int two) {
		if (one > two) {
			return one;
		} else {
			return two;
		}
	}
}