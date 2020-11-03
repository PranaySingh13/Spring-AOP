package com.gk.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.gk.dto.Account;
import com.gk.exceptions.InsufficientFundsException;

@Component(value = "aspect")
@Aspect
public class TransactionAspect {

	@Before("execution(* com.gk.service.TransactionService.*(..))")
	public void before(JoinPoint jp) {
		Object[] args = jp.getArgs();
		Account account = (Account) args[0];
		System.out.println("Before Advice: Initial Balance :" + account.getBalance());
	}

	@After("execution(* com.gk.service.TransactionService.*(..))")
	public void after(JoinPoint jp) {
		Object[] args = jp.getArgs();
		Account account = (Account) args[0];
		System.out.println("After Advice: Total Balance :" + account.getBalance());
	}

	@AfterReturning(pointcut = "execution(* com.gk.service.TransactionService.*(..))", returning = "result")
	public void afterReturning(JoinPoint jp, String result) {
		System.out.println("After Returning Advice: Transaction Status: " + result);
	}

	@Around("execution(* com.gk.service.TransactionService.*(..))")
	public void around(ProceedingJoinPoint jp) {
		System.out.println("Around Advice : Before " + jp.getSignature().getName() + " Method Execution");
		String status = "";
		try {
			status = (String) jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Around Advice : After " + jp.getSignature().getName() + " Method Execution");
		System.out.println("Around Advice: Transaction Status: " + status);
	}

	@AfterThrowing(pointcut = "execution(* com.gk.service.TransactionService.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint jp, InsufficientFundsException exception) {
		System.out.println("After Throwing Advice: " + exception.getClass().getName() + " in Transaction : "
				+ exception.getMessage());
	}
}
