package com.fau.amos.team2.WoundManagement.provider;

import java.util.Locale;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.vaadin.Application;
import com.vaadin.service.ApplicationContext.TransactionListener;
import com.vaadin.shared.communication.PushMode;

public class ApplicationSettings implements TransactionListener {
	
	public static ThreadLocal<ApplicationSettings> instance =
			new ThreadLocal<ApplicationSettings>();
	
	private Application application;
	
	/*private*/static EmployeeProvider provider;
	/*private*/static Employee currentEmployee;
	private Locale language = Locale.GERMAN;
	
	public ApplicationSettings(Application application) {
		this.application = application;
		ApplicationSettings.provider = EmployeeProvider.getInstance();
		instance.set(this);
	}
	
	public static EmployeeProvider getEmployeeProvider(){
		instance.get();
		return ApplicationSettings.provider;
	}
	
	public static Employee getCurrentEmployee() {
		instance.get();
		return ApplicationSettings.currentEmployee;
	}
	
	public static void loginEmployee(String user, String pass) {
		currentEmployee = provider.getEmployeeByUsernameAndPassword(user, pass);
	}
	
	public static void logout() {
		currentEmployee = null;
	}
	
	public static Locale getLanguage() {
		return instance.get().language;
	}
	
	// TODO: change Local from WoundManagementSettings in UserBar
	public static void setLanguage(Locale language) {
		instance.get().language = language;
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
		ApplicationSettings appSettings = new ApplicationSettings(application);
		application.getContext().addTransactionListener(appSettings);
	}
	
}