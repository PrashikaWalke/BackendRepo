package com.cjc.main.serviceImpl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Student updateData(int studentId, Student student) {
		Optional<Student> findById = saRepo.findById(studentId);
		if(findById.isPresent()) {
			student.setStudentId(findById.get().getStudentId());
			return saRepo.save(student);
		}else {
			return new Student();
		}
	}

	@Override
	public String deleteData(int studentId) {
		Optional<Student> findById = saRepo.findById(studentId);
		if(findById.isPresent()) {
			saRepo.deleteById(findById.get().getStudentId());
			return "Data is Deleted!";
		}else {
			return "Data is not Present";
		}
	}
	
	

}
