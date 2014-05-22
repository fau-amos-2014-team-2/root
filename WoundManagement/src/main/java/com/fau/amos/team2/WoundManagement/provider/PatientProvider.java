package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.Patient;

/**
 * <code>PatientProvider</code> manages the access to the
 * Database 'patient', which handles objects
 * of the type <code>Patient</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.Patient
 * @author Stefan, Betz
 * */
public class PatientProvider extends ObjectProvider<Patient> {

	private static PatientProvider instance;
	
	public PatientProvider() {
		super(Patient.class);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static PatientProvider getInstance() {
		if(instance == null) {
			instance = new PatientProvider();
		}
		return instance;
	}
}
