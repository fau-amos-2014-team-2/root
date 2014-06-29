package com.fau.amos.team2.WoundManagement.provider;

public enum ConnectionType {

	LOCAL("postgres", "postgres", "jdbc:postgresql://localhost:5432/postgres"),
	TEST("postgres", "postgres", "jdbc:postgresql://localhost:5432/template1");
	
	
	private String usr;
	private String passwd;
	private String url;
	
	private ConnectionType(String usr, String passwd, String url) { 
		this.usr = usr;
		this.passwd = passwd;
		this.url = url;
	}
	
	public String getUser() { 
		return usr;
	}
	public String getPassword() { 
		return passwd;
	}
	public String getUrl() { 
		return url;
	}
}
