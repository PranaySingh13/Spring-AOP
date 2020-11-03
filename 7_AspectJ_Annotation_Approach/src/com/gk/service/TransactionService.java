package com.gk.service;

import com.gk.dto.Account;
import com.gk.exceptions.InsufficientFundsException;

public interface TransactionService {

	public String withdraw(Account account, int withdraw_Amount) throws InsufficientFundsException;
}
