package com.fau.amos.team2.WoundManagement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class WoundType implements Serializable {
	@Id
	@Column(name = "NR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "KENMDT07_NR")
	private int sensoID;
	
	@Column(name = "BEZEICH", nullable = false)
	private String classification;
	
	@Column(name = "TYP", nullable = false)
	private char type;
	
	@Column(name = "GROESSEPFL", nullable = false)
	private boolean sizeIsRequired;
	
	@Column(name = "GRADSTATUS", nullable = false)
	private char level;
	
	@Column(name = "KOERPERSTELLEPFL", nullable = false)
	private boolean isBodyLocationRequired;
	
	public WoundType() {
		
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

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public boolean isSizeIsRequired() {
		return sizeIsRequired;
	}

	public void setSizeIsRequired(boolean sizeIsRequired) {
		this.sizeIsRequired = sizeIsRequired;
	}

	public char getLevel() {
		return level;
	}

	public void setLevel(char level) {
		this.level = level;
	}

	public boolean isBodyLocationRequired() {
		return isBodyLocationRequired;
	}

	public void setBodyLocationRequired(boolean isBodyLocationRequired) {
		this.isBodyLocationRequired = isBodyLocationRequired;
	}
}