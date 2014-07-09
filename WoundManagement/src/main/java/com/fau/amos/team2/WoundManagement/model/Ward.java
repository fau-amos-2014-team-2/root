package com.fau.amos.team2.WoundManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "STATIONEN07")
@NamedQueries({
	@NamedQuery(name="Ward.findAll", query="SELECT w FROM Ward w"),
	@NamedQuery(name="Ward.deleteAll", query="DELETE FROM Ward")
})
public class Ward implements BusinessObject {
	@Id
	@Column(name = "NR", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(name = "KENMDT07_NR", nullable = false)
	private int sensoID;
	
	@Column(name = "BEZEICH", nullable = false, length=30)
	private String characterisation;
	
	@Column(name = "HAUS_NR", nullable = false)
	private int houseNumber;
	
	public Ward() {
		this.sensoID=1;
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
