package com.java8.interfacemethods;

public class TestImpl implements Iface,Iface2 {

	@Override
	public void sum(int x, int y) {
		System.out.println("sum is :"+(x+y));
	}

	public static void main(String[] args) {
		Iface i1= new TestImpl();
		i1.sum(20, 30);
		Iface2 i2= new TestImpl();
		i2.sum(12, 31);
	}
}
