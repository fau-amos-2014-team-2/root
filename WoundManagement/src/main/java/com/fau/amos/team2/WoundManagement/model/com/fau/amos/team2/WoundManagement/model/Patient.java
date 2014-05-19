package com.fau.amos.team2.WoundManagement.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Patient implements BusinessObject {
	@Id
	@Column(name = "NR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "KENMDT07_NR")
	private int sensoID;
	
	@Column(name = "NAME")
	private String lastName;
	
	@Column(name = "VORNAME")
	private String firstName;
	
	@Column(name = "GESCHLECHT")
	private String gender;
	
	@Column(name = "ANREDE")
	private String title;
	
	@Column(name = "GEBDATUM")
	private Date birthday;
	
	@Column(name = "ZIMMER")
	private String room;
	
	@ManyToOne
	@JoinColumn(name = "STATIONEN07_NR", referencedColumnName="NR")
	private Ward ward;
	
	@Column(name = "SUCHBEZ")
	private String keyword;
	
	@Column(name = "EINZUG")
	private Date entryDate;
	
	@Column(name = "UNTERBRINGUNG")
	private char accomodation;
	
	public Patient() {
		
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public char getAccomodation() {
		return accomodation;
	}

	public void setAccomodation(char accomodation) {
		this.accomodation = accomodation;
	}
}
