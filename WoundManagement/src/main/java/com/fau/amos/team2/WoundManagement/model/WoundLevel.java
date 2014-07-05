package com.fau.amos.team2.WoundManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "KENDEK07")
@NamedQueries({
	@NamedQuery(name="WoundLevel.deleteAll", query="DELETE FROM WoundLevel")
})
public class WoundLevel implements BusinessObject {
	@Id
	@Column(name = "NR", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "KENMDT07_NR", nullable = false)
	private int sensoID;
	
	@Column(name = "BEZEICH", nullable = false, length=2000)
	private String characterisation;
	
	@Column(name = "GRAD", nullable = false)
	private int level;
	
	@ManyToOne
	@JoinColumn(name = "KENWUN07_NR", nullable = false, referencedColumnName = "NR")
	private WoundType woundType;
	
	@Column(name = "BESCHREIB", length=4000)
	private String description;
	
	@Column(name = "KUERZL", nullable = false, length=5)
	private String abbreviation;
	
	@Column(name = "POS")
	private int position;
	
	public WoundLevel() { 
		this.sensoID=1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPos() {
		return this.position;
	}
	
	public void setPos(int pos) {
		this.position = pos;
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
