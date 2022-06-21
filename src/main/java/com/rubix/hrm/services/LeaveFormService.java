package com.rubix.hrm.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubix.hrm.repository.LeaveFormRepository;
import com.rubix.hrm.models.LeaveForm;

import lombok.Data;

@Service
public class LeaveFormService {
	
	@Autowired
	 LeaveFormRepository leaveFormRepository;
	
	 public Optional<LeaveForm> create(LeaveForm leaveForm) {	
			return Optional.of(leaveFormRepository.save(leaveForm));
	}

	 public List<LeaveForm> retrieve() {
			return leaveFormRepository.findAll();
		}
	 
	 public Optional<LeaveForm> retrieveOne(Long empId) {
			return leaveFormRepository.findById(empId);
		}
	 
	 public String update(int empId, LeaveForm leaveForm) {
			leaveForm.setEmpId(empId);
			leaveFormRepository.save(leaveForm);
			return "successfully updated";
		}
	    
	    public String delete(Long EmpId) {
			if (leaveFormRepository.existsById(EmpId)) {
				leaveFormRepository.deleteById(EmpId);
				return EmpId + " deleted successfully!";
			} else {
				return "The Employee data does not exist in records!";
			}
		}
	    
}


