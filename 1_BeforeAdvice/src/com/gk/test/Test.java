package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.dto.Employee;
import com.gk.service.EmployeeService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		Employee employee = (Employee) context.getBean("empBean");
		EmployeeService empService = (EmployeeService) context.getBean("empProxy");
		empService.displayEmployee(employee);
		System.out.println();
		empService.getEmployeeDetails(employee);
	}

}
