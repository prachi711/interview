package com.cts.InterviewSchedulingManagement.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Candidate {
	
	@Column
	int candidateNumber;
	@Column
	String  firstName;
	@Column
	String lastName;
	@Column
	int age;
	@Column
	String gender;
	@Column
	String contactNumber;
	@Id
	@Column
	String emailId;
	@Column
	String password;
	@Column
	String qualification;
	@Column
	String companyName;
	
	@Column
	String userType;
	
	

	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	

	public int getCandidateNumber() {
		return candidateNumber;
	}

	public void setCandidateNumber(int candidateNumber) {
		this.candidateNumber = candidateNumber;
	}

	@Override
	public String toString() {
		return "Candidate [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", contactNumber=" + contactNumber + ", emailId=" + emailId + ", password=" + password
				+ ", qualification=" + qualification + ", companyName=" + companyName + ", userType=" + userType + "]";
	}

	public Candidate(String firstName, String lastName, int age, String gender, String contactNumber, String emailId,
			String password, String qualification, String companyName, String userType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.password = password;
		this.qualification = qualification;
		this.companyName = companyName;
		this.userType = userType;
	}

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	

	
	
	
	 

}
