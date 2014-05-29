package com.fau.amos.team2.WoundManagement.provider;

import javax.persistence.EntityManager;

import com.fau.amos.team2.WoundManagement.model.WoundType;

/**
 * <code>WoundTypeProvider</code> manages the access to the
 * Database 'woundtypeprovider', which handles objects
 * of the type <code>WoundType</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.WoundType
 * @author Stefan, Betz
 * */
public class WoundTypeProvider extends ObjectProvider<WoundType> {

	private static WoundTypeProvider instance;
	
	public WoundTypeProvider(Class<WoundType> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static WoundTypeProvider getInstance() {
		if(instance == null) {
			instance = new WoundTypeProvider(WoundType.class);
		}
		return instance;
	}
	
	public void deleteAll() {
		EntityManager em = container.getEntityProvider().getEntityManager();
		em.getTransaction().begin();
		em.createNamedQuery("WoundType.deleteAll").executeUpdate();
		em.getTransaction().commit();
	}
}