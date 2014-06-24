package com.fau.amos.team2.WoundManagement.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fau.amos.team2.WoundManagement.ui.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.ui.UserWardView.WardChangeListener;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserBar;
import com.fau.amos.team2.WoundManagement.ui.SessionedNavigationView;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.server.Page;
import com.vaadin.server.Page.BrowserWindowResizeEvent;
import com.vaadin.server.Page.BrowserWindowResizeListener;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class ShowWoundDescriptionView extends SessionedNavigationView implements
		WardChangeListener {

	/*
	 * The View that shows a previously created Wounddescription. It show the
	 * information listed to the previously selected description.
	 * 
	 * @Param: Wounddescription to be shown
	 */
	private WoundDescription woundDescription;

	private final NavigationButton showwoundphoto;

	public ShowWoundDescriptionView(WoundDescription woundDescription) {

		// ResizeListener
		UI.getCurrent().setImmediate(true);
		UI.getCurrent().setResizeLazy(true);
		Page.getCurrent().addBrowserWindowResizeListener(
				new BrowserWindowResizeListener() {
					@SuppressWarnings("deprecation")
					@Override
					public void browserWindowResized(
							BrowserWindowResizeEvent event) {
						getEnvironment().setOrientation();
						UI.getCurrent().requestRepaint();
						// Page.getCurrent().reload();
					}
				});

		setRightComponent(new UserBar(this));
		this.woundDescription = woundDescription;

		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		setCaption(MessageResources.getString("showWoundDescView"));
		Wound wound = this.woundDescription.getWound();
		if (wound != null) {
			Patient patient = wound.getPatient();
			if (patient != null) {
				setCaption(patient.getFirstName() + " " + patient.getLastName());
			}
		}

		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();
		mainLayout.setSizeFull();

		// final NavigationButton uploadnewphoto = new
		// NavigationButton("Foto hinzufuegen");
		// uploadnewphoto.setTargetView(new
		// UploadPhotoView(this.woundDescription));
		// mainLayout.addComponent(uploadnewphoto);

		showwoundphoto = new NavigationButton(MessageResources.getString("showpicture"));
		showwoundphoto.setTargetView(new ShowWoundPhotoView(woundDescription));
		mainLayout.addComponent(showwoundphoto);

		HorizontalLayout greetingandDate = new HorizontalLayout();

		Label greeting = new Label();
		greeting.setCaption(MessageResources.getString("author") + ": "
				+ this.woundDescription.getEmployee().getLastName() + ", "
				+ woundDescription.getEmployee().getFirstName());

		Label date = new Label();
		date.setCaption(dateFormat.format(this.woundDescription.getDate()));

		greetingandDate.addComponents(greeting, date);
		greetingandDate.setSpacing(true);

		mainLayout.addComponent(greetingandDate);

		HorizontalLayout groesen = new HorizontalLayout();
		if (this.woundDescription.getSize2() == 0) {
			// getSize2 equal to zero means that size 1 has to be interpreted as
			// diameter/durchmesser & size2 is not relevant
			Label diameter = new Label();
			diameter.setCaption(MessageResources.getString("diameter") + ":");
			diameter.setValue("" + this.woundDescription.getSize1());

			Label depth = new Label();
			depth.setCaption(MessageResources.getString("depth") + ":");
			depth.setValue("" + this.woundDescription.getDepth());

			groesen.addComponents(diameter, depth);
		} else {
			// getsize2 not equal to zero means size 1 is not the diameter &
			// both sizes are relevant
			Label length = new Label();
			length.setCaption(MessageResources.getString("height") + ":");
			length.setValue("" + this.woundDescription.getSize1());

			Label width = new Label();
			width.setCaption(MessageResources.getString("width") + ":");
			width.setValue("" + this.woundDescription.getSize2());

			Label depth = new Label();
			depth.setCaption(MessageResources.getString("depth") + ":");
			depth.setValue("" + this.woundDescription.getDepth());

			groesen.addComponents(length, width, depth);
		}
		groesen.setSpacing(true);
		mainLayout.addComponent(groesen);

		GridLayout taschen = new GridLayout();
		taschen.setRows(1);
		taschen.setColumns(3);

		Label besitzt = new Label();
		String hasbags = (this.woundDescription.isBaggy()) ? (MessageResources
				.getString("yes")) : (MessageResources.getString("no"));
		besitzt.setCaption(MessageResources.getString("woundBags") + ":");
		besitzt.setValue(hasbags);

		Label taschenLokal = new Label();
		String baglocal = (this.woundDescription.getBagLocation() == null) ? (MessageResources
				.getString("noInformation")) : (this.woundDescription
				.getBagLocation());
		taschenLokal
				.setCaption(MessageResources.getString("baglocation") + ":");
		taschenLokal.setValue(baglocal);

		Label taschenRicht = new Label();
		String bagdirect = (this.woundDescription.getBagDirection() == null) ? (MessageResources
				.getString("noInformation")) : (this.woundDescription
				.getBagDirection());
		taschenRicht.setCaption(MessageResources.getString("bagdirection")
				+ ":");
		taschenRicht.setValue(bagdirect);

		taschen.addComponents(besitzt, taschenLokal, taschenRicht);
		taschen.setSpacing(true);

		mainLayout.addComponent(taschen);

		HorizontalLayout woundtypeandgrade = new HorizontalLayout();

		Label woundtypedesc = new Label();
		woundtypedesc.setCaption(MessageResources.getString("woundType") + ":");
		woundtypedesc.setValue(this.woundDescription.getWoundType()
				.getClassification());

		Label woundgradedesc = new Label();
		String woundgrade = (this.woundDescription.getWoundLevel() == null) ? (MessageResources
				.getString("noInformation")) : (this.woundDescription
				.getWoundLevel().getCharacterisation());
		woundgradedesc.setCaption(MessageResources.getString("woundLevel")
				+ ":");
		woundgradedesc.setValue(woundgrade);

		woundtypeandgrade.addComponents(woundtypedesc, woundgradedesc);
		woundtypeandgrade.setSpacing(true);

		mainLayout.addComponent(woundtypeandgrade);

		Label berichtBeschreibung = new Label();
		berichtBeschreibung.setCaption(MessageResources
				.getString("description") + ":");

		Label beschreibung = new Label();
		String description = (this.woundDescription.getDescription() == null) ? (MessageResources
				.getString("noInformation")) : (this.woundDescription
				.getDescription());
		beschreibung.setCaption(description);

		mainLayout.addComponents(berichtBeschreibung, beschreibung);

		setContent(mainLayout);

	}

	@Override
	public void wardChanged(WardChangeEvent event) {
		WoundDescriptionListView newView = new WoundDescriptionListView(
				this.woundDescription.getWound());
		getNavigationManager().setPreviousComponent(newView);
	}

	// if there is no image yet, disable the navigation button, so that the user
	// can not go to the
	// in this case useless- show image view
	public void onBecomingVisible() {

		if (woundDescription.getImage() == null) {
			showwoundphoto.setVisible(false);
		} else {
			showwoundphoto.setVisible(true);
		}
	}
}
