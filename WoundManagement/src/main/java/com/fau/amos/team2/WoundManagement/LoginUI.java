package com.fau.amos.team2.WoundManagement;

import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

/**
 * The UI's "main" class
 */
@SuppressWarnings("serial")
@Widgetset("simonlogin.gwt.AppWidgetSet")
@Theme("touchkit")
public class LoginUI extends UI {

	@Override
	protected void init(VaadinRequest request) {

		NavigationManager manager = new NavigationManager();
		manager.setCurrentComponent(new LoginView());
		setContent(manager);

		getPage().setTitle("Login Example");
	}
}
