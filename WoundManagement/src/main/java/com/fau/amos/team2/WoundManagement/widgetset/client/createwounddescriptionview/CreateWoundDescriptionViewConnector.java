package com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.ui.AbstractComponentConnector;

public class CreateWoundDescriptionViewConnector extends
		AbstractComponentConnector {

	private static final long serialVersionUID = 4281131505941021232L;
	
	@Override
	protected Widget createWidget() {
		final CreateWoundDescriptionViewWidget widget = GWT.create(CreateWoundDescriptionViewWidget.class);
		return widget;
	}
}
