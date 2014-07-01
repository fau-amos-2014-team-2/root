package com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview;

import com.fau.amos.team2.WoundManagement.widgetset.client.model.WoundDescription;
import com.vaadin.shared.AbstractComponentState;

public class CreateWoundDescriptionViewState extends AbstractComponentState {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4084723167869182804L;
	private WoundDescription woundDescription = new WoundDescription();

	public WoundDescription getWoundDescription() {
		return woundDescription;
	}

	public void setWoundDescription(WoundDescription woundDescription) {
		this.woundDescription = woundDescription;
	}
}
