package com.rubix.hrm.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rubix.hrm.models.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
