package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.dto.Account;
import com.gk.exceptions.InsufficientFundsException;
import com.gk.service.TransactionService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		Account acc = (Account) context.getBean("accBean");
		TransactionService txService = (TransactionService) context.getBean("transactionService");
		try {
			txService.withdraw(acc, 50000);
		} catch (InsufficientFundsException e) {
			//e.printStackTrace();
		}
	}

}
