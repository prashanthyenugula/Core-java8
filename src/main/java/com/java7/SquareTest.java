package com.java7;

public class SquareTest {
	
	public static void main(String[] args) {
		//int a= 19;
		SquareTest s = new SquareTest();
		System.out.println(s.square(18));
		System.out.println(s.square(66));
	}
	 
	public int square(int n) {
		return n*n;
	}
}
