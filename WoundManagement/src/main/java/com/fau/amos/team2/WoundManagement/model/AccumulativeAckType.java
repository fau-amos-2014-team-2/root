package com.fau.amos.team2.WoundManagement.model;

public enum AccumulativeAckType {
	ALLOWED_WITH_CARE('j'),
	ALLOWED_WITHOUT_CARE('o'),
	NOT_ALLOWED('n');
	
	private char character;
	
	private AccumulativeAckType(char character) {
		this.character = character;
	}
	
	public String toString() {
		return Character.toString(character);
	}
	
	public static AccumulativeAckType enumOf(char character) {
		for (AccumulativeAckType type : AccumulativeAckType.values())
			if (character == type.character)
				return type;
		
		return null;
	}
	
	public static AccumulativeAckType enumOf(String string) {
		if (string.length() > 0)
			return enumOf(string.toLowerCase().charAt(0));
		
		return null;
	}
}
