package com.rubix.hrm.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
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
@Table(name = "client")

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "client_id")
	private Long clientId;

	@Column(name = "client_name")
	private String clientName;

	@Column(name = "client_gstno")
	private String clientGestNo;

	@Column(name = "client_mail")
	private String clientMail;

	@Column(name = "client_address")
	private String clientAddress;

	@Column(name = "client_barach")
	private String clientbrach;

	@Column(name = "client_region")
	private String clientRegion;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "client_bnk", 
		      joinColumns = 
		        { @JoinColumn(name = "fk_client_id", referencedColumnName = "client_id") },
		      inverseJoinColumns = 
		        { @JoinColumn(name = "fk_bnk_id", referencedColumnName = "bank_id") })
	private BankDetails bankDetails;
	
	@ManyToOne
	@JoinColumn(name="fk_company_cli_id", referencedColumnName = "company_id")
	private Company company;

}
