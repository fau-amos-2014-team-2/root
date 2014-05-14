package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.CoreDataWoundDescriptionMapping;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

/**
 * <code>CoreDataWoundDescriptionMappingProvider</code> manages the access to the
 * Database 'coredatawounddescriptionmapping', which handles the mapping of the objects
 * of the type <code>CoreDataWoundDescriptionMapping</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.CoreDataWoundDescriptionMapping
 * @author Stefan, Betz
 * */
public class CoreDataWoundDescriptionMappingProvider {

	private static CoreDataWoundDescriptionMappingProvider instance;
	
	private JPAContainer<CoreDataWoundDescriptionMapping> mappings;
	
	/**
	 * Constructs an empty <code>JPAContainer<CoreDataWoundDescriptionMapping></code>
	 * and in this context an empty Database with the
	 * credentials of <code>Constants.PERSISTANCE_UNIT</code>
	 * 
	 * @see com.fau.amos.team2.WoundManagement.model.Constants
	 * @see persistence.xml
	 */
	private CoreDataWoundDescriptionMappingProvider() {
		mappings = JPAContainerFactory.make(CoreDataWoundDescriptionMapping.class, Constants.PERSISTANCE_UNIT);
	}
	
	/**
	 * @return The instance of <code>CoreDataWoundDescriptionMappingProvider</code> 
	 * */
	public static CoreDataWoundDescriptionMappingProvider getInstance() {
		if(instance == null) {
			instance = new CoreDataWoundDescriptionMappingProvider();
		}
		return instance;
	}
	
	/**
	 * Adds an CoreDataWoundDescriptionMapping to the Database
	 * 
	 * @param CoreDataWoundDescriptionMapping
	 * @return the Id of the inserted CoreDataWoundDescriptionMapping
	 */
	public Object add(CoreDataWoundDescriptionMapping ward) {
		return mappings.addEntity(ward);
	}
	
	/**
	 * Get all CoreDataWoundDescriptionMapping from the Database
	 * 
	 * @return JPAContainer containing all CoreDataWoundDescriptionMapping
	 */
	public JPAContainer<CoreDataWoundDescriptionMapping> getAll() {
		return mappings;
	}
	/**
	 * Get the CoreDataWoundDescriptionMapping with id from the Database 
	 * 
	 * @param id - The unique id of an CoreDataWoundDescriptionMapping
	 * @return instance of the according CoreDataWoundDescriptionMapping, or null
	 */
	public CoreDataWoundDescriptionMapping getByID(Object id) { 
		return mappings.getItem(id).getEntity();
	}
	
}
