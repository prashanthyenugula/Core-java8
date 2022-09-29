package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.functinalComparator.Student;

public class StreamMapStudent {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "ajay", 69));
		list.add(new Student(101, "vinay", 52));
		list.add(new Student(102, "vamshi", 70));
		list.add(new Student(103, "sanjay", 25));
		list.add(new Student(104, "prashanth", 89));
		
		// students who are less than <60 marks are add 6 marks and list printed!!(1.8)
		
		Predicate<Student> p = std-> std.getMarks()<60;
		
		
		//Here add 6 marks to student and return that student only
		Function<Student, Student> f = std->{
			if(p.test(std))
			//if(p.negate().test(std)) //here >60+ students add 6 marks
				std.setMarks(std.getMarks()+6);
			return std;
		};
		//list = list.stream().map(f).collect(Collectors.toList());
		System.out.println(list);
		
		// Above logic in 1 line by Using StreamAPI 1.8v
		list = list.stream().filter(std->std.getMarks()<60).collect(Collectors.toList()).stream().map(f).collect(Collectors.toList());
		System.out.println(list);
	}
}
