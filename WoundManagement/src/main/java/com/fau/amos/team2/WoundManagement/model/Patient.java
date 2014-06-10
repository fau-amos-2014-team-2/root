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

import com.fau.amos.team2.WoundManagement.provider.WardProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;

@SuppressWarnings("serial")
@Entity
@NamedQueries({
	@NamedQuery(name="Patient.findAll", query="SELECT p FROM Patient p"),
	@NamedQuery(name="Patient.deleteAll", query="DELETE FROM Patient")
})
public class Patient implements BusinessObject {
	@Id
	@Column(name = "NR", nullable=false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "KENMDT07_NR", nullable=false)
	private int sensoID;
	
	@Column(name = "NAME")
	private String lastName;//35
	
	@Column(name = "VORNAME")
	private String firstName;//35
	
	@Column(name = "GESCHLECHT")
	private String gender;//100
	
	@Column(name = "TITEL")
	private String title;//100
	
	@Column(name = "ANREDE")
	private String salutation;//100
	
	@Column(name = "GEBDATUM")
	private Date birthday;
	
	@Column(name = "ZIMMER")
	private String room;//8
	
	/*
	@ManyToOne
	@JoinColumn(name = "STATIONEN07_NR", referencedColumnName="NR")
	private Ward ward;
	*/
	@ManyToOne
	@JoinColumn(name = "STATIONEN07_WARD", referencedColumnName = "NR")
	private Ward ward;
	
	@Column(name = "STATIONEN07_NR")
	private int wardId;
		
	
	@OneToMany(targetEntity = Wound.class, mappedBy="patient")
	private List<Wound> wounds;

	@Column(name = "SUCHBEZ")
	private String keyword;//35
	
	@Column(name = "EINZUG")
	private Date entryDate;
	
	@Column(name = "UNTERBRINGUNG")
	private char accomodation;
	
	//Standard Constructor is setting the sensoID to default value
	public Patient() {
		this.sensoID =1;
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
		return WardProvider.getInstance().getByID(wardId);
	}

	public void setWard(Ward ward) {
		this.ward = ward;
		this.wardId = ward.getId();
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
	
	public List<Wound> getWounds() {
		//TODO: this is just a workaround! shall not call database every time a patients wounds are needed.
		return WoundProvider.getInstance().getAllForPatient(this);
	}
	
	public List<Wound> getCurrentWounds() {
		//TODO: this is just a workaround! shall not call database every time a patients wounds are needed.
		return WoundProvider.getInstance().getCurrentForPatient(this);
	}
}
