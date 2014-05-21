package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.fau.amos.team2.WoundManagement.model.WoundType;

/**
 * <code>WoundTypeProvider</code> manages the access to the
 * Database 'woundtypeprovider', which handles objects
 * of the type <code>WoundType</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.WoundType
 * @author Stefan, Betz
 * */
public class WoundTypeProvider<T extends BusinessObject> extends ObjectProvider<T> {

	private static WoundTypeProvider<WoundType> instance;
	
	public WoundTypeProvider(Class<T> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static WoundTypeProvider<? extends BusinessObject> getInstance() {
		if(instance == null) {
			instance = new WoundTypeProvider<WoundType>(WoundType.class);
		}
		return instance;
	}
}