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

import com.rubix.hrm.models.LeaveForm;
import com.rubix.hrm.services.LeaveFormService;

import lombok.Data;

@Data
@RestController
@RequestMapping("/api/v1")
public class LeaveFormController {
	
	@Autowired
    LeaveFormService leaveFormService;
	
	@GetMapping("/leaveform")
	private List<LeaveForm> getAllLeaveforms() {
		return leaveFormService.getAllLeaveForm();
	}

	@GetMapping("/leaveform/{empid}")
	private LeaveForm getLeaveForm(@PathVariable("empid") int empid) {
		return leaveFormService.getLeaveFormById(empid);
	}

	@DeleteMapping("/leaveform/{empid}")
	private void deleteLeaveForm(@PathVariable("empid") int empid) {
	  leaveFormService.delete(empid);
	}

	@PostMapping("/leaveforms")
	private int  saveLeaveForm(@RequestBody LeaveForm leaveForm) {
		leaveFormService.saveOrUpdate(leaveForm);
		return leaveForm.getEmpid();
	}

	@PutMapping("/leaveform/{empid}")
	public LeaveForm update( @RequestBody LeaveForm leaveForm) {
		return leaveForm;
	}


}
