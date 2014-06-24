package com.fau.amos.team2.WoundManagement.provider;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fau.amos.team2.WoundManagement.model.Ward;

/**
 * <code>WardProvider</code> manages the access to the
 * Database 'ward', which handles objects
 * of the type <code>Ward</code>
 *
 * */
public class WardProvider extends ObjectProvider<Ward> {

	private static WardProvider instance;
	
	public WardProvider(Class<Ward> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>WardProvider</code> 
	 * */
	public static WardProvider getInstance() {
		if(instance == null) {
			instance = new WardProvider(Ward.class);
		}
		return instance;
	}
	
	public List<Ward> getAllItems() {
		EntityManager em = container.getEntityProvider().getEntityManager();
		
		TypedQuery<Ward> query = em.createNamedQuery("Ward.findAll", Ward.class);
		return query.getResultList();
	}
	
	public void deleteAll() {
		EntityManager em = container.getEntityProvider().getEntityManager();
		em.getTransaction().begin();
		em.createNamedQuery("Ward.deleteAll").executeUpdate();
		em.getTransaction().commit();
	}
}
