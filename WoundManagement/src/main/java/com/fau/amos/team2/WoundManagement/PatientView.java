package com.fau.amos.team2.WoundManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.vaadin.addon.touchkit.ui.NavigationView;
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

	public PatientView(Object id) {
		setCaption("Patientenansicht");
		
		HorizontalLayout content = new HorizontalLayout();
		WoundManager woundManager = new WoundManager(null);
		
		Wound wound = WoundProvider.getInstance().getByID(id);
		
		VerticalLayout rightContent = new VerticalLayout();
		HorizontalLayout woundDataContent = new HorizontalLayout();
		rightContent.addComponent(new Label("Senso6 Dekubitus, id: 10 (verheilt)  <--- was genau steht hier?"));
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
		dataColumn.addComponent(new Label(wound.getRecordingEmployee().getAbbreviation()));
		
		labelColumn.addComponent(new Label("Beendet am:"));
//		dataColumn.addComponent(new Label("09.04.2012"));
		dataColumn.addComponent(new Label(df.format(wound.getEndDate())));
		
		labelColumn.addComponent(new Label("von:"));
//		dataColumn.addComponent(new Label("CSC"));
		dataColumn.addComponent(new Label(wound.getCureEmployee().getAbbreviation()));

		labelColumn.addComponent(new Label("Körperregion:"));
//		dataColumn.addComponent(new Label("Brustbein"));
		dataColumn.addComponent(new Label(wound.getBodyLocation()));
		
		labelColumn.addComponent(new Label("Körperstelle:"));
//		dataColumn.addComponent(new Label("Brustbein"));
		dataColumn.addComponent(new Label(wound.getBodyLocationCode()+""));
		
		labelColumn.addComponent(new Label("Grad:"));
//		dataColumn.addComponent(new Label("1 Grad l - Nicht wegdrückbare Rötung"));
		dataColumn.addComponent(new Label(wound.getWoundLevel().getAbbreviation()));
		
		labelColumn.addComponent(new Label("Größe (mm):"));
//		dataColumn.addComponent(new Label("1 x 1"));
		dataColumn.addComponent(new Label(wound.getSize1() + " x " + wound.getSize2()));
		
		labelColumn.addComponent(new Label("Tiefe(mm):"));
//		dataColumn.addComponent(new Label("1 x 1"));
		dataColumn.addComponent(new Label(wound.getDepth()+""));
		
		labelColumn.addComponent(new Label("Wo entstanden:"));
//		dataColumn.addComponent(new Label("wo die Wunde entstanden ist..."));
		dataColumn.addComponent(new Label(wound.getOrigination()+""));
		
		labelColumn.addComponent(new Label("Bemerkung:"));
//		dataColumn.addComponent(new Label("hier steht eine Bemerkunng..."));
		dataColumn.addComponent(new Label(wound.getDescription()));
		
		content.addComponents(woundManager.getWoundSelector(), rightContent);
		
		setContent(content);
	}
}
