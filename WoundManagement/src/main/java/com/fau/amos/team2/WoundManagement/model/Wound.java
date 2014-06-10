package com.fau.amos.team2.WoundManagement.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundDescriptionProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;

@SuppressWarnings("serial")
@Entity
@NamedQueries({
		@NamedQuery(name = "Wound.currentForPatient", query = "SELECT w FROM Wound w WHERE w.patient=:patient AND w.endDate IS NULL"),
		@NamedQuery(name = "Wound.deleteAll", query = "DELETE FROM Wound"),
		@NamedQuery(name = "Wound.getMaxDecubitusId", query = "SELECT MAX(w.decubitusId) FROM Wound w"),
		@NamedQuery(name = "Wound.allForPatient", query = "SELECT w FROM Wound w WHERE w.patient=:patient") })
public class Wound implements BusinessObject {
	@Id
	@Column(name = "NR", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(name = "KENMDT07_NR", nullable = false)
	private int sensoID;

	@ManyToOne
	@JoinColumn(name = "BEWOPE07_Patient", nullable = false, referencedColumnName = "NR")
	private Patient patient;
	
	@Column(name = "BEWOPE07_NR", nullable = false)
	private int patientId;

	@Column(name = "ERFASSUNGSDATUM", nullable = false)
	private Date recordingDate;

	@ManyToOne
	@JoinColumn(name = "MITAPE07_Empl", nullable = false, referencedColumnName = "NR")
	private Employee recordingEmployee;

	
	@Column(name = "MITAPE07_nr", nullable = false)
	private int recordingEmployeeId;

	
	@Column(name = "ENDEDATUM")
	private Date endDate;

	@ManyToOne
	@JoinColumn(name = "ENDE_MITAPE07_CureEmpl", referencedColumnName = "NR")
	private Employee cureEmployee;

	@Column(name = "ENDE_MITAPE07_NR")
	private int cureEmployeeId;
	
	@Column(name = "KOERPERSTELLE")
	private String bodyLocation;//200

	@Column(name = "KOERPERSTELLE_CODE", nullable = false)
	private int bodyLocationCode;

	@Column(name = "GROESSE1")
	private int size1;

	@Column(name = "GROESSE2")
	private int size2;

	@Column(name = "TIEFE")
	private int depth;

	@Column(name = "BEMERKUNG")
	private String description;//2000

	@Column(name = "ENTSTEHUNG")
	private int origination;

	@ManyToOne
	@JoinColumn(name = "KENDEK07_WType", referencedColumnName = "NR")
	private WoundType woundType;

	
	@Column(name = "KENDEK07_NR")
	private int woundTypeId;
	
	@ManyToOne
	@JoinColumn(name = "KENWUN07_WLevel", referencedColumnName = "NR")
	private WoundLevel woundLevel;
	
	@Column(name = "KENWUN07_NR")
	private int woundLevelId;

	@Column(name = "DEKUBITUSNR")
	private int decubitusId;

	@OneToMany(targetEntity = WoundDescription.class, mappedBy = "wound")
	private List<WoundDescription> wounddescriptions;

	public Wound() {
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

	public Patient getPatient() {
		return PatientProvider.getInstance().getByID(patientId);
	}

	public void setPatient(Patient patient) {
		this.patientId = patient.getId();
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
		this.recordingEmployeeId = recordingEmployee.getId();
		this.recordingEmployee = recordingEmployee;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@SuppressWarnings("deprecation")
	public void setEndDate(int year, int month, int day) {
		this.endDate = new Date(year, month, day);
	}

	public Employee getCureEmployee() {
		return cureEmployee;
	}

	public void setCureEmployee(Employee cureEmployee) {
		this.cureEmployeeId = cureEmployee.getId();
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
		this.woundLevelId = woundLevel.getId();
		this.woundLevel = woundLevel;
	}

	public WoundType getWoundType() {
		return woundType;
	}

	public void setWoundType(WoundType woundType) {
		this.woundTypeId = woundType.getId();
		this.woundType = woundType;
	}

	public int getDecubitusId() {
		return decubitusId;
	}

	public void setDecubitusId(int decubitusId) {
		this.decubitusId = decubitusId;
	}

	public List<WoundDescription> getWoundDescriptions() {
		// TODO: this is just a workaround! shall not call database every time a
		// wounds wounddescriptions are needed.
		return WoundDescriptionProvider.getInstance().getAllForWound(this);
	}

	
}
