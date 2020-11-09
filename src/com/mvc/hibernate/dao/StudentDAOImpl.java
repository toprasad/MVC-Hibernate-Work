package com.mvc.hibernate.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mvc.hibernate.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudents() {
	
		Session session =sessionFactory.getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<Student> students=session.createQuery("from Student").getResultList();
		
		return students;
	}

	@Override
	public void saveStudent(Student student) {
		Session session=sessionFactory.getCurrentSession();
		session.save(student);
	}

}
