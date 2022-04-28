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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
>>>>>>> ee9661520152ed4a1d411de04db5aad3c53bd10f

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "attendance")
public class Attendance {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "reference_id")
	private Long referenceId;

	@Column(name = "date")
	private Date date;

	@Column(name = "month")
	private String month;

	@Column(name = "year")
	private String year;

	@Column(name = "inTime")
	private Date inTime;

	@Column(name = "outTime")
	private Date outTime;


	
	
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reference_id")
    private int referenceId;
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
     @Column(name = "intime")
    private Date inTime;
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Column(name = "outtime")
    private Date outTime;
=======
  
>>>>>>> ee9661520152ed4a1d411de04db5aad3c53bd10f
}
