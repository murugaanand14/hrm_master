package com.rubix.hrm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubix.hrm.models.LeaveForm;
import com.rubix.hrm.services.LeaveFormService;

import lombok.Data;

public class LeaveFormController {
	
	@Autowired
    LeaveFormService leaveFormService;
	
	@PostMapping("/LeaveForm")
	public String saveForm(@RequestBody LeaveForm leaveForm) {
		Optional<LeaveForm> FormDB = leaveFormService.create(leaveForm);
		if (FormDB.isPresent()) {
			return "The LeaveForm data has been saved successfully!";
		} else {
			return "LeaveForm already exist in records";
		}
	}

	@GetMapping("/Form/{empId}")
	public ResponseEntity<LeaveForm> getFormById(@PathVariable("empId")Long empId) {
		Optional<LeaveForm> FDB = leaveFormService.retrieveOne(empId);
		if (FDB.isPresent()) {
			return new ResponseEntity<>(FDB.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/LeaveForm/{empId}")
	private String update(@PathVariable("empId") int empId, @RequestBody LeaveForm leaveForm) {
		return leaveFormService.update(empId, leaveForm);
	}
	
	@GetMapping("/LeaveForms")
	public List<LeaveForm> getAllForm() {
		return leaveFormService.retrieve();
	}
	
	@DeleteMapping("/LeaveForms/{empId}")
	public String deleteFormById(@PathVariable("empId")Long empId) {
		return leaveFormService.delete(empId);
	}	
	
}
