package com.training.missingnumber.exception;

public class EmptyArrayException extends Exception {

	public EmptyArrayException() {
	}
	
	/**
	 * Passes message to super class Exception
	 * 
	 */
	public EmptyArrayException(String message) {
		super(message);
	}
}
