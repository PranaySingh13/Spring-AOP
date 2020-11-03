package com.gk.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspectBean {

	public void before(JoinPoint jp) {
		System.out.println("Before " + jp.getSignature().getName() + " method Execution");
	}

	public void after(JoinPoint jp) {
		System.out.println("After " + jp.getSignature().getName() + " method Execution");
	}

	public void afterReturning(JoinPoint jp, Object result) {
		System.out.println("After Returning " + result + " from " + jp.getSignature().getName());
	}

	/*
	 * Proceeding JoinPoint because it contain proceed() method for around advice to
	 * work.
	 */
	public void around(ProceedingJoinPoint jp) {
		System.out.println("Before " + jp.getSignature().getName() + " execution from around Advice");
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After " + jp.getSignature().getName() + " execution from around advice");
	}

	public void afterThrowing(JoinPoint jp, Throwable exception) {
		System.out.println("After Throwing " + exception.getMessage() + " from " + jp.getSignature().getName() + " method");
	}
}
