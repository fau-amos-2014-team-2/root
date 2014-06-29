package com.fau.amos.team2.WoundManagement.ui;

import com.fau.amos.team2.WoundManagement.provider.TestDataLoader;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
//import com.vaadin.addon.responsive.Responsive;
import com.vaadin.annotations.Theme;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@Theme("wm-responsive")
public class StartMenuView extends SessionedNavigationView {
	private static final long serialVersionUID = -5310803657027928140L;

	@SuppressWarnings("serial")
	public StartMenuView() {

		setCaption(MessageResources.getString("mainMenu")); //$NON-NLS-1$

		final VerticalComponentGroup content = new VerticalComponentGroup();

		//NavigationButton loginScreenButton = new NavigationButton(MessageResources.getString("login")); //$NON-NLS-1$
		//loginScreenButton.setTargetView(new UserLoginView());
		Button loginScreenButton = new Button(MessageResources.getString("login"));
		loginScreenButton.addClickListener(new ClickListener(){

			@Override
			public void buttonClick(ClickEvent event) {
				Page.getCurrent().setUriFragment("login");
			}
			
		});
		content.addComponent(loginScreenButton);
		
		//NavigationButton initializeDataButton = new NavigationButton("For Software Developers only: initialize data");
		Button initializeDataButton = new Button("For Software Developers only: initialize data");
		initializeDataButton.addClickListener(new ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				TestDataLoader.resetData();				
			}
		});
		content.addComponent(initializeDataButton);
		
		// ...not necessary atm: 
		/* new Responsive(content); */
		
		setContent(content);

	}
}
