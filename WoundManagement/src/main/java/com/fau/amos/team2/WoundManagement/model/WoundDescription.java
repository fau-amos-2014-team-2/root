package com.fau.amos.team2.WoundManagement.model;

import java.sql.Date;

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

import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;

@SuppressWarnings("serial")
@Entity
@NamedQueries({
		@NamedQuery(name = "WoundDescription.deleteAll", query = "DELETE FROM WoundDescription"),
		@NamedQuery(name = "WoundDescription.allForWound", query = "SELECT w FROM WoundDescription w WHERE w.wound=:wound") })
public class WoundDescription implements BusinessObject {
	@Id
	@Column(name = "NR", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(name = "KENMDT07_NR", nullable = false)
	private int sensoID;

	@ManyToOne
	@JoinColumn(name = "BEWDKL07_Wound", nullable = false, referencedColumnName = "NR")
	private Wound wound;

	@Column(name = "BEWDKL07_NR", nullable = false)
	private int woundId;

	@Column(name = "DATUM", nullable = false)
	private Date date;

	@ManyToOne
	@JoinColumn(name = "MITAPE07_Empl", nullable = false, referencedColumnName = "NR")
	private Employee employee;

	@Column(name = "MITAPE07_NR", nullable = false)
	private int employeeId;

	@Column(name = "TASCHEN")
	private char isBaggy;

	@Column(name = "TASCHENB")
	private boolean isBaggyB;

	@Column(name = "TASCHLOK")
	private String bagLocation;// 200

	@Column(name = "TASCHRICHT")
	private String bagDirection;// 200

	@Column(name = "BEMERKUNG")
	private String description;// 2000

	@Column(name = "GROESSE1")
	private int size1;

	@Column(name = "GROESSE2")
	private int size2;

	@ManyToOne
	@JoinColumn(name = "KENDEK07_WLevel", referencedColumnName = "NR")
	private WoundLevel woundLevel;

	@Column(name = "KENDEK07_Nr")
	private int woundLevelId;

	@ManyToOne
	@JoinColumn(name = "KENWUN07_WType", nullable = false, referencedColumnName = "NR")
	private WoundType woundType;

	@Column(name = "KENWUN07_Nr", nullable = false)
	private int woundTypeId;

	@Column(name = "TIEFE")
	private int depth;

	@Lob
	@Column(name = "WOUNDDESCIMAGE")
	private byte[] image;

	public void setImage(byte[] image) {
		this.image = image;
	}

	public byte[] getImage() {
		return this.image;
	}

	public WoundDescription() {
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

	public Wound getWound() {
		return WoundProvider.getInstance().getByID(this.woundId);
	}

	public void setWound(Wound wound) {
		this.woundId = wound.getId();
		this.wound = wound;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Employee getEmployee() {
		return EmployeeProvider.getInstance().getByID(this.employeeId);
	}

	public void setEmployee(Employee employee) {
		this.employeeId = employee.getId();
		this.employee = employee;
	}

	public boolean isBaggy() {
		return (isBaggy == 'j') ? (true) : (false);
	}

	public void setBaggy(boolean isBaggy) {
		this.isBaggy = (isBaggy) ? ('j') : ('n');
		this.isBaggyB = isBaggy;
	}

	public String getBagLocation() {
		return bagLocation;
	}

	public void setBagLocation(String bagLocation) {
		this.bagLocation = bagLocation;
	}

	public String getBagDirection() {
		return bagDirection;
	}

	public void setBagDirection(String bagDirection) {
		this.bagDirection = bagDirection;
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

	public WoundLevel getWoundLevel() {
		return WoundLevelProvider.getInstance().getByID(this.woundLevelId);
	}

	public void setWoundLevel(WoundLevel woundLevel) {
		this.woundLevelId = woundLevel.getId();
		this.woundLevel = woundLevel;
	}

	public WoundType getWoundType() {
		return WoundTypeProvider.getInstance().getByID(this.woundTypeId);
	}

	public void setWoundType(WoundType woundType) {
		this.woundTypeId = woundType.getId();
		this.woundType = woundType;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
}
