package com.fau.amos.team2.WoundManagement.provider;

import java.sql.Date;
import java.util.Iterator;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Sex;
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.model.WoundLevel;
import com.fau.amos.team2.WoundManagement.model.WoundType;

public class TestDataLoader {
	private static EmployeeProvider employeeProvider = 
			EmployeeProvider.getInstance();
	private static PatientProvider patientProvider = 
			PatientProvider.getInstance();
	private static WoundProvider woundProvider = 
			WoundProvider.getInstance();
	private static WoundTypeProvider woundTypeProvider = 
			WoundTypeProvider.getInstance();
	private static WoundLevelProvider woundLevelProvider = 
			WoundLevelProvider.getInstance();
	private static WardProvider wardProvider = 
			WardProvider.getInstance();
	private static WoundDescriptionProvider woundDescriptionProvider = 
			WoundDescriptionProvider.getInstance();

	private static WoundType testWoundType1 = new WoundType();
	private static WoundLevel testWoundLevel1 = new WoundLevel();
	private static Wound testWound1 = new Wound();
	private static Wound testWound2 = new Wound();

	public static void resetData() {

		//empty tables
		woundDescriptionProvider.deleteAll();
		woundProvider.deleteAll();
		woundLevelProvider.deleteAll();
		woundTypeProvider.deleteAll();
		employeeProvider.deleteAll();
		patientProvider.deleteAll();
		wardProvider.deleteAll();

		for (int i = 0; i < 3; i++) {
			Ward ward = new Ward();
			ward.setCharacterisation("Station " + (i+1));
			wardProvider.add(ward);

			Employee testUser = new Employee();
			testUser.setWorkingWard(ward);
			testUser.setCurrentWard(ward);

			switch (i) {
			case 0:
				testUser.setFirstName("Adam");
				testUser.setLastName("Arbeit");
				testUser.setAbbreviation("testuser1");
				testUser.setPdaCode("1111");
				break;

			case 1:
				testUser.setFirstName("Bernd");
				testUser.setLastName("Bond");
				testUser.setAbbreviation("testuser2");
				testUser.setPdaCode("2222");
				testUser.setWorkingWard(ward);
				break;

			case 2:
				testUser.setFirstName("Christina");
				testUser.setLastName("Charles");
				testUser.setAbbreviation("testuser3");
				testUser.setPdaCode("3333");
				break;
			}

			employeeProvider.add(testUser);

			Patient testPatient = new Patient();
			testPatient.setSensoID(1);
			testPatient.setAccomodation('c');
			testPatient.setKeyword("keyword");

			switch (i) {
			case 0:
				testPatient.setFirstName("Doerte");
				testPatient.setLastName("Daeumler");
				testPatient.setBirthday(java.sql.Date.valueOf("1956-03-12"));
				testPatient.setEntryDate(java.sql.Date.valueOf("2014-04-11"));
				testPatient.setGender(Sex.FEMALE.toCharString());
				testPatient.setTitle("Dr.");
				testPatient.setWard(ward);
				testPatient.setRoom("A1.11");
				break;

			case 1:
				testPatient.setFirstName("Egon");
				testPatient.setLastName("Erhardt");
				testPatient.setBirthday(java.sql.Date.valueOf("1957-04-13"));
				testPatient.setEntryDate(java.sql.Date.valueOf("2014-04-12"));
				testPatient.setGender(Sex.MALE.toCharString());
				testPatient.setTitle("Prof.");
				testPatient.setWard(ward);
				testPatient.setRoom("B2.22");
				break;

			case 2:
				testPatient.setFirstName("Fritz");
				testPatient.setLastName("Fischer");
				testPatient.setBirthday(java.sql.Date.valueOf("1958-05-14"));
				testPatient.setEntryDate(java.sql.Date.valueOf("2014-04-13"));
				testPatient.setGender(Sex.NEUTER.toCharString());
				testPatient.setWard(ward);
				testPatient.setRoom("C3.33");
				break;
			}

			patientProvider.add(testPatient);
		}

		Employee firstEmployee = employeeProvider.getAllItems().iterator().next();

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

		Iterator<Patient> iterator = patientProvider.getAllItems().iterator();
		Patient firstPatient = iterator.next();
		Patient secondPatient = iterator.next();

		testWound1.setBodyLocation("Brustbein");
		testWound1.setBodyLocationCode(64);
		testWound1.setCureEmployee(firstEmployee);
		testWound1.setDepth(3);
		testWound1.setDescription("Ich bin eine Bemerkung. Ich bin eine Bemerkung. Ich bin eine Bemerkung. Ich bin eine Bemerkung. Ich bin eine Bemerkung. Ich bin eine Bemerkung. Ich bin eine Bemerkung. ");
		testWound1.setEndDate(java.sql.Date.valueOf("2014-05-12"));
		testWound1.setOrigination(1);
		testWound1.setRecordingDate(java.sql.Date.valueOf("2014-04-12"));
		testWound1.setRecordingEmployee(firstEmployee);
		testWound1.setSize1(1);
		testWound1.setSize2(2);
		testWound1.setWoundType(testWoundType1);
		testWound1.setWoundLevel(testWoundLevel1);
		testWound1.setPatient(firstPatient);

		woundProvider.add(testWound1);

		testWound2.setBodyLocation("linke Wade");
		testWound2.setBodyLocationCode(15);
		//testWound2.setCureEmployee(firstEmployee);
		testWound2.setDepth(4);
		testWound2.setDescription("Ich bin eine Bemerkung.");
		//testWound2.setEndDate(java.sql.Date.valueOf("2014-05-22"));
		testWound2.setOrigination(2);
		testWound2.setRecordingDate(java.sql.Date.valueOf("2014-04-22"));
		testWound2.setRecordingEmployee(firstEmployee);
		testWound2.setSize1(2);
		testWound2.setSize2(3);
		testWound2.setWoundType(testWoundType1);
		testWound2.setWoundLevel(testWoundLevel1);
		testWound2.setPatient(secondPatient);

		woundProvider.add(testWound2);

		for (int i = 0; i < 4; i++){
			WoundDescription woundDescription = new WoundDescription();
			woundDescription.setEmployee(firstEmployee);
			woundDescription.setWoundType(testWoundType1);
			woundDescription.setWoundLevel(testWoundLevel1);

			switch(i){
			case 0: 
				woundDescription.setDate(Date.valueOf("2012-01-11"));
				woundDescription.setWound(testWound1);
				woundDescription.setSize1(1);
				woundDescription.setSize2(2);
				woundDescription.setDepth(3);
				break;
			case 1:
				woundDescription.setDate(Date.valueOf("2012-02-12"));
				woundDescription.setWound(testWound1);
				woundDescription.setSize1(4);
				woundDescription.setSize2(5);
				woundDescription.setDepth(6);
				break;
			case 2:
				woundDescription.setDate(Date.valueOf("2012-03-13"));
				woundDescription.setWound(testWound2);
				woundDescription.setSize1(7);
				woundDescription.setSize2(8);
				woundDescription.setDepth(9);
				break;
			case 3:
				woundDescription.setDate(Date.valueOf("2012-04-14"));
				woundDescription.setWound(testWound2);
				woundDescription.setSize1(1);
				woundDescription.setSize2(2);
				woundDescription.setDepth(3);
				break;
			}

			woundDescriptionProvider.add(woundDescription);
		}
	}
}
