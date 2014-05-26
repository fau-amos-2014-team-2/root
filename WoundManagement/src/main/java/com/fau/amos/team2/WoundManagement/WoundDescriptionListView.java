package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.UserWardView.WardChangeListener;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.subviews.UserBar;
import com.vaadin.addon.touchkit.ui.NavigationView;

public class WoundDescriptionListView extends NavigationView implements WardChangeListener {
	
	private static final long serialVersionUID = 2998701886426658070L;
	
	private Patient patient;

	public WoundDescriptionListView(Patient patient){
		setCaption(MessageResources.getString("woundDescriptions"));
		
		this.patient = patient;
		
		setRightComponent(new UserBar(this));

	}
	
	@Override
	public void wardChanged(WardChangeEvent event) {
		getNavigationManager().setPreviousComponent(new PatientView(patient));
	}

}
