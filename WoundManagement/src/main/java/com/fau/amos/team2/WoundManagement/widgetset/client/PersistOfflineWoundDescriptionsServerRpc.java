package com.fau.amos.team2.WoundManagement.widgetset.client;

import java.util.List;

import com.fau.amos.team2.WoundManagement.widgetset.client.model.WoundDescription;
import com.vaadin.shared.communication.ServerRpc;

public interface PersistOfflineWoundDescriptionsServerRpc extends ServerRpc {

	void persistWoundDescriptions(List<WoundDescription> woundDescriptions);
	
}
