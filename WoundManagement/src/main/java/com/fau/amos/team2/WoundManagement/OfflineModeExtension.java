package com.fau.amos.team2.WoundManagement;

import java.util.List;

import com.fau.amos.team2.WoundManagement.widgetset.client.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.widgetset.client.PersistOfflineWoundDescriptionsServerRpc;
import com.vaadin.addon.touchkit.extensions.OfflineMode;

public class OfflineModeExtension extends OfflineMode {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final PersistOfflineWoundDescriptionsServerRpc serverRpc = new PersistOfflineWoundDescriptionsServerRpc() {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void persistWoundDescriptions(List<WoundDescription> woundDescriptions) {
			// TODO Call other method like DataUtil.persistWoundDescription(woundDescriptions)
			System.out.println("persistWoundDescriptions");
		}
	};
	
	public OfflineModeExtension() {
		setOfflineModeTimeout(60);
		registerRpc(serverRpc);
	}
	
}
