package com.fau.amos.team2.WoundManagement.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@SuppressWarnings("serial")
@Entity
@NamedQueries({
	@NamedQuery(name="Wound.currentForPatient",
		query="SELECT w FROM Wound w WHERE w.patient=:patient AND w.endDate IS NULL")
})
public class Wound implements BusinessObject {
	@Id
	@Column(name = "NR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "KENMDT07_NR")
	private int sensoID;
	
	@ManyToOne
	@JoinColumn(name = "BEWOPE07_NR", nullable = false, referencedColumnName="NR")
	private Patient patient;
	
	@Column(name = "ERFASSUNGSDATUM", nullable = false)
	private Date recordingDate;
	
	@ManyToOne
	@JoinColumn(name = "MITAPE07_nr", nullable = false, referencedColumnName="NR")
	private Employee recordingEmployee;
	
	@Column(name = "ENDEDATUM")
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name = "ENDE_MITAPE07_NR", referencedColumnName="NR")
	private Employee cureEmployee;
	
	@Column(name = "KOERPERSTELLE")
	private String bodyLocation;
	
	@Column(name = "KOERPERSTELLE_CODE", nullable = false)
	private int bodyLocationCode;
	
	@Column(name = "GROESSE1")
	private int size1;
	
	@Column(name = "GROESSE2")
	private int size2;
	
	@Column(name = "TIEFE")
	private int depth;
	
	@Column(name = "BEMERKUNG")
	private String description;
	
	@Column(name = "ENTSTEHUNG")
	private int origination;

	@ManyToOne
	@JoinColumn(name = "KENDEK07_NR", referencedColumnName="NR")
	private WoundType woundType;
	
	@ManyToOne
	@JoinColumn(name = "KENWUN07_NR", referencedColumnName="NR")
	private WoundLevel woundLevel;
	
	@Column(name = "DEKUBITUSNR")
	private int decubitusId;
	
	public Wound() { 
		
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

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Date getRecordingDate() {
		return recordingDate;
	}

	public void setRecordingDate(Date recordingDate) {
		this.recordingDate = recordingDate;
	}

	public Employee getRecordingEmployee() {
		return recordingEmployee;
	}

	public void setRecordingEmployee(Employee recordingEmployee) {
		this.recordingEmployee = recordingEmployee;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Employee getCureEmployee() {
		return cureEmployee;
	}

	public void setCureEmployee(Employee cureEmployee) {
		this.cureEmployee = cureEmployee;
	}

	public String getBodyLocation() {
		return bodyLocation;
	}

	public void setBodyLocation(String bodyLocation) {
		this.bodyLocation = bodyLocation;
	}

	public int getBodyLocationCode() {
		return bodyLocationCode;
	}

	public void setBodyLocationCode(int bodyLocationCode) {
		this.bodyLocationCode = bodyLocationCode;
	}

	public int getSize1() {
		return size1;
	}

	public void setSize1(int size1) {
		this.size1 = size1;
	}

	public int getSize2() {
		return size2;
	}

	public void setSize2(int size2) {
		this.size2 = size2;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOrigination() {
		return origination;
	}

	public void setOrigination(int origination) {
		this.origination = origination;
	}

	public WoundLevel getWoundLevel() {
		return woundLevel;
	}

	public void setWoundLevel(WoundLevel woundLevel) {
		this.woundLevel = woundLevel;
	}

	public WoundType getWoundType() {
		return woundType;
	}

	public void setWoundType(WoundType woundType) {
		this.woundType = woundType;
	}

	public int getDecubitusId() {
		return decubitusId;
	}

	public void setDecubitusId(int decubitusId) {
		this.decubitusId = decubitusId;
	}
}
