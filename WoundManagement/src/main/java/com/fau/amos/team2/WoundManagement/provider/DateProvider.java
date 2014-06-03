package com.fau.amos.team2.WoundManagement.provider;

import java.util.Date;

/**
 * DateProvider for creating Date using java.util.Date for creating new Date().
 * Based on default settings, sets date to current.
 * Use to extract parameters for initializing java.sql.Date(year, month, day).
 */
public class DateProvider {

	private Date date;
	
	public DateProvider() {
		date = new Date();
	}
	
	@SuppressWarnings("deprecation")
	public int getYear() {
		int y = date.getYear();
		return y;
	}
	
	@SuppressWarnings("deprecation")
	public int getMonth() {
		int m = date.getMonth();
		return m;
	}
	
	@SuppressWarnings("deprecation")
	public int getDay() {
		int d = date.getDay();
		return d;
	}
}
