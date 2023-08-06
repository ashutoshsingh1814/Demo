package com.ashu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PatientEntity {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String mail;
	private String password;
	private int age;
	private String adress;
	private String weight;

}
