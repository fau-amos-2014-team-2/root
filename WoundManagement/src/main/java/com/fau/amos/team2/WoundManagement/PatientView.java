package com.fau.amos.team2.WoundManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager;
import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager.NewWoundChangeEvent;
import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager.NewWoundChangeListener;
import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager.SelectedWoundChangeEvent;
import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundPosition;
import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager.SelectedWoundChangeListener;
import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Origination;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.subviews.UserBar;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

/**
 * View to see a picture
 * 
 * @author ???
 */
public class PatientView extends NavigationView implements SelectedWoundChangeListener, NewWoundChangeListener {
	private static final long serialVersionUID = -572027045788648039L;
	
	private DateFormat dateFormat;
	private Patient currentPatient;
	
	private Label typeDecubitusLabel;
	private Label recordingDateLabel;
	private Label recordingEmployeeLabel;
	private Label endDateLabel;
	private Label cureEmployeeLabel;
	private Label bodyLocationCodeLabel;
	private Label bodyLocationLabel;
	private Label woundLevelLabel;
	private Label sizeLabel;
	private Label depthLabel;
	private Label originationLabel;
	private Label descriptionLabel;

	@SuppressWarnings("serial")
	public PatientView(Patient patient) {
		
		/*
		// TODO: Remove the following lines after the previous view (PatientSelectionView) is passing a real patient object.
		if (patient == null)
			patient = PatientProvider.getInstance().getByID(PatientProvider.getInstance().getAll().firstItemId());
		// End of code to remove
		*/
		
		this.currentPatient = patient;
		
		setRightComponent(new UserBar());
		
		setCaption(MessageResources.getString("patientView")); //$NON-NLS-1$
		
		HorizontalLayout content = new HorizontalLayout();
		WoundManager woundManager = new WoundManager(currentPatient);
		woundManager.addSelectedWoundChangeListener(this);
		woundManager.addNewWoundChangeListener(this);
		
		VerticalLayout rightContent = new VerticalLayout();
		rightContent.setSpacing(true);
		HorizontalLayout woundDataContent = new HorizontalLayout();
		woundDataContent.setSpacing(true);
		
		VerticalLayout labelColumn = new VerticalLayout();
		VerticalLayout dataColumn = new VerticalLayout();
		woundDataContent.addComponents(labelColumn, dataColumn);
		labelColumn.setSpacing(true);
		dataColumn.setSpacing(true);
		
		String width = "20em";

		
		typeDecubitusLabel = new Label("");
		typeDecubitusLabel.setWidth(width);
		rightContent.addComponent(typeDecubitusLabel);
		rightContent.addComponent(woundDataContent);
		
		dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		labelColumn.addComponent(new Label(MessageResources.getString("recordingDate") + ":")); //$NON-NLS-1$
		recordingDateLabel = new Label("");
		recordingDateLabel.setWidth(width);
		dataColumn.addComponent(recordingDateLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("from") + ":")); //$NON-NLS-1$
		recordingEmployeeLabel = new Label("");
		recordingEmployeeLabel.setWidth(width);
		dataColumn.addComponent(recordingEmployeeLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("endDate") + ":")); //$NON-NLS-1$
		endDateLabel = new Label("");
		endDateLabel.setWidth(width);
		dataColumn.addComponent(endDateLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("from") + ":")); //$NON-NLS-1$
		cureEmployeeLabel = new Label("");
		cureEmployeeLabel.setWidth(width);
		dataColumn.addComponent(cureEmployeeLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("bodyLocationCode") + ":")); //$NON-NLS-1$
		bodyLocationCodeLabel = new Label("");
		bodyLocationCodeLabel.setWidth(width);
		dataColumn.addComponent(bodyLocationCodeLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("bodyLocation") + ":")); //$NON-NLS-1$
		bodyLocationLabel = new Label("");
		bodyLocationLabel.setWidth(width);
		dataColumn.addComponent(bodyLocationLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("woundLevel") + ":")); //$NON-NLS-1$
		woundLevelLabel = new Label("");
		woundLevelLabel.setWidth(width);
		dataColumn.addComponent(woundLevelLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("size") + " (mm):")); //$NON-NLS-1$
		sizeLabel = new Label("");
		sizeLabel.setWidth(width);
		dataColumn.addComponent(sizeLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("depth") + " (mm):")); //$NON-NLS-1$
		depthLabel = new Label("");
		depthLabel.setWidth(width);
		dataColumn.addComponent(depthLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("origination") + ":")); //$NON-NLS-1$
		originationLabel = new Label("");
		originationLabel.setWidth(width);
		dataColumn.addComponent(originationLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("description") + ":")); //$NON-NLS-1$
		descriptionLabel = new Label("");
		descriptionLabel.setWidth(width);
		dataColumn.addComponent(descriptionLabel);
		
		if (!currentPatient.getWounds().isEmpty()){

			Wound wound = currentPatient.getWounds().iterator().next();
				
			this.setAllFields(wound);		
		}
		
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

	
	private void setAllFields(Wound wound){
		this.setTypeDecubitusLabel(wound);
		this.setRecordingDateLabel(wound);
		this.setRecordingEmployeeLabel(wound);
		this.setEndDateLabel(wound);
		this.setCureEmployeeLabel(wound);
		this.setBodyLocationCodeLabel(wound);
		this.setBodyLocationLabel(wound);
		this.setWoundLevelLabel(wound);
		this.setSizeLabel(wound);
		this.setDepthLabel(wound);
		this.setOriginationLabel(wound);
		this.setDescriptionLabel(wound);
	}
	
	private void emptyAllFields(){
		typeDecubitusLabel.setValue("");
		recordingDateLabel.setValue("");
		recordingEmployeeLabel.setValue("");
		endDateLabel.setValue("");
		cureEmployeeLabel.setValue("");
		bodyLocationCodeLabel.setValue("");
		bodyLocationLabel.setValue("");
		woundLevelLabel.setValue("");
		sizeLabel.setValue("");
		depthLabel.setValue("");
		originationLabel.setValue("");			
		descriptionLabel.setValue("");
	}
	
	private void setTypeDecubitusLabel(Wound wound){
		String typeDecubitus = MessageResources.getString("decubitusID") + (": ") + wound.getDecubitusId(); //$NON-NLS-1$ //$NON-NLS-2$
		if (wound.getWoundType() != null){
			typeDecubitus = wound.getWoundType().getClassification() + ", " + typeDecubitus; //$NON-NLS-1$
		}
		if (wound.getEndDate() != null){
			typeDecubitus = typeDecubitus + " (" + MessageResources.getString("healed") + ")";
		}
		typeDecubitusLabel.setValue(typeDecubitus);
	}
	
	private void setRecordingDateLabel(Wound wound){
		if (dateFormat != null){
			recordingDateLabel.setValue(dateFormat.format(wound.getRecordingDate()));
		}
	}
	
	private void setRecordingEmployeeLabel(Wound wound){
		recordingEmployeeLabel.setValue(wound.getRecordingEmployee().getFirstName() + " " + wound.getRecordingEmployee().getLastName()); //$NON-NLS-1$
	}
	
	private void setEndDateLabel(Wound wound){
		if (dateFormat != null){
			String endDate = "-"; 
			if (wound.getEndDate() != null){
				endDate = dateFormat.format(wound.getEndDate());
			}
			endDateLabel.setValue(endDate);
		}
	}
	
	private void setCureEmployeeLabel(Wound wound){
		String cureEmployee = "-";
		if (wound.getCureEmployee() != null){
			cureEmployee = wound.getCureEmployee().getFirstName() + " " + wound.getCureEmployee().getLastName();
		}
		cureEmployeeLabel.setValue(cureEmployee);
	}
	
	private void setBodyLocationCodeLabel(Wound wound){
		bodyLocationCodeLabel.setValue(BodyLocation.valueOf(wound.getBodyLocationCode()).toString());
	}
	
	private void setBodyLocationLabel(Wound wound){
		bodyLocationLabel.setValue(wound.getBodyLocation());
	}
	
	private void setWoundLevelLabel(Wound wound){
		String woundLevel = "";
		if (wound.getWoundLevel() != null){
			woundLevel = wound.getWoundLevel().getCharacterisation();
		} 
		woundLevelLabel.setValue(woundLevel);
	}
	
	private void setSizeLabel(Wound wound){
		String size = "";
		if (wound.getSize1() != 0){
			if (wound.getSize2() != 0){
				size = wound.getSize1() + " x " + wound.getSize2();
			} else {
				size = wound.getSize1() + " x " + wound.getSize1();
			}
		}
		sizeLabel.setValue(size);
	}
	
	private void setDepthLabel(Wound wound){
		String depth = "";
		if (wound.getDepth() != 0){
			depth = wound.getDepth()+"";
		} 
		depthLabel.setValue(depth);
	}
	
	private void setOriginationLabel(Wound wound){
		originationLabel.setValue(Origination.valueOf(wound.getOrigination()).toString());
	}
	
	private void setDescriptionLabel(Wound wound){
		descriptionLabel.setValue(wound.getDescription());
	}
	

	@Override
	public void selectedWoundChanged(SelectedWoundChangeEvent event) {
		Wound selectedWound = event.getWound();
		if (selectedWound != null) {
			this.setAllFields(selectedWound);		
		}
		else {
			this.emptyAllFields();
		}
	}
	
	@Override
	public void newWoundChanged(NewWoundChangeEvent event) {
		WoundPosition woundPosition = event.getWoundPosition();
		if (woundPosition != null){
			getNavigationManager().navigateTo(new NewWoundView(currentPatient, woundPosition.getBodyLocation(), Environment.INSTANCE.getCurrentEmployee()));
		}
	}
}
