package com.java8.functional.threadClass;

public class RunnableAnnonymous {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					System.out.println("Run Method");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=1; i<=10; i++) {
			System.out.println("Main Method");
		}
		
	}
}
