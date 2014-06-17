package com.fau.amos.team2.WoundManagement.model;

public enum WoundKind {
	DECUBITUS('d'),
	OTHER('s')
	;
	
	private char character;
	
	private WoundKind(char character) {
		this.character = character;
	}
	
	public String toString() {
		return Character.toString(this.character);
	}
	
	public static WoundKind enumOf(char character) {
		for (WoundKind type : WoundKind.values())
			if (character == type.character)
				return type;
		
		return null;
	}
	
	public static WoundKind enumOf(String string) {
		if (string.length() > 0)
			return enumOf(string.toLowerCase().charAt(0));
		
		return null;
	}
}
