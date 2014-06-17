package com.fau.amos.team2.WoundManagement.widgetset.client.provider;

import java.util.Collection;
import java.util.HashMap;

import com.fau.amos.team2.WoundManagement.widgetset.client.model.WoundLevel;

public class WoundLevelProvider {
	
	private static WoundLevelProvider instance;
	
	private HashMap<Long, String> woundLevels;
	
	public static WoundLevelProvider getInstance(){
		if (instance == null){
			instance = new WoundLevelProvider();
		}
		return instance;
	}
	
	public WoundLevelProvider(){
		woundLevels = new HashMap<Long, String>();
	}
	
	public void addWoundLevel(WoundLevel woundLevel){
		woundLevels.put(woundLevel.getId(), woundLevel.getClassification());
	}
	
	public void removeAll(){
		woundLevels = new HashMap<Long, String>();
	}
	
	public String getClassificationById(long id){
		return woundLevels.get(id);
	}
	
	public Collection<Long> getAllIds(){
		return woundLevels.keySet();
	}
	

}
