package com.fau.amos.team2.WoundManagement;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class AppSettings extends PreferenceActivity {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
	}
	
}
