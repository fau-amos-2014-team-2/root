package com.fau.amos.team2.WoundManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fau.amos.team2.WoundManagement.provider.CoreDataWoundDescriptionProvider;

import converter.BooleanToStringConverter;

@SuppressWarnings("serial")
@Entity
@Table(name = "KENWBS07")
public class CoreDataWoundDescription implements BusinessObject {
	@Id
	@Column(name = "NR", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "KENMDT07_NR", nullable = false)
	private int sensoID;
	
	@Column(name = "TYP", length=3)
	private String type;//3
	
	@Column(name = "BEZEICH", nullable = false, length=50)
	private String characterisation;//50
	
	@Column(name = "KENWBS07_NR")
	private int coreDataWoundDescriptionId;
	
	@Column(name = "MITFREITEXT", length=1)
	private String isFreeText;
	
	@Column(name = "POSITION")
	private int position;
	
	public CoreDataWoundDescription() { 
		this.sensoID = 1;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSensoID() {
		return sensoID;
	}


	public void setSensoID(int sensoID) {
		this.sensoID = sensoID;
	}


	public CoreDataWoundDescriptionType getType() {
		return CoreDataWoundDescriptionType.enumOf(this.type);
	}

	public void setType(CoreDataWoundDescriptionType type) {
		this.type = type.toString();
	}

	public String getCharacterisation() {
		return characterisation;
	}

	public void setCharacterisation(String characterisation) {
		this.characterisation = characterisation;
	}

	public CoreDataWoundDescription getCoreDataWoundDescription() {
		return CoreDataWoundDescriptionProvider.getInstance().getByID(this.coreDataWoundDescriptionId);
	}

	public void setCoreDataWoundDescription(CoreDataWoundDescription coreDataWoundDescription) {
		this.coreDataWoundDescriptionId = coreDataWoundDescription.getId();
	}

	public boolean isFreeText() {
		return BooleanToStringConverter.convertBack(isFreeText);
	}

	public void setFreeText(boolean isFreeText) {
		this.isFreeText = BooleanToStringConverter.convert(isFreeText);
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
}
