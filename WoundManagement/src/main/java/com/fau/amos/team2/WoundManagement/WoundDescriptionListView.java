package com.fau.amos.team2.WoundManagement;

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
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.data.Property;
import com.vaadin.ui.AbstractSelect.ItemCaptionMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.OptionGroup;

public class WoundDescriptionListView extends NavigationView implements WardChangeListener {
	
	private static final long serialVersionUID = 2998701886426658070L;
	
	private Patient patient;
	private List<WoundDescription> descriptions;
	private Object selected = null;
	private Button showselected;
	@SuppressWarnings("serial")
	public WoundDescriptionListView(final Wound wound){
		
		setCaption(MessageResources.getString("woundDescriptions"));
		this.patient = wound.getPatient();
		
		
		Environment.INSTANCE.getCurrentEmployee();
		
		
		setRightComponent(new UserBar(this));
		
		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();

		NavigationButton createWoundDescriptionButton = new NavigationButton(
				MessageResources.getString("createDesc")	);
		createWoundDescriptionButton
				.setTargetView(new CreateWoundDescriptionView(wound));
		mainLayout.addComponents(createWoundDescriptionButton);

		setContent(mainLayout);

		// some preparations for proper sorting
		descriptions =  wound.getWoundDescriptions();

		
		int quantityDescriptions= descriptions.size();
		
		// Label showing how many wounddescribes are known
		Label anzahlDescriptions = new Label();
		anzahlDescriptions.setValue(MessageResources.getString("quantityDescText1") +" "+ quantityDescriptions
				+ " "+MessageResources.getString("quantityDescText2") +" " + patient.getFirstName() + " "
				+ patient.getLastName() + " " + MessageResources.getString("quantityDescText3"));
		mainLayout.addComponent(anzahlDescriptions);

		//the following build up is only necessary if there exists at least one description
		if (quantityDescriptions > 0){

		// Fill array, in order such that first one of the returned ids is
		// getting the last place of the array
		//later we want to have the oldest description to be shown last
		WoundDescription[] woundDescriptions = new WoundDescription[quantityDescriptions];
		
		for (int z=0; z<quantityDescriptions; z++){
			woundDescriptions[z] = descriptions.get(z);
		}
		sortDescriptionsbyDate(woundDescriptions);
		
		//Building OptionGroup so the User can select which WoundDescription he want to be shown in more Detail
		final OptionGroup descriptionGroup = new OptionGroup(MessageResources.getString("pleaseChoose"));
		descriptionGroup.setItemCaptionMode(ItemCaptionMode.EXPLICIT);
		descriptionGroup.setImmediate(true);

		WoundDescription tmp = null;

		/*for building the optiongroup the sorting within woundDescriptions array is used.
		 * if this sorting is wrong, items will be arranged unsorted.
		 */
		
		for (int z = 0; z < woundDescriptions.length; z++) {

			tmp = woundDescriptions[z];

			descriptionGroup.addItem(tmp.getId());
			descriptionGroup.setItemCaption(tmp.getId(),
					(tmp.getDate().toLocaleString()));
		}

		descriptionGroup
				.addValueChangeListener(new Property.ValueChangeListener() {
					@Override
					public void valueChange(
							com.vaadin.data.Property.ValueChangeEvent event) {
						selected = descriptionGroup.getValue();

					}
				});
		mainLayout.addComponent(descriptionGroup);
		
		
		/* show-Selected-Description-View navigation button
		 * navigates the User to a View in which the selected Description is shown in Detail
		 * If no Description was selected yet, a Notification is shown
		 */		
		showselected = new Button();
		showselected.setCaption("Anzeigen");
		showselected.addClickListener(new Button.ClickListener() {
	
			public void buttonClick(ClickEvent event) {
				if (selected != null) {
					NavigationView next = new ShowWoundDescriptionView(WoundDescriptionProvider.getInstance().getByID(selected));
					getNavigationManager().navigateTo(next);
				} else {
					Notification.show(MessageResources.getString("chooseDescriptionException")+"!");
				}
			}
		});
		mainLayout.addComponent(showselected);
		}
		setContent(mainLayout);
		

	}
	
	private int sortDescriptionsbyDate(WoundDescription[] woundDescriptions) {
		/*
		 * sorts the given array of WoundDescription corresponding to their
		 * date. Previous/Oldest Description is listed last, newest description
		 * first.
		 * A simple bubblesort algo is used, due to the fact that in most cases 
		 * the descriptions are already sorted by id ((an
		 * older insert date should lead to a lower database id - this fact is used 
		 * in the filling-phase (array woundDescriptions)))
		 * RETURNS: the number of steps used during the sorting 
		 */
		int steps = 0;
		if (woundDescriptions.length <= 1) {
			return steps;
		}

		boolean swaphappened = false;

		for (int x = 0; x < woundDescriptions.length; x++) {
			swaphappened = false;

			for (int z = 1; z < (woundDescriptions.length - x); z++) {
				WoundDescription left = woundDescriptions[z - 1];
				WoundDescription right = woundDescriptions[z];

				// if date of "left"-description is NOT before the date of right
				// description, swap them
				if (left.getDate().before(right.getDate())) {
					woundDescriptions[z] = left;
					woundDescriptions[z - 1] = right;

					swaphappened = true;

					// FIXME: delete, just for Testing:
				//	Notification.show("Swap happened durchlauf " + x + "  " + z);

					steps++;
				}

			}

			// if no swap was necessary, we're finished! -> return
			if (swaphappened == false) {
				return steps;
			}

		}
		return steps;

	}


	
	@Override
	public void onBecomingVisible(){
		super.onBecomingVisible();
		getNavigationManager().setPreviousComponent(new PatientView(patient));
	}
	
	@Override
	public void wardChanged(WardChangeEvent event) {
		getNavigationManager().setPreviousComponent(new PatientView(patient));
	}

}
