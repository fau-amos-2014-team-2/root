package com.fau.amos.team2.WoundManagement.widgetset.client.provider;

import java.util.Collection;
import java.util.HashMap;

import com.fau.amos.team2.WoundManagement.widgetset.client.model.WoundType;

public class WoundTypeProvider {
	
	private static WoundTypeProvider instance;
	
	private HashMap<Long, String> woundTypes;
	
	public static WoundTypeProvider getInstance(){
		if (instance == null){
			instance = new WoundTypeProvider();
		}
		return instance;
	}
	
	public WoundTypeProvider(){
		woundTypes = new HashMap<Long, String>();
	}
	
	public void addWoundLevel(WoundType woundType){
		woundTypes.put(woundType.getId(), woundType.getClassification());
	}
	
	public void removeAll(){
		woundTypes = new HashMap<Long, String>();
	}
	
	public String getClassificationById(long id){
		return woundTypes.get(id);
	}
	
	public Collection<Long> getAllIds(){
		return woundTypes.keySet();
	}
	

}
