package com.java8.MethodReference;

public class EmployeeServiceLambda {
	
	public static void main(String[] args) {
		Child c = new Child();
		Runnable r = c :: childWork;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread!!");
		}
	}

}
