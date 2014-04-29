package de.fau.cs.amos;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.data.Property;
import com.vaadin.ui.Label;

public class PatientView extends NavigationView {
	
	public PatientView(String firstName, String lastName, int age, boolean checkWound){
		
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
