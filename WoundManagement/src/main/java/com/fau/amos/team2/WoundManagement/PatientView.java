package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.Employee;
//added import Ward
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Label.ValueChangeEvent;

/**
 * View to see patients of selected ward
 * @author Eugen
 * @param <event>
 */
@SuppressWarnings("serial")
public class PatientView<event> extends NavigationView {
	
	public PatientView(event id) 
	{
		CssLayout content = new CssLayout();
		
		NativeSelect wpview = new NativeSelect ("Please select a patient: ");
		
		/**
		 * the actual db-based way to go:
		 * wpview.addItem(patients.get(ward.id) == ward.get(event.value));
		*/
		
		//creates six "patients"
		for (int i=0; i<6; i++)
		{
			wpview.addItem(i);
			wpview.setItemCaption(i, "Patient " +i);
		}
			
		//a selection must occur... 
		wpview.setNullSelectionAllowed(false);
		//...therefore legal to set '-1' by default
		wpview.setValue(-1);
		wpview.setImmediate(true);
		
		wpview.addValueChangeListener(new ValueChangeListener() 
		{
            public void valueChange(final ValueChangeEvent event) 
            {
                final String valueString = String.valueOf(event.getProperty().getValue());
            }

			@Override
			public void valueChange(com.vaadin.data.Property.ValueChangeEvent event) 
			{
				getNavigationManager().navigateTo(new WardPatientView(event.getProperty().getValue()));
			}
        });
		
		VerticalComponentGroup box = new VerticalComponentGroup();
		box.addComponent( new Label( "Patients: ") );
		box.addComponent( wpview );
		
		NavigationButton allPatientsButton = new NavigationButton("All Patients");
		allPatientsButton.addClickListener(new NavigationButtonClickListener()
		{
			@Override
			public void buttonClick(NavigationButtonClickEvent event) 
			{
				getNavigationManager().navigateTo(new PatientView());
			}
		});
		box.addComponent(allPatientsButton);
		
		content.addComponent(box);
		setContent(content);
		
	}

	//Standard PatientView
	public PatientView()
	{
		CssLayout content = new CssLayout();

		setCaption("Patient information");
		
		Employee e = EmployeeProvider.getInstance().getByFirstName("Adam");
		
		VerticalComponentGroup box = new VerticalComponentGroup();
		box.addComponent(new Label("Patient: "+ e.getFirstName() + " " + e.getLastName()));
		box.addComponent(new Label("username: "+ e.getAbbreviation()));
		
		content.addComponent(box);
		setContent(content);
	}

}

