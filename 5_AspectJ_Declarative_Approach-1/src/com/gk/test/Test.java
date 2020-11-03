package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.dto.Employee;
import com.gk.service.EmployeeService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		EmployeeService empService = (EmployeeService) context.getBean("empService");
		Employee employee = (Employee) context.getBean("empBean");
		String message = "";
		try {
			//Business Method Calling 
			message = empService.createEmployee(employee);
		} catch (Exception e) {
	
		}
		System.out.println(message);
	}

}
