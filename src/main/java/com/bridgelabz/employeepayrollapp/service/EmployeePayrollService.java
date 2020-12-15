package com.bridgelabz.employeepayrollapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
	private List<EmployeePayrollData> empPayrollList = new ArrayList<>();

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return empPayrollList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return empPayrollList.get(empId-1);
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(empPayrollList.size() + 1, employeePayrollDTO);
		empPayrollList.add(empData);
		return empData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
		empData.setName(employeePayrollDTO.getName());
		empData.setSalary(employeePayrollDTO.getSalary());
		empData.setImagePath(employeePayrollDTO.getImagePath());
		empData.setEmployeeId(employeePayrollDTO.getEmployeeId());
		empData.setStartDate(employeePayrollDTO.getStartDate());
		empData.setDepartment(employeePayrollDTO.getDepartment());
		empData.setNotes(employeePayrollDTO.getNotes());
		empPayrollList.set(empId-1, empData);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollDTO(int empId) {
		empPayrollList.remove(empId-1);
	}
}
