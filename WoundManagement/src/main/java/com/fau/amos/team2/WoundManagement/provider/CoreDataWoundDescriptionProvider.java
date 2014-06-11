package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.CoreDataWoundDescription;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

/**
 * <code>CoreDataWoundDescriptionProvider</code> manages the access to the
 * Database 'coredatawounddescription', which handles objects
 * of the type <code>CoreDataWoundDescription</code>
 * 
 * */
public class CoreDataWoundDescriptionProvider {

	private static CoreDataWoundDescriptionProvider instance;
	
	private JPAContainer<CoreDataWoundDescription> cdWoundDescriptions;
	
	/**
	 * Constructs an empty <code>JPAContainer<CoreDataWoundDescription></code>
	 * and in this context an empty Database with the
	 * credentials of <code>Constants.PERSISTANCE_UNIT</code>
	 * 
	 * @see com.fau.amos.team2.WoundManagement.model.Constants
	 * @see persistence.xml
	 */
	private CoreDataWoundDescriptionProvider() {
		cdWoundDescriptions = JPAContainerFactory.make(CoreDataWoundDescription.class, Constants.PERSISTANCE_UNIT);
	}
	
	/**
	 * @return The instance of <code>CoreDataWoundDescriptionProvider</code> 
	 * */
	public static CoreDataWoundDescriptionProvider getInstance() {
		if(instance == null) {
			instance = new CoreDataWoundDescriptionProvider();
		}
		return instance;
	}
	
	/**
	 * Adds a CoreDataWoundDescription to the database
	 * 
	 * @param CoreDataWoundDescription
	 * @return the Id of the inserted CoreDataWoundDescription
	 */
	public Object add(CoreDataWoundDescription coreDataWoundDescription) {
		return cdWoundDescriptions.addEntity(coreDataWoundDescription);
	}
	
	/**
	 * Get all CoreDataWoundDescription from the database
	 * 
	 * @return JPAContainer containing all CoreDataWoundDescription
	 */
	public JPAContainer<CoreDataWoundDescription> getAll() {
		return cdWoundDescriptions;
	}
	/**
	 * Get the CoreDataWoundDescription with id from the database 
	 * 
	 * @param id - The unique id of a CoreDataWoundDescription
	 * @return instance of the according CoreDataWoundDescription, or null
	 */
	public CoreDataWoundDescription getByID(Object id) { 
		return cdWoundDescriptions.getItem(id).getEntity();
	}
	
}
