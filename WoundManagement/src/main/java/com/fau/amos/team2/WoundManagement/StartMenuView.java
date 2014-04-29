package com.fau.amos.team2.WoundManagement;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;

public class StartMenuView extends NavigationView {
	private static final long serialVersionUID = -5310803657027928140L;

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
		
		content.addComponents(loginScreenButton, patientSelectorButton, pictureButton);
		
		setContent(content);
	}
}
