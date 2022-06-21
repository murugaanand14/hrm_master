package com.rubix.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rubix.hrm.models.LeaveForm;

@Repository
public interface LeaveFormRepository extends JpaRepository<LeaveForm, Long> {	

}
