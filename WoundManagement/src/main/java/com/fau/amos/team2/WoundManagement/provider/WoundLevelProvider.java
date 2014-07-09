package com.fau.amos.team2.WoundManagement.provider;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fau.amos.team2.WoundManagement.model.WoundLevel;
import com.fau.amos.team2.WoundManagement.model.WoundType;

/**
 * <code>WoundLevelProvider</code> manages the access to the
 * Database 'woundlevel', which handles objects
 * of the type <code>WoundLevel</code>
 * 
 * */
public class WoundLevelProvider extends ObjectProvider<WoundLevel> {

	private static WoundLevelProvider instance;
	
	public WoundLevelProvider(Class<WoundLevel> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>WoundLevelProvider</code> 
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
	
	public List<WoundLevel> getAllFoWoundType(WoundType woundType){
		EntityManager em = container.getEntityProvider().getEntityManager();
		TypedQuery<WoundLevel> query = em.createNamedQuery("WoundLevel.allForWoundType", WoundLevel.class);
		query.setParameter("woundType", woundType);
		List<WoundLevel> resultList = query.getResultList();
		return resultList;
	}
}

