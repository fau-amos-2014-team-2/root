package com.fau.amos.team2.WoundManagement.model;

public enum AccomodationType {
	SHORTTIME('k'),
	DAYTIME('t'),
	NIGHTTIME('n'),
	STATIONARY('s'),
	HOSPITAL('h'),
	RESIDENTIAL('w'),
	PREVENTION_CARE('v')
	;
	
	private char character;
	
	private AccomodationType(char character) {
		this.character = character;
	}
	
	public String toString() {
		return Character.toString(this.character);
	}
	
	public static AccomodationType enumOf(char character) {
		for (AccomodationType type : AccomodationType.values())
			if (character == type.character)
				return type;
		
		return null;
	}
	
	public static AccomodationType enumOf(String string) {
		if (string.length() > 0)
			return enumOf(string.toLowerCase().charAt(0));
		
		return null;
	}
}
