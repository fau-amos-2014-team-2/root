package com.fau.amos.team2.WoundManagement.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fau.amos.team2.WoundManagement.provider.WoundProvider;

@SuppressWarnings("serial")
@Entity
@Table(name = "BEWOPE07")
@NamedQueries({
		@NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p"),
		@NamedQuery(name = "Patient.deleteAll", query = "DELETE FROM Patient") })
public class Patient implements BusinessObject {
	@Id
	@Column(name = "NR", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(name = "KENMDT07_NR", nullable = false)
	private int sensoID;

	@Column(name = "NAME", length = 35)
	private String lastName;// 35

	@Column(name = "VORNAME", length = 35)
	private String firstName;// 35

	@Column(name = "GESCHLECHT", length = 100)
	private String gender;// 100

	@Column(name = "TITEL", length = 100)
	private String title;// 100

	@Column(name = "ANREDE", length = 100)
	private String salutation;// 100

	@Column(name = "GEBDATUM")
	private Date birthday;

	@Column(name = "ZIMMER", length = 8)
	private String room;// 8

	@ManyToOne
	@JoinColumn(name = "STATIONEN07_NR", referencedColumnName = "NR")
	private Ward ward;

	@OneToMany(targetEntity = Wound.class, mappedBy = "patient")
	private List<Wound> wounds;

	@Column(name = "SUCHBEZ", length = 35)
	private String keyword;// 35

	@Column(name = "EINZUG")
	private Date entryDate;

	@Column(name = "UNTERBRINGUNG", length = 1)
	private String accomodation;

	// Standard Constructor is setting the sensoID to default value
	public Patient() {
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

	public Sex getSex() {
		return Sex.valueOf(getGender().charAt(0));
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

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
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

	public AccomodationType getAccomodation() {
		return AccomodationType.valueOf(accomodation);
	}

	public void setAccomodation(AccomodationType accomodation) {
		this.accomodation = accomodation.toString();
	}

	public List<Wound> getWounds() {
		// TODO: this is just a workaround! shall not call database every time a
		// patients wounds are needed.
		return WoundProvider.getInstance().getAllForPatient(this);
	}

	public List<Wound> getCurrentWounds() {
		// TODO: this is just a workaround! shall not call database every time a
		// patients wounds are needed.
		return WoundProvider.getInstance().getCurrentForPatient(this);
	}
}
