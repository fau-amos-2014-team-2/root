package com.fau.amos.team2.WoundManagement.provider;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;

/**
 * <code>WoundProvider</code> manages the access to the
 * Database 'wound', which handles objects
 * of the type <code>Wound</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.Wound
 * @author Stefan, Betz
 * */
public class WoundProvider extends ObjectProvider<Wound> {

	private static WoundProvider instance;
	
	public WoundProvider(Class<Wound> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static WoundProvider getInstance() {
		if(instance == null) {
			instance = new WoundProvider(Wound.class);
		}
		return instance;
	}
	
	public void deleteAll() {
		EntityManager em = container.getEntityProvider().getEntityManager();
		em.getTransaction().begin();
		em.createNamedQuery("Wound.deleteAll").executeUpdate();
		em.getTransaction().commit();
	}
	
	public void add(Wound object) {
		EntityManager em = container.getEntityProvider().getEntityManager();
		TypedQuery<Integer> decubitusQuery = em.createNamedQuery("Wound.getMaxDecubitusId", Integer.class);
		List<Integer> resultList = decubitusQuery.getResultList();
		
		int decubitusId = 0;
		if (resultList != null && !resultList.isEmpty()) {
			decubitusId = resultList.get(0) != null ? resultList.get(0) : 0;
		}
		
		decubitusId++;
		
		object.setDecubitusId(decubitusId);
		
		super.add(object);
	}
	
	public List<Wound> getAllForPatient(Patient patient) {
		EntityManager em = container.getEntityProvider().getEntityManager();
		TypedQuery<Wound> query = em.createNamedQuery("Wound.allForPatient", Wound.class);
		query.setParameter("patient", patient);
		List<Wound> resultList = query.getResultList();
		return resultList;
	}
}