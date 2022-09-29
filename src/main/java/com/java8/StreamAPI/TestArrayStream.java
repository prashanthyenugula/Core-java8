package com.java8.StreamAPI;

import java.util.Arrays;

public class TestArrayStream {
	
	public static void main(String[] args) {
		int[] a = {10,9,36,77,96,52};
		
// Array printed forEach(1.7)
		/*for (int i : a) {
			System.out.println(i);
		}*/
		
// Array printed forEach using streamAPI(1.8)
		Arrays.stream(a).forEach(System.out::println);
	}

}
