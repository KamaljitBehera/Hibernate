package com.hbt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "student_details")
public class Student {

	public Student(String name, int age, String email, String password) {
		super();
		this.studentName = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int id;
	
	@Column(name = "student_name")
	private String studentName;

	@Column(name = "email")
	private String email;

	
	@Column(name = "student_age")
	private int age;
	
	@Column(name = "student_pwd",nullable = false)
	private String password;
	
}
