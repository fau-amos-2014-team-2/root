package com.fau.amos.team2.WoundManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import converter.BooleanToStringConverter;

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
	
	@Column(name = "BEZEICH", nullable = false, length=30)
	private String classification;//30
	
	@Column(name = "TYP", nullable = false, length=1)
	private String type;
	
	@Column(name = "GROESSEPFL", nullable = false, length=1)
	private String sizeIsRequired;

	@Column(name = "GRADSTATUS", nullable = false, length=1)
	private String levelState;
	
	@Column(name = "KOERPERSTELLEPFL", nullable = false, length=1)
	private String isBodyLocationRequired;
	
	public WoundType() {
		this.sensoID=1;
		this.levelState= "E";
		this.isBodyLocationRequired = "n";
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

	public WoundKind getType() {
		return WoundKind.enumOf(type);
	}

	public void setType(WoundKind type) {
		this.type = type.toString();
	}

	public boolean isSizeIsRequired() {
		return BooleanToStringConverter.convertBack(sizeIsRequired);
	}
		
	public void setSizeIsRequired(boolean sizeIsRequired) {
		this.sizeIsRequired = BooleanToStringConverter.convert(sizeIsRequired);
	}

	public WoundLevelState getLevelState() {
		return WoundLevelState.enumOf(levelState);
	}

	public void setLevelState(WoundLevelState level) {
		this.levelState = level.toString();
	}

	public boolean isBodyLocationRequired() {
		return BooleanToStringConverter.convertBack(isBodyLocationRequired);
	}

	public void setBodyLocationRequired(boolean isBodyLocationRequired) {
		this.isBodyLocationRequired = BooleanToStringConverter.convert(isBodyLocationRequired);
	}
}
