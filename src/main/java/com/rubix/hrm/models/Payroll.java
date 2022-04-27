package com.rubix.hrm.models;

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

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "payroll")
public class Payroll {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long payrollId;
	private long empId;
	private long jobId;
	private long salaryId;
	private long leaveId;
	private String date;
	private String report;
	private double totalAmount;
}