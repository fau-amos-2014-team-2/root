package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.WoundDescription;

/**
 * <code>WoundDescriptionProvider</code> manages the access to the
 * Database 'wounddescription', which handles objects
 * of the type <code>WoundDescription</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.WoundDescription
 * @author Stefan, Betz
 * */
public class WoundDescriptionProvider extends ObjectProvider<WoundDescription>{

	private static WoundDescriptionProvider instance;
	
	public WoundDescriptionProvider(Class<WoundDescription> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static WoundDescriptionProvider getInstance() {
		if(instance == null) {
			instance = new WoundDescriptionProvider(WoundDescription.class);
		}
		return instance;
	}
}
