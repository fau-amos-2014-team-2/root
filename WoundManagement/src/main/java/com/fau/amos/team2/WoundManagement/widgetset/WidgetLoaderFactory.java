package com.fau.amos.team2.WoundManagement.widgetset;

import java.util.ArrayList;
import java.util.Collection;

import com.fau.amos.team2.WoundManagement.widgetset.client.WoundManagementOfflineConnector;
import com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview.CreateWoundDescriptionViewConnector;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.TypeOracle;
import com.vaadin.addon.touchkit.gwt.TouchKitBundleLoaderFactory;
import com.vaadin.shared.ui.Connect.LoadStyle;

public class WidgetLoaderFactory extends TouchKitBundleLoaderFactory {
	
	private final ArrayList<String> usedConnectors;
	
	public WidgetLoaderFactory() {
		usedConnectors = new ArrayList<String>();
		usedConnectors.add(WoundManagementOfflineConnector.class.getName());
		usedConnectors.add(CreateWoundDescriptionViewConnector.class.getName());
		// TODO: Finish this
	}
	
	@Override
	protected Collection<JClassType> getConnectorsForWidgetset(TreeLogger logger, TypeOracle typeOracle) throws UnableToCompleteException {
		Collection<JClassType> connectorsForWidgetset = super.getConnectorsForWidgetset(logger, typeOracle);
		ArrayList<JClassType> arrayList = new ArrayList<JClassType>();
		
		for (JClassType jClassType : connectorsForWidgetset) {
			String qualifiedSourceName = jClassType.getQualifiedSourceName();
			
			if (usedConnectors.contains(qualifiedSourceName)) {
				arrayList.add(jClassType);
			}
		}
		
		return arrayList;
	}
	
	@Override
	protected LoadStyle getLoadStyle(JClassType connectorType) {
		return LoadStyle.EAGER;
	}
}
