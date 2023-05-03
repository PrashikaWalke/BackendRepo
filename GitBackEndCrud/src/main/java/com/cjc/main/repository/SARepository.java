package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.model.Student;

public interface SARepository extends JpaRepository<Student, Integer>{

}
