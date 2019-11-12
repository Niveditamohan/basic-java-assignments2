package com.training.nameoccurence.exception;

public class NoSuchNameFoundException extends Exception {

	public NoSuchNameFoundException() {
	}
	
	/**
	 * Method that passes message to the super class Exception
	 */
	public NoSuchNameFoundException(String message) {
		super(message);
	}
}
