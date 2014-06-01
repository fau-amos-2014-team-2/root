package com.fau.amos.team2.WoundManagement.provider;

import java.util.Date;

/**
 * DateProvider for creating Date, which can be used with class 'java.sql.Date'
 * 
 * @author ???
 */
public class DateProvider {

	private Date date;
	
	public DateProvider() {
		date = new Date();
	}
	
	public int getYear() {
		int y = date.getYear();
		return y;
	}
	
	public int getMonth() {
		int m = date.getMonth();
		return m;
	}
	
	public int getDay() {
		int d = date.getDay();
		return d;
	}
}
