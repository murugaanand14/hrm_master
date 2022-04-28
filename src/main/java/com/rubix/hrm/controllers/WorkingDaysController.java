package com.rubix.hrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubix.hrm.models.EmployeeWorkingDays;
import com.rubix.hrm.services.WorkingDaysService;

import lombok.Data;

@Data
@RestController
//@RequestMapping("/api/v1")

public class WorkingDaysController {
	
	@Autowired
	 WorkingDaysService workingDaysService;

	@GetMapping("/empwork")
	private List<EmployeeWorkingDays> getAll() {
		return workingDaysService.getAllEmployeeWorkingDays();
	}
	
	@GetMapping("/empwork/{empid}")
	private EmployeeWorkingDays getEmployeeWorkingDays(@PathVariable("empid") int empid) {
		return workingDaysService.getEmployeeWorkingDaysById(empid);
	}

	@DeleteMapping("/empwork/{empid}")
	private void deleteempWorkingDays(@PathVariable("empid") int empid) {
		 workingDaysService.delete(empid);
	}
	
	
	@PostMapping("/empworkday")
	private EmployeeWorkingDays saveEmployeeWorkingDays (@RequestBody EmployeeWorkingDays workday) {
		workingDaysService.saveOrUpdate(workday);
		return workday;
	}	
	
	@PutMapping("/empwork/{empid}")
	private String update(@PathVariable("empid") int empid,@RequestBody EmployeeWorkingDays employeeWorkingDays) {
	//	workingDaysService.saveOrUpdate(employeeWorkingDays);
		return workingDaysService.update(empid,employeeWorkingDays);
	}

	
}
