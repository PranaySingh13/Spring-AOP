package com.gk.service;

import org.springframework.stereotype.Component;

import com.gk.dto.Account;
import com.gk.exceptions.InsufficientFundsException;

@Component(value = "transactionService")
public class TransactionServiceImpl implements TransactionService {

	@Override
	public String withdraw(Account account, int withdraw_Amount) throws InsufficientFundsException {
		String status = "";
		if (account.getBalance() > withdraw_Amount) {
			int total_balance = account.getBalance() - withdraw_Amount;
			account.setBalance(total_balance);
			System.out.println("From Withdraw(): Transaction Withdraw Completed");
			status = "Success";
		} else {
			status = "Failure";
			throw new InsufficientFundsException("Funds are not Sufficient in Account");
		}
		return status;
	}

}
