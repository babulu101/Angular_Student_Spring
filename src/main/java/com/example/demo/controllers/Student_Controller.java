package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repo.Student_Repo;

@RequestMapping("/student")
@CrossOrigin("*")
@RestController
public class Student_Controller {
	
	@Autowired
	private Student_Repo repo;
	
	
	@GetMapping("/get")
	public List<Student> getStudent() {
		List<Student> students=repo.findAll();
		return students;
	}
	@PostMapping("/save")
	public String save(@RequestBody Student student) {
		Student stu=repo.save(student);
		return "Student Saved successfuly::"+stu.getId();
	}
	
	

}
