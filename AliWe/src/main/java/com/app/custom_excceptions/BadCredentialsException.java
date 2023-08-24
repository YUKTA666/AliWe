package com.app.custom_excceptions;

public class BadCredentialsException extends Exception {

	private static final long serialVersionUID = 5169762680602049817L;

	public BadCredentialsException(String msg) {
		super(msg);
	}

}
