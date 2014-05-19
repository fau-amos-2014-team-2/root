package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Label;

/**
 * The View that is shown, if a user has successfully logged in
 * @author ???
 */
@SuppressWarnings("serial")
public class LoggedInView extends NavigationView {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private EmployeeProvider<Employee> employeeProvider = 
			(EmployeeProvider<Employee>) EmployeeProvider.getInstance();
	private PatientProvider<Patient> patientProvider = 
			(PatientProvider<Patient>) PatientProvider.getInstance();
	
	/**
 * The View that is shown, if a user has successfully logged in
 * @author ???
 */
	public LoggedInView(final Object id) {
		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();

		setCaption("Übersicht");

		Employee user = employeeProvider.getByID(id);

		Label greetingLable = new Label();
		greetingLable.setValue("Hi, "
				+ user.getFirstName() + " " + user.getLastName());
		mainLayout.addComponent(greetingLable);

		NavigationButton changePasswordButton = new NavigationButton("Passwort ändern");
		changePasswordButton.setTargetView(new UserPasswordView(id));
		mainLayout.addComponent(changePasswordButton);

		NavigationButton patientSelectorButton = new NavigationButton("Patientenauswahl");
		patientSelectorButton.setTargetView(new PatientSelectionView());
		mainLayout.addComponent(patientSelectorButton);

		NavigationButton pictureButton = new NavigationButton("Patientenansicht");
		pictureButton.setTargetView(new PatientView(WoundProvider.getInstance().getAll().getIdByIndex(0)));
		mainLayout.addComponent(pictureButton);

		NavigationButton addWoundDataButton = new NavigationButton("Wunde hinzufügen");
		addWoundDataButton.setTargetView(new NewWoundView(
				patientProvider.getByID(patientProvider.getAll().getIdByIndex(0)), 
				BodyLocation.BRUSTBEIN, 
				employeeProvider.getByID(employeeProvider.getAll().getIdByIndex(0))));
		mainLayout.addComponent(addWoundDataButton);

		NavigationButton logoutButton = new NavigationButton("Abmelden");
		logoutButton.addClickListener(new NavigationButtonClickListener() {

			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().setCurrentComponent(new UserLoginView());

			}
		});
		mainLayout.addComponent(logoutButton);
		
		// added Ward View navigation button
		NavigationButton wardButton = new NavigationButton("Ward View");
		wardButton.setTargetView(new WardSelectionView(id));
		mainLayout.addComponents(wardButton);
		
		setContent(mainLayout);

	}
}
