package com.fau.amos.team2.WoundManagement.widgetset.client.model;

import java.io.Serializable;

public class WoundLevel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2509141291509859610L;
	private long id;
	private String classification;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	private static final String DELIMITER = "<wl-d>";
	
	public String serialize(){
		StringBuilder sb = new StringBuilder();
		sb.append(id + DELIMITER);
		sb.append(classification + DELIMITER);
		return sb.toString();
	}
	
	public static WoundLevel deserialize(String str){
		WoundLevel result = null;
		if (str != null){
			result = new WoundLevel();
			String[] split = str.split(DELIMITER);
			result.setId(Long.parseLong(split[0]));
			result.setClassification(split[1]);
		}
		return result;
	}

}
