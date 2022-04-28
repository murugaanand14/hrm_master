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

import com.rubix.hrm.models.Attendance;
import com.rubix.hrm.services.AttendanceService;



@RestController
//@RequestMapping("/api/v1")
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;
	
	@GetMapping("/attendance")
	private List<Attendance> getAllAttendance() {
		return attendanceService.getAllAttendance();
	}
	
	@GetMapping("/attendance/{referenceId}")
	private Attendance getAttendance(@PathVariable("referenceId") int referenceId) {
		return attendanceService.getAttendanceById(referenceId);
	}

	@DeleteMapping("/attendance/{referenceId}")
	private void deleteAttendance(@PathVariable("referenceId") int referenceId) {
		attendanceService.delete(referenceId);
	}
	
	
	@PostMapping("/attendances")
	private int saveAttendance(@RequestBody Attendance attendance) {
		attendanceService.saveOrUpdate(attendance);
		return attendance.getReferenceId();
	}
	
	@PutMapping("/attendance/{referenceId}")
	private String update(@PathVariable("referenceId") int referenceId,@RequestBody Attendance attendance) {
		//attendanceService.saveOrUpdate(attendance);
		return attendanceService.update(referenceId, attendance);
	}


}
