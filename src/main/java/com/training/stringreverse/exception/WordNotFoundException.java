package com.training.stringreverse.exception;

public class WordNotFoundException extends Exception {

	public WordNotFoundException() {
	}
	
	/**
	 * Sends the message to the super class Exception
	 */
	public WordNotFoundException(String message) {
		super(message);
	}
}
