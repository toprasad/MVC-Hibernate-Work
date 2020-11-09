package com.mvc.hibernate.service;

import java.util.List;
import com.mvc.hibernate.entity.Student;

public interface StudentService {
	
	public List<Student> getStudents();

	public void saveStudent(Student student);
}
