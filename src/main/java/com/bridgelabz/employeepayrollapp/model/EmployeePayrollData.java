package com.bridgelabz.employeepayrollapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

@Entity
@Table(name = "employee_payroll")
public @Data class EmployeePayrollData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int employeeId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "GENDER", length = 10)
	private String gender;
	@Column(name = "SALARY")
	private long salary;
	@Column(name = "IMAGEPATH")
	private String imagePath;
	@Column(name = "STARTDATE")
	private Date startDate;
	@Column(name = "NOTES")
	private String notes;
	@Column(name = "DEPARTMENT")
	private String department;

	public EmployeePayrollData() {}

	public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
		this.employeeId = employeeId;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.imagePath = employeePayrollDTO.imagePath;
		this.gender = employeePayrollDTO.gender;
		this.startDate = employeePayrollDTO.startDate;
		this.department = employeePayrollDTO.department;
		this.notes = employeePayrollDTO.notes;
	}
}
