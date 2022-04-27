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
@Table(name = "jobdept")
public class Jobdept {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long jobId;
	private String jobDept;
	private String name;
	private String description;
	private String salaryRange;
}
