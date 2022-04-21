package com.rubix.hrm.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_Id")
	private Long employeeId;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "designation")
	private String designation;

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "mail")
	private String mail;

	@Column(name = "address")
	private String address;
    
    @Column(name = "dob")
    private int dob;
    
	@Column(name = "mobileNumber")
	private String mobileNumber;

	@Column(name = "bloodGroup")
	private String bloodGroup;

	@Column(name = "emergncyContactNo")
	private String emergncyContactNo;
}
