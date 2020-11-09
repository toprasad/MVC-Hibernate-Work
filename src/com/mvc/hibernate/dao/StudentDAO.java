package com.mvc.hibernate.dao;

import java.util.List;
import com.mvc.hibernate.entity.Student;

public interface StudentDAO {

	public List<Student> getStudents();

	public void saveStudent(Student student); 
}
