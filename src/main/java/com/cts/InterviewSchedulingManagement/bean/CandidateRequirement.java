package com.cts.InterviewSchedulingManagement.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CandidateRequirement {
	
	@Column
	String employeeId;
	@Id
	@Column
   int requirementId;
	
	@Column
	String domain;
	@Column
	int requiredVacancies;
	@Column
	Date closingDate;
	@Column
	int priority;
	@Column
	int minExperience;
	@Column
	String modeOfInterview;
	@Column 
    String qualification;
	@Column
	int maxNoCan;
	
	public CandidateRequirement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidateRequirement(String employeeId,int requirementId ,String domain, int requiredVacancies, Date closingDate, int priority,
			int minExperience, String modeOfInterview,int maxNoCan) {
		super();
		this.employeeId = employeeId;
		this.domain = domain;
		this.requiredVacancies = requiredVacancies;
		this.closingDate = closingDate;
		this.priority = priority;
		this.minExperience = minExperience;
		this.modeOfInterview = modeOfInterview;
		this.requirementId= requirementId;
		this.maxNoCan= maxNoCan;
	}
	
	
	
	

	public int getMaxNoCan() {
		return maxNoCan;
	}

	public void setMaxNoCan(int maxNoCan) {
		this.maxNoCan = maxNoCan;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	

	public int getRequirementId() {
		return requirementId;
	}

	public void setRequirementId(int requirementId) {
		this.requirementId = requirementId;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public int getRequiredVacancies() {
		return requiredVacancies;
	}

	public void setRequiredVacancies(int requiredVacancies) {
		this.requiredVacancies = requiredVacancies;
	}

	public Date getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getMinExperience() {
		return minExperience;
	}

	public void setMinExperience(int minExperience) {
		this.minExperience = minExperience;
	}

	public String getModeOfInterview() {
		return modeOfInterview;
	}

	public void setModeOfInterview(String modeOfInterview) {
		this.modeOfInterview = modeOfInterview;
	}
	

}
