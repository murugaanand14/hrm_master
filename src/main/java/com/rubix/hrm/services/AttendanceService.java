package com.rubix.hrm.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubix.hrm.repository.AttendanceRepository;
import com.rubix.hrm.models.Attendance;

import lombok.Data;
@Service
public class AttendanceService {
	
	@Autowired
    AttendanceRepository attendanceRepository;
	
	public Optional<Attendance> create(Attendance attendance) {	
		return Optional.of(attendanceRepository.save(attendance));
}
 
	 public List<Attendance> retrieve() {
			return attendanceRepository.findAll();
		}

	 public Optional<Attendance> retrieveOne(Long empId) {
			return attendanceRepository.findById(empId);
		}
	 
	 public String update(int empId, Attendance attendance) {
			attendance.setEmpId(empId);
			attendanceRepository.save(attendance);
			return "successfully updated";
		}
	 public String delete(Long EmpId) {
			if (attendanceRepository.existsById(EmpId)) {
				attendanceRepository.deleteById(EmpId);
				return EmpId + " deleted successfully!";
			} else {
				return "The Attendance data does not exist in records!";
			}
		}
}
