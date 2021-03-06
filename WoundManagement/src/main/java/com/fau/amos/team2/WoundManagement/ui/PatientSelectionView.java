package com.fau.amos.team2.WoundManagement.ui;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserBar;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserWardView;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserWardView.WardChangeListener;
import com.vaadin.addon.responsive.Responsive;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.Align;

@PreserveOnRefresh
@SuppressWarnings("serial")
public class PatientSelectionView extends SessionedNavigationView implements WardChangeListener {
	
	private static PatientProvider patientProvider = PatientProvider.getInstance();
	
	private List<Patient> allPatients;
	private List<Patient> patientsOfWard;
	private List<Patient> patientsForTable;
	private Table table;
	private Container container;
	private Property[][] propertiesOfWard;
	private Property[][] allProperties;
	private Property[][] propertiesForTable;
	
	private Button wardBtn;
	
	public PatientSelectionView() 
	{
		getEnvironment().setCurrentWound(null);
		
		setCaption(MessageResources.getString("patientSelection"));
		Ward currentWard = getEnvironment().getCurrentEmployee().getCurrentWard();
		
		VerticalComponentGroup verticalGroup = new VerticalComponentGroup();
		
		setRightComponent(new UserBar(this));
		
		new Responsive(verticalGroup);
		
		wardBtn = new Button(currentWard.getCharacterisation());
		wardBtn.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				UserWardView userWardView = new UserWardView();
				userWardView.addWardChangeListener(PatientSelectionView.this);
				userWardView.showRelativeTo(wardBtn);
			}
		});
		
		Panel tablePanel = new Panel();
		tablePanel.setWidth("100%");
		tablePanel.setImmediate(true);
		tablePanel.addStyleName("panel");

		new Responsive(tablePanel);
		
		table = new Table() {
		    @Override
		    protected String formatPropertyValue(Object rowId,
		            Object colId, Property property) {
		        if (property.getType() == Date.class) {
		            SimpleDateFormat df =
		                new SimpleDateFormat("dd.MM.yyyy");
		            if (property.getValue() != null){
			            return df.format((Date)property.getValue());
		            }
		            return "";
		        }
		        return super.formatPropertyValue(rowId, colId, property);
		    }
		};
		
		table.setSelectable(true);
		table.setImmediate(true);
		table.setWidth("100%");
		
		allPatients = patientProvider.getAllItems();
		allProperties = new Property[allPatients.size()][5];
		patientsOfWard = patientProvider.getPatientsOfWard(currentWard);
		propertiesOfWard = new Property[patientsOfWard.size()][5];
		
		patientsForTable = patientsOfWard;
		propertiesForTable = propertiesOfWard;
		
		table.addContainerProperty("name", String.class , null, MessageResources.getString("name"), null , null);
		table.addContainerProperty("birthdate", Date.class, null, MessageResources.getString("birthdate"), null, null);
		table.addContainerProperty("ward", String.class, null, MessageResources.getString("ward"), null, null);
		table.addContainerProperty("room", String.class, null, MessageResources.getString("room"), null, null);
		table.addContainerProperty("currentWounds", Integer.class, 0, MessageResources.getString("wounds"), null, Align.RIGHT);
		
		table.addStyleName("table");
		
		new Responsive(table);
		
		container = table.getContainerDataSource();
		
		fillTable(); 
		
		tablePanel.setContent(table);
		
		table.addValueChangeListener(new Property.ValueChangeListener() {
		    public void valueChange(ValueChangeEvent event) {
		    	Object value = table.getValue();
		    	if (value != null){
		    		Patient patient = patientProvider.getByID(value);
		    		getEnvironment().setCurrentPatient(patient);
		    		getEnvironment().setShowCurrentWoundsOnly(true);
		    		getEnvironment().setCurrentUriFragment("patient");
					Page.getCurrent().setUriFragment(getEnvironment().getCurrentUriFragment());
		    	}
		    }

		});
		
		verticalGroup.addComponent(wardBtn);
		verticalGroup.addComponent(tablePanel);
		
		setContent(verticalGroup);		
	}

	@Override
	public void wardChanged(WardChangeEvent event) {
		if (event.getWard() == null){
			patientsForTable = allPatients;
			propertiesForTable = allProperties;
			wardBtn.setCaption(MessageResources.getString("allPatients"));
		} else {
			patientsOfWard = patientProvider.getPatientsOfWard(event.getWard());
			propertiesOfWard = new Property[patientsOfWard.size()][5];
			patientsForTable = patientsOfWard;
			propertiesForTable = propertiesOfWard;
			wardBtn.setCaption(event.getWard().getCharacterisation());
		}
		
		container.removeAllItems();
		
		fillTable();
	}
	
	@SuppressWarnings("unchecked")
	public void fillTable(){
		for (Patient p : patientsForTable){
			table.addItem(p.getId());
			Item item = table.getItem(p.getId());
			propertiesForTable[patientsForTable.indexOf(p)][0] = item.getItemProperty("name");
			propertiesForTable[patientsForTable.indexOf(p)][0].setValue(p.getFirstName() + " " + p.getLastName());
			propertiesForTable[patientsForTable.indexOf(p)][1] = item.getItemProperty("birthdate");
			propertiesForTable[patientsForTable.indexOf(p)][1].setValue(p.getBirthday());
			propertiesForTable[patientsForTable.indexOf(p)][2] = item.getItemProperty("ward");
			propertiesForTable[patientsForTable.indexOf(p)][2].setValue(p.getWard().getCharacterisation());
			propertiesForTable[patientsForTable.indexOf(p)][3] = item.getItemProperty("room");
			propertiesForTable[patientsForTable.indexOf(p)][3].setValue(p.getRoom());
			propertiesForTable[patientsForTable.indexOf(p)][4] = item.getItemProperty("currentWounds");
			propertiesForTable[patientsForTable.indexOf(p)][4].setValue(p.getCurrentWounds().size());
			container.addItem(p.getId());
		}
	}
}

