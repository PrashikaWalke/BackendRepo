package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.SAServiceI;

@RestController
public class SAController {
	
	@Autowired
	SAServiceI saServiceI;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student)
	{
		return saServiceI.saveData(student);
	}

}
