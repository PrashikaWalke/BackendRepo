package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.SARepository;
import com.cjc.main.serviceI.SAServiceI;
@Service
public class SAServiceImpl implements SAServiceI{
	
	@Autowired
	SARepository saRepo;

	@Override
	public Student saveData(Student student) {
		
		return saRepo.save(student);
	}

	@Override
	public List<Student> getData() {
		return saRepo.findAll();
		
	}
	

}
