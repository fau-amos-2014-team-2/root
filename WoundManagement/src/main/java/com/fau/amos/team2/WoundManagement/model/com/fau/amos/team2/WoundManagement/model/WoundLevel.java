package com.fau.amos.team2.WoundManagement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class WoundLevel implements BusinessObject {
	@Id
	@Column(name = "NR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "KENMDT07_NR")
	private int sensoID;
	
	@Column(name = "BEZEICH", nullable = false)
	private String characterisation;
	
	@Column(name = "GRAD", nullable = false)
	private int level;
	
	@ManyToOne
	@JoinColumn(name = "KENWUN07_NR", nullable = false, referencedColumnName="NR")
	private WoundType woundType;
	
	@Column(name = "BESCHREIB")
	private String description;
	
	@Column(name = "KUERZL", nullable = false)
	private String abbreviation;
	
	@Column(name = "POS")
	private int position;
	
	public WoundLevel() { 
		
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

	public String getCharacterisation() {
		return characterisation;
	}

	public void setCharacterisation(String characterisation) {
		this.characterisation = characterisation;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public WoundType getWoundType() {
		return woundType;
	}

	public void setWoundType(WoundType woundType) {
		this.woundType = woundType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
}
