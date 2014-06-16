package com.fau.amos.team2.WoundManagement.widgetset.client;

import java.util.ArrayList;
import java.util.List;

import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.google.gwt.storage.client.Storage;
import com.google.gwt.storage.client.StorageMap;
import com.vaadin.data.util.sqlcontainer.TicketTests;

public class OfflineDataService {
	
	private static final String LOCALSTORAGE_PREFIX = "WOUNDMANAGEMENT_";
	private static final String WOUNDDESCRIPTIONCOUNT_KEY = LOCALSTORAGE_PREFIX + "wounddescriptioncount";

	public static void localStoreWoundDescription(final WoundDescription woundDescription) {
		StorageMap s = new StorageMap(Storage.getLocalStorageIfSupported());
		String woundDescriptionCount = s.get(WOUNDDESCRIPTIONCOUNT_KEY);
		int id;
		
		if (woundDescriptionCount == null) {
			id = 0;
			woundDescriptionCount = "" + 1;
			s.put(WOUNDDESCRIPTIONCOUNT_KEY, woundDescriptionCount);
		}
		else {
			id = Integer.parseInt(woundDescriptionCount);
		}
		
		s.put(LOCALSTORAGE_PREFIX + id, woundDescription.serialize());
		id++;
		s.put(WOUNDDESCRIPTIONCOUNT_KEY, "" + id);
	}
	
	public static int getStoredWoundDescriptionCount() {
		int result = 0;
		StorageMap s = new StorageMap(Storage.getLocalStorageIfSupported());
		String woundDescriptionCount = s.get(WOUNDDESCRIPTIONCOUNT_KEY);
		
		if (woundDescriptionCount != null) {
			result = Integer.parseInt(woundDescriptionCount);
		}
		
		return result;
	}
	
	public static List<WoundDescription> getAndResetLocallyStoredWoundDescriptions() {
		ArrayList<WoundDescription> al = new ArrayList<WoundDescription>();
		StorageMap s = new StorageMap(Storage.getLocalStorageIfSupported());
		String woundDescriptionCount = s.get(WOUNDDESCRIPTIONCOUNT_KEY);
		
		if (woundDescriptionCount != null) {
			int c = Integer.parseInt(woundDescriptionCount);
			for (int i = 0; i < c; i++) {
				String key = LOCALSTORAGE_PREFIX + i;
				String json = s.get(key);
				WoundDescription fromJSON = WoundDescription.deserialize(json);
				al.add(fromJSON);
				s.remove(key);
			}
			
			s.remove(woundDescriptionCount);
		}
		
		s.put(WOUNDDESCRIPTIONCOUNT_KEY, "" + 0);
		return al;
	}	
}
