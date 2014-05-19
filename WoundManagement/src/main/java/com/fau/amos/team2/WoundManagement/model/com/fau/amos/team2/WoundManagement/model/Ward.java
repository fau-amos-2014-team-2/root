package com.fau.amos.team2.WoundManagement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Ward implements BusinessObject {
	@Id
	@Column(name = "NR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@Column(name = "KENMDT07_NR")
	private int sensoID;
	
	@Column(name = "BEZEICH", nullable = false)
	private String characterisation;
	
	@Column(name = "HAUS_NR", nullable = false)
	private int houseNumber;
	
	public Ward() {
		
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

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
}
