package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

/**
 * <code>WardProvider</code> manages the access to the
 * Database 'ward', which handles objects
 * of the type <code>Ward</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.Ward
 * @author Stefan, Betz
 * */
public class WardProvider<T extends BusinessObject> extends ObjectProvider<T> {

	private static WardProvider<Ward> instance;
	
	public WardProvider(Class<T> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static WardProvider<? extends BusinessObject> getInstance() {
		if(instance == null) {
			instance = new WardProvider<Ward>(Ward.class);
		}
		return instance;
	}
}
