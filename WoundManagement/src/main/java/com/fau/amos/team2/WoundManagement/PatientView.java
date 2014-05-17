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

	@SuppressWarnings("serial")
	public PatientView(Object id) {
		setCaption("Patientenansicht");
		
		HorizontalLayout content = new HorizontalLayout();
		WoundManager woundManager = new WoundManager(null);
		
		Wound wound = WoundProvider.getInstance().getByID(id);
		
		VerticalLayout rightContent = new VerticalLayout();
		rightContent.setSpacing(true);
		HorizontalLayout woundDataContent = new HorizontalLayout();
		woundDataContent.setSpacing(true);
		rightContent.addComponent(new Label(wound.getWoundType().getClassification() + ", id: " + wound.getDecubitusId() + " (verheilt)"));
//		rightContent.addComponent(new Label("Senso6 Dekubitus, id: 10 (verheilt)"));
		rightContent.addComponent(woundDataContent);		
		
		VerticalLayout labelColumn = new VerticalLayout();
		VerticalLayout dataColumn = new VerticalLayout();
		woundDataContent.addComponents(labelColumn, dataColumn);
		labelColumn.setSpacing(true);
		dataColumn.setSpacing(true);
		
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		labelColumn.addComponent(new Label("Erfasst am:"));
//		dataColumn.addComponent(new Label("13.08.2012"));
		dataColumn.addComponent(new Label(df.format(wound.getRecordingDate())));
		
		labelColumn.addComponent(new Label("von:"));
//		dataColumn.addComponent(new Label("Beige"));
		dataColumn.addComponent(new Label(wound.getRecordingEmployee().getFirstName() + " " + wound.getRecordingEmployee().getLastName()));
		
		labelColumn.addComponent(new Label("Beendet am:"));
//		dataColumn.addComponent(new Label("09.04.2012"));
		if (wound.getEndDate() != null){
			dataColumn.addComponent(new Label(df.format(wound.getEndDate())));
		} else {
			dataColumn.addComponent(new Label("-"));
		}
		
		labelColumn.addComponent(new Label("von:"));
//		dataColumn.addComponent(new Label("CSC"));
		if (wound.getCureEmployee() != null){
			dataColumn.addComponent(new Label(wound.getCureEmployee().getFirstName() + " " + wound.getCureEmployee().getLastName()));
		} else {
			dataColumn.addComponent(new Label("-"));
		}
		
		labelColumn.addComponent(new Label("Körperregion:"));
//		dataColumn.addComponent(new Label("Brustbein"));
		dataColumn.addComponent(new Label(BodyLocation.valueOf(wound.getBodyLocationCode()).toString()));
		
		labelColumn.addComponent(new Label("Körperstelle:"));
//		dataColumn.addComponent(new Label("Brustbein"));
		dataColumn.addComponent(new Label(wound.getBodyLocation()));
		
		labelColumn.addComponent(new Label("Grad:"));
//		dataColumn.addComponent(new Label("1 Grad l - Nicht wegdrückbare Rötung"));
		if (wound.getWoundLevel() != null){
			dataColumn.addComponent(new Label(wound.getWoundLevel().getCharacterisation()));
		} else {
			dataColumn.addComponent(new Label(""));
		}
		
		labelColumn.addComponent(new Label("Größe (mm):"));
//		dataColumn.addComponent(new Label("1 x 1"));
		if (wound.getSize1() != 0){
			if (wound.getSize2() != 0){
				dataColumn.addComponent(new Label(wound.getSize1() + " x " + wound.getSize2()));
			} else {
				dataColumn.addComponent(new Label(wound.getSize1() + " x " + wound.getSize1()));
			}
		} else {
			dataColumn.addComponent(new Label(""));
		}
		
		labelColumn.addComponent(new Label("Tiefe (mm):"));
//		dataColumn.addComponent(new Label("1 x 1"));
		if (wound.getDepth() != 0){
			dataColumn.addComponent(new Label(wound.getDepth()+""));
		} else {
			dataColumn.addComponent(new Label(""));
		}
		
		labelColumn.addComponent(new Label("Wo entstanden:"));
//		dataColumn.addComponent(new Label("wo die Wunde entstanden ist..."));
		dataColumn.addComponent(new Label(Origination.valueOf(wound.getOrigination()).toString()));
		
		labelColumn.addComponent(new Label("Bemerkung:"));
//		dataColumn.addComponent(new Label("hier steht eine Bemerkung..."));
		dataColumn.addComponent(new Label(wound.getDescription()));
		
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
