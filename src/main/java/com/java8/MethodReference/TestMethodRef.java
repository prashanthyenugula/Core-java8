package com.java8.MethodReference;

public class TestMethodRef {
	
	static int a = 10;
	public static void main(String[] args) {
		//m1();
		Runnable r = new MyRunnableForMessages();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("cash withdraw..");
		}
	}

	/*public static void m1() {
		System.out.println(a);
		for (int i = 0; i < 10; i++) {
			System.out.println("send message..");
		}
	}*/
}
