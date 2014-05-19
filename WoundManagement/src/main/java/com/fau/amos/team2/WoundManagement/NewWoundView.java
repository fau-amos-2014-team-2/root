package com.fau.amos.team2.WoundManagement;

import java.util.Collection;
import java.util.Date;
import java.util.ResourceBundle;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Origination;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundLevel;
import com.fau.amos.team2.WoundManagement.model.WoundType;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.NumberField;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;

@SuppressWarnings("serial")
public class NewWoundView extends NavigationView {
	
	public NewWoundView(final ResourceBundle messages, final Patient patient, BodyLocation bodyLocation, final Employee currentUser){
				
		setCaption(messages.getString("addNewWound")); //$NON-NLS-1$
		
		String width = "20em";
		String halfWidth = "10em";
		
		final Wound wound = new Wound();

		FormLayout layout = new FormLayout();
		layout.setSizeUndefined();
		
		//DateField - when is the wound recorded
		final DateField recorded = new DateField(messages.getString("recordingDate") + ":"); //$NON-NLS-1$
		recorded.setValue(new Date());
		recorded.setDateFormat("dd.MM.yyyy");
		recorded.setInvalidAllowed(false);
		recorded.setWidth(width);
		layout.addComponent(recorded);
		
		//ComboBox - body location code
		final ComboBox location = new ComboBox(messages.getString("bodyLocationCode") + ":"); //$NON-NLS-1$
		for (BodyLocation b : BodyLocation.values()){
			location.addItem(b);
			location.setItemCaption(b, b.toFullString());
		}
		location.setValue(bodyLocation); //select chosen location
		location.setNullSelectionAllowed(false);
		location.setWidth(width);
		layout.addComponent(location);
		
		//TextField - body location (in words)
		final TextField locationText = new TextField(messages.getString("bodyLocation") + ":"); //$NON-NLS-1$
		locationText.setMaxLength(200);
		locationText.setWidth(width);
		layout.addComponent(locationText);
		
		//ComboBox - wound type
		Collection<Object> typeIds = WoundTypeProvider.getInstance().getAll().getItemIds();
		final ComboBox type = new ComboBox(messages.getString("woundType") + ":"); //$NON-NLS-1$
		for (Object o : typeIds){
			WoundType tmp = WoundTypeProvider.getInstance().getByID(o);
			type.addItem(tmp);
			type.setItemCaption(tmp, tmp.getClassification());
		}
		type.setWidth(width);
		layout.addComponent(type);
		
		//ComboBox - wound level
		Collection<Object> levelIds = WoundLevelProvider.getInstance().getAll().getItemIds();
		final ComboBox level = new ComboBox(messages.getString("woundLevel") + ":"); //$NON-NLS-1$
		for (Object o : levelIds){
			WoundLevel tmp = WoundLevelProvider.getInstance().getByID(o);
			level.addItem(tmp);
			level.setItemCaption(tmp, tmp.getCharacterisation());
		}
		level.setWidth(width);
		layout.addComponent(level);
		
		//ComboBox - origination of wound
		final ComboBox origination = new ComboBox(messages.getString("origination") + ":"); //$NON-NLS-1$
		for (Origination o : Origination.values()){
			origination.addItem(o);
			origination.setItemCaption(o, o.toFullString());
		}
		origination.setNullSelectionAllowed(false);
		origination.setWidth(width);
		layout.addComponent(origination);
		
		//NumberField - height of wound
		final NumberField size1 = new NumberField(messages.getString("height") + " (mm):"); //$NON-NLS-1$
		size1.setValue("0"); //$NON-NLS-1$
		size1.setInvalidAllowed(false);
		size1.setWidth(width);
		layout.addComponent(size1);
		
		//NumberField - width of wound
		final NumberField size2 = new NumberField(messages.getString("width") + " (mm):"); //$NON-NLS-1$
		size2.setValue("0"); //$NON-NLS-1$
		size2.setInvalidAllowed(false);
		size2.setWidth(width);
		layout.addComponent(size2);
		
		//NumberField - depth of wound
		final NumberField depth = new NumberField(messages.getString("depth") + " (mm):"); //$NON-NLS-1$
		depth.setValue("0"); //$NON-NLS-1$
		depth.setInvalidAllowed(false);
		depth.setWidth(width);
		layout.addComponent(depth);
		
		//TextField - commentary
		final TextArea comment = new TextArea(messages.getString("description") + ":"); //$NON-NLS-1$
		comment.setMaxLength(2000);
		comment.setWidth(width);
		comment.setHeight(halfWidth);
		layout.addComponent(comment);
		
		HorizontalLayout buttons = new HorizontalLayout();
		buttons.setSpacing(true);
		
		Button submit = new
				Button(messages.getString("addWound")); //$NON-NLS-1$
		submit.setClickShortcut(KeyCode.ENTER);
		submit.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
				try {
					//TODO: where does the DecubitusId come from?
					//TODO: what is SensoID? Do I need it?
					//TODO: BodyLocation or BodyLocationCode required?
					//TODO: how to react on different inputs for Date or Number
					wound.setDecubitusId(42);
					wound.setSensoID(7);
					wound.setPatient(patient);
					
					//setOrigination - if none is entered, choose Origination.NULL = 0
					if (origination.getValue() != null){
						wound.setOrigination(((Origination)origination.getValue()).getValue());
					} else {
						wound.setOrigination(0);
					}
					
					//setWoundLevel
					if (level.getValue() != null){
						wound.setWoundLevel((WoundLevel)level.getValue());
					}
					
					//setWoundType
					if (type.getValue() != null){
						wound.setWoundType((WoundType)type.getValue());
						
						//check if WoundLevel is set according to chosen WoundType
						//'P''p' - level required
						//'V''v' - level forbidden
						//'E''e' - level allowed
						if ('p' == (((WoundType)type.getValue()).getLevel()) || 'P' == (((WoundType)type.getValue()).getLevel())){
							if (level.getValue() == null){
								Notification.show(messages.getString("woundType") + ": " + ((WoundType)type.getValue()).getClassification() + " - " + messages.getString("woundLevelRequired")); //$NON-NLS-1$ //$NON-NLS-2$
								return;
							}
						} else if ('v' == (((WoundType)type.getValue()).getLevel()) || 'V' == (((WoundType)type.getValue()).getLevel())){
							if (level.getValue() != null){
								Notification.show(messages.getString("woundType") + ": " + ((WoundType)type.getValue()).getClassification() + " - " + messages.getString("woundLevelForbidden")); //$NON-NLS-1$ //$NON-NLS-2$
								return;
							}
						}
						//check if BodyLocation is set according to chosen WoundType
						if (((WoundType)type.getValue()).isBodyLocationRequired()){
							if (locationText.getValue().equals("")){ //$NON-NLS-1$
								Notification.show(messages.getString("woundType") + ": " + ((WoundType)type.getValue()).getClassification() + " - " + messages.getString("bodyLocationRequired")); //$NON-NLS-1$ //$NON-NLS-2$
								return;
							}
						}
						// check if Size is set according to chosen WoundType
						if (((WoundType)type.getValue()).isSizeIsRequired()){
							if (size1.getValue().equals("") && size2.getValue().equals("")){ //$NON-NLS-1$ //$NON-NLS-2$
								Notification.show(messages.getString("woundType") + ": " + ((WoundType)type.getValue()).getClassification() + " - " + messages.getString("sizeRequired")); //$NON-NLS-1$ //$NON-NLS-2$
								return;
							}
						}
						
					}
					
					//setBodyLocation (in words)
					wound.setBodyLocation(locationText.getValue());
					//setBodyLocationCode - null is not possible
					wound.setBodyLocationCode(((BodyLocation)location.getValue()).getValue());
					//setDescription - is automatically cut to at most 2000 characters
					wound.setDescription(comment.getValue());
					//setRecordingEmployee - currently logged in
					wound.setRecordingEmployee(currentUser);

					//setRecordingDate - all misformatted inputs result in "null"
					try{
						wound.setRecordingDate(new java.sql.Date(recorded.getValue().getTime()));
					} catch (NullPointerException e){
						Notification.show(messages.getString("recordingDateFormatException")); //$NON-NLS-1$
						e.printStackTrace();
						return;
					}
					
					//setSizes - if only one size is entered it is stored to size1 as diameter
					//         - size must be between 0 and 9999
					try{
						if (size1.getValue().equals("")){ //$NON-NLS-1$
							wound.setSize2(0);
							if (size2.getValue().equals("")){ //$NON-NLS-1$
								wound.setSize1(0);
							} else {
								int size2Int = Integer.parseInt(size2.getValue());
								if (size2Int < 9999 && size2Int >= 0){
									wound.setSize1(size2Int);
								} else {
									Notification.show(messages.getString("sizeFormatException")); //$NON-NLS-1$
									return;
								}
							}
							
						} else {
							int size1Int = Integer.parseInt(size1.getValue());
							if (size1Int < 9999 && size1Int >= 0){
								wound.setSize1(size1Int);
								if (size2.getValue().equals("")){ //$NON-NLS-1$
									wound.setSize2(0);
								} else {
									int size2Int = Integer.parseInt(size2.getValue());
									if (size2Int < 9999 && size2Int >= 0){
										wound.setSize2(size2Int);
									} else {
										Notification.show(messages.getString("sizeFormatException")); //$NON-NLS-1$
										return;
									}
								} 
							} else {
								Notification.show(messages.getString("sizeFormatException")); //$NON-NLS-1$
								return;
							}
						}
					} catch(NumberFormatException e){
						//should never get here actually
						Notification.show("Die Größe ist im falschen Format angegeben."); //$NON-NLS-1$
						e.printStackTrace();
						return;
					}
					
					//setDepth - depth must be between 0 and 99
					try {
						if (depth.getValue().equals("")){ //$NON-NLS-1$
							wound.setDepth(0);
						} else {
							int depthInt = Integer.parseInt(depth.getValue());
							if (depthInt < 99 && depthInt >= 0){
								wound.setDepth(depthInt);
							} else {
								Notification.show(messages.getString("depthFormatException")); //$NON-NLS-1$
								return;
							}
						}
					} catch (NumberFormatException e){
						//should never get here actually
						Notification.show("Die Tiefe ist im falschen Format angegeben."); //$NON-NLS-1$
						e.printStackTrace();
						return;
					}
					
					
					
					WoundProvider.getInstance().add(wound);
					getNavigationManager().navigateBack();
				
				} catch (Exception e){
					//should never get here actually
					Notification.show("Daten nicht korrekt eingegeben!"); //$NON-NLS-1$
					e.printStackTrace();
					
				}
				
			}
		});
		
		Button cancel = new Button(messages.getString("cancel")); //$NON-NLS-1$
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
