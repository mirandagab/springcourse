package com.mirandagab.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7168896728768930837L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
