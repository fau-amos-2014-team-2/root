package com.fau.amos.team2.WoundManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@SuppressWarnings("serial")
@Entity
@NamedQueries({
	@NamedQuery(name="WoundType.deleteAll", query="DELETE FROM WoundType")
})
public class WoundType implements BusinessObject {
	@Id
	@Column(name = "NR", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "KENMDT07_NR", nullable = false)
	private int sensoID;
	
	@Column(name = "BEZEICH", nullable = false)
	private String classification;//30
	
	@Column(name = "TYP", nullable = false)
	private char type;
	
	@Column(name = "GROESSEPFL", nullable = false)
	private char sizeIsRequired;//j || n
	
	@Column(name = "GROESSEPFLB", nullable = false)
	private boolean sizeIsRequiredB;
	
	@Column(name = "GRADSTATUS", nullable = false)
	private char level;
	
	@Column(name = "KOERPERSTELLEPFL", nullable = false)
	private char isBodyLocationRequired;
	
	@Column(name = "KOERPERSTELLEPFLB", nullable = false)
	private boolean isBodyLocationRequiredB;
	
	//TODO: translation of 'j'/'n' to boolean?
	
	public WoundType() {
		this.sensoID=1;
		this.level= 'E';
		this.isBodyLocationRequired = 'n';
		this.isBodyLocationRequiredB = false;
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
		return (sizeIsRequired=='j')?(true):(false);
	}

	public void setSizeIsRequired(boolean sizeIsRequired) {
		this.sizeIsRequiredB = sizeIsRequired;
		this.sizeIsRequired = (sizeIsRequired)?('j'):('n');
	}

	public char getLevel() {
		return level;
	}

	public void setLevel(char level) {
		this.level = level;
	}

	public boolean isBodyLocationRequired() {
		return (isBodyLocationRequired=='j')?(true):(false);
	}

	public void setBodyLocationRequired(boolean isBodyLocationRequired) {
		this.isBodyLocationRequired = (isBodyLocationRequired)?('j'):('n');
		this.isBodyLocationRequiredB = isBodyLocationRequired;
	}
}
