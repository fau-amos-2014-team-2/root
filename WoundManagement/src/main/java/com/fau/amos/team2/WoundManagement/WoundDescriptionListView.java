package com.fau.amos.team2.WoundManagement;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import com.fau.amos.team2.WoundManagement.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.UserWardView.WardChangeListener;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.fau.amos.team2.WoundManagement.provider.WoundDescriptionProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.subviews.UserBar;
import com.fau.amos.team2.WoundManagement.ui.SessionedNavigationView;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.util.DefaultItemSorter;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;

public class WoundDescriptionListView extends SessionedNavigationView implements WardChangeListener {
	
	private static final long serialVersionUID = 2998701886426658070L;
	
	private Wound wound;
	private Patient patient;
	private Table table;
	private List<WoundDescription> descriptions;
	private WoundDescriptionProvider woundDescriptionProvider = 
			WoundDescriptionProvider.getInstance();
	
	
	@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
	public WoundDescriptionListView(Wound wound){
		
		setCaption(MessageResources.getString("woundDescriptionsHeader"));
		this.wound = wound;
		this.patient = this.wound.getPatient();

		// TODO: Check if this apparently not-doing-anything code line is needed.
		getEnvironment().getCurrentEmployee();
		
		
		setRightComponent(new UserBar(this));
		
		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();

		NavigationButton createWoundDescriptionButton = new NavigationButton(
				MessageResources.getString("createDesc")	);
		createWoundDescriptionButton
				.setTargetView(new CreateWoundDescriptionView(wound));

		// some preparations for proper sorting
		descriptions =  wound.getWoundDescriptions();
		
		Panel tablePanel = new Panel();
		tablePanel.setSizeUndefined();
		tablePanel.setImmediate(true);
		
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
		
		tablePanel.setContent(table);
		tablePanel.getContent().setSizeUndefined();
		
		table.addContainerProperty("date", Date.class , null, MessageResources.getString("recordingDate"), null , null);
		table.addContainerProperty("woundType", String.class, null, MessageResources.getString("woundType"), null, null);
		table.addContainerProperty("description", String.class, null, MessageResources.getString("description"), null, null);
		
		table.setColumnWidth("date", 250);
		table.setColumnWidth("woundType", 250);
		table.setColumnWidth("description", 500);
			
		Property[][] properties = new Property[descriptions.size()][3];
				
		IndexedContainer ic = new IndexedContainer() {
            @Override
            public Collection<?> getSortableContainerPropertyIds() {
                return getContainerPropertyIds();
            }
        };

        ic.addContainerProperty("date", Date.class , null);
		ic.addContainerProperty("woundType", String.class, "");
		ic.addContainerProperty("description", String.class, "");
		
        ic.setItemSorter(new DefaultItemSorter(new Comparator<Object>() {

            public int compare(Object o1, Object o2) {
                if (o1 instanceof Date && o2 instanceof Date) {
                    Date b1 = (Date) o1;
                    return b1.compareTo((Date) o2);
                } else if (o1 instanceof String && o2 instanceof String) {
                    return ((String) o1).toLowerCase().compareTo(
                            ((String) o2).toLowerCase());
                }

                return 0;

            }
        }));


		for (WoundDescription wd : descriptions){
			Item item = ic.addItem(wd.getId());
			properties[descriptions.indexOf(wd)][0] = item.getItemProperty("date");
			properties[descriptions.indexOf(wd)][0].setValue(wd.getDate());
			properties[descriptions.indexOf(wd)][1] = item.getItemProperty("woundType");
			properties[descriptions.indexOf(wd)][1].setValue(wd.getWoundType().getClassification());
			properties[descriptions.indexOf(wd)][2] = item.getItemProperty("description");
			properties[descriptions.indexOf(wd)][2].setValue(wd.getDescription());
		} 
		
		table.setContainerDataSource(ic);
		
		table.addValueChangeListener(new Property.ValueChangeListener() {
		    public void valueChange(ValueChangeEvent event) {
		    	Object value = table.getValue();
		    	if (value != null){
		    		WoundDescription woundDescription = woundDescriptionProvider.getByID(value);
		    		NavigationView next = new ShowWoundDescriptionView(woundDescription);
		    		getNavigationManager().navigateTo(next);
		    	}
		    }

		});
		
		mainLayout.addComponent(createWoundDescriptionButton);
		mainLayout.addComponent(tablePanel);

		setContent(mainLayout);
	}
	

	@Override
	public void onBecomingVisible(){
		super.onBecomingVisible();
		PatientView patientView = new PatientView(patient);
		patientView.prepareSelectedWound(wound);
		getNavigationManager().setPreviousComponent(patientView);
	}
	
	@Override
	public void wardChanged(WardChangeEvent event) {
		PatientView patientView = new PatientView(patient);
		patientView.prepareSelectedWound(wound);
		getNavigationManager().setPreviousComponent(patientView);
	}

}
