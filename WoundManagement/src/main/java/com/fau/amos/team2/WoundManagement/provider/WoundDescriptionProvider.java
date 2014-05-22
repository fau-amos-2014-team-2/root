package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;

/**
 * <code>WoundDescriptionProvider</code> manages the access to the
 * Database 'wounddescription', which handles objects
 * of the type <code>WoundDescription</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.WoundDescription
 * @author Stefan, Betz
 * */
public class WoundDescriptionProvider<T extends BusinessObject> extends ObjectProvider<T> {

	private static WoundDescriptionProvider<WoundDescription> instance;
	
	public WoundDescriptionProvider(Class<T> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static WoundDescriptionProvider<? extends BusinessObject> getInstance() {
		if(instance == null) {
			instance = new WoundDescriptionProvider<WoundDescription>(WoundDescription.class);
		}
		return instance;
	}
}
