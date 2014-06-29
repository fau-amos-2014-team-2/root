package com.fau.amos.team2.WoundManagement.ui;

import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager;
import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager.SelectedWoundChangeEvent;
import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager.SelectedWoundChangeListener;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.ui.UserWardView.WardChangeListener;
import com.fau.amos.team2.WoundManagement.ui.subviews.ExistingWound;
import com.fau.amos.team2.WoundManagement.ui.subviews.NewWound;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserBar;
import com.vaadin.addon.responsive.Responsive;
import com.vaadin.addon.touchkit.ui.Switch;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.server.Page;
import com.vaadin.server.Page.BrowserWindowResizeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout.AlignmentHandler;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.GridLayout;

@PreserveOnRefresh
//@Theme("touchkit")
@Theme("wm-responsive")
public class PatientView extends SessionedNavigationView implements SelectedWoundChangeListener, WardChangeListener {
	private static final long serialVersionUID = -572027045788648039L;
	
	private Patient currentPatient;
	private WoundManager woundManager;
	
	private boolean showCurrentWoundsOnly;
	
	VerticalLayout woundContent = new VerticalLayout();
	//VerticalLayout rightContent2;
	
	public PatientView(Patient patient) {
		this(patient, true);
	}
	
	@SuppressWarnings("serial")
	public PatientView(Patient patient, boolean showCurrentWoundsOnly) {
		
		this.currentPatient = patient;
		this.showCurrentWoundsOnly = showCurrentWoundsOnly;
		
		setRightComponent(new UserBar(this));
		
		/*UserBar userBar = new UserBar(this);
		userBar.addStyleName("userBar");
		userBar.setWidth("100%");*/		
		
		final CssLayout contentLayout = new CssLayout();
		//contentLayout.addStyleName("grid");
		contentLayout.setSizeFull();
		
		setCaption(currentPatient.getFirstName() + " " + currentPatient.getLastName());

		final CheckBox showOnlyCurrentWoundsSwitch = new CheckBox(MessageResources.getString("showHealedWounds"));
		showOnlyCurrentWoundsSwitch.setValue(!getBoolShowCurrentWoundsOnly());
		showOnlyCurrentWoundsSwitch.addValueChangeListener(new ValueChangeListener() {
			@Override
			public void valueChange(ValueChangeEvent event) {
				setBoolShowCurrentWoundsOnly(!showOnlyCurrentWoundsSwitch.getValue());
				getNavigationManager().navigateTo(
					new PatientView(currentPatient, getBoolShowCurrentWoundsOnly()));
			}

		});
		showOnlyCurrentWoundsSwitch.setHeight("10%");
		showOnlyCurrentWoundsSwitch.setImmediate(true);
		
		createWoundManager();
		
		//Label spacing = new Label("");
		//spacing.addStyleName("spacingLabel");
		//final VerticalLayout switchAndPic = new VerticalLayout();
		// addComponents(...spacing...)
		//switchAndPic.addComponents(showOnlyCurrentWoundsSwitch,woundManager.getWoundSelector());
		//contentLayout.addComponent(switchAndPic);
		
		contentLayout.addComponent(showOnlyCurrentWoundsSwitch);
		contentLayout.addComponent(woundManager.getWoundSelector());
		contentLayout.addComponent(woundContent);
		
		setAlignment(showOnlyCurrentWoundsSwitch, woundManager, woundContent);

		
		Page.getCurrent().addBrowserWindowResizeListener(new Page.BrowserWindowResizeListener() {

			@Override
			public void browserWindowResized(BrowserWindowResizeEvent event) {

				setAlignment(showOnlyCurrentWoundsSwitch, woundManager, woundContent);
			}
		});
		
		new Responsive(contentLayout);
		setContent(contentLayout);
	}

	private void setAlignment(CheckBox showOnlyCurrentWoundsSwitch, WoundManager woundManager, VerticalLayout woundContent) {
		
		if(UI.getCurrent().getPage().getBrowserWindowWidth() 
				> UI.getCurrent().getPage().getBrowserWindowHeight()){
			
			showOnlyCurrentWoundsSwitch.addStyleName("checkboxHoriz");
			new Responsive(showOnlyCurrentWoundsSwitch);
			
			woundManager.getWoundSelector().addStyleName("wndMngHoriz");
			new Responsive(woundManager.getWoundSelector());
			
			woundContent.addStyleName("wndContHoriz");
			new Responsive(woundContent);
			
		}else{
			
			showOnlyCurrentWoundsSwitch.addStyleName("checkboxVert");
			new Responsive(showOnlyCurrentWoundsSwitch);
			
			woundManager.getWoundSelector().addStyleName("wndMngVert");
			new Responsive(woundManager.getWoundSelector());
			
			woundContent.addStyleName("wndContVert");
			new Responsive(woundContent);
			
		}
	}

	private void createWoundManager() {
		float heightFactor = (getEnvironment().getWindowHeight()-104)/513;
		float widthFactor = getEnvironment().getWindowWidth()/600;
		
		float scaleFactor = widthFactor < heightFactor ? widthFactor : heightFactor;

		if (scaleFactor < 1){
			woundManager = new WoundManager(currentPatient, getBoolShowCurrentWoundsOnly(), scaleFactor);
		} else {
			woundManager = new WoundManager(currentPatient, getBoolShowCurrentWoundsOnly(), 1);
		}
		
		woundManager.addSelectedWoundChangeListener(this);
	}

	@Override
	public void selectedWoundChanged(SelectedWoundChangeEvent event) {
		Wound selectedWound = event.getWound();
		woundContent.removeAllComponents();	
				
		if (selectedWound != null) {
			woundContent.addComponent(new ExistingWound(this, selectedWound));
		}
		else if (event.getWoundPosition() != null) {
			woundContent.addComponent(new NewWound(this, currentPatient, event.getWoundPosition().getBodyLocation()));
		}
	}
	
	@Override
	public void onBecomingVisible(){
		super.onBecomingVisible();
		this.setNavigationManagerPreviousComponent();
	}


	@Override
	public void wardChanged(WardChangeEvent event) {
		this.setNavigationManagerPreviousComponent();
	}
	
	public void setSelectedWound(Wound wound) {
		if (wound != null && wound.getPatient().getId() == currentPatient.getId()) {
			woundManager.addWound(wound);
			woundManager.setSelectedWound(wound);
		}
		else {
			woundManager.setSelectedWound(null);
		}
		this.setNavigationManagerPreviousComponent();
	}
	
	public void prepareSelectedWound(Wound wound) {
		if (wound != null && wound.getPatient().getId() == currentPatient.getId()) {
			woundManager.addWound(wound);
			woundManager.setSelectedWound(wound);
		}
		else {
			woundManager.setSelectedWound(null);
		}
	}
	
	public Patient getPatient(){
		return currentPatient;
	}
	
	public void setNavigationManagerPreviousComponent(){
		getNavigationManager().setPreviousComponent(new PatientSelectionView());
	}
	
	public boolean getBoolShowCurrentWoundsOnly() {
		return this.showCurrentWoundsOnly;
	}
	
	public void setBoolShowCurrentWoundsOnly(Boolean showCurrentWoundsOnly) {
		this.showCurrentWoundsOnly = showCurrentWoundsOnly;
	}

}
