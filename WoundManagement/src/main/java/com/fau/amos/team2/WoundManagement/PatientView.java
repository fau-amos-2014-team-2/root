package com.fau.amos.team2.WoundManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager;
import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Origination;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
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
		setCaption(MessageResources.getString("patientView")); //$NON-NLS-1$
		
		HorizontalLayout content = new HorizontalLayout();
		WoundManager woundManager = new WoundManager(null);
		
		Wound wound = woundProvider.getByID(id);
		
		String width = "20em";
		
		VerticalLayout rightContent = new VerticalLayout();
		rightContent.setSpacing(true);
		HorizontalLayout woundDataContent = new HorizontalLayout();
		woundDataContent.setSpacing(true);
		//TODO: where does '(verheilt)' come from, where is it stored?
		String typeDecubitus = MessageResources.getString("decubitusID") + (": ") + wound.getDecubitusId() + " (" + MessageResources.getString("healed") + ")"; //$NON-NLS-1$ //$NON-NLS-2$
		if (wound.getWoundType() != null){
			typeDecubitus = wound.getWoundType().getClassification() + ", " + typeDecubitus; //$NON-NLS-1$
		}
		Label typeDecubitusLabel = new Label(typeDecubitus);
		typeDecubitusLabel.setWidth(width);
		rightContent.addComponent(typeDecubitusLabel);
		rightContent.addComponent(woundDataContent);		
		
		VerticalLayout labelColumn = new VerticalLayout();
		VerticalLayout dataColumn = new VerticalLayout();
		woundDataContent.addComponents(labelColumn, dataColumn);
		labelColumn.setSpacing(true);
		dataColumn.setSpacing(true);
		
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		labelColumn.addComponent(new Label(MessageResources.getString("recordingDate") + ":")); //$NON-NLS-1$
		Label recordingDateLabel = new Label(df.format(wound.getRecordingDate()));
		recordingDateLabel.setWidth(width);
		dataColumn.addComponent(recordingDateLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("from") + ":")); //$NON-NLS-1$
		Label recordingEmployeeLabel = new Label(wound.getRecordingEmployee().getFirstName() + " " + wound.getRecordingEmployee().getLastName()); //$NON-NLS-1$
		recordingEmployeeLabel.setWidth(width);
		dataColumn.addComponent(recordingEmployeeLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("endDate") + ":")); //$NON-NLS-1$
		String endDate = "-"; 
		if (wound.getEndDate() != null){
			endDate = df.format(wound.getEndDate());
		}
		Label endDateLabel = new Label(endDate);
		endDateLabel.setWidth(width);
		dataColumn.addComponent(endDateLabel);
				
		labelColumn.addComponent(new Label(MessageResources.getString("from") + ":")); //$NON-NLS-1$
		String cureEmployee = "-";
		if (wound.getCureEmployee() != null){
			cureEmployee = wound.getCureEmployee().getFirstName() + " " + wound.getCureEmployee().getLastName();
		}
		Label cureEmployeeLabel = new Label(cureEmployee);
		cureEmployeeLabel.setWidth(width);
		dataColumn.addComponent(cureEmployeeLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("bodyLocationCode") + ":")); //$NON-NLS-1$
		Label bodyLocationCodeLabel = new Label(BodyLocation.valueOf(wound.getBodyLocationCode()).toString());
		bodyLocationCodeLabel.setWidth(width);
		dataColumn.addComponent(bodyLocationCodeLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("bodyLocation") + ":")); //$NON-NLS-1$
		Label bodyLocationLabel = new Label(wound.getBodyLocation());
		bodyLocationLabel.setWidth(width);
		dataColumn.addComponent(bodyLocationLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("woundLevel") + ":")); //$NON-NLS-1$
		String woundLevel = "";
		if (wound.getWoundLevel() != null){
			woundLevel = wound.getWoundLevel().getCharacterisation();
		} 
		Label woundLevelLabel = new Label(woundLevel);
		woundLevelLabel.setWidth(width);
		dataColumn.addComponent(woundLevelLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("size") + " (mm):")); //$NON-NLS-1$
		String size = "";
		if (wound.getSize1() != 0){
			if (wound.getSize2() != 0){
				size = wound.getSize1() + " x " + wound.getSize2();
			} else {
				size = wound.getSize1() + " x " + wound.getSize1();
			}
		}
		Label sizeLabel = new Label(size);
		sizeLabel.setWidth(width);
		dataColumn.addComponent(sizeLabel);
		
		
		labelColumn.addComponent(new Label(MessageResources.getString("depth") + " (mm):")); //$NON-NLS-1$
		String depth = "";
		if (wound.getDepth() != 0){
			depth = wound.getDepth()+"";
		} 
		Label depthLabel = new Label(depth);
		depthLabel.setWidth(width);
		dataColumn.addComponent(depthLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("origination") + ":")); //$NON-NLS-1$
		Label originationLabel = new Label(Origination.valueOf(wound.getOrigination()).toString());
		originationLabel.setWidth(width);
		dataColumn.addComponent(originationLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("description") + ":")); //$NON-NLS-1$
		Label descriptionLabel = new Label(wound.getDescription());
		descriptionLabel.setWidth(width);
		dataColumn.addComponent(descriptionLabel);
		
		Button endWound = new Button(MessageResources.getString("endWound") + "..."); //$NON-NLS-1$
		endWound.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			}
		});
		Button addWoundDescription = new Button(MessageResources.getString("woundDescriptions") + "..."); //$NON-NLS-1$
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
