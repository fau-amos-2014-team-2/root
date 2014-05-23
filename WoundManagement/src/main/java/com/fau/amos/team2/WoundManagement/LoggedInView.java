package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.subviews.UserBar;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * The View that is shown, if a user has successfully logged in
 * @author ???
 */
@SuppressWarnings("serial")
public class LoggedInView extends NavigationView {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private EmployeeProvider employeeProvider = EmployeeProvider.getInstance();
	private PatientProvider patientProvider = 
			PatientProvider.getInstance();
	
	/**
 * The View that is shown, if a user has successfully logged in
 * @author ???
 */
	public LoggedInView() {
		setRightComponent(new UserBar());
		
		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();

		setCaption(MessageResources.getString("overview")); //$NON-NLS-1$

		Employee user = Environment.INSTANCE.getCurrentEmployee();

		Label greetingLable = new Label();
		greetingLable.setValue(MessageResources.getString("hi") + ", " //$NON-NLS-1$
				+ user.getFirstName() + " " + user.getLastName()); //$NON-NLS-1$
		mainLayout.addComponent(greetingLable);
		/*
		NavigationButton changePasswordButton = new NavigationButton(MessageResources.getString("changePIN")); //$NON-NLS-1$
		changePasswordButton.setTargetView(new UserPasswordView());
		mainLayout.addComponent(changePasswordButton);
		 */
		NavigationButton patientSelectorButton = new NavigationButton(MessageResources.getString("patientSelection")); //$NON-NLS-1$
		patientSelectorButton.setTargetView(new PatientSelectionView());
		mainLayout.addComponent(patientSelectorButton);
		/*
        NavigationButton pictureButton = new NavigationButton(MessageResources.getString("patientView")); //$NON-NLS-1$
		pictureButton.addClickListener(new NavigationButtonClickListener() {
			
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				PatientView patientView = new PatientView(null);
				getNavigationManager().navigateTo(patientView);
			}
		});
		mainLayout.addComponent(pictureButton);
		 */
		NavigationButton addWoundDataButton = new NavigationButton(MessageResources.getString("addNewWound")); //$NON-NLS-1$
		addWoundDataButton.setTargetView(new NewWoundView(
				patientProvider.getByID(patientProvider.getAll().getIdByIndex(0)), 
				BodyLocation.BRUSTBEIN, 
				employeeProvider.getByID(employeeProvider.getAll().getIdByIndex(0))));
		mainLayout.addComponent(addWoundDataButton);
		
		NavigationButton wardButton = new NavigationButton(MessageResources.getString("wardView")); //$NON-NLS-1$
		wardButton.setTargetView(new WardSelectionView());
		mainLayout.addComponents(wardButton);

		NavigationButton logoutButton = new NavigationButton(MessageResources.getString("logout")); //$NON-NLS-1$
		logoutButton.addClickListener(new NavigationButtonClickListener() {

			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				Environment.INSTANCE.logout();
				getNavigationManager().setCurrentComponent(new UserLoginView());
			}
		});
		mainLayout.addComponent(logoutButton);
		
		setContent(mainLayout);

	}
}
