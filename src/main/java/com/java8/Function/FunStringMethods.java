package com.java8.Function;

import java.util.function.Function;

public class FunStringMethods {
	
	public static void main(String[] args) {
		
		//Function<String, String> f = text->text.toUpperCase();// here UpperCase letters printed!!
		
		Function<Integer, Integer> f1 = i->i*5;// here multiplication of 5 printed
		Function<Integer, Integer> f2 = i->i*i;// here square value printed
		Function<Integer, Integer> f3 = i->i-29;
		
		System.out.println(f1.apply(34));
		System.out.println(f2.apply(89));
		
		// here diff b/w andThen & compose i.e, 
		//andThen--> f1 after that f2 after that f3..
		// compose--> f3 after that f2 after that f1..
		System.out.println(f1.andThen(f2).andThen(f3).apply(67));
		System.out.println(f1.compose(f2).compose(f3).apply(67));
		
		/*System.out.println(f.apply("Shravan"));
		System.out.println(f.apply("Madhu"));*/
	}

}
