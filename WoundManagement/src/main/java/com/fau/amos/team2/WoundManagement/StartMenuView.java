package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;

/**
 * View to see the StartMenu
 * @author ???
 */
public class StartMenuView extends NavigationView {
	private static final long serialVersionUID = -5310803657027928140L;

	/**
	 * Creates an instance of StartMenuView
	 * 
	 * Navigates to one of the following Views
	 * 
	 * @see com.fau.amos.team2.WoundManagement.UserLoginView
	 * @see com.fau.amos.team2.WoundManagement.PatientSelectionView
	 * @see com.fau.amos.team2.WoundManagement.PatientView
	 */
	public StartMenuView() {
		setCaption("Main Menu");

		final VerticalComponentGroup content = new VerticalComponentGroup();

		NavigationButton loginScreenButton = new NavigationButton("Login");
		loginScreenButton.setTargetView(new UserLoginView());
		content.addComponent(loginScreenButton);

		NavigationButton patientSelectorButton = new NavigationButton("Patient Selector");
		patientSelectorButton.setTargetView(new PatientSelectionView());
		content.addComponent(patientSelectorButton);
		
		NavigationButton pictureButton = new NavigationButton("Patient View");
		pictureButton.setTargetView(new PatientView(WoundProvider.getInstance().getAll().getIdByIndex(0)));
		content.addComponent(pictureButton);
		
		NavigationButton addDataButton = new NavigationButton("Add Wound Data");
		addDataButton.setTargetView(new NewWoundView(
				PatientProvider.getInstance().getByID(PatientProvider.getInstance().getAll().getIdByIndex(0)), 
				BodyLocation.BRUSTBEIN, 
				EmployeeProvider.getInstance().getByID(EmployeeProvider.getInstance().getAll().getIdByIndex(0))));
		content.addComponent(addDataButton);

		setContent(content);
	}
}
