package com.fau.amos.team2.WoundManagement.provider.exceptions;

public class DuplicateEmployeeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4155655088870632931L;
	
	private String username;
	
	public String getUsername() {
		return username;
	}

	public DuplicateEmployeeException(String username) {
		this.username = username;
	}

}
