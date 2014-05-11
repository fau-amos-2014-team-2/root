package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.WoundType;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

/**
 * <code>WoundTypeProvider</code> manages the access to the
 * Database 'woundtypeprovider', which handles objects
 * of the type <code>WoundType</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.WoundType
 * @author Stefan, Betz
 * */
public class WoundTypeProvider {

	private static WoundTypeProvider instance;
	
	private JPAContainer<WoundType> woundTypes;
	
	/**
	 * Constructs an empty <code>JPAContainer<WoundType></code>
	 * and in this context an empty Database with the
	 * credentials of <code>Constants.PERSISTANCE_UNIT</code>
	 * 
	 * @see com.fau.amos.team2.WoundManagement.model.Constants
	 * @see persistence.xml
	 */
	private WoundTypeProvider() {
		woundTypes = JPAContainerFactory.make(WoundType.class, Constants.PERSISTANCE_UNIT);
	}
	
	/**
	 * @return The instance of <code>WoundType</code> 
	 * */
	public static WoundTypeProvider getInstance() {
		if(instance == null) {
			instance = new WoundTypeProvider();
		}
		return instance;
	}
	
	/**
	 * Adds an WoundType to the Database
	 * 
	 * @param WoundType
	 * @return the Id of the inserted WoundType
	 */
	public Object add(WoundType ward) {
		return woundTypes.addEntity(ward);
	}
	
	/**
	 * Get all WoundTypes from the Database
	 * 
	 * @return JPAContainer containing all WoundTypes
	 */
	public JPAContainer<WoundType> getAll() {
		return woundTypes;
	}
	/**
	 * Get the WoundType with id from the Database 
	 * 
	 * @param id - The unique id of an WoundType
	 * @return instance of the according WoundType, or null
	 */
	public WoundType getByID(Object id) { 
		return woundTypes.getItem(id).getEntity();
	}
	
}
