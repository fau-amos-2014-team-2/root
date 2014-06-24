package com.fau.amos.team2.WoundManagement.ui;

import com.fau.amos.team2.WoundManagement.WoundManagementUI;
import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.UI;

public abstract class SessionedNavigationView extends NavigationView {
	
	private static final long serialVersionUID = -6707854071291341702L;

	public Environment getEnvironment() {
		WoundManagementUI currentUI = (WoundManagementUI)UI.getCurrent();
		if (currentUI != null) {
			return currentUI.getEnvironment();
		}
		
		return null;
	}
	
}
