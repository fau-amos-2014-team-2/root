package com.fau.amos.team2.WoundManagement.widgetset.client.createwounddescriptionview;

import com.fau.amos.team2.WoundManagement.widgetset.client.model.WoundDescription;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.RepeatingCommand;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.addon.touchkit.gwt.client.offlinemode.OfflineMode;
import com.vaadin.addon.touchkit.gwt.client.ui.VNavigationBar;
import com.vaadin.addon.touchkit.gwt.client.ui.VNavigationView;
import com.vaadin.client.ApplicationConnection;
import com.vaadin.client.ui.VCssLayout;
import com.vaadin.client.ui.VOverlay;

public class CreateWoundDescriptionViewWidget extends VOverlay implements
		OfflineMode, CreateWoundDescriptionViewModuleListener, RepeatingCommand {
	
	private CreateWoundDescriptionViewWidgetListener listener;
	private InformationLayout informationLayout;
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
		
		woundDescriptionUpdated(new WoundDescription(), false, true);
		Scheduler.get().scheduleFixedPeriod(this, 1000);
	}
	
	private Widget buildContentView() {
		VNavigationView contentView = new VNavigationView();
		contentView.setHeight("100%");
		contentView.setWidth("100%");
		VNavigationBar navigationBar = new VNavigationBar();
		navigationBar.setCaption("Wound Management App");
		navigationBar.setWidth("100%");
		
		contentView.setNavigationBar(navigationBar);
		
		FlowPanel panel = new FlowPanel();
		panel.setStyleName("v-csslayout-margin-left v-csslayout-margin-right");
		
		offlineOnlineIndicator = new VCssLayout();
		offlineOnlineIndicator.addStyleName("offlineindicator");
		
		VCssLayout indicatorWrapper = new VCssLayout();
		indicatorWrapper.setWidth("100%");
		
		onlineStatusLabel = new Label("Connection offline");
        indicatorWrapper.add(onlineStatusLabel);
        reconnectLabel = new Anchor("Reconnect", Window.Location.getHref());
        reconnectLabel.setVisible(false);
        indicatorWrapper.add(reconnectLabel);
        offlineOnlineIndicator.add(indicatorWrapper);
        panel.add(offlineOnlineIndicator);
        // informationLayout = new InformationLayout(this);
        // panel.add(buildSectionWrapper(informationLayout, "Information", "informationlayout"));
        // photoLayout = new PhotoLayout(this);
        // panel.add(buildSectionWrapper(photoLayout, "Photo", "photolayout"));
        // panel.add(buildNotesLayout());
        contentView.setContent(panel);
        return contentView;
	}
	
	private Widget buildSectionWrapper(final Widget content, final String captionString, final String styleName) {
		VCssLayout layout = new VCssLayout();
		layout.addStyleName(styleName);
		
		Label caption = new Label(captionString);
		caption.addStyleName("sectioncaption");
		layout.add(caption);
		
		layout.add(content);
		
		return layout;
	}

	@Override
	public boolean execute() {
		if (isActive() && isNetworkOnline()) {
			// offline -> online
			offlineOnlineIndicator.addStyleName("connection");
			reconnectLabel.setVisible(true);
			onlineStatusLabel.setText("Connection available");
		}
		else if (!isNetworkOnline()) {
			// online -> offline
			listener = null;
			refreshOnSave = true;
		}
		return true;
	}
	
	private static native boolean isNetworkOnline()
	/*-{
		return $wnd.navigator.onLine;
	}-*/;

	@Override
	public void fieldsChanged() {
		if (validateFields) {
			validateFields();
		}
		
		if (isNetworkOnline() && listener != null) {
			listener.updateState(getWoundDescription());
		}
	}
	
	private boolean validateFields() {
		resetValidations();
		
		boolean valid = true;
		if (!informationLayout.validateFields()) {
			valid = false;
		}
		return valid;
	}
	
	private void resetValidations() {
		informationLayout.resetValidations();
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
	
	public final void woundDescriptionUpdated(final WoundDescription woundDescription, final boolean skipStateChange, final boolean initialize) {
		final CreateWoundDescriptionViewWidgetListener listener = this.listener;
		this.listener = null;
		
		informationLayout.woundDescriptionUpdated(woundDescription);
		
		// TODO: Indicator and stuff…		
		
		this.listener = listener;
		
		if (!skipStateChange) {
			fieldsChanged();
		}
		
		// TODO: Set save button enabled true (?)
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
