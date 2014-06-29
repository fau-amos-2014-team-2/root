package com.fau.amos.team2.WoundManagement.BodyWoundSelector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Sex;
import com.fau.amos.team2.WoundManagement.model.Wound;

public class WoundManager {
	private final int THRESHOLD = 25;

	private HashMap<WoundPosition, Wound> wounds;
	private WoundSelector woundSelector;
	
	private WoundPosition selectedWoundPosition;
	private Wound selectedWound;
	
	private Sex sex;
	
	public WoundManager(Patient patient, boolean showCurrentWoundsOnly, float scaleFactor) {
		wounds = new HashMap<WoundPosition, Wound>();
		this.sex = (patient.getSex() != null) 
				? patient.getSex() : Sex.NEUTER;
		woundSelector = new WoundSelector(this, this.sex, scaleFactor);
		if(showCurrentWoundsOnly) {
			for (Wound wound : patient.getCurrentWounds())
				addInitialWound(wound);
		} else{
			for (Wound wound : patient.getWounds())
				addInitialWound(wound);
		}
		addWoundsInSelector();
	}

	public WoundSelector getWoundSelector() {
		return woundSelector;
	}
	
	public void addInitialWound(Wound wound){
		WoundPosition pos = WoundPosition.getPositionForBodyLocation(BodyLocation.valueOf(wound.getBodyLocationCode()),
				this.sex);
		
		//ignore healed wound if there's a current one at the same position
		if (wounds.containsKey(pos)){
			if (wound.getCureEmployee() == null){
				wounds.remove(pos);
				wounds.put(pos, wound);
			}
		}
		wounds.put(pos, wound);
	}

	public void addWound(Wound wound) {
		addInitialWound(wound);
		WoundPosition pos = WoundPosition.getPositionForBodyLocation(BodyLocation.valueOf(wound.getBodyLocationCode()),
				this.sex);
		woundSelector.addWoundAtPosition(pos);
	}
	
	public void addWoundsInSelector(){
		for (WoundPosition pos : wounds.keySet()){
			woundSelector.addWoundAtPosition(pos);
		}
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

		for (WoundPosition p : WoundPosition.getWoundPositionValues(sex)) {
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
		
		if (this.selectedWound != null) {
			WoundPosition woundPosition = WoundPosition.getPositionForBodyLocation(BodyLocation.valueOf(selectedWound.getBodyLocationCode()),
					woundSelector.getSex());
			setSelectedWoundPosition(woundPosition);
			woundSelector.setSelectedWoundPosition(woundPosition);
		}
		else {
			setSelectedWoundPosition(null);
			woundSelector.setSelectedWoundPosition(null);
		}
	}

	public List<SelectedWoundChangeListener> selectedWoundListeners = null;
	
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
		if (selectedWoundListeners != null) {
			SelectedWoundChangeEvent event = new SelectedWoundChangeEvent(this, selectedWoundPosition, selectedWound);
			for (SelectedWoundChangeListener listener : selectedWoundListeners)
				listener.selectedWoundChanged(event);
		}
	}
	
	public void addSelectedWoundChangeListener(SelectedWoundChangeListener listener) {
        if (selectedWoundListeners == null) {
            selectedWoundListeners = new ArrayList<SelectedWoundChangeListener>();
        }
        selectedWoundListeners.add(listener);
    }

    public void removeSelectedWoundChangeListener(SelectedWoundChangeListener listener) {
        if (selectedWoundListeners != null) {
            selectedWoundListeners.remove(listener);
        }
    }
    
}