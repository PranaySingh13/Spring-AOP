package com.gk.service;

import com.gk.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String createEmployee(Employee employee) throws Exception {
		System.out.println("Employee " + employee.getEno() + " Inserted Successfully from createEmployee()");
		float i=10/0; //creating a exception to check after throwing advice
		return "Success";
	}

	@Override
	public Employee searchEmployee(int eno) {
		System.out.println("Employee " + eno + " Existed from searchEmployee()");
		return null;
	}

	@Override
	public String updateEmployee(Employee employee) {
		System.out.println("Employee " + employee.getEno() + " Updated Successfully from createEmployee()");
		return "Success";
	}

	@Override
	public String deleteEmployee(Employee employee) {
		System.out.println("Employee " + employee.getEno() + " Deleted Successfully from createEmployee()");
		return null;
	}

}
