package com.fau.amos.team2.WoundManagement.ui;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.ui.UserWardView.WardChangeListener;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserBar;
import com.vaadin.addon.responsive.Responsive;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.Align;

@PreserveOnRefresh
@SuppressWarnings("serial")
public class PatientSelectionView extends SessionedNavigationView implements WardChangeListener{
	
	private static PatientProvider patientProvider = PatientProvider.getInstance();
	
	private List<Patient> allPatients;
	private List<Patient> patientsOfWard;
	private List<Patient> patientsForTable;
	private Table table;
	private Container container;
	@SuppressWarnings("rawtypes")
	private Property[][] propertiesOfWard;
	@SuppressWarnings("rawtypes")
	private Property[][] allProperties;
	@SuppressWarnings("rawtypes")
	private Property[][] propertiesForTable;
	
	final OptionGroup optionGroup;

	public PatientSelectionView() 
	{
		setCaption(MessageResources.getString("patientSelection"));
		Ward currentWard = getEnvironment().getCurrentEmployee().getCurrentWard();
		
		setRightComponent(new UserBar(this));
		
		VerticalComponentGroup verticalGroup = new VerticalComponentGroup();
		new Responsive(verticalGroup);
		
		HorizontalLayout horizLayout = new HorizontalLayout();
		
		verticalGroup.addComponent(horizLayout);
		
		horizLayout.setWidth("100%");
		horizLayout.setSpacing(true);
		new Responsive(horizLayout);
		
		Label plzChoose = new Label(MessageResources.getString("pleaseChoose") + ":"); //$NON-NLS-1$) 
		horizLayout.addComponent(plzChoose);
		
		optionGroup = new OptionGroup();
		horizLayout.addComponent(optionGroup);
		optionGroup.setStyleName("horizontal");
		
		optionGroup.addItem("patientsOfWard");
		optionGroup.setItemCaption("patientsOfWard", MessageResources.getString("patientsOfWard"));
		
		optionGroup.addItem("allPatients");
		optionGroup.setItemCaption("allPatients", MessageResources.getString("allPatients"));
		
		optionGroup.setImmediate(true);
		optionGroup.setValue("patientsOfWard");
		optionGroup.setMultiSelect(false);
		optionGroup.setNullSelectionAllowed(false);
		
		table = new Table() {
		    @Override
		    protected String formatPropertyValue(Object rowId,
		            Object colId, @SuppressWarnings("rawtypes") Property property) {
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
		
		verticalGroup.addComponent(table);
		table.setPageLength(0);
		table.setSizeUndefined();
		table.setSelectable(true);
		table.setImmediate(true);
		
		new Responsive(table);
		
		allPatients = patientProvider.getAllItems();
		allProperties = new Property[allPatients.size()][5];
		patientsOfWard = patientProvider.getPatientsOfWard(currentWard);
		propertiesOfWard = new Property[patientsOfWard.size()][5];
		
		patientsForTable = patientsOfWard;
		propertiesForTable = propertiesOfWard;
		
		table.addContainerProperty("name", String.class , null, MessageResources.getString("name"), null , null);
		table.setColumnWidth("name", (int) table.getColumnExpandRatio("name"));
		table.addContainerProperty("birthdate", Date.class, null, MessageResources.getString("birthdate"), null, null);
		table.setColumnWidth("birthdate", (int) table.getColumnExpandRatio("name"));
		table.addContainerProperty("ward", String.class, null, MessageResources.getString("ward"), null, null);
		table.setColumnWidth("ward", (int) table.getColumnExpandRatio("name"));
		table.addContainerProperty("room", String.class, null, MessageResources.getString("room"), null, null);
		table.setColumnWidth("room", (int) table.getColumnExpandRatio("name"));
		table.addContainerProperty("currentWounds", Integer.class, 0, MessageResources.getString("wounds"), null, Align.RIGHT);
		table.setColumnWidth("currentWounds", (int) table.getColumnExpandRatio("name"));

		container = table.getContainerDataSource();
		fillTable(); 
		
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
		
		optionGroup.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				if (optionGroup.getValue().equals("allPatients")){
					patientsForTable = allPatients;
					propertiesForTable = allProperties;
				} else {
					patientsForTable = patientsOfWard;
					propertiesForTable = propertiesOfWard;
				}
				
				container.removeAllItems();
				fillTable();
			}
			
		});
		setContent(verticalGroup);
		
	}

	
	
	@Override
	public void wardChanged(WardChangeEvent event) {
		if (event.getWard() != null){
			patientsOfWard = patientProvider.getPatientsOfWard(event.getWard());
			propertiesOfWard = new Property[patientsOfWard.size()][5];
			
			if (optionGroup.getValue().equals("allPatients")){
				patientsForTable = allPatients;
				propertiesForTable = allProperties;
			} else {
				patientsForTable = patientsOfWard;
				propertiesForTable = propertiesOfWard;
			}
			
			container.removeAllItems();
			
			fillTable();
		}
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

