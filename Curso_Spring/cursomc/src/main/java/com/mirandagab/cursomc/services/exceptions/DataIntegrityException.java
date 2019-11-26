package com.mirandagab.cursomc.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = -7168896728768930837L;

	public DataIntegrityException(String msg) {
		super(msg);
	}
	
	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
