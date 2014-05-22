package com.fau.amos.team2.WoundManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@SuppressWarnings("serial")
@Entity
@NamedQueries({
	@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e"),
	@NamedQuery(name="Employee.findByUsernameAndPassword",
			query="SELECT e FROM Employee e WHERE e.abbreviation = :username AND e.qualificationNumber = :password"),
	@NamedQuery(name="Employee.findByUsername",
			query="SELECT e FROM Employee e WHERE e.abbreviation = :username"),
})
public class Employee implements BusinessObject {
	@Id
	@Column(name = "NR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "KENMDT07_NR")
	private int sensoID;
	
	@Column(name = "SUCHBEZ", nullable=false)
	private String keyword;
	
	@Column(name = "NAME")
	private String lastName;
	
	@Column(name = "VORNAME")
	private String firstName;
	
	@Column(name = "KUERZL")
	private String abbreviation;
	
	@Column(name = "QUALNR")
	private int qualificationNumber;
	
	@Column(name = "PDACODE")
	private String pdaCode;
	
	@Column(name = "GLKONTR", nullable=false)
	private char collectiveAcc;
	
	@Column(name = "SAMMQUIT_M", nullable=false)
	private char collectiveAccMedication;
	
	@Column(name = "GESCHLECHT")
	private String gender;
	
	@JoinColumn(name = "DERZSTATION", referencedColumnName="NR")
	private Ward currentWard;
	
	@JoinColumn(name = "ARBEITSSTATION", referencedColumnName="NR")
	private Ward workingWard;
	
	public Employee() {
		keyword = "key";
		collectiveAcc = 'a';
		collectiveAccMedication = 'a';
	}
	
	public long getId() {
		return id;
	}
	public void setID(long id) {
		this.id = id;
	}

	public int getSensoKennung() {
		return sensoID;
	}

	public void setSensoID(int sensoID) {
		this.sensoID = sensoID;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
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



	public String getAbbreviation() {
		return abbreviation;
	}



	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}



	public int getQualificationNumber() {
		return qualificationNumber;
	}



	public void setQualificationNumber(int qualificationNumber) {
		this.qualificationNumber = qualificationNumber;
	}



	public String getPdaCode() {
		return pdaCode;
	}



	public void setPdaCode(String pdaCode) {
		this.pdaCode = pdaCode;
	}



	public char getCollectiveAcc() {
		return collectiveAcc;
	}



	public void setCollectiveAcc(char collectiveAcc) {
		this.collectiveAcc = collectiveAcc;
	}



	public char getCollectiveAccMedication() {
		return collectiveAccMedication;
	}



	public void setCollectiveAccMedication(char collectiveAccMedication) {
		this.collectiveAccMedication = collectiveAccMedication;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public Ward getCurrentWard() {
		if (currentWard == null) {
			currentWard = workingWard;
		}
		
		return currentWard;
	}

	public void setCurrentWard(Ward current) {
		this.currentWard = current;
	}

	public Ward getWorkingWard() {
		return workingWard;
	}

	public void setWorkingWard(Ward working) {
		this.workingWard = working;
	}
	
}
