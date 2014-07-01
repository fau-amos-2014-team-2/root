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
import com.fau.amos.team2.WoundManagement.ui.PatientSelectionView;
import com.fau.amos.team2.WoundManagement.ui.StartMenuView;
/*import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;*/
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.WrappedSession;
import com.vaadin.ui.UI;

/**
 * The UI's "main" class
 * 
 */
@SuppressWarnings("serial")
@Widgetset("com.fau.amos.team2.WoundManagement.widgetset.WoundManagementWidgetset")
@Theme("touchkit")
@PreserveOnRefresh
public class WoundManagementUI extends UI /*implements EntryPoint*/ {
	
	private OfflineModeExtension offlineModeSettings;

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

		//...
		// Locale currentLocale = Locale.GERMAN;
		// currentLocale = Locale.ENGLISH;
		// MessageResources.setLocale(currentLocale);
		// legacy...

		// TODO: Check for second parameter "loadDescriptions"
				
		enableOfflineMode();
		setLocale();
		setImmediate(true);

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

	private void setLocale() {
		//Locale currentLocale = ApplicationSettings.instance.get().getLanguage();
		Locale currentLocale = Locale.GERMAN;
		//currentLocale = Locale.ENGLISH;

		MessageResources.setLocale(currentLocale);
	}
	
	public void goOffline() {
		// TODO: Check if needed
		offlineModeSettings.goOffline();
	}

	private void enableOfflineMode() {
		offlineModeSettings = new OfflineModeExtension();
		offlineModeSettings.extend(this);
		offlineModeSettings.setPersistentSessionCookie(true);
		offlineModeSettings.setOfflineModeEnabled(true);
	}

	
	/*public void onModuleLoad() {
		MyThemeBundle.INSTANCE.css().ensureInjected();
		
	}
	
    public interface MyThemeBundle extends ClientBundle {
        public static final MyThemeBundle INSTANCE = GWT.create(MyThemeBundle.class);

        @Source({ "myGWT.css" })
        public CssResource css();
    }*/
}
