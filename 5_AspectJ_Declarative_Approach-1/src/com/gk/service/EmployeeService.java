package com.gk.service;

import com.gk.dto.Employee;

public interface EmployeeService {

	public String createEmployee(Employee employee) throws Exception;
	
	public Employee searchEmployee(int eno);
	
	public String updateEmployee(Employee employee);
	
	public String deleteEmployee(Employee employee);
	
}
