package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

/**
 * <code>WoundProvider</code> manages the access to the
 * Database 'wound', which handles objects
 * of the type <code>Wound</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.Wound
 * @author Stefan, Betz
 * */
public class WoundProvider {

	private static WoundProvider instance;
	
	private JPAContainer<Wound> wounds;
	
	/**
	 * Constructs an empty <code>JPAContainer<Wound></code>
	 * and in this context an empty Database with the
	 * credentials of <code>Constants.PERSISTANCE_UNIT</code>
	 * 
	 * @see com.fau.amos.team2.WoundManagement.model.Constants
	 * @see persistence.xml
	 */
	private WoundProvider() {
		wounds = JPAContainerFactory.make(Wound.class, Constants.PERSISTANCE_UNIT);
	}
	
	/**
	 * @return The instance of <code>WoundProvider</code> 
	 * */
	public static WoundProvider getInstance() {
		if(instance == null) {
			instance = new WoundProvider();
		}
		return instance;
	}
	
	/**
	 * Adds an Wound to the Database
	 * 
	 * @param Wound
	 * @return the Id of the inserted Wound
	 */
	public Object add(Wound wound) {
		return wounds.addEntity(wound);
	}
	
	/**
	 * Get all Wound from the Database
	 * 
	 * @return JPAContainer containing all Wounds
	 */
	public JPAContainer<Wound> getAll() {
		return wounds;
	}
	/**
	 * Get the Wound with id from the Database 
	 * 
	 * @param id - The unique id of an Wound
	 * @return instance of the according Wound, or null
	 */
	public Wound getByID(Object id) { 
		return wounds.getItem(id).getEntity();
	}
	
}
