package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.WoundManagementApplication;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.vaadin.Application;

import java.util.Locale;

import com.vaadin.service.ApplicationContext.TransactionListener;

@SuppressWarnings("serial")
public class Environment implements TransactionListener {
	
	//INSTANCE;
	
	public static ThreadLocal<Environment> instance =
			new ThreadLocal<Environment>();
	
	private static EmployeeProvider provider = EmployeeProvider.getInstance();
	private static Employee currentEmployee;
	
	private WoundManagementApplication application;
	
	WoundManagementApplication wouManApp = new WoundManagementApplication();
	
	private Environment() {
		//provider = EmployeeProvider.getInstance();
		
		application = new WoundManagementApplication();
		setProvider();
		setInstance(this);
	}

	public static void setInstance(Environment application) {
		instance.set(application);
	}
	
	public static void setProvider() {
		provider = EmployeeProvider.getInstance();
	}
	
	//@SuppressWarnings("static-access")
	public static Employee getCurrentEmployee() {
		//TODO//
		//currentEmployee = Environment.instance.get().getCurrentEmployee();
		return currentEmployee;
	}
	
	public static void loginEmployee(String user, String pass) {
		currentEmployee = provider.getEmployeeByUsernameAndPassword(user, pass);
		//currentEmployee = ApplicationSettings.instance.get().getEmployeeProvider().getEmployeeByUsernameAndPassword(user, pass);
	}
	
	public static void logout() {
		Environment.instance.get();
		//currentEmployee = null;
		//currentEmployee = ApplicationSettings.getCurrentEmployee();
		currentEmployee = Environment.getCurrentEmployee();
	}

	@Override
	public void transactionStart(Application application, Object transactionData) {
		if(this.application == application) {
			instance.set(this);
		}
	}

	@Override
	public void transactionEnd(Application application, Object transactionData) {
		if(this.application == application) {
			instance.set(null);
		}
	}
	
	public static void initialize(Application application) {
		if(application == null) {
			throw new IllegalArgumentException("Application may not be null");
		}
		Environment appSettings = new Environment();
		application.getContext().addTransactionListener(appSettings);
	}
}