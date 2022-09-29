package com.java8.MethodReference;

public class MethodRefLambda {
	
	static int a=10;
	public static void main(String[] args) {
		Runnable r = ()->{
			System.out.println(a);
			for (int i = 0; i < 10; i++) {
				System.out.println("send message to mobile..");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("cash withdraw..");
		}
	}

}
