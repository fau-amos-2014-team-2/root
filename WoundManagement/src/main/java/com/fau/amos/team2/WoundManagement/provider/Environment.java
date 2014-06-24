package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.vaadin.ui.UI;

public class Environment {
	
	private Employee currentEmployee;
	private static EmployeeProvider provider = EmployeeProvider.getInstance();

	boolean isHorizontalLayout;
	
	public Employee getCurrentEmployee() {
		return currentEmployee;
	}
	
	public void loginEmployee(String user, String pass) {
		Employee employee = provider.getEmployeeByUsernameAndPassword(user, pass);
		currentEmployee = employee;
	}
	
	public void logout() {
		currentEmployee = null;
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
/**
// case: horizontal layout
if(getEnvironment().isHorizontalLayout()){
	
// case: vertical layout
}else{
	
}
*/