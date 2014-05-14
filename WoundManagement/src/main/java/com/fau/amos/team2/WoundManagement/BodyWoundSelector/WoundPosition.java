package com.fau.amos.team2.WoundManagement.BodyWoundSelector;

class WoundPosition {
	
	public WoundPosition(int number, int xPosition, int yPosition, String description) {
		this.number = number;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.description = description;
	}

	public int getNumber() {
		return number;
	}
	
	private int number;
	
	public int getXPosition() {
		return xPosition;
	}

	private int xPosition;
	
	public int getYPosition() {
		return yPosition;
	}
	
	private int yPosition;
	
	public String getDescription() {
		return description;
	}
	
	private String description;
}
