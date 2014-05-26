package com.fau.amos.team2.WoundManagement.model;

public enum Sex {
	MALE('m', "männlich"),
	FEMALE('w', "weiblich"),
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
	
	public String toCharString() {
		return this.character + "";
	}
	
	public String toString() {
		return this.string;
	}
	
	public static Sex valueOf(char character) {
		for (Sex sex : Sex.values())
			if (sex.character == character)
				return sex;
		
		return null;
	}
}
