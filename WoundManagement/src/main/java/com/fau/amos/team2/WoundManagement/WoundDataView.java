package com.fau.amos.team2.WoundManagement;

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
	
	public WoundDataView(){
		
		setCaption("Wunddaten anzeigen");

		VerticalComponentGroup box = new VerticalComponentGroup();
	
		box.addComponent(new Label("Senso6 Dekubitus, id: 10 (verheilt)  <--- was genau steht hier?"));
	
		HorizontalLayout columns = new HorizontalLayout();
		columns.setSpacing(true);
		
		VerticalLayout labels = new VerticalLayout();
		VerticalLayout data = new VerticalLayout();
		labels.setSpacing(true);
		data.setSpacing(true);
		
		labels.addComponent(new Label("Erfasst am:"));
		data.addComponent(new Label("13.08.2012"));
		
		labels.addComponent(new Label("von:"));
		data.addComponent(new Label("Beige"));
		
		labels.addComponent(new Label("Beendet am:"));
		data.addComponent(new Label("09.04.2012"));
		
		labels.addComponent(new Label("von:"));
		data.addComponent(new Label("CSC"));
		
		labels.addComponent(new Label("Körperregion:"));
		data.addComponent(new Label("Brustbein"));
		
		labels.addComponent(new Label("Körperstelle:"));
		data.addComponent(new Label("Brustbein"));
		
		labels.addComponent(new Label("Grad:"));
		data.addComponent(new Label("1 Grad l - Nicht wegdrückbare Rötung"));
		
		labels.addComponent(new Label("Größe (mm):"));
		data.addComponent(new Label("1 x 1"));
		
		labels.addComponent(new Label("Tiefe(mm):"));
		data.addComponent(new Label("1 x 1"));
		
		labels.addComponent(new Label("Wo entstanden:"));
		data.addComponent(new Label("wo die Wunde entstanden ist..."));
		
		labels.addComponent(new Label("Bemerkung:"));
		data.addComponent(new Label("hier steht eine Bemerkunng..."));
		
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
