package com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview;

import com.fau.amos.team2.WoundManagement.widgetset.client.model.WoundDescription;
import com.vaadin.addon.touchkit.gwt.client.ui.VerticalComponentGroupWidget;

public class InformationLayout extends VerticalComponentGroupWidget {
	
	private CreateWoundDescriptionViewModuleListener listener;

	public InformationLayout(final CreateWoundDescriptionViewModuleListener listener) {
		this.listener = listener;
	}
	
	public final boolean validateFields() {
		resetValidations();
		
		// TODO: Implement
		return true;
	}
	
	public final void resetValidations() {
		// TODO: Implement
	}
	
	public final void woundDescriptionUpdated(final WoundDescription woundDescription) {
		// TODO: Implement
	}
}
