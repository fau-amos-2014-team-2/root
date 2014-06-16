package com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview;

import java.util.List;

import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.vaadin.shared.annotations.Delayed;
import com.vaadin.shared.communication.ServerRpc;

public interface CreateWoundDescriptionViewServerRpc extends ServerRpc {
	void persistWoundDescription(List<WoundDescription> woundDescriptions);
	
	@Delayed(lastOnly = true)
	void updateState(WoundDescription woundDescription);
}
