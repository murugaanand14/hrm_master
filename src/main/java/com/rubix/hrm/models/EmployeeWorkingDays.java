package com.rubix.hrm.models;


//import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "empworkdays")

public class EmployeeWorkingDays {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empid")
    private int empid;
    
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

}
