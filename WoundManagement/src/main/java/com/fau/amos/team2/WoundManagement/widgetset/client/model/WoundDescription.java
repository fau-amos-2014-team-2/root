package com.fau.amos.team2.WoundManagement.widgetset.client.model;

import java.io.Serializable;

public class WoundDescription implements Serializable {
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	private static final String DELIMITER = "<wd-d>";
	
	public String serialize() {
		StringBuilder sb = new StringBuilder();
		sb.append(description + DELIMITER);
		// TODO: Finish
		return sb.toString();
	}
	
	public static WoundDescription deserialize(final String str) {
		WoundDescription result = null;
		if (str != null) {
			result = new WoundDescription();
			String[] split = str.split(DELIMITER);
			result.setDescription(split[0]);
		}
		
		return result;
	}
	
}
