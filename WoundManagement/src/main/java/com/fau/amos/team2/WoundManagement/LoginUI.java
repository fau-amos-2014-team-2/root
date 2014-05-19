package com.fau.amos.team2.WoundManagement;

/*
import javax.naming.Context;
import javax.naming.InitialContext;

import org.eclipse.persistence.config.SessionCustomizer;
import org.eclipse.persistence.sessions.DatabaseLogin;
import org.eclipse.persistence.sessions.JNDIConnector;
import org.eclipse.persistence.sessions.Session;
import org.eclipse.persistence.sessions.server.ServerSession;*/

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WardProvider;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundLevel;
import com.fau.amos.team2.WoundManagement.model.WoundType;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

/**
 * The UI's "main" class
 * 
 * @author ???
 */
@SuppressWarnings("serial")
@Widgetset("com.fau.amos.team2.WoundManagement.gwt.AppWidgetSet")
@Theme("touchkit")
public class LoginUI extends UI {

	private static EmployeeProvider<Employee> employeeProvider = 
			(EmployeeProvider<Employee>) EmployeeProvider.getInstance();
	private static PatientProvider<Patient> patientProvider = 
			(PatientProvider<Patient>) PatientProvider.getInstance();
	private static WoundProvider<Wound> woundProvider = 
			(WoundProvider<Wound>) WoundProvider.getInstance();
	private static WoundTypeProvider<WoundType> woundTypeProvider = 
			(WoundTypeProvider<WoundType>) WoundTypeProvider.getInstance();
	private static WoundLevelProvider<WoundLevel> woundLevelProvider = 
			(WoundLevelProvider<WoundLevel>) WoundLevelProvider.getInstance();
	
	// Provide to initialize objects just once; before the instance exists
	private static Employee testUser1 = new Employee();
	private static Employee testUser2 = new Employee();
	private static Employee testUser3 = new Employee();
	

	private static WoundType testWoundType1 = new WoundType();
	private static WoundLevel testWoundLevel1 = new WoundLevel();
	private static Patient testPatient1 = new Patient();
	private static Wound testWound1 = new Wound();
	
	private static boolean isInitialized = false;
	
	static void initData() {
		// curiosly breaks the connection
		//if(isInitialized)
		//	return;
		//isInitialized = true;
		Ward ward = new Ward();
		ward.setCharacterisation("blub");
		
		testUser1.setFirstName("Adam");
		testUser1.setLastName("Arbeit");
		testUser1.setAbbreviation("testuser1");
		testUser1.setQualificationNumber(1111);
		testUser1.setWorkingWard(ward);
		
		testUser2.setFirstName("Bernd");
		testUser2.setLastName("Bond");
		testUser2.setAbbreviation("testuser2");
		testUser2.setQualificationNumber(2222);
		
		testUser3.setFirstName("Christina");
		testUser3.setLastName("Charles");
		testUser3.setAbbreviation("testuser3");
		testUser3.setQualificationNumber(3333);
		
		employeeProvider.add(testUser1);
		employeeProvider.add(testUser2);
		employeeProvider.add(testUser3);
		
		testWoundType1.setBodyLocationRequired(false);
		testWoundType1.setClassification("Senso6 Dekubitus");
		testWoundType1.setLevel('p');
		testWoundType1.setType('d');
		testWoundType1.setSizeIsRequired(true);
		testWoundType1.setBodyLocationRequired(true);
		
		woundTypeProvider.add(testWoundType1);
		
		testWoundLevel1.setAbbreviation("1");
		testWoundLevel1.setCharacterisation("Grad 1 - Nicht wegdrückbare Rötung");
		testWoundLevel1.setDescription("Nicht wegdrückbare Rötung");
		testWoundLevel1.setLevel(1);
		testWoundLevel1.setWoundType(testWoundType1);
		
		woundLevelProvider.add(testWoundLevel1);
		
		testPatient1.setFirstName("Doerte");
		testPatient1.setLastName("Daeumler");
		testPatient1.setSensoID(1);
		testPatient1.setAccomodation('c');
		testPatient1.setBirthday(java.sql.Date.valueOf("1956-03-12"));
		testPatient1.setEntryDate(java.sql.Date.valueOf("2014-04-11"));
		testPatient1.setGender("f");
		testPatient1.setKeyword("keyword");
		testPatient1.setRoom("room");
		testPatient1.setTitle("Dr.");
		
		patientProvider.add(testPatient1);
		
		testWound1.setBodyLocation("Brustbein");
		testWound1.setBodyLocationCode(64);
		testWound1.setCureEmployee(testUser3);
		testWound1.setDecubitusId(10);
		testWound1.setDepth(3);
		testWound1.setDescription("Ich bin eine Bemerkung. Ich bin eine Bemerkung. Ich bin eine Bemerkung. Ich bin eine Bemerkung. Ich bin eine Bemerkung. Ich bin eine Bemerkung. Ich bin eine Bemerkung. ");
		testWound1.setEndDate(java.sql.Date.valueOf("2014-05-12"));
		testWound1.setOrigination(1);
		testWound1.setRecordingDate(java.sql.Date.valueOf("2014-04-12"));
		testWound1.setRecordingEmployee(testUser1);
		testWound1.setSize1(1);
		testWound1.setSize2(2);
		testWound1.setWoundType(testWoundType1);
		testWound1.setWoundLevel(testWoundLevel1);
		testWound1.setPatient(testPatient1);
		
		woundProvider.add(testWound1);

	}
	// END INIT //

		@Override
	protected void init(VaadinRequest request) {	
		initData();
		
		Locale currentLocale;
        ResourceBundle messages;

        currentLocale = Locale.GERMAN;
        //currentLocale = Locale.ENGLISH;

        messages = ResourceBundle.getBundle("bundles.MessagesBundle", currentLocale);

		NavigationManager manager = new NavigationManager();
		manager.setCurrentComponent(new StartMenuView(messages));
		setContent(manager);
		getPage().setTitle("Wound Management");
	}
}
