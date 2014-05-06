package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

/**
 * The UI's "main" class
 */
@SuppressWarnings("serial")
@Widgetset("com.fau.amos.team2.WoundManagement.gwt.AppWidgetSet")
@Theme("touchkit")
public class LoginUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		CreateTestUser();
		
		NavigationManager manager = new NavigationManager();
		manager.setCurrentComponent(new StartMenuView());
		setContent(manager);

		getPage().setTitle("Woundmanagement-App v0.3");
	}
	
	private static void CreateTestUser() {
		Employee testUser1 = new Employee();
		Employee testUser2 = new Employee();
		Employee testUser3 = new Employee();
		
		testUser1.setFirstName("Adam");
		testUser1.setLastName("Arbeit");
		testUser1.setAbbreviation("testuser1");
		testUser1.setQualificationNumber(1111);
		
		testUser2.setFirstName("Bernd");
		testUser2.setLastName("Bond");
		testUser2.setAbbreviation("testuser2");
		testUser2.setQualificationNumber(2222);
		
		testUser3.setFirstName("Christina");
		testUser3.setLastName("Charles");
		testUser3.setAbbreviation("testuser3");
		testUser3.setQualificationNumber(3333);
		
		EmployeeProvider.getInstance().add(testUser1);
		EmployeeProvider.getInstance().add(testUser2);
		EmployeeProvider.getInstance().add(testUser3);
	}
}
