package com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview;

import java.util.Arrays;

import com.fau.amos.team2.WoundManagement.widgetset.client.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview.CreateWoundDescriptionViewWidget.CreateWoundDescriptionViewWidgetListener;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.ui.AbstractComponentConnector;

public class CreateWoundDescriptionViewConnector extends
		AbstractComponentConnector implements
		CreateWoundDescriptionViewWidgetListener {
	
	private final CreateWoundDescriptionViewServerRpc rpc = RpcProxy.create(CreateWoundDescriptionViewServerRpc.class, this);

	@Override
	public CreateWoundDescriptionViewWidget getWidget() {
		return (CreateWoundDescriptionViewWidget)super.getWidget();
	}
	
	@Override
	public CreateWoundDescriptionViewState getState() {
		return (CreateWoundDescriptionViewState)super.getState();
	}
	
	@Override
	protected Widget createWidget() {
		final CreateWoundDescriptionViewWidget widget = GWT.create(CreateWoundDescriptionViewWidget.class);
		widget.setCreateWoundDescriptionViewWidgetListener(this);
		return widget;
	}
	
	@Override
	public void persistWoundDescription(WoundDescription woundDescription) {
		rpc.persistWoundDescription(Arrays.asList(woundDescription));
	}

	@Override
	public void updateState(WoundDescription woundDescription) {
		rpc.updateState(woundDescription);
	}

}
