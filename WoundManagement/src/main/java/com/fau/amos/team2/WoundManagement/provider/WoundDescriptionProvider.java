package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

/**
 * <code>WoundDescriptionProvider</code> manages the access to the
 * Database 'wounddescription', which handles objects
 * of the type <code>WoundDescription</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.WoundDescription
 * @author Stefan, Betz
 * */
public class WoundDescriptionProvider {

	private static WoundDescriptionProvider instance;
	
	private JPAContainer<WoundDescription> woundDesc;
	
	/**
	 * Constructs an empty <code>JPAContainer<WoundDescription></code>
	 * and in this context an empty Database with the
	 * credentials of <code>Constants.PERSISTANCE_UNIT</code>
	 * 
	 * @see com.fau.amos.team2.WoundManagement.model.Constants
	 * @see persistence.xml
	 */
	private WoundDescriptionProvider() {
		woundDesc = JPAContainerFactory.make(WoundDescription.class, Constants.PERSISTANCE_UNIT);
	}
	
	/**
	 * @return The instance of <code>WoundDescriptionProvider</code> 
	 * */
	public static WoundDescriptionProvider getInstance() {
		if(instance == null) {
			instance = new WoundDescriptionProvider();
		}
		return instance;
	}
	
	/**
	 * Adds an WoundDescription to the Database
	 * 
	 * @param WoundDescription
	 * @return the Id of the inserted WoundDescription
	 */
	public Object add(WoundDescription woundDesc) {
		return this.woundDesc.addEntity(woundDesc);
	}
	
	/**
	 * Get all WoundDescription from the Database
	 * 
	 * @return JPAContainer containing all WoundDescription
	 */
	public JPAContainer<WoundDescription> getAll() {
		return woundDesc;
	}
	/**
	 * Get the WoundDescription with id from the Database 
	 * 
	 * @param id - The unique id of an WoundDescription
	 * @return instance of the according WoundDescription, or null
	 */
	public WoundDescription getByID(Object id) { 
		return woundDesc.getItem(id).getEntity();
	}
	
}
