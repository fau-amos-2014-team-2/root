package com.fau.amos.team2.WoundManagement;

import java.util.List;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.fau.amos.team2.WoundManagement.provider.WardProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.data.Property;
import com.vaadin.ui.AbstractSelect.ItemCaptionMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.OptionGroup;

/**
 * The View that is shown, if a user wants to change his/her current Ward * @author
 * simon
 */
@SuppressWarnings("serial")
public class WardSelectionView extends NavigationView {

	private Label greetingLabel;
	
	private static WardProvider wardProvider = 
			WardProvider.getInstance();


	public WardSelectionView() {
		setCaption(MessageResources.getString("changeWard")); //$NON-NLS-1$

		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();

		final Employee user = Environment.INSTANCE.getCurrentEmployee();
		Ward currentWard = user.getCurrentWard();

		Label workingLabel=new Label();

		workingLabel.setValue(user.getFirstName() + " " //$NON-NLS-1$
				+ user.getLastName() + ", " + MessageResources.getString("yourWardIs") + ": " //$NON-NLS-1$
				+ user.getWorkingWard().getCharacterisation());
		mainLayout.addComponent(workingLabel);
		
		greetingLabel = new Label();
		greetingLabel.setValue(MessageResources.getString("yourCurrentWardIs") + ": "//$NON-NLS-1$
				+ currentWard.getCharacterisation());
		
		mainLayout.addComponent(greetingLabel);

		// Hole ids aller der Datenbank bekannten Stationen
		List<Ward> wards = wardProvider.getAllItems();

		final OptionGroup wardGroup = new OptionGroup(
				MessageResources.getString("pleaseChooseCurrentWard") + ":"); //$NON-NLS-1$

		// das aendern der Caption aendert nicht die Item-ID der optiongroup-
		// mode explicit
		wardGroup.setItemCaptionMode(ItemCaptionMode.EXPLICIT);
		// aenderung innerhalb der wardgroup werden direkt mit dem server
		// kommuniziert
		// keine verzoegerung bei valuechange-events
		wardGroup.setImmediate(true);

		for (Ward ward : wards) {
			// fuege jede Ward in die Liste ein, Item-ID = datenbank ID
			wardGroup.addItem(ward.getId());
			wardGroup.setItemCaption(ward.getId(), ward.getCharacterisation());
		}
		
		wardGroup.addValueChangeListener(new Property.ValueChangeListener() {

			@Override
			public void valueChange(
					com.vaadin.data.Property.ValueChangeEvent event) {
				Object blub = wardGroup.getValue();
				user.setCurrentWard(wardProvider.getByID(blub));

				Ward newWard = user.getCurrentWard();
				
				//TODO: why is update not working?
				EmployeeProvider.getInstance().updateEmployeeWardManually(user);

				greetingLabel.setValue(MessageResources.getString("currentWardChangedTo1") //$NON-NLS-1$
						+ " " + newWard.getCharacterisation() + " " + MessageResources.getString("currentWardChangedTo2")); //$NON-NLS-1$
						
			}
		});

		mainLayout.addComponent(wardGroup);
		
		/*
		/*natuerlich kann man jederzeit mit Hilfe der auto-back-Funktion zurueckgehen, 
		 * erreicht dann aber einen veralteten LoggedInView, in dem noch nicht die -veraenderte- 
		 * Station angezeigt wird. Problematisch ist dabei, dass die Station aber geandert ist, nur 
		 * die anzeige veraltet (s.o.). Mit Hilfe dieses Buttons erreicht man einen refreshten LoggedInView, 
		 * in dem die aktuelle Station angezeigt wird.
		
		 SHOULD BE FIXED
		 
		NavigationButton zurueck = new NavigationButton(MessageResources.getString("back")); //$NON-NLS-1$
		zurueck.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().navigateTo(new LoggedInView());
			}
		});
		
		mainLayout.addComponent(zurueck);
		
		*/ 
		
		setContent(mainLayout);
	}
}
