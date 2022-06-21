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
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubix.hrm.models.Attendance;
import com.rubix.hrm.services.AttendanceService;



//@RequestMapping("/api/v1")
@RestController
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;
	
	@PostMapping("/attendance")
	public String saveAttendance(@RequestBody Attendance attendance) {
		Optional<Attendance> AttendanceDB = attendanceService.create(attendance);
		if (AttendanceDB.isPresent()) {
			return "The Attendance data has been saved successfully!";
		} else {
			return "Attendance already exist in records";
		}
	}
	
	@GetMapping("/Attendance")
	private List<Attendance> getAllAttendance() {
		return attendanceService.retrieve();
	}
	
	
	@GetMapping("/Attendance/{empId}")
	public ResponseEntity<Attendance> getAttendanceById(@PathVariable("empId")Long empId) {
		Optional<Attendance> AttendDB = attendanceService.retrieveOne(empId);
		if (AttendDB.isPresent()) {
			return new ResponseEntity<>(AttendDB.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping("/attendance/{empId}")
	private String update(@PathVariable("empId") int empId,@RequestBody Attendance attendance) {
		//attendanceService.saveOrUpdate(attendance);
		return attendanceService.update(empId, attendance);
	}
	@DeleteMapping("/Attendance/{empId}")
	public String deleteAttendanceById(@PathVariable("empId")Long empId) {
		return attendanceService.delete(empId);
	}	
}
