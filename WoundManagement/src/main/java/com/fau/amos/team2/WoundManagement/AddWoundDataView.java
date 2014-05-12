package com.fau.amos.team2.WoundManagement;

import java.util.Date;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.NumberField;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

public class AddWoundDataView extends NavigationView {
	
	@SuppressWarnings("serial")
	public AddWoundDataView(){
		
		setCaption("Neue Wunde anlegen");

		FormLayout layout = new FormLayout();
		
		DateField recorded = new DateField("Erfasst am:");
		recorded.setValue(new Date());
		layout.addComponent(recorded);

		ComboBox recordedBy = new ComboBox("von:");
		recordedBy.addItem("hier würde der angemeldete Mitarbeiter stehen");
		recordedBy.addItem("Adam Arbeit");
		recordedBy.addItem("Bernd Bond");
		recordedBy.addItem("Christina Charles");
		recordedBy.setValue("hier würde der angemeldete Mitarbeiter stehen");
		layout.addComponent(recordedBy);
		
		layout.addComponent(new TextField("Körperregion:"));
		
		ComboBox location = new ComboBox("Körperstelle:");
		Object locationItem0 = location.addItem("hier würde die zuvor ausgewählte Körperstelle stehen");
		Object locationItem1 = location.addItem("1 - Hinterkopf");
		Object locationItem2 = location.addItem("2 - Schädelansatz");
		location.setValue("hier würde die zuvor ausgewählte Körperstelle stehen");
		location.setNullSelectionAllowed(false);
		layout.addComponent(location);
		
		ComboBox type = new ComboBox("Wundart:");
		type.addItem("Wundart 1");
		type.addItem("Wundart 2");
		layout.addComponent(type);
		
		ComboBox stage = new ComboBox("Grad:");
		stage.addItem("Grad 1");
		stage.addItem("Grad 2");
		layout.addComponent(stage);
		
		ComboBox emerged = new ComboBox("Wo entstanden:");
		emerged.addItem("1 - Häuslich");
		emerged.addItem("2 - Krankenhaus/Einzug");
		emerged.addItem("3 - Andere Einrichtung");
		layout.addComponent(emerged);
		
		layout.addComponent(new NumberField("Größe"));
		
		layout.addComponent(new NumberField("Tiefe"));
		
		layout.addComponent(new TextField("Bemerkung"));
		
		HorizontalLayout buttons = new HorizontalLayout();
		buttons.setSpacing(true);
		
		Button submit = new Button("Wunde anlegen");
		submit.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
				getNavigationManager().navigateBack();
			}
		});
		
		Button cancel = new Button("Abbrechen");
		cancel.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
				getNavigationManager().navigateBack();
			}
		});
		
		buttons.addComponent(submit);
		buttons.addComponent(cancel);
		
		layout.addComponent(buttons);
		
		setContent(layout);
	}

}
