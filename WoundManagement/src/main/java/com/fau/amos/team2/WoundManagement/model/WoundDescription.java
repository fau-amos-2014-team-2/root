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
	@JoinColumn(name = "BEWDKL07_NR", nullable = false, referencedColumnName = "NR")
	private Wound wound;

	@Column(name = "DATUM", nullable = false)
	private Date date;

	@ManyToOne
	@JoinColumn(name = "MITAPE07_NR", nullable = false, referencedColumnName = "NR")
	private Employee employee;

	@Column(name = "TASCHEN", length = 1)
	private String isBaggy;

	@Column(name = "TASCHLOK", length = 200)
	private String bagLocation;// 200

	@Column(name = "TASCHRICHT", length = 200)
	private String bagDirection;// 200

	@Column(name = "BEMERKUNG", length = 2000)
	private String description;// 2000

	@Column(name = "GROESSE1")
	private int size1;

	@Column(name = "GROESSE2")
	private int size2;

	@ManyToOne
	@JoinColumn(name = "KENDEK07_NR", referencedColumnName = "NR")
	private WoundLevel woundLevel;

	@ManyToOne
	@JoinColumn(name = "KENWUN07_NR", nullable = false, referencedColumnName = "NR")
	private WoundType woundType;

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
		return wound;
	}

	public void setWound(Wound wound) {
		this.wound = wound;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public boolean isBaggy() {
		return (isBaggy == "j") ? (true) : (false);
	}

	public void setBaggy(boolean isBaggy) {
		this.isBaggy = (isBaggy) ? ("j") : ("n");
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
