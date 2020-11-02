package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.dto.Account;
import com.gk.dto.Cheque;
import com.gk.service.TransactionService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		Account account = (Account) context.getBean("accBean");
		Cheque cheque=(Cheque) context.getBean("chequeBean");
		TransactionService trans_serv = (TransactionService) context.getBean("transactionProxy");
		trans_serv.debit(account, cheque);
	
	}
}
