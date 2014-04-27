package de.fau.cs.amos;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

public class StartView extends NavigationView {

	public StartView(){
		
		setCaption("Main Menu");

		VerticalComponentGroup box = new VerticalComponentGroup();
		TableView next = new TableView();
    	box.addComponent(new NavigationButton("Patients", next));
    	
    	setContent(box);
	}        
}
