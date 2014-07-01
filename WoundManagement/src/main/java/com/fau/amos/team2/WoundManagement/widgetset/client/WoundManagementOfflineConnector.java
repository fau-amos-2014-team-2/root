package com.fau.amos.team2.WoundManagement.widgetset.client;

import java.util.List;

import com.fau.amos.team2.WoundManagement.OfflineModeExtension;
import com.fau.amos.team2.WoundManagement.widgetset.client.model.WoundDescription;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.vaadin.addon.touchkit.gwt.client.vcom.OfflineModeConnector;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.shared.ui.Connect;

@Connect(OfflineModeExtension.class)
public class WoundManagementOfflineConnector extends OfflineModeConnector {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8715249937842142606L;
	private final PersistOfflineWoundDescriptionsServerRpc rpc = RpcProxy.create(PersistOfflineWoundDescriptionsServerRpc.class, this);
	
	@Override
	protected void init() {
		super.init();
		
		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
			
			@Override
			public void execute() {
				final int storedWoundDescriptions = OfflineDataService.getStoredWoundDescriptionCount();
				if (storedWoundDescriptions > 0) {
					List<WoundDescription> woundDescriptions = OfflineDataService.getAndResetLocallyStoredWoundDescriptions();
					rpc.persistWoundDescriptions(woundDescriptions);
				}
			}
		});
	}
	
}
