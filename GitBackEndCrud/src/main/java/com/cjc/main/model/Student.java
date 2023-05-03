package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	private int StudentId;
	private String StudentName;
	@OneToOne(cascade=CascadeType.ALL)
	private Admission admission;


}
