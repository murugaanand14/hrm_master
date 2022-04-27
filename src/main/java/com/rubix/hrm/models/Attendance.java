package com.rubix.hrm.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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


	
	
  
}
