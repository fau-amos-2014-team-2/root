package com.fau.amos.team2.WoundManagement.provider;

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
