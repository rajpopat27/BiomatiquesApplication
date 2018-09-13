package com.biomatiques.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biomatiques.model.Attendance;
import com.biomatiques.model.Employee;
import com.biomatiques.repository.AttendanceRepository;
import com.biomatiques.repository.EmployeeRepository;

@Service
public class AttendanceService {

	 @Autowired
	    private AttendanceRepository attendanceRepository;
	 @Autowired
	 	private EmployeeRepository employeeRepository;
	 
	 public List<Attendance> getAllAttendance() {
	        List<Attendance> attendanceList = new ArrayList<>();
	        attendanceRepository.findAll().forEach(attendanceList::add);
	        System.out.println(attendanceList.size());
	        return attendanceList;
	    }
	 
	 public List<Attendance> getAttendanceByEmployeeId(long employeeId) {
	        List<Attendance> attendanceList = new ArrayList<>();
	        attendanceRepository.findByEmployeeId(employeeId).forEach(attendanceList::add);
	        return attendanceList;
	    }
	 
	/* public List<Attendance> getAttendanceByEmployeeLastName(String employeeLastName) {
	        List<Attendance> attendanceList = new ArrayList<>();
	        attendanceRepository.findByemployeeLastName(employeeLastName).forEach(attendanceList::add);
	        return attendanceList;
	    }*/
	 
	 public List<Attendance> getAttendanceByEmployeeFirstName(String firstName) {
	        List<Attendance> attendanceList = new ArrayList<>();
	        attendanceRepository.findByEmployeeFirstName(firstName).forEach(attendanceList::add);
	        return attendanceList;
	    }
	 public void addAttendance(String irisId) {
		 	Employee employee = employeeRepository.findByIrisId(irisId);
		 	Attendance attendance = new Attendance();
		 	attendance.setEmployeeFirstName(employee.getFirstname());
		 	attendance.setEmployeeLastName(employee.getLastname());
		 	attendance.setEmployeeId(employee.getId());
	        attendanceRepository.save(attendance);
	    }

	public List<Attendance> getAttendanceByDate(String date) {
		List<Attendance> attendanceList = new ArrayList<>();
		attendanceRepository.findAttendanceByDate(date).forEach(attendanceList::add);
		return attendanceList;
	}
	
	
	
}
