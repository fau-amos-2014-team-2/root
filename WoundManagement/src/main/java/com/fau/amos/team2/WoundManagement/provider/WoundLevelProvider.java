package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.Patient;
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
public class WoundLevelProvider<T extends BusinessObject> extends ObjectProvider<T> {

	private static WoundLevelProvider<WoundLevel> instance;
	
	public WoundLevelProvider(Class<T> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static WoundLevelProvider<? extends BusinessObject> getInstance() {
		if(instance == null) {
			instance = new WoundLevelProvider<WoundLevel>(WoundLevel.class);
		}
		return instance;
	}
}

