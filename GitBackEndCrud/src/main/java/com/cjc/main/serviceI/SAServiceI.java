package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Student;

public interface SAServiceI {

	public Student saveData(Student student);

	public List<Student> getData();

	public Student updateData(int studentId, Student student);

}
