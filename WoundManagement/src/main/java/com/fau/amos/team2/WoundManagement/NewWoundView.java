package com.fau.amos.team2.WoundManagement;

import java.util.Collection;
import java.util.Date;

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
	
	private static WoundProvider<Wound> woundProvider = 
			(WoundProvider<Wound>) WoundProvider.getInstance();
	private static WoundTypeProvider<WoundType> woundTypeProvider = 
			(WoundTypeProvider<WoundType>) WoundTypeProvider.getInstance();
	private static WoundLevelProvider<WoundLevel> woundLevelProvider = 
			(WoundLevelProvider<WoundLevel>) WoundLevelProvider.getInstance();
	
	public NewWoundView(final Patient patient, BodyLocation bodyLocation, final Employee currentUser){
				
		setCaption("Neue Wunde anlegen");
		
		final Wound wound = new Wound();

		FormLayout layout = new FormLayout();
		layout.setSizeUndefined();
		
		//DateField - when is the wound recorded
		final DateField recorded = new DateField("Erfasst am:");
		recorded.setValue(new Date());
		recorded.setDateFormat("dd.MM.yyyy");
		recorded.setInvalidAllowed(false);
		recorded.setWidth("20em");
		layout.addComponent(recorded);
		
		//ComboBox - body location code
		final ComboBox location = new ComboBox("Körperregion:");
		for (BodyLocation b : BodyLocation.values()){
			location.addItem(b);
			location.setItemCaption(b, b.toFullString());
		}
		location.setValue(bodyLocation); //select chosen location
		location.setNullSelectionAllowed(false);
		location.setWidth("20em");
		layout.addComponent(location);
		
		//TextField - body location (in words)
		final TextField locationText = new TextField("Körperstelle:");
		locationText.setMaxLength(200);
		locationText.setWidth("20em");
		layout.addComponent(locationText);
		
		//ComboBox - wound type
		Collection<Object> typeIds = WoundTypeProvider.getInstance().getAll().getItemIds();
		final ComboBox type = new ComboBox("Wundart:");
		for (Object o : typeIds){
			WoundType tmp = woundTypeProvider.getByID(o);
			type.addItem(tmp);
			type.setItemCaption(tmp, tmp.getClassification());
		}
		type.setWidth("20em");
		layout.addComponent(type);
		
		//ComboBox - wound level
		Collection<Object> levelIds = WoundLevelProvider.getInstance().getAll().getItemIds();
		final ComboBox level = new ComboBox("Grad:");
		for (Object o : levelIds){
			WoundLevel tmp = woundLevelProvider.getByID(o);
			level.addItem(tmp);
			level.setItemCaption(tmp, tmp.getCharacterisation());
		}
		level.setWidth("20em");
		layout.addComponent(level);
		
		//ComboBox - origination of wound
		final ComboBox origination = new ComboBox("Wo entstanden:");
		for (Origination o : Origination.values()){
			origination.addItem(o);
			origination.setItemCaption(o, o.toFullString());
		}
		origination.setNullSelectionAllowed(false);
		origination.setWidth("20em");
		layout.addComponent(origination);
		
		//NumberField - height of wound
		final NumberField size1 = new NumberField("Höhe");
		size1.setValue("0");
		size1.setInvalidAllowed(false);
		size1.setWidth("20em");
		layout.addComponent(size1);
		
		//NumberField - width of wound
		final NumberField size2 = new NumberField("Breite");
		size2.setValue("0");
		size2.setInvalidAllowed(false);
		size2.setWidth("20em");
		layout.addComponent(size2);
		
		//NumberField - depth of wound
		final NumberField depth = new NumberField("Tiefe");
		depth.setValue("0");
		depth.setInvalidAllowed(false);
		depth.setWidth("20em");
		layout.addComponent(depth);
		
		//TextField - commentary
		final TextArea comment = new TextArea("Bemerkung");
		comment.setMaxLength(2000);
		comment.setWidth("20em");
		comment.setHeight("10em");
		layout.addComponent(comment);
		
		HorizontalLayout buttons = new HorizontalLayout();
		buttons.setSpacing(true);
		
		Button submit = new Button("Wunde anlegen");
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
								Notification.show("Wundtyp: " + ((WoundType)type.getValue()).getClassification() + " - der Wundgrad muss angegeben werden.");
								return;
							}
						} else if ('v' == (((WoundType)type.getValue()).getLevel()) || 'V' == (((WoundType)type.getValue()).getLevel())){
							if (level.getValue() != null){
								Notification.show("Wundtyp: " + ((WoundType)type.getValue()).getClassification() + " - es darf kein Wundgrad angegeben werden.");
								return;
							}
						}
						//check if BodyLocation is set according to chosen WoundType
						if (((WoundType)type.getValue()).isBodyLocationRequired()){
							if (locationText.getValue().equals("")){
								Notification.show("Wundtyp: " + ((WoundType)type.getValue()).getClassification() + " - die Körperstelle muss angegeben werden.");
								return;
							}
						}
						// check if Size is set according to chosen WoundType
						if (((WoundType)type.getValue()).isSizeIsRequired()){
							if (size1.getValue().equals("") && size2.getValue().equals("")){
								Notification.show("Wundtyp: " + ((WoundType)type.getValue()).getClassification() + " - die Größe muss angegeben werden.");
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
						Notification.show("Das Erfassungsdatum wurde nicht im richtigen Format angegeben.\nKorrekt wäre 'TT.MM.JJJJ', z.B. '25.04.2014'.");
						e.printStackTrace();
						return;
					}
					
					//setSizes - if only one size is entered it is stored to size1 as diameter
					//         - size must be between 0 and 9999
					try{
						if (size1.getValue().equals("")){
							wound.setSize2(0);
							if (size2.getValue().equals("")){
								wound.setSize1(0);
							} else {
								int size2Int = Integer.parseInt(size2.getValue());
								if (size2Int < 9999 && size2Int >= 0){
									wound.setSize1(size2Int);
								} else {
									Notification.show("Bitte korrigieren Sie die Größenangabe (0 - 9999).");
									return;
								}
							}
							
						} else {
							int size1Int = Integer.parseInt(size1.getValue());
							if (size1Int < 9999 && size1Int >= 0){
								wound.setSize1(size1Int);
								if (size2.getValue().equals("")){
									wound.setSize2(0);
								} else {
									int size2Int = Integer.parseInt(size2.getValue());
									if (size2Int < 9999 && size2Int >= 0){
										wound.setSize2(size2Int);
									} else {
										Notification.show("Bitte korrigieren Sie die Größenangabe (0 - 9999).");
										return;
									}
								} 
							} else {
								Notification.show("Bitte korrigieren Sie die Größenangabe (0 - 9999).");
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
							wound.setDepth(0);
						} else {
							int depthInt = Integer.parseInt(depth.getValue());
							if (depthInt < 99 && depthInt >= 0){
								wound.setDepth(depthInt);
							} else {
								Notification.show("Bitte korrigieren Sie die Tiefenangabe (0 - 99).");
								return;
							}
						}
					} catch (NumberFormatException e){
						//should never get here actually
						Notification.show("Die Tiefe ist im falschen Format angegeben.");
						e.printStackTrace();
						return;
					}
					
					
					
					woundProvider.add(wound);
					getNavigationManager().navigateBack();
				
				} catch (Exception e){
					//should never get here actually
					Notification.show("Daten nicht korrekt eingegeben!");
					e.printStackTrace();
					
				}
				
			}
		});
		
		Button cancel = new Button("Abbrechen");
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
