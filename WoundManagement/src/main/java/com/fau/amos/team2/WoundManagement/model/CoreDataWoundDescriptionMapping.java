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
public class CoreDataWoundDescriptionMapping implements Serializable {
	@Id
	@Column(name = "NR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "KENMDT07_NR")
	private int sensoID;

	@OneToOne
	@JoinColumn(name = "KENWBS07_NR", nullable = false, referencedColumnName="NR")
	private CoreDataWoundDescription coreDataWoundDescription;
	
	@OneToOne
	@JoinColumn(name = "BEWWBS07_NR", nullable = false, referencedColumnName="NR")
	private WoundDescription woundDescription;
	
	@Column(name = "FREITEXT")
	private String freeText;
	
	public CoreDataWoundDescriptionMapping() {
		
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

	public CoreDataWoundDescription getCoreDataWoundDescription() {
		return coreDataWoundDescription;
	}

	public void setCoreDataWoundDescription(CoreDataWoundDescription coreDataWoundDescription) {
		this.coreDataWoundDescription = coreDataWoundDescription;
	}

	public WoundDescription getWoundDescription() {
		return woundDescription;
	}

	public void setWoundDescription(WoundDescription woundDescription) {
		this.woundDescription = woundDescription;
	}

	public String getFreeText() {
		return freeText;
	}

	public void setFreeText(String freeText) {
		this.freeText = freeText;
	}
}
