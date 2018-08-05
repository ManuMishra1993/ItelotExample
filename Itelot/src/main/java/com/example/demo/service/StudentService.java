package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	public String add(Student student) {
		// TODO Auto-generated method stub
		Student newStudent=new Student();
		newStudent.setName(student.getName());
		newStudent.setCourse(student.getName());
		newStudent.setMarks(student.getMarks());
		studentRepository.save(newStudent);
		return "Success";
	}
	

}
