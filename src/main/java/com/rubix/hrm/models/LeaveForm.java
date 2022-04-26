package com.rubix.hrm.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//import com.example.lms.models.NotEmpty;
//import com.example.lms.models.NotNull;
@Data
@Entity
@Table(name = "leave_app")
public class LeaveForm {

    @Id
    @Column(name = "empid")
    private int empid;

    @Column(name = "emp_name")
    private String empName;

   // @NotNull(message = "Please provide start date!")
    @Column(name = "designation")
    private String designation;
    
    @Column(name = "from_date")
    private Date fromDate;   
    

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
    private String workingDays;    
    
    @Column(name = "approved_by")
    private String approvedBy;
}
