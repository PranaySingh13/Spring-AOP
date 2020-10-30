package com.gk.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.gk.dto.Employee;

public class EmployeeValidator implements MethodBeforeAdvice {

	/*
	 * It will be executed before executing the respective business method,
	 * which are mentioned in pointcut list values in configuration.xml file
	 */
	@Override
	public void before(Method method, Object[] params, Object target) throws Throwable {

		Employee employee = (Employee) params[0];// employee obejct at zero index in Object array.

		System.out.println("Validation Messages For " + method.getName());
		System.out.println("-----------------------------------------");
		if (employee.getEmpId() < 100 || employee.getEmpId() > 999) {
			System.out.println("***Employee Id must be 3 digit number***");
		}
		if (employee.getEmpSalary() < 20000 || employee.getEmpSalary() > 50000) {
			System.out.println("***Employee Salary must be in between 20000 to 50000***");
		}
		if (!employee.getEmpEmail().endsWith("@gmail.com")) {
			System.out.println("***Employee Email is Invalid***");
		}
		if (!employee.getEmpMobile().startsWith("+91-")) {
			System.out.println("***Employee Mobile Number is Invalid***");
		}
	}

}
