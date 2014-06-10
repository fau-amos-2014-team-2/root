package com.fau.amos.team2.WoundManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fau.amos.team2.WoundManagement.provider.CoreDataWoundDescriptionProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundDescriptionProvider;

@SuppressWarnings("serial")
@Entity
public class CoreDataWoundDescriptionMapping implements BusinessObject {
	@Id
	@Column(name = "NR", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "KENMDT07_NR", nullable = false)
	private int sensoID;

	@OneToOne
	@JoinColumn(name = "KENWBS07_CDWD", nullable = false, referencedColumnName="NR")
	private CoreDataWoundDescription coreDataWoundDescription;
	
	@Column(name = "KENWBS07_NR", nullable = false)
	private int coreDataWoundDescriptionId;
	
	@OneToOne
	@JoinColumn(name = "BEWWBS07_WDesc", nullable = false, referencedColumnName="NR")
	private WoundDescription woundDescription;
	

	@Column(name = "BEWWBS07_NR", nullable = false)
	private int woundDescriptionId;
	
	@Column(name = "FREITEXT")
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
		return CoreDataWoundDescriptionProvider.getInstance().getByID(coreDataWoundDescriptionId);
	}

	public void setCoreDataWoundDescription(CoreDataWoundDescription coreDataWoundDescription) {
		this.coreDataWoundDescriptionId = coreDataWoundDescription.getId();
		this.coreDataWoundDescription = coreDataWoundDescription;
	}

	public WoundDescription getWoundDescription() {
		return WoundDescriptionProvider.getInstance().getByID(woundDescriptionId);
	}

	public void setWoundDescription(WoundDescription woundDescription) {
		this.woundDescriptionId = woundDescription.getId();
		this.woundDescription = woundDescription;
	}

	public String getFreeText() {
		return freeText;
	}

	public void setFreeText(String freeText) {
		this.freeText = freeText;
	}
}
