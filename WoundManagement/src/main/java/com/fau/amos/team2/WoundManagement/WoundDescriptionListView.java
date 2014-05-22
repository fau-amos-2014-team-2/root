package com.fau.amos.team2.WoundManagement;

import java.util.ResourceBundle;

import com.vaadin.addon.touchkit.ui.NavigationView;

public class WoundDescriptionListView extends NavigationView {
	
	private static final long serialVersionUID = 2998701886426658070L;

	public WoundDescriptionListView(final ResourceBundle messages){
		setCaption(messages.getString("woundDescriptions"));
	}

}
