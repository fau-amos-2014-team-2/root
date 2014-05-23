package com.fau.amos.team2.WoundManagement.provider;

import javax.persistence.EntityManager;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.fau.amos.team2.WoundManagement.model.WoundLevel;

/**
 * <code>WoundLevelProvider</code> manages the access to the
 * Database 'woundlevel', which handles objects
 * of the type <code>WoundLevel</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.WoundLevel
 * @author Stefan, Betz
 * */
public class WoundLevelProvider extends ObjectProvider<WoundLevel> {

	private static WoundLevelProvider instance;
	
	public WoundLevelProvider(Class<WoundLevel> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static WoundLevelProvider getInstance() {
		if(instance == null) {
			instance = new WoundLevelProvider(WoundLevel.class);
		}
		return instance;
	}
	
	public void deleteAll() {
		EntityManager em = container.getEntityProvider().getEntityManager();
		em.getTransaction().begin();
		em.createNamedQuery("WoundLevel.deleteAll").executeUpdate();
		em.getTransaction().commit();

	}
}

