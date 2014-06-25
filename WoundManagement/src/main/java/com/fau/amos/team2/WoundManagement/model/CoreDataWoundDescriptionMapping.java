package com.fau.amos.team2.WoundManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "BEWWBZ07")
public class CoreDataWoundDescriptionMapping implements BusinessObject {
	@Id
	@Column(name = "NR", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "KENMDT07_NR", nullable = false)
	private int sensoID;

	@OneToOne
	@JoinColumn(name = "KENWBS07_NR", referencedColumnName="NR")
	private CoreDataWoundDescription coreDataWoundDescription;
	
	@OneToOne
	@JoinColumn(name = "BEWWBS07_NR", nullable = false, referencedColumnName="NR")
	private WoundDescription woundDescription;
	
	@Column(name = "FREITEXT", length=4000)
	private String freeText;//4000
	
	public CoreDataWoundDescriptionMapping() {
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
