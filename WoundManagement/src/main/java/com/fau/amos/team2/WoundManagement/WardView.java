package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
//added Ward-model and WardProvider
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.fau.amos.team2.WoundManagement.provider.WardProvider;
//added Patient-model and PatientProvider
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
//added JPAContainer for future use with database
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
//added NavigationClickListener classes for drop-down menu
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Label.ValueChangeEvent;
import com.vaadin.ui.NativeSelect;

/**
* View for all patients of ward selected by employee
* @author Eugen
*/
@SuppressWarnings("serial")
public class WardView extends NavigationView {
	
	/**
	* Creates an instance of WardView and shows patients at ward
	*/
	public WardView()
	{
		
		CssLayout content = new CssLayout();
		
		NativeSelect wview = new NativeSelect ("Please select a ward: ");
		
		/**
		 * if the database would exist, this is the right way to go:
		 * JPAContainer<Ward> w = WardProvider.getInstance().getAll();
		 */
		
		//creates six "wards"
		for (int i=0; i<6; i++)
		{
			wview.addItem(i);
			wview.setItemCaption(i, "Ward " +i);
		}
		
		//a selection must occur... 
		wview.setNullSelectionAllowed(false);
		//...therefore legal to set '-1' by default
		wview.setValue(-1);
		wview.setImmediate(true);
		
		wview.addValueChangeListener(new ValueChangeListener() 
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
		box.addComponent( new Label( "Wards: "));
		box.addComponent (wview);

		content.addComponent(box);
		setContent(content);
	}

}