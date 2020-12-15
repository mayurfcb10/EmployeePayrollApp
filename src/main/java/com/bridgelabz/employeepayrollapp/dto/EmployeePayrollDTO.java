package com.bridgelabz.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class EmployeePayrollDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid Employee Name")
	private String name;
	@Pattern(regexp = "^(male|female)$", message = "Invalid Employee Name")
	private String gender;
	@Min(value = 500,message = "Minimum wage should be more than 500")
	private long salary;
	private String imagePath;
	@NotEmpty
	private String startDate;
	private String notes;
	private String department;
	private int employeeId;

	public EmployeePayrollDTO(String name, String gender, long salary, String imagePath, String startDate, String notes,
			String department, int employeeId) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.imagePath = imagePath;
		this.startDate = startDate;
		this.notes = notes;
		this.department = department;
		this.employeeId = employeeId;
	}
	
}
