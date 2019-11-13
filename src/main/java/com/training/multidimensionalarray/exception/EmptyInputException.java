package com.training.multidimensionalarray.exception;

public class EmptyInputException extends Exception {

	public EmptyInputException() {
	}
	
	/**
	 * Method that passes exception message to super class Exception
	 */
	public EmptyInputException(String message) {
		super(message);
	}
}
