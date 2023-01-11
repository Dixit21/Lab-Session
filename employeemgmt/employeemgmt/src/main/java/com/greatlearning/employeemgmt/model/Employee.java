package com.greatlearning.employeemgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name ="employees")
@Getter
@Setter
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name ="emp_id")
	private String id;
	@Column (name ="emp_first_name")
	private String firstName; 
	@Column (name ="emp_last_name")
	private String lastName; 
	@Column (name ="emp_email")
	private String email;
	
	
}
