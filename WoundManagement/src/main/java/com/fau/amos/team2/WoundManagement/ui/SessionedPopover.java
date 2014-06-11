package com.fau.amos.team2.WoundManagement.ui;

import com.fau.amos.team2.WoundManagement.WoundManagementUI;
import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.vaadin.addon.touchkit.ui.Popover;
import com.vaadin.ui.UI;

public abstract class SessionedPopover extends Popover {

	private static final long serialVersionUID = -7457609800859676268L;

	public Environment getEnvironment() {
		WoundManagementUI currentUI = (WoundManagementUI)UI.getCurrent();
		if (currentUI != null) {
			return currentUI.getEnvironment();
		}
		
		return null;
	}
}
