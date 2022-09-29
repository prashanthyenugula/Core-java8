package com.java8.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.java8.functinalComparator.Student;

public class SupplierStudentExmpl {
	
	public static void main(String[] args) {
		
		Supplier<List<Student>> supStd = ()-> {
			
			// Database logic here
			List<Student> list = new ArrayList<>();
			list.add(new Student(100, "ajay", 69));
			list.add(new Student(101, "vinay", 52));
			list.add(new Student(102, "vamshi", 70));
			list.add(new Student(103, "sanjay", 25));
			list.add(new Student(104, "prashanth", 91));
			return list;
		};
		 
		Consumer<Student> con =(std)->{
			System.out.println("Student name :"+std.getName());
			System.out.println("Student Id :"+std.getStdId());
			System.out.println("Student Marks :"+std.getMarks());
		};
		
		Predicate<Student> p = std-> std.getMarks()>60; 
		
		Function<Student, Student> f = std->{
			if(std.getMarks()<90)
			std.setMarks(std.getMarks()+11);
			return std;
		};
		
		//List<Student> liststd = supStd.get();
		for (Student student : supStd.get()) {
			f.apply(student);
			if(p.test(student))
				con.accept(student);
			System.out.println("-------------");
		}
	}

}
