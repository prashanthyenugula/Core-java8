package com.java8.MethodReference;

public class CalculateTest {
	
	public static void main(String[] args) {
		ICalculate cal = Calculator :: add;
			
		System.out.println(cal.sum(27, 11));	
		System.out.println(cal.sum(12, 16));
	}

}
