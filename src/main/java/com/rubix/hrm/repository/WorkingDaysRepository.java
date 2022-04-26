package com.rubix.hrm.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rubix.hrm.models.EmployeeWorkingDays;

@Repository
public interface WorkingDaysRepository extends JpaRepository<EmployeeWorkingDays, Integer> {
	
	

}
