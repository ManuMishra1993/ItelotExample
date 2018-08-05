package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/rest/hello")
public class ItelotController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/get")
	public List<Student> getAllData() {
		return studentService.getAll();
	}
	
	@PostMapping("/add")
	public String addData(@RequestBody Student student) {
		return studentService.add(student);
		
	}

}
