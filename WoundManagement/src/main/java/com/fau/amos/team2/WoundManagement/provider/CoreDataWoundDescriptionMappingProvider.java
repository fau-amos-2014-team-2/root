package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.fau.amos.team2.WoundManagement.model.CoreDataWoundDescriptionMapping;

/**
 * <code>CoreDataWoundDescriptionMappingProvider</code> manages the access to the
 * Database 'coredatawounddescriptionmapping', which handles the mapping of the objects
 * of the type <code>CoreDataWoundDescriptionMapping</code>
 * 
 * */
public class CoreDataWoundDescriptionMappingProvider<T extends BusinessObject> extends ObjectProvider<T> {

	private static CoreDataWoundDescriptionMappingProvider
							<CoreDataWoundDescriptionMapping> instance;
	
	public CoreDataWoundDescriptionMappingProvider(Class<T> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>CoreDataWoundDescriptionMappingProvider</code> 
	 * */
	public static CoreDataWoundDescriptionMappingProvider
					<? extends BusinessObject> 
						getInstance() {
		if(instance == null) {
			instance = new CoreDataWoundDescriptionMappingProvider
					<CoreDataWoundDescriptionMapping>(CoreDataWoundDescriptionMapping.class);
		}
		return instance;
	}
}
	