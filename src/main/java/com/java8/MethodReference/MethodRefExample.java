package com.java8.MethodReference;

public class MethodRefExample {
	
	static int a=10;
	public static void main(String[] args) {
		Runnable r = MethodRefExample::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("cash withdraw..");
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void m1() {
		System.out.println(a);
		for (int i = 0; i < 10; i++) {
			System.out.println("send message..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
