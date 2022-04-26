package com.rubix.hrm.models;


//import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
@Entity
@Builder
@Data
@Table(name = "emp_wd")

public class EmployeeWorkingDays {
	
    @Id
    @Column(name = "empid")
    private int empid;
    
    @Column(name = "total_no_of_days")
    private int totalDays;    
	
    @Column(name = "present_days")
    private int presentDays; 	
    
    @Column(name = "leave_taken")
    private int leaveTaken;     
    
    @Column(name = "leave_type")
    private String leaveType;
    
    @Column(name = "balance")
    private int balance;

}
