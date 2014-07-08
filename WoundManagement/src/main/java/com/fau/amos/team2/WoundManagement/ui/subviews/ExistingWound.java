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
		VerticalLayout woundDataContent = new VerticalLayout();
		woundDataContent.setSpacing(true);
		
		String width = "16em";
		String labelWidth = "10em";
		
		typeDecubitusLabel = new Label("");
		typeDecubitusLabel.setWidth(width);
		addComponent(typeDecubitusLabel);
		addComponent(woundDataContent);
		
		dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		recordingDateLabel = new Label("");
		recordingDateLabel.setWidth(width);
		HorizontalLayout recordingDateLayout = new HorizontalLayout();
		Label labelRecordingDate = new Label(MessageResources.getString("recordingDate") + ":");
		labelRecordingDate.setWidth(labelWidth);
		recordingDateLayout.addComponent(labelRecordingDate);
		recordingDateLayout.addComponent(recordingDateLabel);
		recordingDateLayout.setSpacing(true);
		woundDataContent.addComponent(recordingDateLayout);
		
		recordingEmployeeLabel = new Label("");
		recordingEmployeeLabel.setWidth(width);
		HorizontalLayout recordingEmployeeLayout = new HorizontalLayout();
		Label labelRecordingEmployee = new Label(MessageResources.getString("from") + ":");
		labelRecordingEmployee.setWidth(labelWidth);
		recordingEmployeeLayout.addComponent(labelRecordingEmployee);
		recordingEmployeeLayout.addComponent(recordingEmployeeLabel);
		recordingEmployeeLayout.setSpacing(true);
		woundDataContent.addComponent(recordingEmployeeLayout);
		
		endDateLabel = new Label("");
		endDateLabel.setWidth(width);
		HorizontalLayout endDateLayout = new HorizontalLayout();
		Label labelEndDate = new Label(MessageResources.getString("endDate") + ":");
		labelEndDate.setWidth(labelWidth);
		endDateLayout.addComponent(labelEndDate);
		endDateLayout.addComponent(endDateLabel);
		endDateLayout.setSpacing(true);
		woundDataContent.addComponent(endDateLayout);
		
		cureEmployeeLabel = new Label("");
		cureEmployeeLabel.setWidth(width);
		HorizontalLayout cureEmployeeLayout = new HorizontalLayout();
		Label labelCureEmployee = new Label(MessageResources.getString("from") + ":");
		labelCureEmployee.setWidth(labelWidth);
		cureEmployeeLayout.addComponent(labelCureEmployee);
		cureEmployeeLayout.addComponent(cureEmployeeLabel);
		cureEmployeeLayout.setSpacing(true);
		woundDataContent.addComponent(cureEmployeeLayout);
		
		bodyLocationCodeLabel = new Label("");
		bodyLocationCodeLabel.setWidth(width);
		HorizontalLayout bodyLocationCodeLayout = new HorizontalLayout();
		Label labelBodyLocationCode = new Label(MessageResources.getString("bodyLocationCode") + ":");
		labelBodyLocationCode.setWidth(labelWidth);
		bodyLocationCodeLayout.addComponent(labelBodyLocationCode);
		bodyLocationCodeLayout.addComponent(bodyLocationCodeLabel);
		bodyLocationCodeLayout.setSpacing(true);
		woundDataContent.addComponent(bodyLocationCodeLayout);
		
		bodyLocationLabel = new Label("");
		bodyLocationLabel.setWidth(width);
		HorizontalLayout bodyLocationLayout = new HorizontalLayout();
		Label labelBodyLocation = new Label(MessageResources.getString("bodyLocation") + ":");
		labelBodyLocation.setWidth(labelWidth);
		bodyLocationLayout.addComponent(labelBodyLocation);
		bodyLocationLayout.addComponent(bodyLocationLabel);
		bodyLocationLayout.setSpacing(true);
		woundDataContent.addComponent(bodyLocationLayout);
		
		woundLevelLabel = new Label("");
		woundLevelLabel.setWidth(width);
		HorizontalLayout woundLevelLayout = new HorizontalLayout();
		Label labelWoundLevel = new Label(MessageResources.getString("woundLevel") + ":");
		labelWoundLevel.setWidth(labelWidth);
		woundLevelLayout.addComponent(labelWoundLevel);
		woundLevelLayout.addComponent(woundLevelLabel);
		woundLevelLayout.setSpacing(true);
		woundDataContent.addComponent(woundLevelLayout);
		
		sizeLabel = new Label("");
		sizeLabel.setWidth(width);
		HorizontalLayout sizeLayout = new HorizontalLayout();
		Label labelSize = new Label(MessageResources.getString("size") + ":");
		labelSize.setWidth(labelWidth);
		sizeLayout.addComponent(labelSize);
		sizeLayout.addComponent(sizeLabel);
		sizeLayout.setSpacing(true);
		woundDataContent.addComponent(sizeLayout);
		
		depthLabel = new Label("");
		depthLabel.setWidth(width);
		HorizontalLayout depthLayout = new HorizontalLayout();
		Label labelDepth = new Label(MessageResources.getString("depth") + ":");
		labelDepth.setWidth(labelWidth);
		depthLayout.addComponent(labelDepth);
		depthLayout.addComponent(depthLabel);
		depthLayout.setSpacing(true);
		woundDataContent.addComponent(depthLayout);
		
		originationLabel = new Label("");
		originationLabel.setWidth(width);
		HorizontalLayout originationLayout = new HorizontalLayout();
		Label labelOrigination = new Label(MessageResources.getString("origination") + ":");
		labelOrigination.setWidth(labelWidth);
		originationLayout.addComponent(labelOrigination);
		originationLayout.addComponent(originationLabel);
		originationLayout.setSpacing(true);
		woundDataContent.addComponent(originationLayout);
		
		descriptionLabel = new Label("");
		descriptionLabel.setWidth(width);
		HorizontalLayout descriptionLayout = new HorizontalLayout();
		Label labelDescription = new Label(MessageResources.getString("description") + ":");
		labelDescription.setWidth(labelWidth);
		descriptionLayout.addComponent(labelDescription);
		descriptionLayout.addComponent(descriptionLabel);
		descriptionLayout.setSpacing(true);
		woundDataContent.addComponent(descriptionLayout);
		
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
