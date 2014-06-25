package com.fau.amos.team2.WoundManagement.widgetset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.vaadin.addon.leaflet.client.LeafletCircleConnector;
import org.vaadin.addon.leaflet.client.LeafletLayersConnector;
import org.vaadin.addon.leaflet.client.LeafletMapConnector;
import org.vaadin.addon.leaflet.client.LeafletMarkerConnector;
import org.vaadin.addon.leaflet.client.LeafletTileLayerConnector;

import com.fau.amos.team2.WoundManagement.widgetset.client.WoundManagementOfflineConnector;
import com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview.CreateWoundDescriptionViewConnector;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.TypeOracle;
import com.vaadin.addon.responsive.client.ResponsiveConnector;
import com.vaadin.addon.touchkit.gwt.TouchKitBundleLoaderFactory;
import com.vaadin.addon.touchkit.gwt.client.vcom.DatePickerConnector;
import com.vaadin.addon.touchkit.gwt.client.vcom.GeolocatorConnector;
import com.vaadin.addon.touchkit.gwt.client.vcom.HorizontalButtonGroupConnector;
import com.vaadin.addon.touchkit.gwt.client.vcom.NumberFieldConnector;
import com.vaadin.addon.touchkit.gwt.client.vcom.SwitchConnector;
import com.vaadin.addon.touchkit.gwt.client.vcom.TabBarConnector;
import com.vaadin.addon.touchkit.gwt.client.vcom.VerticalComponentGroupConnector;
import com.vaadin.addon.touchkit.gwt.client.vcom.navigation.NavigationBarConnector;
import com.vaadin.addon.touchkit.gwt.client.vcom.navigation.NavigationButtonConnector;
import com.vaadin.addon.touchkit.gwt.client.vcom.navigation.NavigationManagerConnector;
import com.vaadin.addon.touchkit.gwt.client.vcom.navigation.NavigationViewConnector;
import com.vaadin.addon.touchkit.gwt.client.vcom.popover.PopoverConnector;
import com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector;
import com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector;
import com.vaadin.client.ui.button.ButtonConnector;
import com.vaadin.client.ui.checkbox.CheckBoxConnector;
import com.vaadin.client.ui.combobox.ComboBoxConnector;
import com.vaadin.client.ui.csslayout.CssLayoutConnector;
import com.vaadin.client.ui.embedded.EmbeddedConnector;
import com.vaadin.client.ui.formlayout.FormLayoutConnector;
import com.vaadin.client.ui.gridlayout.GridLayoutConnector;
import com.vaadin.client.ui.image.ImageConnector;
import com.vaadin.client.ui.label.LabelConnector;
import com.vaadin.client.ui.link.LinkConnector;
import com.vaadin.client.ui.nativeselect.NativeSelectConnector;
import com.vaadin.client.ui.optiongroup.OptionGroupConnector;
import com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector;
import com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector;
import com.vaadin.client.ui.panel.PanelConnector;
import com.vaadin.client.ui.passwordfield.PasswordFieldConnector;
import com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector;
import com.vaadin.client.ui.table.TableConnector;
import com.vaadin.client.ui.textarea.TextAreaConnector;
import com.vaadin.client.ui.textfield.TextFieldConnector;
import com.vaadin.client.ui.ui.UIConnector;
import com.vaadin.client.ui.upload.UploadConnector;
import com.vaadin.client.ui.window.WindowConnector;
import com.vaadin.shared.ui.Connect.LoadStyle;
import com.vaadin.shared.ui.datefield.DateFieldConstants;
import com.vaadin.ui.DateField;

public class WidgetLoaderFactory extends TouchKitBundleLoaderFactory {
	
	private final ArrayList<String> usedConnectors;
	
	public WidgetLoaderFactory() {
		usedConnectors = new ArrayList<String>(Arrays.asList(
				AbsoluteLayoutConnector.class.getName(),
		        ButtonConnector.class.getName(),
		        CheckBoxConnector.class.getName(),
		        ComboBoxConnector.class.getName(),
		        CreateWoundDescriptionViewConnector.class.getName(),
		        CssLayoutConnector.class.getName(),
		        DatePickerConnector.class.getName(),
		        FormLayoutConnector.class.getName(),
		        EmbeddedConnector.class.getName(),
		        GeolocatorConnector.class.getName(),
		        GridLayoutConnector.class.getName(),
		        HorizontalButtonGroupConnector.class.getName(),
		        HorizontalLayoutConnector.class.getName(),
				HorizontalSplitPanelConnector.class.getName(),
		        ImageConnector.class.getName(),
		        JavaScriptManagerConnector.class.getName(),
		        LabelConnector.class.getName(),
		        LeafletCircleConnector.class.getName(),
		        LeafletLayersConnector.class.getName(),
		        LeafletMapConnector.class.getName(),
		        LeafletMarkerConnector.class.getName(),
		        LeafletTileLayerConnector.class.getName(),
		        LinkConnector.class.getName(),
		        NativeSelectConnector.class.getName(),
		        NavigationBarConnector.class.getName(),
		        NavigationButtonConnector.class.getName(),
		        NavigationManagerConnector.class.getName(),
		        NavigationViewConnector.class.getName(),
		        NumberFieldConnector.class.getName(),
		        OptionGroupConnector.class.getName(),
		        PanelConnector.class.getName(),
		        PasswordFieldConnector.class.getName(),
		        PopoverConnector.class.getName(),
		        ResponsiveConnector.class.getName(),
		        SwitchConnector.class.getName(),
		        TabBarConnector.class.getName(),
		        TableConnector.class.getName(),
		        TextAreaConnector.class.getName(),
		        TextFieldConnector.class.getName(),
		        UIConnector.class.getName(),
		        UploadConnector.class.getName(),
		        VerticalComponentGroupConnector.class.getName(),
		        VerticalLayoutConnector.class.getName(),
		        WindowConnector.class.getName(),
		        WoundManagementOfflineConnector.class.getName()
				));
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
