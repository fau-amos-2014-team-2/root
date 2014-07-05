package com.fau.amos.team2.WoundManagement.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserBar;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

@Theme("wm-responsive")
@PreserveOnRefresh
@SuppressWarnings("serial")
public class ShowWoundDescriptionView extends SessionedNavigationView {

	private WoundDescription woundDescription;
	
	private final Button showWoundPhoto;
	
	public ShowWoundDescriptionView() {

		setRightComponent(new UserBar(this));
		this.woundDescription = getEnvironment().getCurrentWoundDescription();

		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		setCaption(MessageResources.getString("showWoundDescView"));
		Wound wound = this.woundDescription.getWound();
		if (wound != null){
			Patient patient = wound.getPatient();
			if (patient != null){
				setCaption(patient.getFirstName() + " " + patient.getLastName());
			}
		}

		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();
		mainLayout.setSizeFull();

		showWoundPhoto = new Button(MessageResources.getString("showpicture"));
		showWoundPhoto.addClickListener(new ClickListener(){

			@Override
			public void buttonClick(ClickEvent event) {
				getEnvironment().setCurrentUriFragment("showPhoto");
				Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
			}
			
		});
		mainLayout.addComponent(showWoundPhoto);
		
		HorizontalLayout greetingandDate =new HorizontalLayout();
		
		
		Label greeting = new Label();
		greeting.setCaption(MessageResources.getString("author")+": " + this.woundDescription.getEmployee().getLastName() + ", " + woundDescription.getEmployee().getFirstName());
		
		Label date= new Label();
		date.setCaption(dateFormat.format(this.woundDescription.getDate()));
		
		greetingandDate.addComponents(greeting, date);
		greetingandDate.setSpacing(true);
		
		mainLayout.addComponent(greetingandDate);

		HorizontalLayout groesen = new HorizontalLayout();
		if (this.woundDescription.getSize2() ==0){
			//getSize2 equal to zero means that size 1 has to be interpreted as diameter
			Label diameter=new Label();
			diameter.setCaption(MessageResources.getString("diameter")+":");
			diameter.setValue(""+this.woundDescription.getSize1());
			
			
			Label depth=new Label();
			depth.setCaption(MessageResources.getString("depth")+":");
			depth.setValue(""+ this.woundDescription.getDepth());
			
			groesen.addComponents(diameter, depth);
		} else {
			//getsize2 not equal to zero means both sizes are relevant
			Label length = new Label();
			length.setCaption(MessageResources.getString("height")+":");
			length.setValue(""+this.woundDescription.getSize1());
			
			Label width = new Label();
			width.setCaption(MessageResources.getString("width")+":");
			width.setValue(""+this.woundDescription.getSize2());
			
			Label depth = new Label();
			depth.setCaption(MessageResources.getString("depth")+":");
			depth.setValue(""+this.woundDescription.getDepth());
			
			groesen.addComponents(length, width, depth);
		}
		groesen.setSpacing(true);
		mainLayout.addComponent(groesen);
		
		
		GridLayout taschen = new GridLayout();
		taschen.setRows(1);
		taschen.setColumns(3);		
		
		Label besitzt =new Label();
		String hasbags = (this.woundDescription.isBaggy())?(MessageResources.getString("yes")):(MessageResources.getString("no"));
		besitzt.setCaption(MessageResources.getString("woundBags")+":");
		besitzt.setValue(hasbags);
		
		Label taschenLokal = new Label();
		String baglocal = (this.woundDescription.getBagLocation() == null)?(MessageResources.getString("noInformation")):(this.woundDescription.getBagLocation());
		taschenLokal.setCaption(MessageResources.getString("baglocation")+":");
		taschenLokal.setValue(baglocal);
		

		Label taschenRicht	= new Label();
		String bagdirect = (this.woundDescription.getBagDirection() == null)?(MessageResources.getString("noInformation")):(this.woundDescription.getBagDirection());
		taschenRicht.setCaption(MessageResources.getString("bagdirection")+":");
		taschenRicht.setValue(bagdirect);
		
		taschen.addComponents(besitzt, taschenLokal, taschenRicht);
		taschen.setSpacing(true);		
		
		mainLayout.addComponent(taschen);
				
		HorizontalLayout woundtypeandgrade = new HorizontalLayout();
		
		Label woundtypedesc=new Label();
		woundtypedesc.setCaption(MessageResources.getString("woundType")+":");
		woundtypedesc.setValue(this.woundDescription.getWoundType().getClassification());
		
		Label woundgradedesc= new Label();
		String woundgrade = (this.woundDescription.getWoundLevel()==null)?(MessageResources.getString("noInformation")):(this.woundDescription.getWoundLevel().getCharacterisation());
		woundgradedesc.setCaption(MessageResources.getString("woundLevel")+":");
		woundgradedesc.setValue(woundgrade);
		
		
		woundtypeandgrade.addComponents(woundtypedesc, woundgradedesc);
		woundtypeandgrade.setSpacing(true);
		
		mainLayout.addComponent(woundtypeandgrade);
		
		Label berichtBeschreibung = new Label();
		berichtBeschreibung.setCaption(MessageResources.getString("description") + ":");
		
		Label beschreibung = new Label();
		String description = (this.woundDescription.getDescription() == null)?(MessageResources.getString("noInformation")):(this.woundDescription.getDescription());
		beschreibung.setValue(description);

		mainLayout.addComponents(berichtBeschreibung, beschreibung);
		
		showOrHidePhotoButton();
		
		setContent(mainLayout);
		
		Button backButton = new Button("< " + MessageResources.getString("woundDescriptionsHeader"));
		backButton.addClickListener(new ClickListener(){

			@Override
			public void buttonClick(ClickEvent event) {
				getEnvironment().setCurrentUriFragment("woundDescriptions");
				Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
			}
			
		});
		
		setLeftComponent(backButton);

	}
	
	//if there is no image yet, disable the button
	public void showOrHidePhotoButton() {
		if (woundDescription.getImage() == null) {			
			showWoundPhoto.setVisible(false);
		} else {
			showWoundPhoto.setVisible(true);
		}
	}
}
