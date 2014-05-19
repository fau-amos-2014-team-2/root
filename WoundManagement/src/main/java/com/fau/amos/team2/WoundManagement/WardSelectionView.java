package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WardProvider;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.data.Property;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.AbstractSelect.ItemCaptionMode;

/**
 * The View that is shown, if a user wants to change his/her current Ward * @author
 * simon
 */
@SuppressWarnings("serial")
public class WardSelectionView extends NavigationView {

	private JPAContainer<Ward> wards;
	private Label greetingLabel;
	
	private static EmployeeProvider<Employee> employeeProvider = 
			(EmployeeProvider<Employee>) EmployeeProvider.getInstance();
	private static WardProvider<Ward> wardProvider = 
			(WardProvider<Ward>) WardProvider.getInstance();


	public WardSelectionView(final Object id) {
		setCaption("Change Ward");

		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();

		final Employee user = employeeProvider.getByID(id);
		Ward currentWard = wardProvider.getByID(
				(user.getCurrentWard()));

		Label workingLabel=new Label();
		workingLabel.setValue(user.getFirstName() + " "
				+ user.getLastName() + " ihre Arbeitsstation ist: "
				+ wardProvider.getByID(user.getWorkingWard()).getCharacterisation());
		mainLayout.addComponent(workingLabel);
		
		greetingLabel = new Label();
		greetingLabel.setValue("Sie arbeiten momentan auf Station: "
				+ currentWard.getCharacterisation());
		
		mainLayout.addComponent(greetingLabel);

		// Hole ids aller der Datenbank bekannten Stationen
		Object[] wardids = prepare();
		int quantity = wardids.length;

		final OptionGroup wardGroup = new OptionGroup(
				"Bitte wählen Sie ihre (neue) derzeitige Station:");

		// das aendern der Caption aendert nicht die Item-ID der optiongroup-
		// mode explicit
		wardGroup.setItemCaptionMode(ItemCaptionMode.EXPLICIT);
		// aenderung innerhalb der wardgroup werden direkt mit dem server
		// kommuniziert
		// keine verzoegerung bei valuechange-events
		wardGroup.setImmediate(true);

		Ward tmp = null;

		for (int z = 0; z < quantity; z++) {

			tmp = wards.getItem(wardids[z]).getEntity();

			// fuege jede Ward in die Liste ein, Item-ID = datenbank ID
			// auch das setzten der Caption ueberschreibt diese nicht!
			wardGroup.addItem(wardids[z]);
			wardGroup.setItemCaption(wardids[z], (tmp.getCharacterisation()));
		}
		
		wardGroup.addValueChangeListener(new Property.ValueChangeListener() {

			@Override
			public void valueChange(
					com.vaadin.data.Property.ValueChangeEvent event) {
				Object blub = wardGroup.getValue();
				user.setCurrentWard(wardProvider.getByID(blub));

				Ward newWard = wardProvider.getByID(
						(user.getCurrentWard()));
				
				//ueberfluessig
				//Notification.show("Station gewechselt zu " + newWard.getCharacterisation());

				greetingLabel.setValue("Als momentane Station wurde "
						+ newWard.getCharacterisation() + " eingestellt!");
						
			}
		});

		mainLayout.addComponent(wardGroup);
		
		/*natuerlich kann man jederzeit mit Hilfe der auto-back-Funktion zurueckgehen, 
		 * erreicht dann aber einen veralteten LoggedInView, in dem noch nicht die -veraenderte- 
		 * Station angezeigt wird. Problematisch ist dabei, dass die Station aber geandert ist, nur 
		 * die anzeige veraltet (s.o.). Mit Hilfe dieses Buttons erreicht man einen refreshten LoggedInView, 
		 * in dem die aktuelle Station angezeigt wird.
		 */
		NavigationButton zurueck = new NavigationButton("Zurueck");
		zurueck.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().navigateTo(new LoggedInView(id));
			}
		});
		
		mainLayout.addComponent(zurueck);
		setContent(mainLayout);
	}

	private Object[] prepare() {

		wards = wardProvider.getAll();

		Object[] wardids = wards.getItemIds().toArray();

		return wardids;

	}

}
