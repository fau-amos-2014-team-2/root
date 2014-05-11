package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Label;

/**
 * View to see the selected Patient
 * 
 * @author ???
 */
@SuppressWarnings("serial")
public class PatientView extends NavigationView {
	
	/**
	 * Creates an instance of PatientView and 
	 * is showing patient infos
	 */
	public PatientView(){
		setCaption("Patient information");
		
		Employee e = EmployeeProvider.getInstance().getByFirstName("Adam");
		
		VerticalComponentGroup box = new VerticalComponentGroup();
		box.addComponent(new Label("Patient: "+ e.getFirstName() + " " + e.getLastName()));
		box.addComponent(new Label("username: "+ e.getAbbreviation()));
		
		setContent(box);
	}

}
