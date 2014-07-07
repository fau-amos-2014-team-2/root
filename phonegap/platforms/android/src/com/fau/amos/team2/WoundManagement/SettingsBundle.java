package com.fau.amos.team2.WoundManagement;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;


public class SettingsBundle extends CordovaPlugin {

	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if(action.equals("getTargetUrl"))
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this.cordova.getActivity().getApplicationContext());

			String host = sp.getString("host", "localhost");

			String portString = sp.getString("port","80");
			int port = 80;
			try
			{
				port = Integer.valueOf(portString);
			}
			catch(NumberFormatException e)
			{
				Toast.makeText(this.cordova.getActivity().getApplicationContext(), R.string.port_error, Toast.LENGTH_SHORT).show();
			}
			
			String protocol = sp.getBoolean("ssl", false) ? "https" : "http";
			String path = "/" + sp.getString("path", "");

			String connectionString = protocol + "://" + host + ":" + port + path;
	    	//Toast.makeText(this.cordova.getActivity().getApplicationContext(),"Connecting to " + connectionString, Toast.LENGTH_LONG).show();
			callbackContext.success(connectionString);
			return true;
		}
		
		return false;
	}
	
}
