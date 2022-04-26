package com.rubix.hrm.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubix.hrm.repository.LeaveFormRepository;
import com.rubix.hrm.models.LeaveForm;

import lombok.Data;

@Data
@Service
public class LeaveFormService {
	
	@Autowired
	 LeaveFormRepository leaveFormRepository;
	
	public List<LeaveForm> getAllLeaveForm() {
		List<LeaveForm> leaveForm =new ArrayList<LeaveForm>();
		leaveFormRepository.findAll().forEach(form1 -> leaveForm.add(form1));
		return leaveForm;
	}

	public LeaveForm getLeaveFormById(int empid) {
		return leaveFormRepository.findById(empid).get();
	}

	public void saveOrUpdate(LeaveForm leaveForm) {
		leaveFormRepository.save(leaveForm);
	}

	public String delete(int empid) {
		leaveFormRepository.deleteById(empid);
		return "successfully deleted";
	}

	public String update(int empid, LeaveForm leaveForm) {
		leaveFormRepository.save(leaveForm);
		return "successfully updated";
	}

}


