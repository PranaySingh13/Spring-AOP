package com.gk.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class ShowAspect {

	public void before() {
		System.out.println("Get Tickets for the Show");
	}

	public void around(ProceedingJoinPoint jp) {
		System.out.println("Show is ready to start, Take Chairs and keep mobile in silent mode");
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Show Completed Just Now, Check Your Laguages");
	}

	public void after() {
		System.out.println("Show is Over, Quit from the Hall");
	}

	public void afterReturning() {
		System.out.println("Thank You for attending the show");
	}

	public void afterThrowing() {
		System.out.println("There is an interruption in the show, because, Show is not Mimicry Show!");
	}
}
