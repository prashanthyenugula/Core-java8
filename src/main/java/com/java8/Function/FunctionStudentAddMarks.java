package com.java8.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.java8.functinalComparator.Student;

public class FunctionStudentAddMarks {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "ajay", 69));
		list.add(new Student(101, "vinay", 52));
		list.add(new Student(102, "vamshi", 70));
		list.add(new Student(103, "sanjay", 25));
		list.add(new Student(104, "prashanth", 89));
		
		System.out.println(list);
		Function<Student, Student> f = std-> {
			std.setMarks(std.getMarks()+6);
			return std;
		};
		
		for (Student student : list) {
			System.out.println(f.apply(student));
		}
	}

}
