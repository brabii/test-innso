package com.innso.exceptions;

public class InvalidClientFolderException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidClientFolderException() {
		super();
	}

	public InvalidClientFolderException(String message) {
		super(message);
	}

	public InvalidClientFolderException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public InvalidClientFolderException(Throwable throwable) {
		super(throwable);
	}
}
