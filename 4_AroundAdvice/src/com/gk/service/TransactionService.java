package com.gk.service;

import com.gk.dto.Account;
import com.gk.dto.Cheque;

public interface TransactionService {

	public void debit(Account account, Cheque cheque);
}
