package org.learn.exception;

public class CustomArithmeticException extends ArithmeticException {

	private static final long serialVersionUID = 652325545058196579L;

	public CustomArithmeticException(String s) {
		super(s);
	}
}
