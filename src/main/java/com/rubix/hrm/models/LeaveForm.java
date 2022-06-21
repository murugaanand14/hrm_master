package com.rubix.hrm.models;


import java.util.Date;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import com.example.lms.models.NotEmpty;
//import com.example.lms.models.NotNull;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "leave_app")
public class LeaveForm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empid")
    private int empId;

    @Column(name = "emp_name")
    private String empName;

   // @NotNull(message = "Please provide start date!")
    @Column(name = "designation")
    private String designation;
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Column(name = "from_date")
    private Date fromDate;   
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
   // @NotNull(message = "Please provide end date!")
    @Column(name = "to_date")
    private Date toDate;

   // @NotEmpty(message = "Please select type of leave!")
    @Column(name = "leave_type")
    private String leaveType;

   // @NotEmpty(message = "Please provide a reason for the leave!")
    @Column(name = "reason")
    private String reason;	
    
    @Column(name = "working_days")
    private int workingDays;    
    
    @Column(name = "approved_by")
    private String approvedBy;
   
    @ManyToOne
 	//@JoinColumn(name="fk_employeeinfo", referencedColumnName = "empid")
 	private Employee employee;
    
    
}
