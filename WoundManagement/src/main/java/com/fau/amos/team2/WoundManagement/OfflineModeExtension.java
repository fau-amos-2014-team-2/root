package com.fau.amos.team2.WoundManagement;

import com.vaadin.addon.touchkit.extensions.OfflineMode;

public class OfflineModeExtension extends OfflineMode {
	
	private static final long serialVersionUID = 1405785367296821092L;
	
	public OfflineModeExtension() {
		setOfflineModeTimeout(60);
	}
	
}
