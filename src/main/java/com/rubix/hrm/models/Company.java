package com.rubix.hrm.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/* *@author  Muruganandham
* @version 1.0
*
*/

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "company_id")
	private Long companyId;

	@Column(name = "name")
	private String companyName;

	@Column(name = "gstno")
	private String gestNo;

	@Column(name = " company_mail")
	private String companyMail;

	@Column(name = "com_address")
	private String companyAddress;

	@Column(name = "com_barach")
	private String companyBrach;

	@Column(name = "com_region")
	private String companyRegion;
	
//	@ManyToMany(fetch = FetchType.LAZY,
//		      cascade = {
//		          CascadeType.PERSIST,
//		          CascadeType.MERGE
//		      })
//		  @JoinTable(name = "company_bank",joinColumns = { @JoinColumn(name = "companyD_id") },
//inverseJoinColumns = { @JoinColumn(name = "bankD_id") })
//	private List <BankDetails>  bankDetails;
	
//	@OneToOne(mappedBy = "bank_details",cascade = CascadeType.ALL)
//	@JoinColumn(name="fk_bank_id", referencedColumnName = "bank_id")
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "cm_bnk", 
		      joinColumns = 
		        { @JoinColumn(name = "fk_com_id", referencedColumnName = "company_id") },
		      inverseJoinColumns = 
		        { @JoinColumn(name = "fk_bnk_id", referencedColumnName = "bank_id") })
	private BankDetails bankDetails;
	
	@OneToMany(mappedBy = "company")
	//@JoinColumn(name="fk_emp_id", referencedColumnName = "employeeId")
	private List <Employee>  employee;


}
