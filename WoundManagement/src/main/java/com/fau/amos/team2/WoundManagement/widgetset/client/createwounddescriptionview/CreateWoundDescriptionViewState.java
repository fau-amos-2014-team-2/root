package com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview;

import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.vaadin.shared.AbstractComponentState;

public class CreateWoundDescriptionViewState extends AbstractComponentState {
	private WoundDescription woundDescription = new WoundDescription();

	public WoundDescription getWoundDescription() {
		return woundDescription;
	}

	public void setWoundDescription(WoundDescription woundDescription) {
		this.woundDescription = woundDescription;
	}
}
