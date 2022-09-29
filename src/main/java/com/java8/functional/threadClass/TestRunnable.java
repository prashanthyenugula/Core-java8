package com.java8.functional.threadClass;

public class TestRunnable {
	
	public static void main(String[] args) {
		
		MyRunnableIntF r = new MyRunnableIntF();
		Thread t = new Thread(r);
		t.start();
		for(int i=1; i<=10; i++) {
			System.out.println("Main Method");
		}
	}

}
