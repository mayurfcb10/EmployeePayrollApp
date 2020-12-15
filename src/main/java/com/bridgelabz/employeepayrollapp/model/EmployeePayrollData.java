package com.bridgelabz.employeepayrollapp.model;

import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

public @Data class EmployeePayrollData {
	private String name;
	private String gender;
	private long salary;
	private String imagePath;
	private String startDate;
	private String notes;
	private String department;
	private int employeeId;

	public EmployeePayrollData() {
		
	}

	public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO ) {
		this.employeeId = employeeId;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.imagePath= employeePayrollDTO.imagePath;
		this.gender = employeePayrollDTO.gender;
		this.startDate=employeePayrollDTO.startDate;
		this.department = employeePayrollDTO.department;
		this.notes = employeePayrollDTO.notes;
	}
	
	@Override
	public String toString() {
		return "EmployeeRequestDao [name=" + name + ", gender=" + gender + ", salary=" + salary + ", imagePath="
				+ imagePath + ", startDate=" + startDate + ", notes=" + notes + ", department=" + department + "]";
	}

	
}
