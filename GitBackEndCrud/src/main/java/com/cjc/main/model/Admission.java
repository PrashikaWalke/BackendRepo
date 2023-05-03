package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admission {
	@Id
	private int AdmsnId;
	private String AdmsnDate;
	

}
