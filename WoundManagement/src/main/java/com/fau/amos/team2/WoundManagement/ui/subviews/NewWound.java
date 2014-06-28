package com.fau.amos.team2.WoundManagement.ui.subviews;

import java.util.Collection;
import java.util.Date;

import com.fau.amos.team2.WoundManagement.WoundManagementUI;
import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Origination;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundLevel;
import com.fau.amos.team2.WoundManagement.model.WoundLevelState;
import com.fau.amos.team2.WoundManagement.model.WoundType;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.PatientView;
import com.vaadin.addon.touchkit.ui.DatePicker;
import com.vaadin.addon.touchkit.ui.NumberField;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class NewWound extends FormLayout {

	private Patient currentPatient;
	
	private static WoundProvider woundProvider = 
			WoundProvider.getInstance();
	private static WoundTypeProvider woundTypeProvider = 
			WoundTypeProvider.getInstance();
	private static WoundLevelProvider woundLevelProvider = 
			WoundLevelProvider.getInstance();
	
	public NewWound(final PatientView parentView, final Patient patient, BodyLocation bodyLocation){
		currentPatient = patient;
		
		setSpacing(false);
		
		String width = "16em";
		String halfWidth = "8em";
		
		final Wound wound = new Wound();

		setSizeUndefined();
		
		//DateField - when is the wound recorded
		final DatePicker recorded = new DatePicker(MessageResources.getString("recordingDate") + ":"); //$NON-NLS-1$
		recorded.setValue(new Date());
		recorded.setLocale(getLocale());
		recorded.setInvalidAllowed(false);
		recorded.setWidth(width);
		addComponent(recorded);
		
		//ComboBox - body location code
		final NativeSelect location = new NativeSelect(MessageResources.getString("bodyLocationCode") + ":"); //$NON-NLS-1$
		for (BodyLocation b : BodyLocation.values()){
			location.addItem(b);
			location.setItemCaption(b, b.toFullString());
		}
		location.setValue(bodyLocation); //select chosen location
		location.setNullSelectionAllowed(false);
		location.setWidth(width);
		addComponent(location);
		
		//TextField - body location (in words)
		final TextField locationText = new TextField(MessageResources.getString("bodyLocation") + ":"); //$NON-NLS-1$
		locationText.setMaxLength(200);
		locationText.setWidth(width);
		addComponent(locationText);
		
		//ComboBox - wound type
		Collection<Object> typeIds = WoundTypeProvider.getInstance().getAll().getItemIds();
		final NativeSelect type = new NativeSelect(MessageResources.getString("woundType") + ":"); //$NON-NLS-1$
		for (Object o : typeIds){
			WoundType tmp = woundTypeProvider.getByID(o);
			type.addItem(tmp);
			type.setItemCaption(tmp, tmp.getClassification());
		}
		type.setWidth(width);
		addComponent(type);
		
		//ComboBox - wound level
		Collection<Object> levelIds = WoundLevelProvider.getInstance().getAll().getItemIds();
		final NativeSelect level = new NativeSelect(MessageResources.getString("woundLevel") + ":"); //$NON-NLS-1$
		for (Object o : levelIds){
			WoundLevel tmp = woundLevelProvider.getByID(o);
			level.addItem(tmp);
			level.setItemCaption(tmp, tmp.getCharacterisation());
		}
		level.setWidth(width);
		addComponent(level);
		
		//ComboBox - origination of wound
		final NativeSelect origination = new NativeSelect(MessageResources.getString("origination") + ":"); //$NON-NLS-1$
		for (Origination o : Origination.values()){
			origination.addItem(o);
			origination.setItemCaption(o, o.toFullString());
		}
		origination.setNullSelectionAllowed(false);
		origination.setWidth(width);
		addComponent(origination);
		
		//NumberField - height of wound
		final NumberField size1 = new NumberField(MessageResources.getString("height") + " (mm):"); //$NON-NLS-1$
		//size1.setValue("0"); //$NON-NLS-1$
		size1.setInvalidAllowed(false);
		size1.setWidth(width);
		addComponent(size1);
		
		//NumberField - width of wound
		final NumberField size2 = new NumberField(MessageResources.getString("width") + " (mm):"); //$NON-NLS-1$
		//size2.setValue("0"); //$NON-NLS-1$
		size2.setInvalidAllowed(false);
		size2.setWidth(width);
		addComponent(size2);
		
		//NumberField - depth of wound
		final NumberField depth = new NumberField(MessageResources.getString("depth") + " (mm):"); //$NON-NLS-1$
		//depth.setValue("0"); //$NON-NLS-1$
		depth.setInvalidAllowed(false);
		depth.setWidth(width);
		addComponent(depth);
		
		//TextField - commentary
		final TextArea comment = new TextArea(MessageResources.getString("description") + ":"); //$NON-NLS-1$
		comment.setMaxLength(2000);
		comment.setWidth(width);
		comment.setHeight(halfWidth);
		addComponent(comment);
		
		HorizontalLayout buttons = new HorizontalLayout();
		buttons.setSpacing(true);
		
		Button submit = new
				Button(MessageResources.getString("addWound")); //$NON-NLS-1$
		submit.setClickShortcut(KeyCode.ENTER);
		submit.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
				try {
					wound.setSensoID(7);
					wound.setPatient(currentPatient);
					
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
						WoundType woundType = (WoundType)type.getValue();
						wound.setWoundType(woundType);
						
						if (woundType.getLevelState() == WoundLevelState.REQUIRED && level.getValue() == null) {
							Notification.show(MessageResources.getString("woundType") + ": " + ((WoundType)type.getValue()).getClassification() + " - " + MessageResources.getString("woundLevelRequired")); //$NON-NLS-1$ //$NON-NLS-2$
							return;
						}
						else if (woundType.getLevelState() == WoundLevelState.FORBIDDEN && level.getValue() != null) {
							Notification.show(MessageResources.getString("woundType") + ": " + ((WoundType)type.getValue()).getClassification() + " - " + MessageResources.getString("woundLevelForbidden")); //$NON-NLS-1$ //$NON-NLS-2$
							return;
						}
						
						//check if BodyLocation is set according to chosen WoundType
						if (woundType.isBodyLocationRequired() && locationText.getValue().equals("")) { //$NON-NLS-1$
							Notification.show(MessageResources.getString("woundType") + ": " + ((WoundType)type.getValue()).getClassification() + " - " + MessageResources.getString("bodyLocationRequired")); //$NON-NLS-1$ //$NON-NLS-2$
							return;
						}
						// check if Size is set according to chosen WoundType
						if (woundType.isSizeIsRequired() && size1.getValue().equals("") && size2.getValue().equals("")) { //$NON-NLS-1$ //$NON-NLS-2$
							Notification.show(MessageResources.getString("woundType") + ": " + ((WoundType)type.getValue()).getClassification() + " - " + MessageResources.getString("sizeRequired")); //$NON-NLS-1$ //$NON-NLS-2$
							return;
						}						
					}
					
					//setBodyLocation (in words)
					wound.setBodyLocation(locationText.getValue());
					//setBodyLocationCode - null is not possible
					wound.setBodyLocationCode(((BodyLocation)location.getValue()).getValue());
					//setDescription - is automatically cut to at most 2000 characters
					wound.setDescription(comment.getValue());
					//setRecordingEmployee - currently logged in
					wound.setRecordingEmployee(((WoundManagementUI)UI.getCurrent()).getEnvironment().getCurrentEmployee());

					//setRecordingDate - all misformatted inputs result in "null"
					try{
						wound.setRecordingDate(new java.sql.Date(recorded.getValue().getTime()));
					} catch (NullPointerException e){
						Notification.show(MessageResources.getString("recordingDateFormatException")); //$NON-NLS-1$
						e.printStackTrace();
						return;
					}
					
					//setSizes - if only one size is entered it is stored to size1 as diameter
					//         - size must be between 0 and 9999
					try{
						if (size1.getValue().equals("") || size1.getValue().equals("0")){ //$NON-NLS-1$
							wound.setSize2(0);
							if (size2.getValue().equals("") || size2.getValue().equals("0")){ //$NON-NLS-1$
								wound.setSize1(0);
							} else {
								int size2Int = Integer.parseInt(size2.getValue());
								if (size2Int < 9999 && size2Int >= 0){
									wound.setSize1(size2Int);
								} else {
									Notification.show(MessageResources.getString("sizeFormatException")); //$NON-NLS-1$
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
										Notification.show(MessageResources.getString("sizeFormatException")); //$NON-NLS-1$
										return;
									}
								} 
							} else {
								Notification.show(MessageResources.getString("sizeFormatException")); //$NON-NLS-1$
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
								Notification.show(MessageResources.getString("depthFormatException")); //$NON-NLS-1$
								return;
							}
						}
					} catch (NumberFormatException e){
						//should never get here actually
						Notification.show("Die Tiefe ist im falschen Format angegeben."); //$NON-NLS-1$
						e.printStackTrace();
						return;
					}
					
					
					
					woundProvider.add(wound);
					
					currentPatient.getWounds().add(wound);
					
					parentView.setSelectedWound(wound);
				} catch (Exception e){
					//should never get here actually
					Notification.show("Daten nicht korrekt eingegeben!"); //$NON-NLS-1$
					e.printStackTrace();
					
				}
				
			}
		});
		
		Button cancel = new Button(MessageResources.getString("cancel")); //$NON-NLS-1$
		cancel.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
				parentView.setSelectedWound(null); 
			}
		});
		
		buttons.addComponent(submit);
		buttons.addComponent(cancel);
		
		addComponent(buttons);
		
	}
}
