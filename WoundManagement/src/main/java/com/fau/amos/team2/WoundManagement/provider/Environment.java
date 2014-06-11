package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.WoundManagementUI;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.vaadin.Application;

import java.io.FileNotFoundException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vaadin.service.ApplicationContext.TransactionListener;
import com.vaadin.terminal.gwt.server.HttpServletRequestListener;

@SuppressWarnings("serial")
public class Environment {
	
	private Employee currentEmployee;
	private static EmployeeProvider provider = EmployeeProvider.getInstance();
	
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
}