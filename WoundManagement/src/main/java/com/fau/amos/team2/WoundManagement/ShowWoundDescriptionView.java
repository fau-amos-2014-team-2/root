package com.fau.amos.team2.WoundManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fau.amos.team2.WoundManagement.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.UserWardView.WardChangeListener;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.subviews.UserBar;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

@SuppressWarnings("serial")
public class ShowWoundDescriptionView extends NavigationView implements WardChangeListener {


	/*
	 * The View that shows a previously created Wounddescription. It show the
	 * information listed to the previously selected description.
	 * @Param: Wounddescription to be shown
	 */
	private WoundDescription wounddescription;
	public ShowWoundDescriptionView(WoundDescription wounddescription) {
		setRightComponent(new UserBar(this));
		this.wounddescription = wounddescription;

		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		setCaption(MessageResources.getString("showWoundDescView"));

		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();
		mainLayout.setSizeFull();

		HorizontalLayout greetingandDate =new HorizontalLayout();
		
		
		Label greeting = new Label();
		greeting.setCaption(MessageResources.getString("author")+": " + wounddescription.getEmployee().getLastName() + ", " + wounddescription.getEmployee().getFirstName());
		
		Label date= new Label();
		date.setCaption(dateFormat.format(wounddescription.getDate()));
		
		greetingandDate.addComponents(greeting, date);
		greetingandDate.setSpacing(true);
		
		mainLayout.addComponent(greetingandDate);

		HorizontalLayout groesen =new HorizontalLayout();
		if (wounddescription.getSize2() ==0){
			//getSize2 equal to zero means that size 1 has to be interpreted as diameter/durchmesser & size2 is not relevant
			Label diameter=new Label();
			diameter.setCaption(MessageResources.getString("diameter")+":");
			diameter.setValue(""+wounddescription.getSize1());
			
			
			Label depth=new Label();
			depth.setCaption(MessageResources.getString("depth")+":");
			depth.setValue(""+ wounddescription.getDepth());
			
			groesen.addComponents(diameter, depth);
		} else {
			//getsize2 not equal to zero means size 1 is not the diameter & both sizes are relevant
			Label length = new Label();
			length.setCaption(MessageResources.getString("height")+":");
			length.setValue(""+wounddescription.getSize1());
			
			Label width = new Label();
			width.setCaption(MessageResources.getString("width")+":");
			width.setValue(""+wounddescription.getSize2());
			
			Label depth = new Label();
			depth.setCaption(MessageResources.getString("depth")+":");
			depth.setValue(""+wounddescription.getDepth());
			
			groesen.addComponents(length, width, depth);
		}
		groesen.setSpacing(true);
		mainLayout.addComponent(groesen);
		
		
		GridLayout taschen = new GridLayout();
		taschen.setRows(1);
		taschen.setColumns(3);
		
		
		
		Label besitzt =new Label();
		String hasbags = (wounddescription.isBaggy())?(MessageResources.getString("yes")):(MessageResources.getString("no"));
		besitzt.setCaption(MessageResources.getString("woundBags")+":");
		besitzt.setValue(hasbags);
		
		Label taschenLokal = new Label();
		String baglocal = (wounddescription.getBagLocation() == null)?(MessageResources.getString("noInformation")):(wounddescription.getBagLocation());
		taschenLokal.setCaption(MessageResources.getString("baglocation")+":");
		taschenLokal.setValue(baglocal);
		

		Label taschenRicht	= new Label();
		String bagdirect = (wounddescription.getBagDirection() == null)?(MessageResources.getString("noInformation")):(wounddescription.getBagDirection());
		taschenRicht.setCaption(MessageResources.getString("bagdirection")+":");
		taschenRicht.setValue( bagdirect);
		
		taschen.addComponents(besitzt, taschenLokal, taschenRicht);
		taschen.setSpacing(true);
	
		//taschen.setWidth(mainLayout.getWidth(), mainLayout.getWidthUnits());
		
		
		mainLayout.addComponent(taschen);
				
		HorizontalLayout woundtypeandgrade = new HorizontalLayout();
		
		Label woundtypedesc=new Label();
		woundtypedesc.setCaption(MessageResources.getString("woundType")+":");
		woundtypedesc.setValue(wounddescription.getWoundType().getClassification());
		
		Label woundgradedesc= new Label();
		String woundgrade = (wounddescription.getWoundLevel()==null)?(MessageResources.getString("noInformation")):(wounddescription.getWoundLevel().getCharacterisation());
		woundgradedesc.setCaption(MessageResources.getString("woundLevel")+":");
		woundgradedesc.setValue(woundgrade);
		
		
		woundtypeandgrade.addComponents(woundtypedesc, woundgradedesc);
		woundtypeandgrade.setSpacing(true);
		
		mainLayout.addComponent(woundtypeandgrade);
		
		Label berichtBeschreibung = new Label();
		berichtBeschreibung.setCaption(MessageResources.getString("description") + ":");
		
		Label beschreibung = new Label();
		String description = (wounddescription.getDescription() == null)?(MessageResources.getString("noInformation")):(wounddescription.getDescription());
		beschreibung.setCaption(description);

		mainLayout.addComponents(berichtBeschreibung, beschreibung);
		
		
		
		setContent(mainLayout);

	}

	@Override
	public void wardChanged(WardChangeEvent event) {
		WoundDescriptionListView newView = new WoundDescriptionListView(wounddescription.getWound());
		getNavigationManager().setPreviousComponent(newView);
	}
}
