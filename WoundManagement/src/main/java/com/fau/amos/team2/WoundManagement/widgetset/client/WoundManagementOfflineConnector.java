package com.fau.amos.team2.WoundManagement.widgetset.client;

import com.fau.amos.team2.WoundManagement.OfflineModeExtension;
import com.vaadin.addon.touchkit.gwt.client.offlinemode.OfflineModeActivationEventImpl;
import com.vaadin.addon.touchkit.gwt.client.offlinemode.OfflineMode.ActivationReason;
import com.vaadin.addon.touchkit.gwt.client.vcom.OfflineModeConnector;
import com.vaadin.client.VConsole;
import com.vaadin.shared.ui.Connect;

@Connect(OfflineModeExtension.class)
public class WoundManagementOfflineConnector extends OfflineModeConnector {
	
	private static final long serialVersionUID = -8715249937842142606L;
	
}
