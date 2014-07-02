package com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview;

import com.fau.amos.team2.WoundManagement.widgetset.client.model.WoundDescription;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.RepeatingCommand;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.addon.touchkit.gwt.client.offlinemode.OfflineMode;
import com.vaadin.addon.touchkit.gwt.client.ui.VNavigationBar;
import com.vaadin.addon.touchkit.gwt.client.ui.VNavigationView;
import com.vaadin.client.ApplicationConnection;
import com.vaadin.client.ui.VCssLayout;
import com.vaadin.client.ui.VImage;
import com.vaadin.client.ui.VNotification;
import com.vaadin.client.ui.VOverlay;
import com.vaadin.client.ui.VVerticalLayout;
import com.vaadin.shared.Position;

public class CreateWoundDescriptionViewWidget extends VOverlay implements
		OfflineMode, CreateWoundDescriptionViewModuleListener, RepeatingCommand {
	
	private CreateWoundDescriptionViewWidgetListener listener;
	private VCssLayout offlineOnlineIndicator;
	private Label onlineStatusLabel;
	private Anchor reconnectLabel;
		
	private boolean validateFields;
	private boolean refreshOnSave;
	private final Widget contentView;
	
	public CreateWoundDescriptionViewWidget() {
		addStyleName("v-window");
		addStyleName("v-touchkit-offlinemode");

		contentView = buildContentView();
		
		setWidget(contentView);
		
		show();
		
		getElement().getStyle().setWidth(100, Unit.PCT);
        getElement().getStyle().setHeight(100, Unit.PCT);
        getElement().getFirstChildElement().getStyle().setHeight(100, Unit.PCT);
		
		// woundDescriptionUpdated(new WoundDescription(), false, true);
		
		GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void onUncaughtException(Throwable e) {
				consoleLog(e.getMessage());
			}
		});
		
		Scheduler.get().scheduleFixedPeriod(this, 1000);
		
		// TODO: Remove old timer bullsh*t and the broken Vaadin stuff
		reconnect();
	}
	
	native void consoleLog(String message) /*-{
	    console.log( "me:" + message );
	}-*/;
	
	static native void reconnect() /*-{
		var callFunction = @com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview.CreateWoundDescriptionViewWidget::reconnect();
	
		$wnd.tryReconnect = function () {
			var xhr = new XMLHttpRequest();
	        xhr.onreadystatechange = function () {
	            if (xhr.readyState == 4 && xhr.status != 0) {
	                $wnd.location.reload();
	            }
	        };
	    
	        xhr.open("GET", $wnd.location, true);
	        xhr.timeout = 5000;
	        xhr.ontimeout = function() {
	        	console.log("reconnect: ontimeout");
	            $wnd.tryReconnect();
	        }
	        xhr.onerror = function() {
	        	console.log("reconnect: onerror");
	            $wnd.setTimeout(callFunction, 5000);
	        }
	        xhr.send();
		}
		$wnd.tryReconnect();
	}-*/;
	
	private Widget buildContentView() {
		VNavigationView contentView = new VNavigationView();
		contentView.setHeight("100%");
		contentView.setWidth("100%");
		VNavigationBar navigationBar = new VNavigationBar();
		navigationBar.setCaption("Wound Management App");
		navigationBar.setWidth("100%");
		
		contentView.setNavigationBar(navigationBar);
		
		VVerticalLayout panel = new VVerticalLayout();
		panel.setWidth("100%");
		panel.setStyleName("v-csslayout-margin-left v-csslayout-margin-right");
		
		offlineOnlineIndicator = new VCssLayout();
		offlineOnlineIndicator.addStyleName("offlineindicator");
		
		VCssLayout indicatorWrapper = new VCssLayout();
		indicatorWrapper.setWidth("100%");
		
		Resources resources = GWT.create(Resources.class);
		
		VImage image = new VImage();
		image.setAltText("Conection offline");
		image.setResource(resources.offline());
		
		panel.add(image);
		
		onlineStatusLabel = new Label("Connection offline");
        indicatorWrapper.add(onlineStatusLabel);
        reconnectLabel = new Anchor("Reconnect", Window.Location.getHref());
        reconnectLabel.setVisible(false);
        indicatorWrapper.add(reconnectLabel);
        offlineOnlineIndicator.add(indicatorWrapper);
        panel.add(offlineOnlineIndicator);
        
        contentView.setContent(panel);
        return contentView;
	}

	@Override
	public boolean execute() {
		/* if (isActive() && isNetworkOnline()) {
			// offline -> online
			offlineOnlineIndicator.addStyleName("connection");
			reconnectLabel.setVisible(true);
			Window.Location.reload();
			onlineStatusLabel.setText("Connection available");
		}
		else if (!isNetworkOnline()) {
			// online -> offline
			listener = null;
			refreshOnSave = true;
		} */
		
		return true;
	}
	
	private static native boolean isNetworkOnline()
	/*-{
		return $wnd.navigator.onLine;
	}-*/;

	@Override
	public void fieldsChanged() {	
		if (isNetworkOnline() && listener != null) {
			listener.updateState(getWoundDescription());
		}
	}
	
	private WoundDescription getWoundDescription() {
		WoundDescription woundDescription = new WoundDescription();
		// TODO: Set
		return woundDescription;
	}

	@Override
	public void activate(ActivationEvent event) { }

	@Override
	public boolean deactivate() {
		VNotification.createNotification(0, this).show("init", Position.MIDDLE_CENTER, "deActive");
		return false;
	}

	@Override
	public boolean isActive() {
		return offlineOnlineIndicator.isVisible();
	}
	
	public final void setCreateWoundDescriptionViewWidgetListener(final CreateWoundDescriptionViewWidgetListener listener) {
		this.listener = listener;
		setWidget(contentView);
		offlineOnlineIndicator.setVisible(false);
	}

	public interface CreateWoundDescriptionViewWidgetListener {
		void persistWoundDescription(WoundDescription woundDescription);
		
		void updateState(WoundDescription woundDescription);
	}
	
	@Override
    public Element getOverlayContainer() {
        ApplicationConnection ac = getApplicationConnection();
        if (ac == null) {
            // could not figure out which one we belong to, styling will
            // probably fail
            return RootPanel.get().getElement();
        } else {
            return getOverlayContainer(ac);
        }
    }
}
