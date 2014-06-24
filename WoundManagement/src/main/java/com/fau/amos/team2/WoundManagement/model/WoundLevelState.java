package com.fau.amos.team2.WoundManagement.model;

public enum WoundLevelState {
	REQUIRED('p'),
	OPTIONAL('e'),
	FORBIDDEN('v');
	
	private char character;
	
	private WoundLevelState(char character) {
		this.character = character;
	}
	
	public String toString() {
		return Character.toString(this.character);
	}
	
	public static WoundLevelState enumOf(char character) {
		for (WoundLevelState type : WoundLevelState.values())
			if (character == type.character)
				return type;
		
		return null;
	}
	
	public static WoundLevelState enumOf(String string) {
		if (string.length() > 0)
			return enumOf(string.toLowerCase().charAt(0));
		
		return null;
	}
}
