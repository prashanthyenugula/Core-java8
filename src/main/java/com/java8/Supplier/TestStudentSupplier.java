package com.java8.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.java8.functinalComparator.Student;

public class TestStudentSupplier {
	
	public static void main(String[] args) {
		
			Supplier<List<Student>> supStd = ()-> {
			
			List<Student> list = new ArrayList<>();
			list.add(new Student(100, "ajay", 69));
			list.add(new Student(101, "vinay", 52));
			list.add(new Student(102, "vamshi", 70));
			list.add(new Student(103, "sanjay", 25));
			list.add(new Student(104, "prashanth", 91));
			return list;
		};
		
		Function<Student, Student> f = std->{
			std.setMarks(std.getMarks()+7);
			return std;
		};
		
		// Update details Database logic here
		Consumer<Student> con = std->{
			System.out.println("Updated marks are :"+std.getMarks());
		};
		
		List<Student> list = supStd.get();
		for (Student student : list) {
			f.apply(student);
			con.accept(student);
			System.out.println("--------------");
		}
	}

}
