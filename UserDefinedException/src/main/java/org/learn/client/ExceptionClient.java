package org.learn.client;

import org.learn.exception.CustomArithmeticException;
import org.learn.exception.CustomNullPointerException;

public class ExceptionClient {
	public static void main(String[] args) {

		// 1. Throw & catch ArithmeticException
		try {
			simulateArithmeticException();
		} catch (CustomArithmeticException exp) {
			System.out.println("1. Caught MyArithmeticException:"+exp.getMessage());
		}

		// 2. Throw & catch NullPointerException		
		try {
			simulateNullPointerException();
		} catch (CustomNullPointerException exp) {
			System.out.println("2. Caught MyNullPointerException : "+exp.getMessage());
		}
	}
	
	private static void simulateArithmeticException() {
		int divByZero = 0;
		try {
			divByZero = 100 / 0;
			System.out.println("divByZero value:"+divByZero);
		} catch (ArithmeticException exp) {
			throw new CustomArithmeticException("ArithmeticException occurred : " + exp.getMessage());
		}
	}
	
	@SuppressWarnings("null")
	private static void simulateNullPointerException() {
		try {
			String blankString = null;
			System.out.println("String length :"+blankString.length());
			//simulating null pointer exception.
		} catch (NullPointerException exp) {
			throw new CustomNullPointerException("NullPointerException occurred ");
		}
	}
}
