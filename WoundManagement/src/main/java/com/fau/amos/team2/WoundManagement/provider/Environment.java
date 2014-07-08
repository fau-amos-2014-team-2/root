package com.fau.amos.team2.WoundManagement.provider;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.vaadin.ui.UI;

public class Environment {
	
	private Employee currentEmployee = null;
	private Patient currentPatient = null;
	private boolean showCurrentWoundsOnly = true;
	private Wound currentWound = null;
	private WoundDescription currentWoundDescription = null;
	private Locale currentLocale = Locale.ENGLISH;
	private String currentUriFragment = "";
	
	private List<Locale> allowedLocales = Arrays.asList(Locale.ENGLISH, Locale.GERMAN);
	
	
	private static EmployeeProvider provider = EmployeeProvider.getInstance();

	boolean isHorizontalLayout;
	
	public Employee getCurrentEmployee() {
		return currentEmployee;
	}
	
	public Patient getCurrentPatient(){
		return currentPatient;
	}
	
	public void setCurrentPatient(Patient patient){
		currentPatient = patient;
	}
	
	public boolean getShowCurrentWoundsOnly(){
		return showCurrentWoundsOnly;
	}
	
	public void setShowCurrentWoundsOnly(boolean showCurrentWoundsOnly){
		this.showCurrentWoundsOnly = showCurrentWoundsOnly;
	}
	
	public Wound getCurrentWound(){
		return currentWound;
	}
	
	public void setCurrentWound(Wound wound){
		currentWound = wound;
	}
	
	public WoundDescription getCurrentWoundDescription(){
		return currentWoundDescription;
	}
	
	public void setCurrentWoundDescription(WoundDescription woundDescription){
		currentWoundDescription = woundDescription;
	}
	
	public Locale getCurrentLocale(){
		return currentLocale;
	}
	
	public void setCurrentLocale(Locale locale){
		if (locale != null){
			for (Locale l : allowedLocales){
				if (l.getLanguage().equals(locale.getLanguage())){
					currentLocale = locale;
				}
			}
		}
	}
	
	public String getCurrentUriFragment(){
		return currentUriFragment;
	}
	
	public void setCurrentUriFragment(String uriFragment){
		currentUriFragment = uriFragment;
	}
	
	public List<Locale> getAllowedLocales(){
		return allowedLocales;
	}
	
	public void loginEmployee(String user, String pass) {
		Employee employee = provider.getEmployeeByUsernameAndPassword(user, pass);
		currentEmployee = employee;
	}
	
	public void logout() {
		currentEmployee = null;
		currentPatient = null;
		currentWound = null;
		currentWoundDescription = null;
		showCurrentWoundsOnly = true;
		currentUriFragment = "login";
	}
	
	public float getWindowHeight(){
		return UI.getCurrent().getPage().getBrowserWindowHeight();
	}
	
	public float getWindowWidth(){
		return UI.getCurrent().getPage().getBrowserWindowWidth();
	}

	public void setOrientation() {
		float height = getWindowHeight();
		float width = getWindowWidth();
		
		if(height > width) {
			isHorizontalLayout = false;
		}else{
			isHorizontalLayout = true;
		}
	}

	public boolean isHorizontalLayout() {
		return isHorizontalLayout;
	}
}
