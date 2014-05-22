package com.fau.amos.team2.WoundManagement.resources;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageResources {
	private static ResourceBundle messages;
	private static Locale locale;
	
	private MessageResources() { }
	
	public static final String getString(String key) {
		return messages.getString(key);
	}
	
	public static final String[] getStringArray(String key) {
		return messages.getStringArray(key);
	}
	
	public static Locale getLocale() {
		return locale;
	}

	public static void setLocale(Locale locale) {
		MessageResources.locale = locale;
		reset();
	}

	private static void reset() {
		messages = ResourceBundle.getBundle("bundles.MessagesBundle", locale);
	}

}
