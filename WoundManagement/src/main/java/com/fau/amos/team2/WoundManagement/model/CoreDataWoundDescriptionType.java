package com.fau.amos.team2.WoundManagement.model;

public enum CoreDataWoundDescriptionType {
	TYPE("TYP"),
	COVERING("BEL"),
	CAUSE("URS"),
	PAIN("SME"),
	STAGE("WHP"),
	HEALTYPE("HEI"),
	SECRETION_AMOUNT("WSM"),
	SECRETION_COLOUR("WSF"),
	SECRETION_SMELL("WSG"),
	SECRETION_GRADE("SEG"),
	BORDER("WRA"),
	SORROUNDINGS("WUM"),
	INFECTION_SIGNS("INF");
	
	private String string;
	
	private CoreDataWoundDescriptionType(String string) {
		this.string = string;
	}
	
	public String toString() {
		return this.string;
	}
	
	public static CoreDataWoundDescriptionType enumOf(String string) {
		for (CoreDataWoundDescriptionType type : CoreDataWoundDescriptionType.values())
			if (string.equalsIgnoreCase(type.string))
				return type;
		
		return null;
	}
}
