package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.UserWardView.WardChangeListener;
import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager;
import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager.SelectedWoundChangeEvent;
import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager.SelectedWoundChangeListener;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.subviews.ExistingWound;
import com.fau.amos.team2.WoundManagement.subviews.NewWound;
import com.fau.amos.team2.WoundManagement.subviews.UserBar;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

/**
 * View to see a picture
 * 
 * @author ???
 */
public class PatientView extends NavigationView implements SelectedWoundChangeListener, WardChangeListener {
	private static final long serialVersionUID = -572027045788648039L;
	
	private Patient currentPatient;
	private WoundManager woundManager;
	
	VerticalLayout rightContent = new VerticalLayout();
	
	public PatientView(Patient patient) {
		this.currentPatient = patient;
		
		setRightComponent(new UserBar(this));
		
		setCaption(MessageResources.getString("patientView")); //$NON-NLS-1$
		
		GridLayout content = new GridLayout(2, 1);
		content.setColumnExpandRatio(0, 0);
		content.setColumnExpandRatio(1, 0);
		
		woundManager = new WoundManager(currentPatient);
		woundManager.addSelectedWoundChangeListener(this);
		
		content.addComponents(woundManager.getWoundSelector(), rightContent);
		
		setContent(content);
	}

	
	@Override
	public void selectedWoundChanged(SelectedWoundChangeEvent event) {
		Wound selectedWound = event.getWound();
		rightContent.removeAllComponents();	
		
		if (selectedWound != null) {
			rightContent.addComponent(new ExistingWound(selectedWound));
		}
		else if (event.getWoundPosition() != null) {
			rightContent.addComponent(new NewWound(this, currentPatient, event.getWoundPosition().getBodyLocation()));
		}
	}
	
	@Override
	public void onBecomingVisible(){
		super.onBecomingVisible();
		getNavigationManager().setPreviousComponent(new PatientSelectionView());
	}


	@Override
	public void wardChanged(WardChangeEvent event) {
		getNavigationManager().setPreviousComponent(new PatientSelectionView());
	}
	
	public void setSelectedWound(Wound wound) {
		if (wound != null && wound.getPatient().getId() == currentPatient.getId()) {
			woundManager.addWound(wound);
			woundManager.setSelectedWound(wound);
		}
		else {
			woundManager.setSelectedWound(null);
		}
	}

}
