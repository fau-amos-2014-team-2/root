package com.fau.amos.team2.WoundManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fau.amos.team2.WoundManagement.provider.CoreDataWoundDescriptionProvider;

@SuppressWarnings("serial")
@Entity
public class CoreDataWoundDescription implements BusinessObject {
	@Id
	@Column(name = "NR", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "KENMDT07_NR", nullable = false)
	private int sensoID;
	
	@Column(name = "TYP")
	private String typ;//3
	
	@Column(name = "BEZEICH", nullable = false)
	private String characterisation;//50
	
	@Column(name = "KENWBS07_NR")
	private int coreDataWoundDescriptionId;
	
	@Column(name = "MITFREITEXT")
	private char isFreeText;//j ||n
	
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


	public String getTyp() {
		return typ;
	}
	
	//TODO: nur bestimmte Werte für String erlaubt (siehe Anforderungen.pdf)
	public void setTyp(String typ) {
		this.typ = typ;
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
		return (isFreeText=='j')?(true):(false);
	}

	public void setFreeText(boolean isFreeText) {
		this.isFreeText = (isFreeText)?('j'):('n');
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
}
