package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.Employee;

public enum Environment {
	INSTANCE;
	
	private EmployeeProvider provider;
	private Employee currentEmployee;
	
	private Environment() {
		provider = EmployeeProvider.getInstance();
	}
	
	public Employee getCurrentEmployee() {
		return currentEmployee;
	}
	
	public void loginEmployee(String user, String pass) {
		currentEmployee = provider.getEmployeeByUsernameAndPassword(user, pass);
	}
	
	public void logout() {
		currentEmployee = null;
	}

}