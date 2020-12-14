package com.bridgelabz.employeepayrollapp.dto;

public class EmployeePayrollDTO {
	private String name;
	private int salary;

	public EmployeePayrollDTO(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollDTO [name=" + name + ", salary=" + salary + "]";
	}

}
