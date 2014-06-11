package com.fau.amos.team2.WoundManagement;

/*
import javax.naming.Context;
import javax.naming.InitialContext;

import org.eclipse.persistence.config.SessionCustomizer;
import org.eclipse.persistence.sessions.DatabaseLogin;
import org.eclipse.persistence.sessions.JNDIConnector;
import org.eclipse.persistence.sessions.Session;
import org.eclipse.persistence.sessions.server.ServerSession;*/

import java.util.Locale;

import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.WrappedSession;
import com.vaadin.ui.UI;

/**
 * The UI's "main" class
 * 
 * @author ???
 */
@SuppressWarnings("serial")
@Widgetset("com.fau.amos.team2.WoundManagement.gwt.AppWidgetSet")
@Theme("touchkit")
public class WoundManagementUI extends UI {
	
	private WrappedSession session;
	public WrappedSession getMySession() {
		return session;
	}
	
	public Environment getEnvironment() {
		return (Environment)session.getAttribute("e");
	}
	
	private void initializeEnvironment(VaadinRequest request) {
		session = request.getWrappedSession(true);
		
		if (session.getAttribute("e") == null) {
			session.setAttribute("e", new Environment());
			
			System.out.println("Created new environment for session " + session.getId());
		}
		else {
			System.out.println("Resumed existing environment for session " + session.getId());
		}
	}

	@Override
	protected void init(VaadinRequest request) {		
		//Locale currentLocale = ApplicationSettings.instance.get().getLanguage();
		Locale currentLocale = Locale.GERMAN;
		//currentLocale = Locale.ENGLISH;

		MessageResources.setLocale(currentLocale);

		initializeEnvironment(request);
		
		NavigationManager manager = new NavigationManager();

		if (getEnvironment().getCurrentEmployee() != null) {
			manager.setCurrentComponent(new PatientSelectionView());
		}
		else {
			manager.setCurrentComponent(new StartMenuView());
		}
		
		setContent(manager);
		getPage().setTitle("Wound Management Session " + session.getId());
	}
}
