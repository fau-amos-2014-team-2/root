package com.fau.amos.team2.WoundManagement.provider;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Ward;

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
	
	public List<Patient> getAllItems() {
		EntityManager em = container.getEntityProvider().getEntityManager();
		TypedQuery<Patient> query = em.createNamedQuery("Patient.findAll", Patient.class);
		return query.getResultList();
	}
	
	public void deleteAll() {
		EntityManager em = container.getEntityProvider().getEntityManager();
		em.getTransaction().begin();
		em.createNamedQuery("Patient.deleteAll").executeUpdate();
		em.getTransaction().commit();
	}
	
	public List<Patient> getPatientsOfWard(Ward ward){
		List<Patient> patientsOfWard = new ArrayList<Patient>();
		if (ward != null){
			List<Patient> allPatients = this.getAllItems();
			for (Patient p : allPatients){
				if (p.getWard() != null){
					if ((ward.getId()) == (p.getWard().getId())){
						patientsOfWard.add(p);
					}	
				}
			}
		}
		return patientsOfWard;
	}
}
