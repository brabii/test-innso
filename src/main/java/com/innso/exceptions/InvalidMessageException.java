package com.innso.exceptions;

public class InvalidMessageException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidMessageException() {
		super();
	}

	public InvalidMessageException(String message) {
		super(message);
	}
}
