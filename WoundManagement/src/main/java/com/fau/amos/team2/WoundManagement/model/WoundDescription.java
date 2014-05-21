package com.fau.amos.team2.WoundManagement.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class WoundDescription implements BusinessObject {
	@Id
	@Column(name = "NR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "KENMDT07_NR")
	private int sensoID;
	
	@OneToOne
	@JoinColumn(name = "BEWDKL07_NR", nullable = false, referencedColumnName="NR")
	private Wound wound;
	
	@Column(name = "DATUM", nullable = false)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "MITAPE07_NR", nullable = false, referencedColumnName="NR")
	private Employee employee;
	
	@Column(name = "TASCHEN")
	private boolean isBaggy;
	
	@Column(name = "TASCHLOK")
	private String bagLocation;
	
	@Column(name = "TASCHRICHT")
	private String bagDirection;
	
	@Column(name = "BEMERKUNG")
	private String description;
	
	@Column(name = "GROESSE1")
	private int size1;
	
	@Column(name = "GROESSE2")
	private int size2;
	
	@ManyToOne
	@JoinColumn(name = "KENDEK07_Nr", referencedColumnName="NR")
	private WoundLevel woundLevel;
	
	@ManyToOne
	@JoinColumn(name = "KENWUN07_Nr", nullable = false, referencedColumnName="NR")
	private WoundType woundType;
	
	@Column(name = "TIEFE")
	private int depth;
	
	public WoundDescription() {
		
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
		return isBaggy;
	}

	public void setBaggy(boolean isBaggy) {
		this.isBaggy = isBaggy;
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
}
