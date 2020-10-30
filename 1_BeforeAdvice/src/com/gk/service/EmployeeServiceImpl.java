package com.gk.service;

import com.gk.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void displayEmployee(Employee employee) {
		System.out.println("Employee Details from displayEmployee(--)");
		System.out.println("-----------------------------------------");
		System.out.println("Employee Id: " + employee.getEmpId());
		System.out.println("Employee Name: " + employee.getEmpName());
		System.out.println("Employee Salary: " + employee.getEmpSalary());
		System.out.println("Employee Email Id: " + employee.getEmpEmail());
		System.out.println("Employee Mobile No. " + employee.getEmpMobile());
	}

	@Override
	public void getEmployeeDetails(Employee employee) {
		System.out.println("Employee Details from displayEmployee(--)");
		System.out.println("-----------------------------------------");
		System.out.println("Employee Id: " + employee.getEmpId());
		System.out.println("Employee Name: " + employee.getEmpName());
		System.out.println("Employee Salary: " + employee.getEmpSalary());
		System.out.println("Employee Email Id: " + employee.getEmpEmail());
		System.out.println("Employee Mobile No. " + employee.getEmpMobile());
	}

}
