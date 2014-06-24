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

import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;

@SuppressWarnings("serial")
@Entity
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
	private String characterisation;//2000
	
	@Column(name = "GRAD", nullable = false)
	private int level;
	
	@ManyToOne
	@JoinColumn(name = "KENWUN07_WT", nullable = false, referencedColumnName = "NR")
	private WoundType woundType;
	
	@Column(name = "KENWUN07_NR", nullable = false)
	private int woundTypeId;

	@Column(name = "BESCHREIB", length=4000)
	private String description;//4000
	
	@Column(name = "KUERZL", nullable = false, length=5)
	private String abbreviation;//5
	
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
		return WoundTypeProvider.getInstance().getByID(woundTypeId);
	}

	public void setWoundType(WoundType woundType) {
		this.woundType = woundType;
		this.woundTypeId = woundType.getId();
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
