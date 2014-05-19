package com.fau.amos.team2.WoundManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager;
import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Origination;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * View to see a picture
 * 
 * @author ???
 */
public class PatientView extends NavigationView {
	private static final long serialVersionUID = -572027045788648039L;

	private WoundProvider<Wound> woundProvider = 
			(WoundProvider<Wound>) WoundProvider.getInstance();
	
	@SuppressWarnings("serial")
	public PatientView(Object id) {
		setCaption("Patientenansicht");
		
		HorizontalLayout content = new HorizontalLayout();
		WoundManager woundManager = new WoundManager(null);
		
		Wound wound = woundProvider.getByID(id);
		
		VerticalLayout rightContent = new VerticalLayout();
		rightContent.setSpacing(true);
		HorizontalLayout woundDataContent = new HorizontalLayout();
		woundDataContent.setSpacing(true);
		//TODO: where does '(verheilt)' come from, where is it stored?
		String typeDecubitus = "id: " + wound.getDecubitusId() + " (verheilt)";
		if (wound.getWoundType() != null){
			typeDecubitus = wound.getWoundType().getClassification() + ", " + typeDecubitus;
		}
		Label typeDecubitusLabel = new Label(typeDecubitus);
		typeDecubitusLabel.setWidth("20em");
		rightContent.addComponent(typeDecubitusLabel);
		rightContent.addComponent(woundDataContent);		
		
		VerticalLayout labelColumn = new VerticalLayout();
		VerticalLayout dataColumn = new VerticalLayout();
		woundDataContent.addComponents(labelColumn, dataColumn);
		labelColumn.setSpacing(true);
		dataColumn.setSpacing(true);
		
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		labelColumn.addComponent(new Label("Erfasst am:"));
		Label recordingDateLabel = new Label(df.format(wound.getRecordingDate()));
		recordingDateLabel.setWidth("20em");
		dataColumn.addComponent(recordingDateLabel);
		
		labelColumn.addComponent(new Label("von:"));
		Label recordingEmployeeLabel = new Label(wound.getRecordingEmployee().getFirstName() + " " + wound.getRecordingEmployee().getLastName());
		recordingEmployeeLabel.setWidth("20em");
		dataColumn.addComponent(recordingEmployeeLabel);
		
		labelColumn.addComponent(new Label("Beendet am:"));
		String endDate = "-";
		if (wound.getEndDate() != null){
			endDate = df.format(wound.getEndDate());
		}
		Label endDateLabel = new Label(endDate);
		endDateLabel.setWidth("20em");
		dataColumn.addComponent(endDateLabel);
				
		labelColumn.addComponent(new Label("von:"));
		String cureEmployee = "-";
		if (wound.getCureEmployee() != null){
			cureEmployee = wound.getCureEmployee().getFirstName() + " " + wound.getCureEmployee().getLastName();
		}
		Label cureEmployeeLabel = new Label(cureEmployee);
		cureEmployeeLabel.setWidth("20em");
		dataColumn.addComponent(cureEmployeeLabel);
		
		labelColumn.addComponent(new Label("Körperregion:"));
		Label bodyLocationCodeLabel = new Label(BodyLocation.valueOf(wound.getBodyLocationCode()).toString());
		bodyLocationCodeLabel.setWidth("20em");
		dataColumn.addComponent(bodyLocationCodeLabel);
		
		labelColumn.addComponent(new Label("Körperstelle:"));
		Label bodyLocationLabel = new Label(wound.getBodyLocation());
		bodyLocationLabel.setWidth("20em");
		dataColumn.addComponent(bodyLocationLabel);
		
		labelColumn.addComponent(new Label("Grad:"));
		String woundLevel = "";
		if (wound.getWoundLevel() != null){
			woundLevel = wound.getWoundLevel().getCharacterisation();
		} 
		Label woundLevelLabel = new Label(woundLevel);
		woundLevelLabel.setWidth("20em");
		dataColumn.addComponent(woundLevelLabel);
		
		labelColumn.addComponent(new Label("Größe (mm):"));
		String size = "";
		if (wound.getSize1() != 0){
			if (wound.getSize2() != 0){
				size = wound.getSize1() + " x " + wound.getSize2();
			} else {
				size = wound.getSize1() + " x " + wound.getSize1();
			}
		}
		Label sizeLabel = new Label(size);
		sizeLabel.setWidth("20em");
		dataColumn.addComponent(sizeLabel);
		
		
		labelColumn.addComponent(new Label("Tiefe (mm):"));
		String depth = "";
		if (wound.getDepth() != 0){
			depth = wound.getDepth()+"";
		} 
		Label depthLabel = new Label(depth);
		depthLabel.setWidth("20em");
		dataColumn.addComponent(depthLabel);
		
		labelColumn.addComponent(new Label("Wo entstanden:"));
		Label originationLabel = new Label(Origination.valueOf(wound.getOrigination()).toString());
		originationLabel.setWidth("20em");
		dataColumn.addComponent(originationLabel);
		
		labelColumn.addComponent(new Label("Bemerkung:"));
		Label descriptionLabel = new Label(wound.getDescription());
		descriptionLabel.setWidth("20em");
		dataColumn.addComponent(descriptionLabel);
		
		Button endWound = new Button("Wunde beenden...");
		endWound.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			}
		});
		Button addWoundDescription = new Button("Wundbeschreibungen...");
		addWoundDescription.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			}
		});
		
		rightContent.addComponent(endWound);
		rightContent.addComponent(addWoundDescription);
		
		content.addComponents(woundManager.getWoundSelector(), rightContent);
		
		setContent(content);
	}
}
