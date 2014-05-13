package com.fau.amos.team2.WoundManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class WoundDataView extends NavigationView {
	
	public WoundDataView(Object id){
		
		setCaption("Wunddaten anzeigen");
		
		Wound wound = WoundProvider.getInstance().getByID(id);
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

		VerticalComponentGroup box = new VerticalComponentGroup();
	
		box.addComponent(new Label("Senso6 Dekubitus, id: 10 (verheilt)  <--- was genau steht hier?"));
	
		HorizontalLayout columns = new HorizontalLayout();
		columns.setSpacing(true);
		
		VerticalLayout labels = new VerticalLayout();
		VerticalLayout data = new VerticalLayout();
		labels.setSpacing(true);
		data.setSpacing(true);
		
		labels.addComponent(new Label("Erfasst am:"));
		//data.addComponent(new Label("13.08.2012"));
		data.addComponent(new Label(df.format(wound.getRecordingDate())));
		
		labels.addComponent(new Label("von:"));
		//data.addComponent(new Label("Beige"));
		data.addComponent(new Label(wound.getRecordingEmployee().getAbbreviation()));
		
		labels.addComponent(new Label("Beendet am:"));
		//data.addComponent(new Label("09.04.2012"));
		data.addComponent(new Label(df.format(wound.getEndDate())));
		
		labels.addComponent(new Label("von:"));
		//data.addComponent(new Label("CSC"));
		data.addComponent(new Label(wound.getCureEmployee().getAbbreviation()));

		labels.addComponent(new Label("Körperregion:"));
		//data.addComponent(new Label("Brustbein"));
		data.addComponent(new Label(wound.getBodyLocation()));
		
		labels.addComponent(new Label("Körperstelle:"));
		//data.addComponent(new Label("Brustbein"));
		data.addComponent(new Label(wound.getBodyLocationCode()+""));
		
		labels.addComponent(new Label("Grad:"));
		//data.addComponent(new Label("1 Grad l - Nicht wegdrückbare Rötung"));
		data.addComponent(new Label(wound.getWoundLevel().getAbbreviation()));
		
		labels.addComponent(new Label("Größe (mm):"));
		//data.addComponent(new Label("1 x 1"));
		data.addComponent(new Label(wound.getSize1() + " x " + wound.getSize2()));
		
		labels.addComponent(new Label("Tiefe(mm):"));
		//data.addComponent(new Label("1 x 1"));
		data.addComponent(new Label(wound.getDepth()+""));
		
		labels.addComponent(new Label("Wo entstanden:"));
		//data.addComponent(new Label("wo die Wunde entstanden ist..."));
		data.addComponent(new Label(wound.getOrigination()+""));
		
		labels.addComponent(new Label("Bemerkung:"));
		//data.addComponent(new Label("hier steht eine Bemerkunng..."));
		data.addComponent(new Label(wound.getDescription()));
		
		columns.addComponent(labels);
		columns.addComponent(data);

		box.addComponent(columns);
		
		NavigationButton descriptionButton = new NavigationButton("Wundbeschreibungen");
		descriptionButton.addClickListener(new NavigationButtonClickListener(){
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().navigateTo(new WoundDescriptionView());
			}
		});
		setContent(box);
	
	}
	
}
