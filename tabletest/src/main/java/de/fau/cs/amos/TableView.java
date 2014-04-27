package de.fau.cs.amos;

import com.vaadin.addon.touchkit.ui.EmailField;
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

public class TableView extends NavigationView {
	
	public TableView(){
		
		setCaption("Patients");
		
		Panel tablePanel = new Panel();
		tablePanel.setSizeUndefined();
		tablePanel.setImmediate(true);
		
		final Table table = new Table("List of patients");
		table.setSelectable(true);
		table.setImmediate(true);
		
		Item[] patients = new Item[20];
		Property[][] properties = new Property[20][5];
		
		table.addContainerProperty("First Name", String.class, null);
		table.addContainerProperty("Last Name", String.class, null);
		table.addContainerProperty("Age", Integer.class, null);
		table.addContainerProperty("Check Wound", Boolean.class, false);
		table.addContainerProperty("Comment", String.class, null);
		/*
		table.addItemClickListener(new ItemClickListener(){

			@Override
			public void itemClick(ItemClickEvent event) {
				System.out.println(event.getItemId().toString());
	    		Item item = event.getItem();
	    		String firstName = (String) item.getItemProperty("First Name").getValue();
	    		String lastName = (String) item.getItemProperty("Last Name").getValue();
	    		int age = (Integer) item.getItemProperty("Age").getValue();
	    		boolean checkWound = (Boolean) item.getItemProperty("Check Wound").getValue();
	    		NavigationView next = new PatientView(firstName, lastName, age, checkWound);
	    		getNavigationManager().navigateTo(next);
			}
			
		});
		*/
		table.addValueChangeListener(new Property.ValueChangeListener() {
		    public void valueChange(ValueChangeEvent event) {
		    	Object value = table.getValue();
		    	if (value != null){
		    		Item item = table.getItem(value);
		    		String firstName = (String) item.getItemProperty("First Name").getValue();
		    		String lastName = (String) item.getItemProperty("Last Name").getValue();
		    		int age = (Integer) item.getItemProperty("Age").getValue();
		    		boolean checkWound = (Boolean) item.getItemProperty("Check Wound").getValue();
		    		NavigationView next = new PatientView(firstName, lastName, age, checkWound);
		    		getNavigationManager().navigateTo(next);
		    	}
		    }
		});
		
		 
		/*
		// Access items and properties through the component
		for (int i = 1; i <= 20; i++){
		table.addItem("patient"+i); // Create item by explicit ID
		patients[i-1] = table.getItem("patient"+i);
		}
		*/
		 
		
		// Equivant access through the container
		Container container = table.getContainerDataSource();
		
		for (int i = 1; i <= 20; i++){
			container.addItem("patient"+i);
			patients[i-1] = container.getItem("patient"+i); 	
		}
		
		
		for (int i = 1; i <= 20; i ++){
			properties[i-1][0] = patients[i-1].getItemProperty("First Name");
			properties[i-1][0].setValue("firstName"+i);
			properties[i-1][1] = patients[i-1].getItemProperty("Last Name");
			properties[i-1][1].setValue("lastName"+i);
			properties[i-1][2] = patients[i-1].getItemProperty("Age");
			properties[i-1][2].setValue(i);
			properties[i-1][3] = patients[i-1].getItemProperty("Check Wound");
			if (i%2 == 0){
				properties[i-1][3].setValue(true);
			}
			properties[i-1][4] = patients[i-1].getItemProperty("Comment");
			properties[i-1][4].setValue(i+"comment_comment_comment_comment_comment_comment_comment_comment_comment_comment_comment_comment_comment_comment_comment");
		}
		
		
		tablePanel.setContent(table);
		tablePanel.getContent().setSizeUndefined();
		
		//getNavigationManager().setPreviousComponent(previous);
		//getNavigationManager().setCurrentComponent(this);
		
		setContent(tablePanel);
		
	}

}
