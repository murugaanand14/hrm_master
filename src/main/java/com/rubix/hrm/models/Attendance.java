package com.rubix.hrm.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
@Table(name = "attendance")
public class Attendance {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reference_id")
    private int referenceId;
    
    @Column(name = "date")
    private Date date;
    
    @Column(name = "month")
    private Date month;
    
    @Column(name = "intime")
    private Date inTime;
    
    @Column(name = "outtime")
    private Date outTime;
}
