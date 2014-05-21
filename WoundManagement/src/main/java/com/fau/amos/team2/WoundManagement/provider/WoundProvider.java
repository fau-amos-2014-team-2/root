package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.fau.amos.team2.WoundManagement.model.Wound;

/**
 * <code>WoundProvider</code> manages the access to the
 * Database 'wound', which handles objects
 * of the type <code>Wound</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.Wound
 * @author Stefan, Betz
 * */
public class WoundProvider<T extends BusinessObject> extends ObjectProvider<T> {

	private static WoundProvider<Wound> instance;
	
	public WoundProvider(Class<T> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static WoundProvider<? extends BusinessObject> getInstance() {
		if(instance == null) {
			instance = new WoundProvider<Wound>(Wound.class);
		}
		return instance;
	}
}