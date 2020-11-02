package com.gk.service;

import com.gk.dto.Account;
import com.gk.dto.Cheque;

public class TransactionServiceImpl implements TransactionService {

	@Override
	public void debit(Account account, Cheque cheque) {
		int initial_Amount = account.getBalance();
		int debit_Amount = cheque.getAmount();
		int total_Amount = initial_Amount - debit_Amount;
		account.setBalance(total_Amount);
		System.out.println("***Transaction Success***");
		System.out.println("***Amount is debited from Account***");
	}

}
