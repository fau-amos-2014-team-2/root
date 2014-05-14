package com.fau.amos.team2.WoundManagement.model;

public enum Sex {
	MALE('m', "männlich"),
	FEMALE('f', "weiblich"),
	NEUTER('n', "neutrum")
	;
	
	private char character;
	private String string;
	
	private Sex(char character, String string) {
		this.character = character;
		this.string = string;
	}
	
	public char toChar() {
		return this.character;
	}
	
	public String toString() {
		return this.string;
	}
}
