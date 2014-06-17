package com.fau.amos.team2.WoundManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import converter.BooleanToStringConverter;

@SuppressWarnings("serial")
@Entity
public class CoreDataWoundDescription implements BusinessObject {
	@Id
	@Column(name = "NR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "KENMDT07_NR")
	private int sensoID;
	
	@Column(name = "TYP", nullable = false, length=3)
	private String type;
	
	@Column(name = "BEZEICH", nullable = false)
	private String characterisation;
	
	@OneToOne
	@JoinColumn(name = "KENWBS07_NR", referencedColumnName="NR")
	private CoreDataWoundDescription coreDataWoundDescription;
	
	@Column(name = "MITFEITEXT", length=1)
	private String isFreeText;
	
	@Column(name = "POSITION")
	private int position;
	
	public CoreDataWoundDescription() { 
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
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
		return coreDataWoundDescription;
	}

	public void setCoreDataWoundDescription(CoreDataWoundDescription coreDataWoundDescription) {
		this.coreDataWoundDescription = coreDataWoundDescription;
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
