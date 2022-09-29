package com.java8.Constructor.Ref;

public class Mobile {
	
	private String name;
	
	public Mobile() {
		System.out.println("No argument Constructor..");
	}
	
	public Mobile(String name) {
		System.out.println("Mobile Obj Created..");
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
