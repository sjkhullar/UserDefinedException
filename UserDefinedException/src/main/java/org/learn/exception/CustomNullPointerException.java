package org.learn.exception;

public class CustomNullPointerException extends NullPointerException {

	private static final long serialVersionUID = 5627096569547521249L;

	public CustomNullPointerException(String s) {
		super(s);
	}
}
