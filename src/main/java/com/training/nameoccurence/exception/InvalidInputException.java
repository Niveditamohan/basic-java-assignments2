package com.training.nameoccurence.exception;

public class InvalidInputException extends Exception {

	public InvalidInputException() {
	}
	
	/**
	 * Method that passes message to the super class Exception
	 */
	public InvalidInputException(String message) {
		super(message);
	}
}
