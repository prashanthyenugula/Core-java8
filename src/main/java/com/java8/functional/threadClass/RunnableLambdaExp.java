package com.java8.functional.threadClass;

public class RunnableLambdaExp {
	
	public static void main(String[] args) {
		Runnable r = () -> {
			for(int i=1; i<=10; i++) {
				System.out.println("Run method");
			}
		};
		
		Thread t = new Thread(r);
		t.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Method");
		}
	}

}
