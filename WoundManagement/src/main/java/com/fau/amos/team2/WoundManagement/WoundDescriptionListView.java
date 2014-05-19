package com.fau.amos.team2.WoundManagement;

import java.util.ResourceBundle;

import com.vaadin.addon.touchkit.ui.NavigationView;

public class WoundDescriptionListView extends NavigationView {
	
	public WoundDescriptionListView(final ResourceBundle messages){
		setCaption(messages.getString("woundDescriptions"));
	}

}
