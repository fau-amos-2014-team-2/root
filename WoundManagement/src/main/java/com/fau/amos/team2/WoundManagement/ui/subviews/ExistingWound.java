package com.fau.amos.team2.WoundManagement.ui.subviews;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Origination;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.PatientView;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class ExistingWound extends VerticalLayout {
	private static final long serialVersionUID = 4222621457384471453L;
	
	private final Wound wound;
	private PatientView parentView;

	private DateFormat dateFormat;
	
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
	
	private WoundProvider woundProvider =
			WoundProvider.getInstance();

	@SuppressWarnings("serial")
	public ExistingWound(final PatientView patientView, Wound w) {
		this.wound = w;
		this.parentView = patientView;
				
		setSpacing(true);
		HorizontalLayout woundDataContent = new HorizontalLayout();
		woundDataContent.setSpacing(true);
		
		VerticalLayout labelColumn = new VerticalLayout();
		VerticalLayout dataColumn = new VerticalLayout();
		woundDataContent.addComponents(labelColumn, dataColumn);
		labelColumn.setSpacing(true);
		dataColumn.setSpacing(true);
		
		String width = "16em";
		
		typeDecubitusLabel = new Label("");
		typeDecubitusLabel.setWidth(width);
		addComponent(typeDecubitusLabel);
		addComponent(woundDataContent);
		
		dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		labelColumn.addComponent(new Label(MessageResources.getString("recordingDate") + ":"));
		recordingDateLabel = new Label("");
		recordingDateLabel.setWidth(width);
		dataColumn.addComponent(recordingDateLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("from") + ":"));
		recordingEmployeeLabel = new Label("");
		recordingEmployeeLabel.setWidth(width);
		dataColumn.addComponent(recordingEmployeeLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("endDate") + ":"));
		endDateLabel = new Label("");
		endDateLabel.setWidth(width);
		dataColumn.addComponent(endDateLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("from") + ":"));
		cureEmployeeLabel = new Label("");
		cureEmployeeLabel.setWidth(width);
		dataColumn.addComponent(cureEmployeeLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("bodyLocationCode") + ":"));
		bodyLocationCodeLabel = new Label("");
		bodyLocationCodeLabel.setWidth(width);
		dataColumn.addComponent(bodyLocationCodeLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("bodyLocation") + ":"));
		bodyLocationLabel = new Label("");
		bodyLocationLabel.setWidth(width);
		dataColumn.addComponent(bodyLocationLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("woundLevel") + ":"));
		woundLevelLabel = new Label("");
		woundLevelLabel.setWidth(width);
		dataColumn.addComponent(woundLevelLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("size") + " (mm):"));
		sizeLabel = new Label("");
		sizeLabel.setWidth(width);
		dataColumn.addComponent(sizeLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("depth") + " (mm):"));
		depthLabel = new Label("");
		depthLabel.setWidth(width);
		dataColumn.addComponent(depthLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("origination") + ":"));
		originationLabel = new Label("");
		originationLabel.setWidth(width);
		dataColumn.addComponent(originationLabel);
		
		labelColumn.addComponent(new Label(MessageResources.getString("description") + ":"));
		descriptionLabel = new Label("");
		descriptionLabel.setWidth(width);
		dataColumn.addComponent(descriptionLabel);
		
		if (w.getEndDate() == null) {
			
			Button endWound = new Button(MessageResources.getString("endWound") + "...");
			endWound.addClickListener(new ClickListener(){
			
				@Override
				public void buttonClick(ClickEvent event) {
					
			        final Window doubleCheckSubWindow = new Window(MessageResources.getString("checkAgain"));
			        
			        doubleCheckSubWindow.setClosable(false);
			        
			        HorizontalLayout subContent = new HorizontalLayout();
			        subContent.addComponent(new Label(MessageResources.getString("checkEndWound")));
			        
			        Button yesButton = new Button(MessageResources.getString("yes"));
			        yesButton.addClickListener(new ClickListener() {
			        	
			        	@Override
			        	public void buttonClick(ClickEvent event) {
			        		
			        		wound.setEndDate(new java.sql.Date(new Date().getTime()));
			        		wound.setCureEmployee(parentView.getEnvironment().getCurrentEmployee());
			        		
							woundProvider.update(wound);
							
							doubleCheckSubWindow.close();
							
							Page.getCurrent().setUriFragment("");
							Page.getCurrent().setUriFragment(patientView.getEnvironment().getCurrentUriFragment());
			        	}
			        });
					
			        subContent.addComponent(yesButton);
			        
			        Button noButton = new Button(MessageResources.getString("no"));
			        noButton.addClickListener(new ClickListener() {
			        	
			        	@Override
			        	public void buttonClick(ClickEvent event) {
			        		doubleCheckSubWindow.close();
			        	}
			        });
			        
			        subContent.addComponent(noButton);
			        
			        subContent.setMargin(true);
			        
			        subContent.setSpacing(true);
			        doubleCheckSubWindow.setContent(subContent);
			        doubleCheckSubWindow.center();
			        
			        UI.getCurrent().addWindow(doubleCheckSubWindow);
				
				}
			
			});
			
			Button addWoundDescription = new Button(MessageResources.getString("woundDescriptions") + "...");
			addWoundDescription.addClickListener(new ClickListener(){
				@Override
				public void buttonClick(ClickEvent event) {
					parentView.getEnvironment().setCurrentWound(ExistingWound.this.wound);
					parentView.getEnvironment().setCurrentUriFragment("woundDescriptions");
					Page.getCurrent().setUriFragment(parentView.getEnvironment().getCurrentUriFragment());
				}
			});
		
			addComponent(endWound);
			addComponent(addWoundDescription);
		}
		
		setAllFields();
	}
	
	private void setAllFields(){
		this.setTypeDecubitusLabel();
		this.setRecordingDateLabel();
		this.setRecordingEmployeeLabel();
		this.setEndDateLabel();
		this.setCureEmployeeLabel();
		this.setBodyLocationCodeLabel();
		this.setBodyLocationLabel();
		this.setWoundLevelLabel();
		this.setSizeLabel();
		this.setDepthLabel();
		this.setOriginationLabel();
		this.setDescriptionLabel();
	}
	
	private void setTypeDecubitusLabel(){
		String typeDecubitus = MessageResources.getString("decubitusID") + (": ") + wound.getDecubitusId();
		if (wound.getWoundType() != null){
			typeDecubitus = wound.getWoundType().getClassification() + ", " + typeDecubitus;
		}
		if (wound.getEndDate() != null){
			typeDecubitus = typeDecubitus + " (" + MessageResources.getString("healed") + ")";
		}
		typeDecubitusLabel.setValue(typeDecubitus);
	}
	
	private void setRecordingDateLabel(){
		if (dateFormat != null){
			recordingDateLabel.setValue(dateFormat.format(wound.getRecordingDate()));
		}
	}
	
	private void setRecordingEmployeeLabel(){
		recordingEmployeeLabel.setValue(wound.getRecordingEmployee().getFirstName() + " " + wound.getRecordingEmployee().getLastName());
	}
	
	private void setEndDateLabel(){
		if (dateFormat != null){
			String endDate = "-"; 
			if (wound.getEndDate() != null){
				endDate = dateFormat.format(wound.getEndDate());
			}
			endDateLabel.setValue(endDate);
		}
	}
	
	private void setCureEmployeeLabel(){
		String cureEmployee = "-";
		if (wound.getCureEmployee() != null){
			cureEmployee = wound.getCureEmployee().getFirstName() + " " + wound.getCureEmployee().getLastName();
		}
		cureEmployeeLabel.setValue(cureEmployee);
	}
	
	private void setBodyLocationCodeLabel(){
		bodyLocationCodeLabel.setValue(BodyLocation.valueOf(wound.getBodyLocationCode()).toString());
	}
	
	private void setBodyLocationLabel(){
		bodyLocationLabel.setValue(wound.getBodyLocation());
	}
	
	private void setWoundLevelLabel(){
		String woundLevel = "";
		if (wound.getWoundLevel() != null){
			woundLevel = wound.getWoundLevel().getCharacterisation();
		} 
		woundLevelLabel.setValue(woundLevel);
	}
	
	private void setSizeLabel(){
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
	
	private void setDepthLabel(){
		String depth = "";
		if (wound.getDepth() != 0){
			depth = wound.getDepth()+"";
		} 
		depthLabel.setValue(depth);
	}
	
	private void setOriginationLabel(){
		originationLabel.setValue(Origination.valueOf(wound.getOrigination()).toString());
	}
	
	private void setDescriptionLabel(){
		descriptionLabel.setValue(wound.getDescription());
	}
}
