package com.mvc.hibernate.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mvc.hibernate.dao.StudentDAO;
import com.mvc.hibernate.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	public StudentDAO studentdao;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentdao.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student student) {
		studentdao.saveStudent(student);
	}

}
