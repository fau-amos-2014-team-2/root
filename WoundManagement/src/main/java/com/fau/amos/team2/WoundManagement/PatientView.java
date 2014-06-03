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
import com.vaadin.addon.touchkit.ui.Switch;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
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
	private Label patientNameLabel;
	
	private boolean showCurrentWoundsOnly;
	
	VerticalLayout rightContent = new VerticalLayout();
	
	@SuppressWarnings("serial")
	public PatientView(Patient patient) {
		this.currentPatient = patient;
		this.showCurrentWoundsOnly = false;
		
		patientNameLabel = new Label("<h2>" + currentPatient.getFirstName() + " " + currentPatient.getLastName() + "</h2>", ContentMode.HTML);
		
		setRightComponent(new UserBar(this));
		
		setCaption(MessageResources.getString("patientView")); //$NON-NLS-1$
		
		final Switch showOnlyCurrentWoundsSwitch = new Switch(MessageResources.getString("currentWoundsOnly"));
		showOnlyCurrentWoundsSwitch.setValue(false);
		showOnlyCurrentWoundsSwitch.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				
				setBoolShowCurrentWoundsOnly(showOnlyCurrentWoundsSwitch.getValue());
				
				getNavigationManager().navigateTo(new PatientView(currentPatient, getBoolShowCurrentWoundsOnly()));
			}
			
		});
		showOnlyCurrentWoundsSwitch.setImmediate(true);
		
		GridLayout content = new GridLayout(3, 1);
		content.setColumnExpandRatio(0, 0);
		content.setColumnExpandRatio(1, 0);
		content.setColumnExpandRatio(2, 0);
		
		woundManager = new WoundManager(currentPatient, getBoolShowCurrentWoundsOnly());
		woundManager.addSelectedWoundChangeListener(this);
		
		content.addComponents(showOnlyCurrentWoundsSwitch, woundManager.getWoundSelector(), rightContent);
		rightContent.addComponent(patientNameLabel);
		
		setContent(content);
	}
	
	@SuppressWarnings("serial")
	public PatientView(Patient patient, boolean showCurrentWoundsOnly) {
		this.currentPatient = patient;
		this.showCurrentWoundsOnly = showCurrentWoundsOnly;
		
		patientNameLabel = new Label("<h2>" + currentPatient.getFirstName() + " " + currentPatient.getLastName() + "</h2>", ContentMode.HTML);
		
		setRightComponent(new UserBar(this));
		
		setCaption(MessageResources.getString("patientView")); //$NON-NLS-1$
		
		final Switch showOnlyCurrentWoundsSwitch = new Switch(MessageResources.getString("currentWoundsOnly"));
		showOnlyCurrentWoundsSwitch.setValue(getBoolShowCurrentWoundsOnly());
		
		showOnlyCurrentWoundsSwitch.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				
				setBoolShowCurrentWoundsOnly(showOnlyCurrentWoundsSwitch.getValue());
				getNavigationManager().navigateTo(
					new PatientView(currentPatient, getBoolShowCurrentWoundsOnly()));
			}
			
		});
		
		showOnlyCurrentWoundsSwitch.setImmediate(true);
		
		GridLayout content = new GridLayout(3, 1);
		content.setColumnExpandRatio(0, 0);
		content.setColumnExpandRatio(1, 0);
		content.setColumnExpandRatio(2, 0);
		
		woundManager = new WoundManager(currentPatient, getBoolShowCurrentWoundsOnly());
		woundManager.addSelectedWoundChangeListener(this);
		
		content.addComponents(showOnlyCurrentWoundsSwitch, woundManager.getWoundSelector(), rightContent);
		rightContent.addComponent(patientNameLabel);
		
		setContent(content);
	}

	
	@Override
	public void selectedWoundChanged(SelectedWoundChangeEvent event) {
		Wound selectedWound = event.getWound();
		rightContent.removeAllComponents();	
		
		rightContent.addComponent(patientNameLabel);
		
		if (selectedWound != null) {
			rightContent.addComponent(new ExistingWound(this, selectedWound));
		}
		else if (event.getWoundPosition() != null) {
			rightContent.addComponent(new NewWound(this, currentPatient, event.getWoundPosition().getBodyLocation()));
		}
	}
	
	@Override
	public void onBecomingVisible(){
		super.onBecomingVisible();
		this.setNavigationManagerPreviousComponent();
	}


	@Override
	public void wardChanged(WardChangeEvent event) {
		this.setNavigationManagerPreviousComponent();
	}
	
	public void setSelectedWound(Wound wound) {
		if (wound != null && wound.getPatient().getId() == currentPatient.getId()) {
			woundManager.addWound(wound);
			woundManager.setSelectedWound(wound);
		}
		else {
			woundManager.setSelectedWound(null);
		}
		this.setNavigationManagerPreviousComponent();
	}
	
	public void prepareSelectedWound(Wound wound) {
		if (wound != null && wound.getPatient().getId() == currentPatient.getId()) {
			woundManager.addWound(wound);
			woundManager.setSelectedWound(wound);
		}
		else {
			woundManager.setSelectedWound(null);
		}
	}
	
	public Patient getPatient(){
		return currentPatient;
	}
	
	public void setNavigationManagerPreviousComponent(){
		getNavigationManager().setPreviousComponent(new PatientSelectionView());
	}
	
	public boolean getBoolShowCurrentWoundsOnly() {
		return this.showCurrentWoundsOnly;
	}
	
	public void setBoolShowCurrentWoundsOnly(Boolean showCurrentWoundsOnly) {
		this.showCurrentWoundsOnly = showCurrentWoundsOnly;
	}

}
