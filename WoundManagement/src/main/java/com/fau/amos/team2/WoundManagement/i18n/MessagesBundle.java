package com.fau.amos.team2.WoundManagement.i18n;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class MessagesBundle {
	private static final String BUNDLE_NAME = "com.fau.amos.team2.WoundManagement.i18n.MessagesBundle"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private MessagesBundle() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
