package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

/**
 * <code>PatientProvider</code> manages the access to the
 * Database 'patient', which handles objects
 * of the type <code>Patient</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.Patient
 * @author Stefan, Betz
 * */
public class PatientProvider {

	private static PatientProvider instance;
	
	private JPAContainer<Patient> patients;
	
	/**
	 * Constructs an empty <code>JPAContainer<Patient></code>
	 * and in this context an empty Database with the
	 * credentials of <code>Constants.PERSISTANCE_UNIT</code>
	 * 
	 * @see com.fau.amos.team2.WoundManagement.model.Constants
	 * @see persistence.xml
	 */
	private PatientProvider() {
		patients = JPAContainerFactory.make(Patient.class, Constants.PERSISTANCE_UNIT);
	}
	
	/**
	 * @return The instance of <code>PatientProvider</code> 
	 * */
	public static PatientProvider getInstance() {
		if(instance == null) {
			instance = new PatientProvider();
		}
		return instance;
	}
	
	/**
	 * Adds an Patient to the Database
	 * 
	 * @param Patient
	 * @return the Id of the inserted Patient
	 */
	public Object add(Patient patient) {
		return patients.addEntity(patient);
	}
	
	/**
	 * Get all Patients from the Database
	 * 
	 * @return JPAContainer containing all Patients
	 */
	public JPAContainer<Patient> getAll() {
		return patients;
	}
	/**
	 * Get the Patient with id from the Database 
	 * 
	 * @param id - The unique id of an Patient
	 * @return instance of the according Patient, or null
	 */
	public Patient getByID(Object id) { 
		return patients.getItem(id).getEntity();
	}
	
}
