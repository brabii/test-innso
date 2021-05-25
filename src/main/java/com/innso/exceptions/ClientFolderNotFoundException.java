package com.innso.exceptions;

public class ClientFolderNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ClientFolderNotFoundException() {
		super();
	}

	public ClientFolderNotFoundException(String message) {
		super(message);
	}

	public ClientFolderNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public ClientFolderNotFoundException(Throwable throwable) {
		super(throwable);
	}
}
