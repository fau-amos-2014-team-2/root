package com.fau.amos.team2.WoundManagement.ui;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.provider.WoundDescriptionProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserBar;
import com.vaadin.addon.responsive.Responsive;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.util.DefaultItemSorter;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.server.Page;
import com.vaadin.server.Page.BrowserWindowResizeEvent;
import com.vaadin.server.Page.BrowserWindowResizeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;

@Theme("wm-responsive")
@PreserveOnRefresh 
public class WoundDescriptionListView extends SessionedNavigationView {

	private static final long serialVersionUID = 2998701886426658070L;

	private Table table;
	private List<WoundDescription> descriptions;
	private WoundDescriptionProvider woundDescriptionProvider = WoundDescriptionProvider
			.getInstance();

	@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
	public WoundDescriptionListView(Wound wound) {

		Page.getCurrent().addBrowserWindowResizeListener(
				new BrowserWindowResizeListener() {
					@Override
					public void browserWindowResized(
							BrowserWindowResizeEvent event) {
						getEnvironment().setOrientation();
					}
				});

		setCaption(MessageResources.getString("woundDescriptionsHeader"));

		// if (patient != null){
		// setCaption(patient.getFirstName() + " " + patient.getLastName());
		// }

		setRightComponent(new UserBar(this));

		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();
		
		mainLayout.addComponent(new UserBar(this));

//		NavigationButton createWoundDescriptionButton = new NavigationButton(MessageResources.getString("createDesc"));
//		createWoundDescriptionButton.setTargetView(new CreateWoundDescriptionView(wound));
		Button createWoundDescriptionButton = new Button(MessageResources.getString("createDesc"));
		createWoundDescriptionButton.addClickListener(new ClickListener(){

			@Override
			public void buttonClick(ClickEvent event) {
				Page.getCurrent().setUriFragment("createWoundDescription");
			}
			
		});
		
		mainLayout.addComponent(createWoundDescriptionButton);
		
		descriptions = wound.getWoundDescriptions();

		Panel tablePanel = new Panel();
		
		tablePanel.addStyleName("panel");
		tablePanel.setWidth("100%");
		tablePanel.setSizeUndefined();
		tablePanel.setImmediate(true);
		
		new Responsive(tablePanel);
		
		mainLayout.addComponent(tablePanel);

		table = new Table() {
			@Override
			protected String formatPropertyValue(Object rowId, Object colId,
					Property property) {
				if (property.getType() == Date.class) {
					SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
					if (property.getValue() != null) {
						return df.format((Date) property.getValue());
					}
					return "";
				}
				return super.formatPropertyValue(rowId, colId, property);
			}
		};

		table.setSelectable(true);
		table.setImmediate(true);
		table.setWidth("100%");
		table.addStyleName("table");
		
		new Responsive(table);

		tablePanel.setContent(table);
		tablePanel.getContent().setSizeUndefined();

		table.addContainerProperty("date", Date.class, null,
				MessageResources.getString("recordingDate"), null, null);
		table.addContainerProperty("author", String.class, null,
				MessageResources.getString("author"), null, null);

		table.addContainerProperty("picture", String.class, null, "Bild", null,
				null);

		table.addContainerProperty("description", String.class, null,
				MessageResources.getString("description"), null, null);

		table.setColumnWidth("date", 250);
		table.setColumnWidth("author", 250);
		table.setColumnWidth("picture", 50);
		table.setColumnWidth("description", 500);

		Property[][] properties = new Property[descriptions.size()][4];

		IndexedContainer ic = new IndexedContainer() {
			@Override
			public Collection<?> getSortableContainerPropertyIds() {
				return getContainerPropertyIds();
			}
		};

		ic.addContainerProperty("date", Date.class, null);
		ic.addContainerProperty("author", String.class, "");
		ic.addContainerProperty("picture", String.class, "");
		// new
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

		for (WoundDescription wd : descriptions) {
			Item item = ic.addItem(wd.getId());
			properties[descriptions.indexOf(wd)][0] = item
					.getItemProperty("date");
			properties[descriptions.indexOf(wd)][0].setValue(wd.getDate());
			properties[descriptions.indexOf(wd)][1] = item
					.getItemProperty("author");
			properties[descriptions.indexOf(wd)][1].setValue(wd.getEmployee()
					.getFirstName() + " " + wd.getEmployee().getLastName());
			// new
			properties[descriptions.indexOf(wd)][2] = item
					.getItemProperty("picture");
			properties[descriptions.indexOf(wd)][2]
					.setValue((wd.getImage() != null) ? (MessageResources
							.getString("yes")) : (MessageResources
							.getString("no")));

			properties[descriptions.indexOf(wd)][3] = item
					.getItemProperty("description");
			properties[descriptions.indexOf(wd)][3].setValue(wd
					.getDescription());
		}

		table.setContainerDataSource(ic);

		table.setSortContainerPropertyId("date");
		table.setSortAscending(false);
		table.sort();

		table.addValueChangeListener(new Property.ValueChangeListener() {
			public void valueChange(ValueChangeEvent event) {
				Object value = table.getValue();
				if (value != null) {
					WoundDescription woundDescription = woundDescriptionProvider
							.getByID(value);
//					NavigationView next = new ShowWoundDescriptionView(woundDescription);
//					getNavigationManager().navigateTo(next);
					getEnvironment().setCurrentWoundDescription(woundDescription);
					Page.getCurrent().setUriFragment("showWoundDescription");
				}
			}

		});

		mainLayout.addComponent(createWoundDescriptionButton);
		mainLayout.addComponent(tablePanel);

		setContent(mainLayout);
	}

	@Override
	public void onBecomingVisible() {
		super.onBecomingVisible();
//		PatientView patientView = new PatientView(patient, true);
//		patientView.prepareSelectedWound(wound);
//		getNavigationManager().setPreviousComponent(patientView);
	}

//	@Override
//	public void wardChanged(WardChangeEvent event) {
//		PatientView patientView = new PatientView(patient, true);
//		patientView.prepareSelectedWound(wound);
//		getNavigationManager().setPreviousComponent(patientView);
//	}

}
