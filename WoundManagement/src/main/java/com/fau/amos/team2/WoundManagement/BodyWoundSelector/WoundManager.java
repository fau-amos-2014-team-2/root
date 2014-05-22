package com.fau.amos.team2.WoundManagement.BodyWoundSelector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.vaadin.ui.Notification;

public class WoundManager {
	private final int THRESHOLD = 25;

	private HashMap<WoundPosition, Wound> wounds;
	private WoundSelector woundSelector;
	
	private WoundPosition selectedWoundPosition;
	private Wound selectedWound;
	
	public WoundManager(Patient patient) {
		woundSelector = new WoundSelector(this, patient.getSex());
		wounds = new HashMap<WoundPosition, Wound>();
		for (Wound wound : patient.getWounds())
			addWound(wound);
	}

	public WoundSelector getWoundSelector() {
		return woundSelector;
	}

	public void addWound(Wound wound) {
		WoundPosition pos = WoundPosition.getPositionForBodyLocation(BodyLocation.valueOf(wound.getBodyLocationCode()));
		
		wounds.put(pos, wound);
		woundSelector.addWoundAtPosition(pos);
	}

	public Boolean hasWoundAtPosition(WoundPosition woundPosition) {
		return wounds.containsKey(woundPosition);
	}

	public void removeWoundAtPosition(WoundPosition woundPosition) {
		wounds.remove(woundPosition);
		woundSelector.removeWoundAtPosition(woundPosition);
	}
	
	public Wound getWoundAtWoundPosition(WoundPosition woundPosition) {
		return wounds.get(woundPosition);
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

	public WoundPosition getSelectedWoundPosition() {
		return selectedWoundPosition;
	}

	public void setSelectedWoundPosition(WoundPosition selectedWoundPosition) {
		this.selectedWoundPosition = selectedWoundPosition;
		selectedWound = getWoundAtWoundPosition(selectedWoundPosition);
		fireSelectedWoundChangeEvent();
	}

	public Wound getSelectedWound() {
		return selectedWound;
	}

	public void setSelectedWound(Wound selectedWound) {
		this.selectedWound = selectedWound;
	}
	
	public List<SelectedWoundChangeListener> listeners = null;
	
	public interface SelectedWoundChangeListener {
		public void selectedWoundChanged(SelectedWoundChangeEvent event);
	}
	
	public class SelectedWoundChangeEvent {
		final WoundManager woundManager;
		final WoundPosition woundPosition;
		final Wound wound;
		
		public SelectedWoundChangeEvent(WoundManager woundManager, WoundPosition woundPosition, Wound wound) {
			this.woundManager = woundManager;
			this.woundPosition = woundPosition;
			this.wound = wound;
		}

		public WoundManager getWoundManager() {
			return woundManager;
		}

		public WoundPosition getWoundPosition() {
			return woundPosition;
		}

		public Wound getWound() {
			return wound;
		}
	}
	
	public void fireSelectedWoundChangeEvent() {
		if (listeners != null) {
			SelectedWoundChangeEvent event = new SelectedWoundChangeEvent(this, selectedWoundPosition, selectedWound);
			for (SelectedWoundChangeListener listener : listeners)
				listener.selectedWoundChanged(event);
		}
	}
	
	public void addSelectedWoundChangeListener(SelectedWoundChangeListener listener) {
        if (listeners == null) {
            listeners = new ArrayList<SelectedWoundChangeListener>();
        }
        listeners.add(listener);
    }

    public void removeSelectedWoundChangeListener(SelectedWoundChangeListener listener) {
        if (listeners != null) {
            listeners.remove(listener);
        }
    }
}