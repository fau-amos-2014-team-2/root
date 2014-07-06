package com.fau.amos.team2.WoundManagement;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;


public class SettingsBundle extends CordovaPlugin {

	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if(action.equals("getTargetUrl"))
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this.cordova.getActivity().getApplicationContext());

			String host = sp.getString("host", "atomserver.eu");
			int port = sp.getInt( "port",8080);
			String protocol = sp.getBoolean("ssl", false) ? "https" : "http";
			String path = "/" + sp.getString("path", "");
			
			
			//callbackContext.success("http://atomserver.eu:8080");
			callbackContext.success(protocol + "://" + host + ":" + port + path);
			return true;
		}
		
		return false;
	}
	
}
