package com.bridgelabz.employeepayrollapp.dto;

import lombok.Data;

public @Data class EmployeePayrollDTO {
	private String name;
	private String gender;
	private long salary;
	private String imagePath;
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
