package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.WoundLevel;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

/**
 * <code>WoundLevelProvider</code> manages the access to the
 * Database 'woundlevel', which handles objects
 * of the type <code>WoundLevel</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.WoundLevel
 * @author Stefan, Betz
 * */
public class WoundLevelProvider {

	private static WoundLevelProvider instance;
	
	private JPAContainer<WoundLevel> woundLvls;
	
	/**
	 * Constructs an empty <code>JPAContainer<WoundLevel></code>
	 * and in this context an empty Database with the
	 * credentials of <code>Constants.PERSISTANCE_UNIT</code>
	 * 
	 * @see com.fau.amos.team2.WoundManagement.model.Constants
	 * @see persistence.xml
	 */
	private WoundLevelProvider() {
		woundLvls = JPAContainerFactory.make(WoundLevel.class, Constants.PERSISTANCE_UNIT);
	}
	
	/**
	 * @return The instance of <code>WoundLevelProvider</code> 
	 * */
	public static WoundLevelProvider getInstance() {
		if(instance == null) {
			instance = new WoundLevelProvider();
		}
		return instance;
	}
	
	/**
	 * Adds an WoundLevel to the Database
	 * 
	 * @param WoundLevel
	 * @return the Id of the inserted WoundLevel
	 */
	public Object add(WoundLevel woundLvl) {
		return woundLvls.addEntity(woundLvl);
	}
	
	/**
	 * Get all WoundLevel from the Database
	 * 
	 * @return JPAContainer containing all WoundLevel
	 */
	public JPAContainer<WoundLevel> getAll() {
		return woundLvls;
	}
	/**
	 * Get the WoundLevel with id from the Database 
	 * 
	 * @param id - The unique id of an WoundLevel
	 * @return instance of the according WoundLevel, or null
	 */
	public WoundLevel getByID(Object id) { 
		return woundLvls.getItem(id).getEntity();
	}
	
}

