package com.java8.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.java8.functinalComparator.Student;

public class TestConsumerStudent {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "ajay", 69));
		list.add(new Student(101, "vinay", 52));
		list.add(new Student(102, "vamshi", 70));
		list.add(new Student(103, "sanjay", 25));
		list.add(new Student(104, "prashanth", 89));
		
		Consumer<Student> con = std-> {
			System.out.println("Name :"+std.getName());
			System.out.println("Id  :"+std.getStdId());
			System.out.println("Marks :"+std.getMarks());
		};
		
		for (Student student : list) {
			con.accept(student);
			System.out.println("-------------");
		}
	}

}
