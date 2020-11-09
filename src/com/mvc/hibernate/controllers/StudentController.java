package com.mvc.hibernate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.hibernate.entity.Student;
import com.mvc.hibernate.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentservice;
	
	@RequestMapping("/list")
	public String showStudents(Model model) {
	
		List<Student> students=studentservice.getStudents();
		model.addAttribute("students",students);
		
		return "student-list";
	}
	
	@RequestMapping("showNewForm")
	public String showForm(Model model)
	{
		Student student = new Student();
		model.addAttribute(student);
		return "stduent-form";
	}
	
	@RequestMapping("saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student)
	{
		
		studentservice.saveStudent(student);
		return "redirect:/student/list";
	}
	
}
