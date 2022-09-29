package com.java8.functional.threadClass;

public class MyRunnableIntF implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=11;i++) {
			System.out.println("Run Method");
		}
	}

}
