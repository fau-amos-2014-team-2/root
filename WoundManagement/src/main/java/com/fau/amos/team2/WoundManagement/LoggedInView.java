package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.WardProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;

/**
 * The View that is shown, if a user has successfully logged in
 * @author ???
 */
@SuppressWarnings("serial")
public class LoggedInView extends NavigationView {
	
	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

/**
 * The View that is shown, if a user has successfully logged in
 * @author ???
 */

	public LoggedInView(final Object id) {
		setCaption("Logged In");

		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();
		
		setCaption("Uebersicht");

				
		Employee user = EmployeeProvider.getInstance().getByID(id);
		Ward currentWard = WardProvider.getInstance().getByID((user.getCurrentWard()));
		
		Label greetingLable = new Label();

		greetingLable.setValue("Hi, "
				+ user.getFirstName() + " " + user.getLastName() + ", sie arbeiten momentan auf Station " + currentWard.getCharacterisation() );
		mainLayout.addComponent(greetingLable);
		
		NavigationButton changeWardButton = new NavigationButton("Station aendern");
		changeWardButton.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().navigateTo(new ChangeWardView(id));
			}
		});
		
		mainLayout.addComponent(changeWardButton);

		NavigationButton changePasswordButton = new NavigationButton("Passwort aendern");
		changePasswordButton.setTargetView(new ChangePasswordView(id));
		mainLayout.addComponent(changePasswordButton);

		NavigationButton patientSelectorButton = new NavigationButton("Patientenauswahl");
		patientSelectorButton.setTargetView(new PatientView());
		mainLayout.addComponent(patientSelectorButton);
		
		NavigationButton pictureButton = new NavigationButton("Patientenansicht");
		pictureButton.setTargetView(new PictureView());
		mainLayout.addComponent(pictureButton);
		
		NavigationButton woundDataButton = new NavigationButton("Wunddaten anzeigen");
		woundDataButton.setTargetView(new WoundDataView(WoundProvider.getInstance().getAll().getIdByIndex(0)));
		mainLayout.addComponent(woundDataButton);
		
		NavigationButton addWoundDataButton = new NavigationButton("Wunde hinzufuegen");
		addWoundDataButton.setTargetView(new AddWoundDataView(BodyLocation.BRUSTBEIN, EmployeeProvider.getInstance().getByID(EmployeeProvider.getInstance().getAll().getIdByIndex(0))));
		mainLayout.addComponent(addWoundDataButton);
		
		NavigationButton logoutButton = new NavigationButton("Abmelden");
		logoutButton.addClickListener(new NavigationButtonClickListener() {
			
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().setCurrentComponent(new LoginView());
				
			}
		});
		mainLayout.addComponent(logoutButton);
		
		greetingLable.setValue("Hi, " + user.getFirstName() + " " + user.getLastName());
		mainLayout.addComponent(greetingLable);

		NavigationButton pictureButton = new NavigationButton("Picture View");
		pictureButton.addClickListener(new NavigationButtonClickListener() 
		{
			@Override
			public void buttonClick(NavigationButtonClickEvent event) 
			{
				getNavigationManager().navigateTo(new PictureView());
			}
		});
		
		// added Ward View navigation button
		NavigationButton wardButton = new NavigationButton("Ward View");
		wardButton.addClickListener(new NavigationButtonClickListener() 
		{
			@Override
			public void buttonClick(NavigationButtonClickEvent event) 
			{
				getNavigationManager().navigateTo(new WardView());
			}
		});

		NavigationButton logoutButton = new NavigationButton("Logout");
		logoutButton.addClickListener(new NavigationButtonClickListener() 
		{
			@Override
			public void buttonClick(NavigationButtonClickEvent event) 
			{
				Notification.show("Tschuess!");
				getNavigationManager().navigateTo(new LoginView());
			}
		});
		
		NavigationButton patientSelectorButton = new NavigationButton(
				"Patient Selector");
		patientSelectorButton.addClickListener(new NavigationButtonClickListener() 
		{
				@Override
				public void buttonClick(NavigationButtonClickEvent event) 
				{
				getNavigationManager().navigateTo(new PatientView());
				}
		});
		
		NavigationButton changePasswordButton = new NavigationButton("Change Password");
		changePasswordButton.addClickListener(new NavigationButtonClickListener() 
		{
			@Override
			public void buttonClick(NavigationButtonClickEvent event) 
			{
				getNavigationManager().navigateTo(new ChangePasswordView(id));
			}
		});
		
		mainLayout.addComponent(changePasswordButton);
		// added wardButton
		mainLayout.addComponents(wardButton, patientSelectorButton, pictureButton, logoutButton);
		
		setContent(mainLayout);
	}
}
