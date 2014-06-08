package com.fau.amos.team2.WoundManagement;

//import com.fau.amos.team2.WoundManagement.provider.ApplicationSettings;
import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.vaadin.Application;

@SuppressWarnings("serial")
public class WoundManagementApplication extends Application {

	@Override
	public void init() {
		//ApplicationSettings.initialize(this);
		Environment.initialize(this);
	}
}
