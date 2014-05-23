package com.fau.amos.team2.WoundManagement;

import java.util.List;

import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.subviews.UserBar;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.NativeSelect;
//added import Ward
import com.vaadin.ui.Table.Align;


/**
 * View to see patients of selected ward
 * @author Eugen
 * @param <event>
 */
@SuppressWarnings("serial")
public class PatientSelectionView extends NavigationView {
	
	private static PatientProvider patientProvider = PatientProvider.getInstance();
	
	private List<Patient> allPatients;
	private Table table;
	private Container container;
	private Property[][] properties;
	
	public PatientSelectionView() 
	{
		setCaption(MessageResources.getString("patientSelection"));
		
		setRightComponent(new UserBar());
		
		Panel tablePanel = new Panel();
		tablePanel.setSizeUndefined();
		tablePanel.setImmediate(true);
		
		table = new Table();
		table.setSelectable(true);
		table.setImmediate(true);
		
		allPatients = patientProvider.getAllItems();
		
		properties = new Property[allPatients.size()][2];
		
		table.addContainerProperty("name", String.class , null, MessageResources.getString("name"), null , null);
		table.addContainerProperty("currentWounds", Integer.class, 0, MessageResources.getString("currentWounds"), null, Align.RIGHT);
		
		container = table.getContainerDataSource();
		
		for (Patient p : allPatients){
			table.addItem(p.getId());
			Item item = table.getItem(p.getId());
			properties[allPatients.indexOf(p)][0] = item.getItemProperty("name");
			properties[allPatients.indexOf(p)][0].setValue(p.getFirstName() + " " + p.getLastName());	
			properties[allPatients.indexOf(p)][1] = item.getItemProperty("currentWounds");
			properties[allPatients.indexOf(p)][1].setValue(p.getWounds().size());
			container.addItem(p.getId());
		} 

		//table.setContainerDataSource(container);
		
		tablePanel.setContent(table);
		tablePanel.getContent().setSizeUndefined();
		
		table.addValueChangeListener(new Property.ValueChangeListener() {
		    public void valueChange(ValueChangeEvent event) {
		    	Object value = table.getValue();
		    	if (value != null){
		    		Patient patient = patientProvider.getByID(value);
		    		NavigationView next = new PatientView(patient);
		    		getNavigationManager().navigateTo(next);
		    	}
		    }

		});
		
		setContent(tablePanel);
		
	}
	
	/*
	@Override
	protected void onBecomingVisible() {
	    super.onBecomingVisible();
	    allPatients = patientProvider.getAllItems();
	    
	    for (Patient p : allPatients){
	    	Item item = table.getItem(p.getId());
			if (table.getItem(p.getId()) == null){
				table.addItem(p.getId());
			}
			properties[allPatients.indexOf(p)][0] = item.getItemProperty("name");
			properties[allPatients.indexOf(p)][0].setValue(p.getFirstName() + " " + p.getLastName());	
			properties[allPatients.indexOf(p)][1] = item.getItemProperty("currentWounds");
			properties[allPatients.indexOf(p)][1].setValue(p.getWounds().size());
			container.addItem(p.getId());
		} 
	}
*/

}

