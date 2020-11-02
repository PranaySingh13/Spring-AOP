package com.gk.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.gk.dto.Account;
import com.gk.dto.Cheque;

public class ChequeClearenceAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvoke) throws Throwable {
		Object[] params = methodInvoke.getArguments();
		Account account = (Account) params[0];
		Cheque cheque = (Cheque) params[1];

		System.out.println("Hello Customer!, Cheque No " + cheque.getCheque_no() + " is coming for clearence");
		methodInvoke.proceed();
		System.out.println("Hello Customer!, Account No " + account.getAccNo() + " has been debited the amount "
				+ cheque.getAmount() + " in clearence of cheque no " + cheque.getCheque_no()
				+ " ,Now the total Amount in your account is " + account.getBalance());
		return null;
	}

}
