package com.fau.amos.team2.WoundManagement.ui;

import java.util.Collection;
import java.util.Date;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.model.WoundLevel;
import com.fau.amos.team2.WoundManagement.model.WoundType;
import com.fau.amos.team2.WoundManagement.provider.WoundDescriptionProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.subviews.UserBar;
import com.fau.amos.team2.WoundManagement.ui.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.ui.UserWardView.WardChangeListener;
import com.vaadin.addon.touchkit.ui.NumberField;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;

@SuppressWarnings("serial")
public class CreateWoundDescriptionView extends SessionedNavigationView implements WardChangeListener {

	private Wound wound;
	private WoundDescriptionProvider woundDescriptionProvider =
			WoundDescriptionProvider.getInstance();
	private WoundLevelProvider woundLevelProvider =
			WoundLevelProvider.getInstance();
	private WoundTypeProvider woundTypeProvider = 
			WoundTypeProvider.getInstance();
	
	public CreateWoundDescriptionView(final Wound wound) {
		this.wound = wound;
		WoundDescription latest = woundDescriptionProvider.getNewestForWound(wound);
		
		Employee user = getEnvironment().getCurrentEmployee();
		setCaption(MessageResources.getString("newDesc"));
		Patient patient = wound.getPatient();
		if (patient != null){
			setCaption(patient.getFirstName() + " " + patient.getLastName());
		}
		setRightComponent(new UserBar(this));


		final FormLayout mainLayout = new FormLayout();
		mainLayout.setSizeUndefined();

		HorizontalLayout greetingdate = new HorizontalLayout();

		Label erstellerLabel = new Label();
		erstellerLabel.setValue(MessageResources.getString("author")+": " + user.getFirstName() + " "
				+ user.getLastName());
		greetingdate.addComponent(erstellerLabel);
		greetingdate.setWidth("20em");

		// DateField - when is the wound recorded/as seen in NewWoundView
		final DateField recorded = new DateField(MessageResources.getString("createDate")+":");
		recorded.setValue(new Date());
		recorded.setDateFormat("dd.MM.yyyy");
		recorded.setInvalidAllowed(false);
		recorded.setWidth("20em");
		greetingdate.addComponent(recorded);

		greetingdate.setSpacing(true);

		mainLayout.addComponent(greetingdate);

		// TaschenBeschreibungs-Checkboxes & Textfields
		HorizontalLayout taschenErfassen = new HorizontalLayout();

		final CheckBox taschen = new CheckBox();
		taschen.setCaption(MessageResources.getString("woundBags")+":");
		taschen.setImmediate(false);
		taschen.setWidth("20em");
		taschen.setValue(latest.isBaggy());


		// taschen.setWidth("-1px");
		// taschen.setHeight("-1px");

		final TextField bagLocation = new TextField();
		bagLocation.setCaption(MessageResources.getString("baglocation")+":");
		bagLocation.setImmediate(false);
		bagLocation.setWidth("20em");
		bagLocation.setMaxLength(200);
		if (latest.getBagLocation() != null){
			bagLocation.setValue(latest.getBagLocation());
		}

		final TextField bagDirection = new TextField();
		bagDirection.setCaption(MessageResources.getString("bagdirection")+":");
		bagDirection.setImmediate(false);
		bagDirection.setWidth("20em");
		bagDirection.setMaxLength(200);
		if (latest.getBagDirection() != null){
			bagDirection.setValue(latest.getBagDirection());
		}


		taschenErfassen.addComponents(taschen, bagLocation,
				bagDirection);
		taschenErfassen.setSpacing(true);

		mainLayout.addComponent(taschenErfassen);

		
		// TextField - commentary
		final TextArea comment = new TextArea();
		comment.setInputPrompt(MessageResources.getString("description")+ ":");
		comment.setMaxLength(2000);
		comment.setWidth("61em");
		comment.setHeight("5em");
		if (latest.getDescription() != null){
			comment.setValue(latest.getDescription());
		}

		mainLayout.addComponent(comment);

		HorizontalLayout wundGroessen = new HorizontalLayout();
		wundGroessen.setSpacing(true);

		// Numberfields taken from NewWoundView
		// NumberField - length of wound
		final NumberField size1 = new NumberField(MessageResources.getString("height")+":");
		size1.setValue("0");
		size1.setInvalidAllowed(false);
		size1.setWidth("20em");
		wundGroessen.addComponent(size1);
		size1.setValue(latest.getSize1()+"");
		

		// NumberField - width of wound
		final NumberField size2 = new NumberField(MessageResources.getString("width")+":");
		size2.setValue("0");
		size2.setInvalidAllowed(false);
		size2.setWidth("20em");
		wundGroessen.addComponent(size2);
		size2.setValue(latest.getSize2()+"");


		// NumberField - depth of wound
		final NumberField depth = new NumberField(MessageResources.getString("depth")+":");
		depth.setValue("0");
		depth.setInvalidAllowed(false);
		depth.setWidth("20em");
		wundGroessen.addComponent(depth);
		depth.setValue(latest.getDepth()+"");

		mainLayout.addComponent(wundGroessen);
		
		/*
		 * Woundtype & Level comboboxes
		 */
		HorizontalLayout woundlevelandtype = new HorizontalLayout();
		woundlevelandtype.setSpacing(true);
		
		// ComboBox - wound type
		Collection<Object> typeIds = WoundTypeProvider.getInstance().getAll().getItemIds();
		final ComboBox type = new ComboBox(MessageResources.getString("woundType")+":");
		for (Object o : typeIds){
			WoundType tmp = WoundTypeProvider.getInstance().getByID(o);
			type.addItem(o);
			type.setItemCaption(o, tmp.getClassification());
		}
		type.setWidth("20em");
		type.setNewItemsAllowed(false);
		type.setTextInputAllowed(false);
		if (latest.getWoundType() != null){
			type.setValue(latest.getWoundType().getId());
		}
		woundlevelandtype.addComponent(type);
		 
		// ComboBox - woundlevel
		Collection<Object> levelIds = WoundLevelProvider.getInstance().getAll().getItemIds();
		final ComboBox level = new ComboBox(MessageResources.getString("woundLevel")+":");
		for (Object o : levelIds){
			WoundLevel tmp = WoundLevelProvider.getInstance().getByID(o);
			level.addItem(o);
			level.setItemCaption(o, tmp.getCharacterisation());
		}
		level.setNewItemsAllowed(false);
		level.setTextInputAllowed(false);
		level.setWidth("20em");
		if (latest.getWoundLevel() != null){
			level.setValue(latest.getWoundLevel().getId());
		}
		woundlevelandtype.addComponent(level);
		
		mainLayout.addComponent(woundlevelandtype);
		
		final WoundDescription woundDescription = new WoundDescription();
		woundDescription.setEmployee(user);
		woundDescription.setWound(wound);
		
		Button createNewDescription = new Button(MessageResources.getString("createDesc"));
		createNewDescription.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
					
					woundDescription.setBaggy(taschen.getValue());
										
					if(bagLocation.getValue() != null){
						woundDescription.setBagLocation(bagLocation.getValue());
					}
					
					if(bagDirection.getValue() != null) {
						woundDescription.setBagDirection(bagDirection.getValue());
					}
					
					/*TODO: woundlevel is set here BUT later there is an Notification saying that 
					 * setting an woundlevel is not allowed (in some cases)
					 */
					//setWoundLevel
					if (level.getValue() != null){
						woundDescription.setWoundLevel(woundLevelProvider.getByID(level.getValue()));
					}
					
					//setWoundType
					if (type.getValue() != null){
						WoundType woundType = woundTypeProvider.getByID(type.getValue());
						woundDescription.setWoundType(woundType);
						
						//check if WoundLevel is set according to chosen WoundType
						//'P''p' - level required
						//'V''v' - level forbidden
						//'E''e' - level allowed
						if ('p' == (woundType.getLevel()) || 'P' == (woundType.getLevel())){
							if (level.getValue() == null){
								Notification.show(MessageResources.getString("woundType") + woundType.getClassification() + MessageResources.getString("woundLevelRequired"));
								return;
							}
						} else if ('v' == (woundType.getLevel()) || 'V' == (woundType.getLevel())){
							if (level.getValue() != null){
								Notification.show(MessageResources.getString("woundType") + woundType.getClassification() + MessageResources.getString("woundLevelForbidden"));
								return;
							}
						}
						
						
						
					} else {
						Notification.show(MessageResources.getString("woundtypeSelectException")+"!");
						return;
					}
					
					//setDescription - is automatically cut to at most 2000 characters
					woundDescription.setDescription(comment.getValue());

					//setRecordingDate - all misformatted inputs result in "null"
					try{
						woundDescription.setDate(new java.sql.Date(recorded.getValue().getTime()));
					} catch (NullPointerException e){
						Notification.show(MessageResources.getString("recordingDateFormatException"));
						e.printStackTrace();
						return;
					}
					
					//setSizes - if only one size is entered it is stored to size1 as diameter
					//         - size must be between 0 and 9999
					try{
						if (size2.getValue().equals("")){
							woundDescription.setSize2(0);
							if (size1.getValue().equals("")){
								woundDescription.setSize1(0);
							} else {
								int size2Int = Integer.parseInt(size2.getValue());
								if (size2Int < 9999 && size2Int >= 0){
									woundDescription.setSize1(size2Int);
								} else {
									Notification.show(MessageResources.getString("sizeFormatException"));
									return;
								}
							}
							
						} else {
							int size1Int = Integer.parseInt(size1.getValue());
							if (size1Int < 9999 && size1Int >= 0){
								woundDescription.setSize1(size1Int);
								if (size2.getValue().equals("")){
									woundDescription.setSize2(0);
								} else {
									int size2Int = Integer.parseInt(size2.getValue());
									if (size2Int < 9999 && size2Int >= 0){
										woundDescription.setSize2(size2Int);
									} else {
										Notification.show(MessageResources.getString("sizeFormatException"));
										return;
									}
								} 
							} else {
								Notification.show(MessageResources.getString("sizeFormatException"));
								return;
							}
						}
					} catch(NumberFormatException e){
						//should never get here actually
						Notification.show("Die Größe ist im falschen Format angegeben.");
						e.printStackTrace();
						return;
					}
					
					//setDepth - depth must be between 0 and 99
					try {
						if (depth.getValue().equals("")){
							woundDescription.setDepth(0);
						} else {
							int depthInt = Integer.parseInt(depth.getValue());
							if (depthInt < 99 && depthInt >= 0){
								woundDescription.setDepth(depthInt);
							} else {
								Notification.show(MessageResources.getString("depthFormatException"));
								return;
							}
						}
					} catch (NumberFormatException e){
						//should never get here actually
						Notification.show("Die Tiefe ist im falschen Format angegeben.");
						e.printStackTrace();
						return;
					}
					
					
					//TODO: look out for problems with new views.
					wound.getWoundDescriptions().add(woundDescription);
					WoundDescriptionProvider.getInstance().add(woundDescription);
					
					/*
					 * need a new view, just navigating back would get the user 
					 * to the old view, which means the old list - new description
					 * would not be listed (even if created properly)
					 */
					getNavigationManager().navigateTo(new WoundDescriptionListView(wound));
	
			}

		});
		
		mainLayout.addComponent(createNewDescription);
		
		setContent(mainLayout);

	}
	@Override
	public void wardChanged(WardChangeEvent event) {
		WoundDescriptionListView newView = new WoundDescriptionListView(wound);
		getNavigationManager().setPreviousComponent(newView);

		
	}
}
