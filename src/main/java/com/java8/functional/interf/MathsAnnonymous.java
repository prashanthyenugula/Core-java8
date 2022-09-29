package com.java8.functional.interf;

public class MathsAnnonymous {
	
	public static void main(String[] args) {
		Imaths mas = new Imaths() {
			
			@Override
			public int square(int num) {
				return num*num;
			}
		};
		
		System.out.println("square value from annonymous inner class :"+mas.square(67));
	}
}
