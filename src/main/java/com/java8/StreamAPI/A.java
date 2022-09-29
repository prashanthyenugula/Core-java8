package com.java8.StreamAPI;

class A {
	static void show() {
		System.out.println("hai...1");
	}
}
class B extends A{
	static	void show() {
		System.out.println("hai...2");
	}
}
 class Cat {
		public static void main(String[] args) {
			A.show();
			
		}
	
}