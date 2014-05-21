package com.fau.amos.team2.WoundManagement.BodyWoundSelector;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Sex;

public class WoundManager {
	private final int THRESHOLD = 25;

	private List<WoundPosition> wounds;
	private WoundSelector woundSelector;

	// TODO: Change type of first parameter to suitable entity class as soon as available
	public WoundManager(Patient patient) {
		// TODO: Dynamically assign sex
		woundSelector = new WoundSelector(this, Math.round(Math.random()) == 1 ? Sex.FEMALE : Sex.MALE);
		wounds = new ArrayList<WoundPosition>();

		// TODO: Replace sample code
		WoundPosition[] woundPositions = WoundPosition.values();
		int randomWoundPosition1Index = (int)Math.round(Math.random()*(woundPositions.length-1));
		int randomWoundPosition2Index = (int)Math.round(Math.random()*(woundPositions.length-1));
		WoundPosition randomWoundPosition1 = woundPositions[randomWoundPosition1Index];
		WoundPosition randomWoundPosition2 = woundPositions[randomWoundPosition2Index];

		addWoundAtPosition(randomWoundPosition1);
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
		int nearestPosDiff = -1;
		WoundPosition nearestPos = null;

		for (WoundPosition p : WoundPosition.values()) {
			int xDiff = Math.abs(p.getXPosition() - x);
			int yDiff = Math.abs(p.getYPosition() - y);
			int diff = xDiff + yDiff;

			if (xDiff < THRESHOLD && yDiff < THRESHOLD && (nearestPosDiff < 0 || diff <= nearestPosDiff)) {
				nearestPos = p;
				nearestPosDiff = diff;
			}
		}

		return nearestPos;
	}
}