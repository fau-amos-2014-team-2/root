package com.fau.amos.team2.WoundManagement.ui;

import com.fau.amos.team2.WoundManagement.provider.TestDataLoader;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;

public class StartMenuView extends SessionedNavigationView {
	private static final long serialVersionUID = -5310803657027928140L;

	/**
	 * Creates an instance of StartMenuView
	 * 
	 * Navigates to one of the following Views
	 * 
	 * @see com.fau.amos.team2.WoundManagement.ui.UserLoginView
	 * @see com.fau.amos.team2.WoundManagement.ui.PatientSelectionView
	 * @see com.fau.amos.team2.WoundManagement.ui.PatientView
	 */
	@SuppressWarnings("serial")
	public StartMenuView() {
		
		setCaption(MessageResources.getString("mainMenu")); //$NON-NLS-1$

		final VerticalComponentGroup content = new VerticalComponentGroup();

		NavigationButton loginScreenButton = new NavigationButton(MessageResources.getString("login")); //$NON-NLS-1$
		loginScreenButton.setTargetView(new UserLoginView());
		content.addComponent(loginScreenButton);

		NavigationButton initializeDataButton = new NavigationButton("For Software Developers only: initialize data");
		initializeDataButton.addClickListener(new NavigationButtonClickListener() {
			public void buttonClick(NavigationButtonClickEvent event) {
				TestDataLoader.resetData();
			}
		});
		content.addComponent(initializeDataButton);

		setContent(content);
	}
}
