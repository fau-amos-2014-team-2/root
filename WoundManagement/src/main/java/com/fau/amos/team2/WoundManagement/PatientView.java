package com.fau.amos.team2.WoundManagement;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Label;

@SuppressWarnings("serial")
public class PatientView extends NavigationView {
	
	public PatientView(){
		String firstName = "Karl-Heinz";
		String lastName = "Schmidt";
		int age = 67;
		boolean checkWound = true;
		setCaption("Patient information");
		
		System.out.println(firstName + " " + lastName + " " + age + " " + checkWound);
		
		VerticalComponentGroup box = new VerticalComponentGroup();
		box.addComponent(new Label("Patient: "+ firstName + " " + lastName));
		box.addComponent(new Label("Age: "+ age));
		if (checkWound){
			box.addComponent(new Label("Wound needs to be checked."));
		} else {
			box.addComponent(new Label("No need to check wound."));
		}

		setContent(box);
	}

}
