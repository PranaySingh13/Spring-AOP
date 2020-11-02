package com.gk.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MovieReturnAdvice implements ThrowsAdvice {

	/*
	 * This method will override the afterThrowing Method of throwsAdvice interface. 
	 */
	public void afterThrowing(Method method, Object[] params, Object target, Exception e) {
		System.out.println("Power Failure Exception Occured,"
				+ " Movie Was Stopped, Please come to counter and collect your money.");
	}
}
