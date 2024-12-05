package com.hbt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Table(name="mystudent")Use to change the name of the table

@Entity   //(name="student_details")To create entity class and change the name of the table by name attribute
public class Student {
	
	@Id
	private int id;
	
	private String name;
	
	private String city;
}
