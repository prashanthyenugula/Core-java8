package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamForEach {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(67);
		list.add(34);
		list.add(12);
		list.add(45);
		list.add(76);
		list.add(51);
		list.add(95);
		list.add(16);
		
		Consumer<Integer> con = n->System.out.println(n);
		
		list.stream().forEach(con);
		
// forEach 1.7v		
		/*System.out.println(list);
		for (Integer num : list) {
			System.out.println(num);
		}*/
	}

}
