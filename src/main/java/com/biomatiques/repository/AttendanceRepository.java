package com.biomatiques.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.biomatiques.model.Attendance;
import com.biomatiques.model.Employee;

public interface AttendanceRepository extends CrudRepository <Attendance,Long> {
	
	public List<Attendance> findByEmployeeId(long id);
	
	public List<Attendance> findByEmployeeFirstName(String  employeeFirstName);
	
	//public List<Attendance> findByemployeeLastName(String employeeLastName);*/
}
