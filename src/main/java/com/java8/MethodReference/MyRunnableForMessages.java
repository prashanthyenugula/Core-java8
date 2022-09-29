package com.java8.MethodReference;

public class MyRunnableForMessages implements Runnable {

	static int a = 10;
	@Override
	public void run() {
		System.out.println(a);
		for (int i = 0; i < 10; i++) {
			System.out.println("send message..");
		}
	}
	
	

}
