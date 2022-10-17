package com.meraj.jsp.servletdemo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		
		List<Student> students = new ArrayList();
		
	     students.add(new Student("Meraj","Syed","msyed@gmail.com"));
	     students.add(new Student("Atheeb","Ahmed","ahmedatheeb@gmail.com"));
	     students.add(new Student("Afeef","Ahmed","ahmedafeef@gmail.com"));
	     students.add(new Student("Mohammed","Rafeeq","mrafeeq@gmail.com"));
	     
		return students;
	}

}
