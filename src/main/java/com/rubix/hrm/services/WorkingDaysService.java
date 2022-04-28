package com.rubix.hrm.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubix.hrm.repository.WorkingDaysRepository;
import com.rubix.hrm.models.EmployeeWorkingDays;

import lombok.Data;
@Data
@Service
public class WorkingDaysService {
	 @Autowired
	 WorkingDaysRepository workingDaysRepository;
	 
		public List<EmployeeWorkingDays> getAllEmployeeWorkingDays( ) {
			//return (List<EmployeeWorkingDays>) workingDaysRepository.findAll();
			List<EmployeeWorkingDays> employeeWorkingDays = new ArrayList <EmployeeWorkingDays>();	
			workingDaysRepository.findAll().forEach(emp1 -> employeeWorkingDays.add(emp1));
			return employeeWorkingDays;
		}	 
	 
		
		public EmployeeWorkingDays getEmployeeWorkingDaysById(int empid) {
			return workingDaysRepository.findById(empid).get();
		}
	 
		public void saveOrUpdate(EmployeeWorkingDays employeeWorkingDays) {
			workingDaysRepository.save(employeeWorkingDays);
		}

		public String delete(int empid) {
			workingDaysRepository.deleteById(empid);
			return "successfully deleted";
		}
		public String update(int empid, EmployeeWorkingDays employeeWorkingDays) {
			employeeWorkingDays.setEmpid(empid);
			workingDaysRepository.save(employeeWorkingDays);
			return "successfully Updated";
		}
}


