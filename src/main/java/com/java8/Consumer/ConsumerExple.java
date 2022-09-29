package com.java8.Consumer;

import java.util.function.Consumer;

public class ConsumerExple {
	
	public static void main(String[] args) {
		
		String name="Madhu";
		String city="Siricilla";
		String designation="Netshop";
		
		Consumer<String> con = text->System.out.println(text);
		
		con.accept(name);
		con.accept(city);
		con.accept(designation);
	}

}
