package com.fau.amos.team2.WoundManagement.widgetset.client.model;

import java.io.Serializable;

public class WoundDescription implements Serializable {
	
	private int sensoID;
	private boolean isBaggy;
	private String bagLocation;
	private String bagDirection;
	private int size1;
	private int size2;
	private int depth;
	private String description;
	
	//TODO: use Date class?
	private String year;
	private String month;
	private String day;
		
	private long wound;
	private long employee;
	private long woundLevel;
	private long woundType;

	public int getSensoID() {
		return sensoID;
	}

	public void setSensoID(int sensoID) {
		this.sensoID = sensoID;
	}

	public boolean isBaggy() {
		return isBaggy;
	}

	public void setBaggy(boolean isBaggy) {
		this.isBaggy = isBaggy;
	}

	public String getBagLocation() {
		return bagLocation;
	}

	public void setBagLocation(String bagLocation) {
		this.bagLocation = bagLocation;
	}

	public String getBagDirection() {
		return bagDirection;
	}

	public void setBagDirection(String bagDirection) {
		this.bagDirection = bagDirection;
	}

	public int getSize1() {
		return size1;
	}

	public void setSize1(int size1) {
		this.size1 = size1;
	}

	public int getSize2() {
		return size2;
	}

	public void setSize2(int size2) {
		this.size2 = size2;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	public long getWound() {
		return wound;
	}

	public void setWound(long wound) {
		this.wound = wound;
	}

	public long getEmployee() {
		return employee;
	}

	public void setEmployee(long employee) {
		this.employee = employee;
	}

	public long getWoundLevel() {
		return woundLevel;
	}

	public void setWoundLevel(long woundLevel) {
		this.woundLevel = woundLevel;
	}

	public long getWoundType() {
		return woundType;
	}

	public void setWoundType(long woundType) {
		this.woundType = woundType;
	}
	
	private static final String DELIMITER = "<wd-d>";
	
	public String serialize() {
		StringBuilder sb = new StringBuilder();
		sb.append(sensoID + DELIMITER);
		//sb.append(date.toString() + DELIMITER);
		sb.append(isBaggy + DELIMITER);
		sb.append(bagLocation + DELIMITER);
		sb.append(bagDirection + DELIMITER);
		sb.append(size1 + DELIMITER);
		sb.append(size2 + DELIMITER);
		sb.append(depth + DELIMITER);
		
		sb.append(year + DELIMITER);
		sb.append(month + DELIMITER);
		sb.append(day + DELIMITER);
		
		sb.append(description + DELIMITER);
		sb.append(wound + DELIMITER);
		sb.append(employee + DELIMITER);
		sb.append(woundLevel + DELIMITER);
		sb.append(woundType + DELIMITER);
		return sb.toString();
	}
	
	public static WoundDescription deserialize(final String str) {
		WoundDescription result = null;
		if (str != null) {
			result = new WoundDescription();
			String[] split = str.split(DELIMITER);
			result.setSensoID(Integer.parseInt(split[0]));
			result.setBaggy(Boolean.parseBoolean(split[1]));
			result.setBagLocation(split[2]);
			result.setBagDirection(split[3]);
			result.setSize1(Integer.parseInt(split[4]));
			result.setSize2(Integer.parseInt(split[5]));
			result.setDepth(Integer.parseInt(split[6]));
			result.setDescription(split[7]);
			
			result.setYear(split[8]);
			result.setMonth(split[9]);
			result.setDay(split[10]);
			
			result.setWound(Long.parseLong(split[11]));
			result.setEmployee(Long.parseLong(split[12]));
			result.setWoundLevel(Long.parseLong(split[13]));
			result.setWoundType(Long.parseLong(split[14]));
		}	
		return result;
	}
	
}
