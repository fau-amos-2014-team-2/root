package com.fau.amos.team2.WoundManagement;

import java.util.Collection;
import java.util.Date;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Origination;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundLevel;
import com.fau.amos.team2.WoundManagement.model.WoundType;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.NumberField;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.data.Item;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;

@SuppressWarnings("serial")
public class NewWoundView extends NavigationView {
	
	public NewWoundView(BodyLocation bodyLocation, Employee currentUser){
				
		setCaption("Neue Wunde anlegen");
		
		final Wound wound = new Wound();

		FormLayout layout = new FormLayout();
		
		//DateField - when is the wound recorded
		final DateField recorded = new DateField("Erfasst am:");
		recorded.setValue(new Date());
		layout.addComponent(recorded);
		
		//ComboBox - who recorded the wound
		Collection<Object> employeeIds = EmployeeProvider.getInstance().getAll().getItemIds();
		final ComboBox recordedBy = new ComboBox("von:");
		for (Object o : employeeIds){
			Employee tmp = EmployeeProvider.getInstance().getByID(o);
			recordedBy.addItem(tmp);
			recordedBy.setItemCaption(tmp, tmp.getAbbreviation());
		}
		recordedBy.setNullSelectionAllowed(false);
		recordedBy.setValue(currentUser); //select current User
		layout.addComponent(recordedBy);
		
		//TextField - body location (in words)
		final TextField locationText = new TextField("Körperregion:");
		layout.addComponent(locationText);
		
		//ComboBox - body location code
		final ComboBox location = new ComboBox("Körperstelle:");
		for (BodyLocation b : BodyLocation.values()){
			location.addItem(b);
			location.setItemCaption(b, b.toFullString());
		}
		location.setValue(bodyLocation); //select chosen location
		location.setNullSelectionAllowed(false);
		layout.addComponent(location);
		
		//ComboBox - wound type
		Collection<Object> typeIds = WoundTypeProvider.getInstance().getAll().getItemIds();
		final ComboBox type = new ComboBox("Wundart:");
		for (Object o : typeIds){
			WoundType tmp = WoundTypeProvider.getInstance().getByID(o);
			type.addItem(tmp);
			type.setItemCaption(tmp, tmp.getClassification());
		}
		layout.addComponent(type);
		
		//ComboBox wound level
		Collection<Object> levelIds = WoundLevelProvider.getInstance().getAll().getItemIds();
		final ComboBox level = new ComboBox("Grad:");
		for (Object o : levelIds){
			WoundLevel tmp = WoundLevelProvider.getInstance().getByID(o);
			level.addItem(tmp);
			level.setItemCaption(tmp, tmp.getAbbreviation());
		}
		layout.addComponent(level);
		
		//ComboBox - origination of wound
		final ComboBox origination = new ComboBox("Wo entstanden:");
		for (Origination o : Origination.values()){
			origination.addItem(o);
			origination.setItemCaption(o, o.toFullString());
		}
		layout.addComponent(origination);
		
		//NumberField - size of wound
		final NumberField size1 = new NumberField("Größe");
		layout.addComponent(size1);
		
		//NumberField - depth of wound
		final NumberField depth = new NumberField("Tiefe");
		layout.addComponent(depth);
		
		//TextField - commentary
		final TextField comment = new TextField("Bemerkung");
		layout.addComponent(comment);
		
		HorizontalLayout buttons = new HorizontalLayout();
		buttons.setSpacing(true);
		
		Button submit = new Button("Wunde anlegen");
		submit.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
				try {
					wound.setBodyLocation(locationText.getValue());
					wound.setBodyLocationCode(((BodyLocation)location.getValue()).getValue());
					wound.setDescription(comment.getValue());
					wound.setOrigination(((Origination)origination.getValue()).getValue());
					wound.setPatient(PatientProvider.getInstance().getByID(PatientProvider.getInstance().getAll().getIdByIndex(0)));
					wound.setRecordingDate(new java.sql.Date(recorded.getValue().getTime()));
					wound.setRecordingEmployee(EmployeeProvider.getInstance().getByID(recordedBy.getValue()));
					wound.setSensoID(1);
					wound.setWoundLevel(WoundLevelProvider.getInstance().getByID(level.getValue()));
					wound.setWoundType(WoundTypeProvider.getInstance().getByID(type.getValue()));
					try{
						wound.setSize1(Integer.parseInt(size1.getValue()));
						wound.setSize2(Integer.parseInt(size1.getValue()));
					} catch (NumberFormatException e){
						wound.setSize1(0);
						wound.setSize2(0);
					}
					try{
						wound.setDepth(Integer.parseInt(depth.getValue()));
					} catch (NumberFormatException e){
						wound.setDepth(0);
					}
					
					WoundProvider.getInstance().add(wound);
					getNavigationManager().navigateBack();
				
				} catch (Exception e){
					Notification.show("Daten nicht korrekt eingegeben!");
					e.printStackTrace();
					
				}
				
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
