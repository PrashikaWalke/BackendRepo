package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/student")
	public List<Student> getStudent()
	{
		return saServiceI.getData();
		 
	}
	
	@PutMapping("/student/{StudentId}")
	public Student updateStudent(@PathVariable int StudentId,@RequestBody Student student)
	{
		return saServiceI.updateData(StudentId,student);
		
	}
	
	@DeleteMapping("/student/{StudentId}")
	public String deleteStudent(@PathVariable int StudentId)
	{
		String dlt = saServiceI.deleteData(StudentId);
		return dlt;
	}

}
