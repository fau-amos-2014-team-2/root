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
public class WardPatientView<event> extends NavigationView {
	
	public WardPatientView(event id) 
	{
		CssLayout content = new CssLayout();
		
		NativeSelect wpview = new NativeSelect ("Please select a patient: ");
		//creates six "patients"
		for (int i=0; i<15; i++)
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
		
		box.addComponent( new Label( "Patients: "));
		box.addComponent (wpview);

		content.addComponent(box);
		setContent(content);
	}

}