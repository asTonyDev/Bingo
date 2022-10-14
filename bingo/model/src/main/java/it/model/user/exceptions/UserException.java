package it.model.user.exceptions;

public class UserException extends Exception{
	
	public UserException() {
		super();
	}

	public UserException(String message) {
	}
	
	private String message;
	
	private static final long serialVersionUID = 1L;

}
