package com.fau.amos.team2.WoundManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import converter.BooleanToStringConverter;

import converter.BooleanToStringConverter;

@SuppressWarnings("serial")
@Entity
@Table(name = "MITAPE07")
@NamedQueries({
	@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e"),
	@NamedQuery(name="Employee.deleteAll", query="DELETE FROM Employee"),
	@NamedQuery(name="Employee.findByUsernameAndPassword",
			query="SELECT e FROM Employee e WHERE e.abbreviation = :username AND e.pdaCode = :password"),
	@NamedQuery(name="Employee.findByUsername",
			query="SELECT e FROM Employee e WHERE e.abbreviation = :username"),
})
public class Employee implements BusinessObject {
	@Id
	@Column(name = "NR", nullable=false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "KENMDT07_NR", nullable=false)
	private int sensoID;
	
	@Column(name = "SUCHBEZ", nullable=false, length=30)
	private String keyword;//30
	
	@Column(name = "NAME", length=30)
	private String lastName;//30
	
	@Column(name = "VORNAME", length=30)
	private String firstName;//30
	
	@Column(name = "KUERZL", length=5)
	private String abbreviation;//5
	
	@Column(name = "QUALNR")
	private int qualificationNumber;
	
	@Column(name = "PDACODE", length=12)
	private String pdaCode;//12
	
	@Column(name = "GLKONTR", nullable=false, length=1)
	private String accumulativeAck;
	
	@Column(name = "SAMMQUIT_M", nullable=false, length=1)
	private String collectiveAccMedication;
	
	@Column(name = "GESCHLECHT", length=100)
	private String gender;//100
	
	@JoinColumn(name = "DERZSTATION", referencedColumnName="NR")
	private Ward currentWard;
	
	@JoinColumn(name = "ARBEITSSTATION", referencedColumnName="NR")
	private Ward workingWard;
	
	public Employee() {
		keyword = "key";
		this.sensoID =1;

		setAccumulativeAckType(AccumulativeAckType.NOT_ALLOWED);
		setCollectiveAccMedicationAllowed(false);
	}
	
	public int getId() {
		return id;
	}
	
	public void setID(int id) {

		this.id = id;
	}

	public int getSensoID() {
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



	public AccumulativeAckType getAccumulativeAckType() {
		return AccumulativeAckType.enumOf(accumulativeAck);
	}



	public void setAccumulativeAckType(AccumulativeAckType accumulativeAckType) {
		this.accumulativeAck = accumulativeAckType.toString();
	}



	public boolean isCollectiveAccMedicationAllowed() {
		return BooleanToStringConverter.convertBack(collectiveAccMedication);
	}



	public void setCollectiveAccMedicationAllowed(boolean collectiveAccMedication) {
		this.collectiveAccMedication = BooleanToStringConverter.convert(collectiveAccMedication);
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
