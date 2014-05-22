package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.fau.amos.team2.WoundManagement.model.Patient;

/**
 * <code>PatientProvider</code> manages the access to the
 * Database 'patient', which handles objects
 * of the type <code>Patient</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.Patient
 * @author Stefan, Betz
 * */
public class PatientProvider<T extends BusinessObject> extends ObjectProvider<T> {

	private static PatientProvider<Patient> instance;
	
	public PatientProvider(Class<T> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static PatientProvider<? extends BusinessObject> getInstance() {
		if(instance == null) {
			instance = new PatientProvider<Patient>(Patient.class);
		}
		return instance;
	}
}
