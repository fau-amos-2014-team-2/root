package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;

/**
 * View to see the StartMenu
 * @author ???
 */
public class StartMenuView extends NavigationView {
	private static final long serialVersionUID = -5310803657027928140L;

	private static EmployeeProvider employeeProvider = 
			EmployeeProvider.getInstance();
	private static PatientProvider patientProvider = 
			PatientProvider.getInstance();
	
	/**
	 * Creates an instance of StartMenuView
	 * 
	 * Navigates to one of the following Views
	 * 
	 * @see com.fau.amos.team2.WoundManagement.UserLoginView
	 * @see com.fau.amos.team2.WoundManagement.PatientSelectionView
	 * @see com.fau.amos.team2.WoundManagement.PatientView
	 */
	@SuppressWarnings("serial")
	public StartMenuView() {
		setCaption(MessageResources.getString("mainMenu")); //$NON-NLS-1$

		final VerticalComponentGroup content = new VerticalComponentGroup();

		NavigationButton loginScreenButton = new NavigationButton(MessageResources.getString("login")); //$NON-NLS-1$
		loginScreenButton.setTargetView(new UserLoginView());
		content.addComponent(loginScreenButton);
		/*
		NavigationButton patientSelectorButton = new NavigationButton(MessageResources.getString("patientSelection")); //$NON-NLS-1$
		patientSelectorButton.setTargetView(new PatientSelectionView());
		content.addComponent(patientSelectorButton);
		
		NavigationButton pictureButton = new NavigationButton(MessageResources.getString("patientView")); //$NON-NLS-1$
		// pictureButton.setTargetView(new PatientView(WoundProvider.getInstance().getAll().getIdByIndex(0)));
		content.addComponent(pictureButton);
		
		NavigationButton addDataButton = new NavigationButton(MessageResources.getString("addNewWound")); //$NON-NLS-1$
		/* addDataButton.setTargetView(new NewWoundView(patientProvider.getByID(patientProvider.getAll().getIdByIndex(0)), 
				BodyLocation.BRUSTBEIN, 
				employeeProvider.getByID(employeeProvider.getAll().getIdByIndex(0)))); 
		content.addComponent(addDataButton);
		*/
		NavigationButton initializeDataButton = new NavigationButton("For Software Developers only: initialize data");
		initializeDataButton.addClickListener(new NavigationButtonClickListener() {
			public void buttonClick(NavigationButtonClickEvent event) {
				WoundManagementUI.initData();
			}
		});
		content.addComponent(initializeDataButton);

		setContent(content);
	}
}
