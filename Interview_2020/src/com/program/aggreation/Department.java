package com.program.aggreation;

import java.util.List;
/* Department class contains list of student 
Objects. It is associated with student 
class through its Object(s). */
public class Department {
	String name;
	List<Student> students;
	
	public Department(String name, List<Student> students) {
		this.name = name;
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public List<Student> getStudents() {
		return students;
	}
	
	
}
