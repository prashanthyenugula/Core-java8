package com.java7;

public class IsEvenOrOdd {
	
	public static void main(String[] args) {
		
		IsEvenOrOdd e = new IsEvenOrOdd();
		
		System.out.println(e.isEven(11));
		System.out.println(e.isEven(89));
		System.out.println(e.isEven(1266));
		System.out.println(e.isEven(1246));
	}
	
		public boolean isEven(int number) {
			if(number % 2 ==0) {
				return true;
			} else {
				return false;
			}
		}
}
