package com.rubix.hrm.models;

import java.util.Date;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
//import com.rubix.hrm.models.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "attendance")
public class Attendance {
	@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "empid")
  private int empId;

  @Column(name = "empname")
	private String empName;
  
  @Column(name = "month")
	private String month;
  
   @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
   @Column(name = "intime")
  private Date inTime;
   
   @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
  @Column(name = "outtime")
  private Date outTime;
   
   @Column(name = "total_days")
   private int totalDays;    
	
   @Column(name = "present_days")
   private int presentDays; 	
   
   @Column(name = "leave_taken")
   private int leaveTaken;     
   
   @Column(name = "leave_type")
   private String leaveType;
   
   @Column(name = "balance")
   private int balance;
   
  @ManyToOne
	//@JoinColumn(name="fk_employeeinfo", referencedColumnName = "empid")
	private Employee employee;

}
