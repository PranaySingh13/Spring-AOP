package com.gk.exceptions;

public class InsufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String description) {
		super(description);
	}
}
