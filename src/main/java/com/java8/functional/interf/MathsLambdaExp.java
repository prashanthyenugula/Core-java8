package com.java8.functional.interf;

public class MathsLambdaExp {
	
	public static void main(String[] args) {
		
		Imaths mas = num-> num*num;
		
		System.out.println("square value from Lambda :"+mas.square(34));
		System.out.println("square value from Lambda :"+mas.square(78));
	}

}
