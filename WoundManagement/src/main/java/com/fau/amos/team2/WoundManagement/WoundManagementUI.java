package com.fau.amos.team2.WoundManagement;

import java.util.Locale;

import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.CreateWoundDescriptionView;
import com.fau.amos.team2.WoundManagement.ui.PatientSelectionView;
import com.fau.amos.team2.WoundManagement.ui.PatientView;
import com.fau.amos.team2.WoundManagement.ui.ShowWoundDescriptionView;
import com.fau.amos.team2.WoundManagement.ui.ShowWoundPhotoView;
import com.fau.amos.team2.WoundManagement.ui.UserLoginView;
import com.fau.amos.team2.WoundManagement.ui.WoundDescriptionListView;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.Page.UriFragmentChangedEvent;
import com.vaadin.server.Page.UriFragmentChangedListener;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.WrappedSession;
import com.vaadin.ui.UI;

/**
 * The UI's "main" class
 * 
 */
@SuppressWarnings("serial")
@Widgetset("com.fau.amos.team2.WoundManagement.widgetset.WoundManagementWidgetset")
@Theme("wm-responsive")
@PreserveOnRefresh
public class WoundManagementUI extends UI {
	
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
		

		initializeEnvironment(request);
		
		getPage().setUriFragment("start");
		
		getPage().addUriFragmentChangedListener(
	               new UriFragmentChangedListener() {
	           public void uriFragmentChanged(
	                   UriFragmentChangedEvent source) {
	               enter(source.getUriFragment());
	            }
	        });

	        // Read the initial URI fragment
	        enter(getPage().getUriFragment());
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
	
	public void enter(String uriFragment){
		if (uriFragment != null){
			switch (uriFragment){
			case "start": 
				enableOfflineMode();
				setLocale();
				setImmediate(true);
				
//				NavigationManager manager = new NavigationManager();
//
//				if (getEnvironment().getCurrentEmployee() != null) {
//					manager.setCurrentComponent(new PatientSelectionView());
//				}
//				else {
//					manager.setCurrentComponent(new StartMenuView());
//				}
//				
//				setContent(manager);
				if (getEnvironment().getCurrentEmployee() != null){
					setContent(new PatientSelectionView());
				}
				else {
					setContent(new UserLoginView());
				}
				getPage().setTitle("Wound Management Session " + session.getId());
				break;
			case "login":
				if (getEnvironment().getCurrentEmployee() == null){
					setContent(new UserLoginView());
				} else {
					Page.getCurrent().setUriFragment("patientSelection");
				}
				break;
			case "patientSelection":
				if (getEnvironment().getCurrentEmployee() != null){
					setContent(new PatientSelectionView());
				} else {
					Page.getCurrent().setUriFragment("login");
				}
				break;
			case "patient":
				if (getEnvironment().getCurrentEmployee() != null){
					if (getEnvironment().getCurrentPatient() != null){
						setContent(new PatientView());
					}
				} else {
					Page.getCurrent().setUriFragment("login");
				}
				break;
			case "woundDescriptions":
				if (getEnvironment().getCurrentEmployee() != null){
					if (getEnvironment().getCurrentWound() != null){
						setContent(new WoundDescriptionListView());
					}
				} else {
					Page.getCurrent().setUriFragment("login");
				}
				break;
			case "createWoundDescription":
				if (getEnvironment().getCurrentEmployee() != null){
					if (getEnvironment().getCurrentWound() != null){
						setContent(new CreateWoundDescriptionView());
					}
				} else {
					Page.getCurrent().setUriFragment("login");
				}
				break;
			case "showWoundDescription":
				if (getEnvironment().getCurrentEmployee() != null){
					if (getEnvironment().getCurrentWoundDescription() != null){
						setContent(new ShowWoundDescriptionView());
					}
				} else {
					Page.getCurrent().setUriFragment("login");
				}
				break;
			case "showPhoto":
				if (getEnvironment().getCurrentEmployee() != null){
					if (getEnvironment().getCurrentWoundDescription() != null){
						setContent(new ShowWoundPhotoView());
					} else {

					}
				} else {
					Page.getCurrent().setUriFragment("login");
				}
				break;
			}

		}
		
	}
}
