package com.fau.amos.team2.WoundManagement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class CoreDataWoundDescription implements BusinessObject {
	@Id
	@Column(name = "NR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "KENMDT07_NR")
	private int sensoID;
	
	@Column(name = "TYP", nullable = false)
	private String typ;
	
	@Column(name = "BEZEICH", nullable = false)
	private String characterisation;
	
	@OneToOne
	@JoinColumn(name = "KENWBS07_NR", referencedColumnName="NR")
	private CoreDataWoundDescription coreDataWoundDescription;
	
	@Column(name = "MITFEITEXT")
	private boolean isFreeText;
	
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


	public String getTyp() {
		return typ;
	}

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
		return coreDataWoundDescription;
	}

	public void setCoreDataWoundDescription(CoreDataWoundDescription coreDataWoundDescription) {
		this.coreDataWoundDescription = coreDataWoundDescription;
	}

	public boolean isFreeText() {
		return isFreeText;
	}

	public void setFreeText(boolean isFreeText) {
		this.isFreeText = isFreeText;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
}
