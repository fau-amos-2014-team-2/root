package com.fau.amos.team2.WoundManagement;

import java.util.ResourceBundle;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;

import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;

/**
 * View to see the StartMenu
 * @author ???
 */
public class StartMenuView extends NavigationView {
	private static final long serialVersionUID = -5310803657027928140L;

	private static EmployeeProvider<Employee> employeeProvider = 
			(EmployeeProvider<Employee>) EmployeeProvider.getInstance();
	private static PatientProvider<Patient> patientProvider = 
			(PatientProvider<Patient>) PatientProvider.getInstance();
	
	/**
	 * Creates an instance of StartMenuView
	 * 
	 * Navigates to one of the following Views
	 * 
	 * @see com.fau.amos.team2.WoundManagement.UserLoginView
	 * @see com.fau.amos.team2.WoundManagement.PatientSelectionView
	 * @see com.fau.amos.team2.WoundManagement.PatientView
	 */
	public StartMenuView(ResourceBundle messages) {
		setCaption(messages.getString("mainMenu")); //$NON-NLS-1$

		final VerticalComponentGroup content = new VerticalComponentGroup();

		NavigationButton loginScreenButton = new NavigationButton(messages.getString("login")); //$NON-NLS-1$
		loginScreenButton.setTargetView(new UserLoginView(messages));
		content.addComponent(loginScreenButton);

		NavigationButton patientSelectorButton = new NavigationButton(messages.getString("patientSelection")); //$NON-NLS-1$
		patientSelectorButton.setTargetView(new PatientSelectionView(messages));
		content.addComponent(patientSelectorButton);
		
		NavigationButton pictureButton = new NavigationButton(messages.getString("patientView")); //$NON-NLS-1$
		pictureButton.setTargetView(new PatientView(messages, WoundProvider.getInstance().getAll().getIdByIndex(0)));
		content.addComponent(pictureButton);
		
		NavigationButton addDataButton = new NavigationButton(messages.getString("addNewWound")); //$NON-NLS-1$
		addDataButton.setTargetView(new NewWoundView(messages,
				patientProvider.getByID(patientProvider.getAll().getIdByIndex(0)), 
				BodyLocation.BRUSTBEIN, 
				employeeProvider.getByID(employeeProvider.getAll().getIdByIndex(0))));
		content.addComponent(addDataButton);

		setContent(content);
	}
}
