package com.bridgelabz.employeepayrollapp.dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.ToString;

public @ToString class EmployeePayrollDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid Employee Name")
	public String name;
	@Pattern(regexp = "^(male|female)$", message = "Invalid Employee Name")
	public String gender;
	@Min(value = 500, message = "Minimum wage should be more than 500")
	public long salary;
	@NotBlank(message = "ImagePath cannot be Empty")
	public String imagePath;
	@JsonFormat(pattern = "dd-MM-yyyy")
	@NotNull(message = "start date should Not be Empty")
	// @PastOrPresent(message = "start date should be past or todays date")
	public String startDate;
	@NotBlank(message = "Note cannot be Empty")
	public String notes;
	@NotBlank(message = "Department cannot be Empty")
	public String department;
	public int employeeId;
}
