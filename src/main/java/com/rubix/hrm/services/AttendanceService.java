package com.rubix.hrm.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubix.hrm.repository.AttendanceRepository;
import com.rubix.hrm.models.Attendance;

import lombok.Data;
@Data
@Service
public class AttendanceService {
	@Autowired
	AttendanceRepository attendanceRepository;
	
	public List<Attendance> getAllAttendance() {
		List<Attendance> attendance = new ArrayList<Attendance>();
		attendanceRepository.findAll().forEach(attend1 -> attendance.add(attend1));
		return attendance;
	}	 
 
	
	public Attendance getAttendanceById(int referenceId) {
		return attendanceRepository.findById(referenceId).get();
	}
 
	public void saveOrUpdate(Attendance attendance) {
		attendanceRepository.save(attendance);
	}

	public String delete(int referenceId) {
		attendanceRepository.deleteById(referenceId);
		return "successfully deleted";
	}
	public String update(int referenceId, Attendance attendance) {
		attendance.setReferenceId(referenceId);
		attendanceRepository.save(attendance);
		return "successfully updated";
	}



}
