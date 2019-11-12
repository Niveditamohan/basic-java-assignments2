package com.training.stringreverse.exception;

public class NullStringException extends Exception {

	public NullStringException() {
	}
	
	/**
	 * Sends the message to the super class Exception
	 */
	public NullStringException(String message) {
		super(message);
	}
}
