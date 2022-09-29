package com.java8.Consumer;

import java.util.function.Consumer;

public class ConsumerMethods {
	
	public static void main(String[] args) {
		
		Consumer<Integer> con1 = n->System.out.println("square is :"+n*n);
		Consumer<Integer> con2 = n->System.out.println("multiplication is :"+(n*6));
		Consumer<Integer> con3 = n->System.out.println("Division is :"+(n/6));
		Consumer<Integer> con4 = n->System.out.println("Addition is :"+(n+6));
		Consumer<Integer> con5 = n->System.out.println("Substraction is :"+(n-6));
		
		con1.andThen(con2).andThen(con5).andThen(con3).andThen(con4).accept(7);;
		
		/*con1.accept(7);
		con2.accept(77);*/
	}

}
