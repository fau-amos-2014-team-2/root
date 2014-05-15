package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.WardView;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
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
	 * @see com.fau.amos.team2.WoundManagement.LoginView
	 * @see com.fau.amos.team2.WoundManagement.PatientView
	 * @see com.fau.amos.team2.WoundManagement.PictureView
	 */
	@SuppressWarnings("serial")
	public StartMenuView() {
		setCaption("Main Menu");

		final VerticalComponentGroup content = new VerticalComponentGroup();
						
		// added Ward View navigation button
		NavigationButton wardButton = new NavigationButton("Ward View");
		wardButton.setTargetView(new WardView());
		content.addComponent(wardButton);
				
		NavigationButton loginScreenButton = new NavigationButton("Login");
		loginScreenButton.setTargetView(new LoginView());
		content.addComponent(loginScreenButton);

		NavigationButton patientSelectorButton = new NavigationButton("Patient Selector");
		patientSelectorButton.setTargetView(new PatientView());
		content.addComponent(patientSelectorButton);
		
		NavigationButton pictureButton = new NavigationButton("Picture View");
		pictureButton.setTargetView(new PictureView());
		content.addComponent(pictureButton);
		
		NavigationButton dataButton = new NavigationButton("Show Wound Data");
		dataButton.setTargetView(new WoundDataView(WoundProvider.getInstance().getAll().getIdByIndex(0)));
		content.addComponent(dataButton);
		
		NavigationButton addDataButton = new NavigationButton("Add Wound Data");
		addDataButton.setTargetView(new AddWoundDataView(BodyLocation.BRUSTBEIN, EmployeeProvider.getInstance().getByID(EmployeeProvider.getInstance().getAll().getIdByIndex(0))));
		content.addComponent(addDataButton);

		setContent(content);
	}
}
