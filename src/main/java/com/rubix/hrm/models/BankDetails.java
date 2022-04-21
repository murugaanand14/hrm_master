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
@Table(name = "bank_details")
public class BankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bank_id")
	private long bankId;

	@Column(name = "account_no")
	private long accountNo;

	@Column(name = "ifsc_code")
	private String ifscCode;

	@Column(name = "account_holder_name")
	private String accountHolderName;

	@Column(name = "bank_name")
	private String bankName;
	
	@Column(name = "branch_name")
	private String branchName;
}
