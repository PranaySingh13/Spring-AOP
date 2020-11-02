package com.gk.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.gk.dto.Student;

public class ThankQAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object return_val, Method method, Object[] params, Object target) throws Throwable {

		Student student = (Student) params[0];//These parameters represents the index of the parameters in service methods.
		String course_Name = (String) params[1];
		System.out.println("Thank Q " + student.getStdName() + " for your course " + method.getName() + " on " + course_Name);
		System.out.println("GK Solutions Team will Contact with you for the Course Schedule!");
	}

}
