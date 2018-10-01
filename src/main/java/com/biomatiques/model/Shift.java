package com.biomatiques.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Shift")
public class Shift {
	
	
	public Shift() {
		
	}


	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="employeeId")
	private long id;
    
    @NotEmpty
	@JsonProperty("Shift Name")	
    public String shiftName;
    
   
	@JsonProperty("Start Time")	
    public Time	 startTime;
    
    
	@JsonProperty("End Time")	
    public Time endTime;
    
	public String getShiftName() {
		return shiftName;
	}


	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}


	public Time getStartTime() {
		return startTime;
	}


	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}


	public Time getEndTime() {
		return endTime;
	}


	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}


	public long getId() {
		return id;
	}


}
