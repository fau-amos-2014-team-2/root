package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Wound;
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
		NavigationButton loginScreenButton = new NavigationButton("Login");
		loginScreenButton.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().navigateTo(new LoginView());				
			}
		});
		
		NavigationButton patientSelectorButton = new NavigationButton("Patient Selector");
		patientSelectorButton.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().navigateTo(new PatientView());
			}
		});
		
		NavigationButton pictureButton = new NavigationButton("Picture View");
		pictureButton.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().navigateTo(new PictureView());
			}
		});
		
		NavigationButton dataButton = new NavigationButton("Show Wound Data");
		dataButton.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				Object id = WoundProvider.getInstance().getAll().getIdByIndex(0);
				getNavigationManager().navigateTo(new WoundDataView(id));
			}
		});
		
		NavigationButton addDataButton = new NavigationButton("Add Wound Data");
		addDataButton.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				Employee user = EmployeeProvider.getInstance().getByID(EmployeeProvider.getInstance().getAll().getIdByIndex(0));
				getNavigationManager().navigateTo(new AddWoundDataView(BodyLocation.BRUSTBEIN, user));
			}
		});
		
		content.addComponent(loginScreenButton);
		content.addComponent(patientSelectorButton);
		content.addComponent(pictureButton);
		content.addComponent(dataButton);
		content.addComponent(addDataButton);

		setContent(content);
	}
}
