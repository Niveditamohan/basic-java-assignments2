package com.training.missingnumber.exception;

public class NoMissingNumberFoundException extends Exception {

	public NoMissingNumberFoundException() {
	}
	
	/**
	 * Passes message to the super class Exception
	 */
	public NoMissingNumberFoundException(String message) {
		super(message);
	}
}
