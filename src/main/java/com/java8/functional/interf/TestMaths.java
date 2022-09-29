package com.java8.functional.interf;

public class TestMaths {

	public static void main(String[] args) {
		Imaths mas = new MathsImpl();
		int result = mas.square(39);
		System.out.println("sqare of implementation :"+result);
	}
}
