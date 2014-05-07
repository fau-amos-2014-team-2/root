package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

/**
 * <code>WardProvider</code> manages the access to the
 * Database 'ward', which handles objects
 * of the type <code>Ward</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.Ward
 * @author Stefan, Betz
 * */
public class WardProvider {

	private static WardProvider instance;
	
	private JPAContainer<Ward> wards;
	
	/**
	 * Constructs an empty <code>JPAContainer<Ward></code>
	 * and in this context an empty Database with the
	 * credentials of <code>Constants.PERSISTANCE_UNIT</code>
	 * 
	 * @see com.fau.amos.team2.WoundManagement.model.Constants
	 * @see persistence.xml
	 */
	private WardProvider() {
		wards = JPAContainerFactory.make(Ward.class, Constants.PERSISTANCE_UNIT);
	}
	
	/**
	 * @return The instance of <code>WardProvider</code> 
	 * */
	public static WardProvider getInstance() {
		if(instance == null) {
			instance = new WardProvider();
		}
		return instance;
	}
	
	/**
	 * Adds an Ward to the Database
	 * 
	 * @param Ward
	 * @return the Id of the inserted Ward
	 */
	public Object add(Ward ward) {
		return wards.addEntity(ward);
	}
	
	/**
	 * Get all Wards from the Database
	 * 
	 * @return JPAContainer containing all Wards
	 */
	public JPAContainer<Ward> getAll() {
		return wards;
	}
	/**
	 * Get the Ward with id from the Database 
	 * 
	 * @param id - The unique id of an Ward
	 * @return instance of the according Ward, or null
	 */
	public Ward getByID(Object id) { 
		return wards.getItem(id).getEntity();
	}
	
}
