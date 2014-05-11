package com.fau.amos.team2.WoundManagement.BodyWoundSelector;

import java.util.ArrayList;
import java.util.List;

public class WoundManager {
	private final int THRESHOLD = 25;

	private List<WoundPosition> wounds;
	private WoundSelector woundSelector;
	
	// TODO: Change type of first parameter to suitable entity class as soon as available
	public WoundManager(Object patient) {
		woundSelector = new WoundSelector(this);
		wounds = new ArrayList<WoundPosition>();
		
		// TODO: Replace sample code
		WoundPosition randomWoundPosition1 = woundPositions.get((int)Math.round(Math.random()*(woundPositions.size()-1)));
		addWoundAtPosition(randomWoundPosition1);
		
		WoundPosition randomWoundPosition2 = woundPositions.get((int)Math.round(Math.random()*(woundPositions.size()-1)));
		if (!hasWoundAtPosition(randomWoundPosition2)) {
			addWoundAtPosition(randomWoundPosition2);
		}
	}
	
	public WoundSelector getWoundSelector() {
		return woundSelector;
	}
	
	public void addWoundAtPosition(WoundPosition woundPosition) {
		wounds.add(woundPosition);
		woundSelector.addWoundAtPosition(woundPosition);
	}
	
	public Boolean hasWoundAtPosition(WoundPosition woundPosition) {
		return wounds.contains(woundPosition);
	}
	
	public void removeWoundAtPosition(WoundPosition woundPosition) {
		wounds.remove(woundPosition);
		woundSelector.removeWoundAtPosition(woundPosition);
	}
	
	public WoundPosition getWoundPositionAtCoordinates(int x, int y) {
		for (WoundPosition p : woundPositions) {
			if (Math.abs(p.getXPosition() - x) < THRESHOLD && Math.abs(p.getYPosition() - y) < THRESHOLD) {
				return p;
			}
		}
		
		return null;
	}
	
	@SuppressWarnings("serial")
	public final static List<WoundPosition> woundPositions = new ArrayList<WoundPosition>() {{
		add(new WoundPosition(1, 309, 317, "Nose"));
		add(new WoundPosition(2, 302, 354, "Mouth"));
		add(new WoundPosition(3, 327, 430, "Shoulder"));
		add(new WoundPosition(4, 265, 270, "Right Eye"));
		add(new WoundPosition(5, 331, 270, "Left Eye"));
	}};
	
}
