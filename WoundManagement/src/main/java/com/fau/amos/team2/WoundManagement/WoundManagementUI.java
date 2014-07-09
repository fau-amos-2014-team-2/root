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

		initializeEnvironment(request);
		
		getEnvironment().setCurrentUriFragment("login");
		getPage().setUriFragment(getEnvironment().getCurrentUriFragment());
		
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
		Locale currentLocale = Page.getCurrent().getWebBrowser().getLocale();
		System.out.println("Current locale browser: " + currentLocale.getLanguage());
		getEnvironment().setCurrentLocale(currentLocale);
		MessageResources.setLocale(getEnvironment().getCurrentLocale());
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
			case "login":
				enableOfflineMode();
				setLocale();
				setImmediate(true);
				if (getEnvironment().getCurrentEmployee() == null){
					setContent(new UserLoginView());
				} else {
					getEnvironment().setCurrentUriFragment("patientSelection");
					Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
				}
				getPage().setTitle("Wound Management Session " + session.getId());
				break;
			case "patientSelection":
				if (getEnvironment().getCurrentEmployee() != null){
					setContent(new PatientSelectionView());
				} else {
					getEnvironment().setCurrentUriFragment("login");
					Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
				}
				break;
			case "patient":
				if (getEnvironment().getCurrentEmployee() != null){
					if (getEnvironment().getCurrentPatient() != null){
						setContent(new PatientView());
					} else  {
						getEnvironment().setCurrentUriFragment("patient");
						Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
					}
				} else {
					getEnvironment().setCurrentUriFragment("login");
					Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
				}
				break;
			case "woundDescriptions":
				if (getEnvironment().getCurrentEmployee() != null){
					if (getEnvironment().getCurrentWound() != null){
						setContent(new WoundDescriptionListView());
					} else {
						if (getEnvironment().getCurrentPatient() != null){
							getEnvironment().setCurrentUriFragment("patient");
							Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
						} else {
							getEnvironment().setCurrentUriFragment("patientSelection");
							Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
						}
					}
				} else {
					getEnvironment().setCurrentUriFragment("login");
					Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
				}
				break;
			case "createWoundDescription":
				if (getEnvironment().getCurrentEmployee() != null){
					if (getEnvironment().getCurrentWound() != null){
						setContent(new CreateWoundDescriptionView());
					} else {
						if (getEnvironment().getCurrentPatient() != null){
							getEnvironment().setCurrentUriFragment("patient");
							Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
						} else {
							getEnvironment().setCurrentUriFragment("patientSelection");
							Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
						}
					}
				} else {
					getEnvironment().setCurrentUriFragment("login");
					Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
				}
				break;
			case "showWoundDescription":
				if (getEnvironment().getCurrentEmployee() != null){
					if (getEnvironment().getCurrentWoundDescription() != null){
						setContent(new ShowWoundDescriptionView());
					} else {
						if (getEnvironment().getCurrentWound() != null){
							getEnvironment().setCurrentUriFragment("woundDescriptions");
							Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
						} else {
							if (getEnvironment().getCurrentPatient() != null){
								getEnvironment().setCurrentUriFragment("patient");
								Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
							} else {
								getEnvironment().setCurrentUriFragment("patientSelection");
								Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
							}
						}
					}
				} else {
					getEnvironment().setCurrentUriFragment("login");
					Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
				}
				break;
			case "showPhoto":
				if (getEnvironment().getCurrentEmployee() != null){
					if (getEnvironment().getCurrentWoundDescription() != null){
						setContent(new ShowWoundPhotoView());
					} else {
						if (getEnvironment().getCurrentWound() != null){
							getEnvironment().setCurrentUriFragment("woundDescriptions");
							Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
						} else {
							if (getEnvironment().getCurrentPatient() != null){
								getEnvironment().setCurrentUriFragment("patient");
								Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
							} else {
								getEnvironment().setCurrentUriFragment("patientSelection");
								Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
							}
						}
					}
				} else {
					getEnvironment().setCurrentUriFragment("login");
					Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
				}
				break;
			}

		}
		
	}
}
