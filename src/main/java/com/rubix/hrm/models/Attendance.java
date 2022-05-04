package com.rubix.hrm.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
=======

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

>>>>>>> e3a6c833762be05ce0ae6b472d530086c0be6535

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
@Table(name = "attendance")
public class Attendance {
<<<<<<< HEAD
	
	
=======


>>>>>>> e3a6c833762be05ce0ae6b472d530086c0be6535
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reference_id")
    private int referenceId;
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
     @Column(name = "intime")
    private Date inTime;
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Column(name = "outtime")
    private Date outTime;
<<<<<<< HEAD
=======

>>>>>>> e3a6c833762be05ce0ae6b472d530086c0be6535
}
