package com.bridgelabz.employeepayrollapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		List<EmployeePayrollData> empDataList = new ArrayList<>();
		empDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Naman",300000)));
		return empDataList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Naman",300000));
		return empData;
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1,employeePayrollDTO);
		return empData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, employeePayrollDTO);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollDTO(int empId) {
		
		
	}

}
