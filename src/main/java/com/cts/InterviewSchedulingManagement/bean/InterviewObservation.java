package com.cts.InterviewSchedulingManagement.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class InterviewObservation {
	
	@Column
	int interviewMarks;
	@Column
	int requirementId;
	@Column
	String toj;
	@Column
	String rank;
	@Column
	int candidateStatus;
	@Id
	@Column
	String interviewId;
	
	
	public InterviewObservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InterviewObservation(int interviewMarks, String toj, String rank, int candidateStatus,
			String interviewId,int requirementId) {
		super();
		this.interviewMarks = interviewMarks;
		this.toj = toj;
		this.rank = rank;
		this.candidateStatus = candidateStatus;
		this.interviewId = interviewId;
		this.requirementId=requirementId;
	}
	

	public int getRequirementId() {
		return requirementId;
	}

	public void setRequirementId(int requirementId) {
		this.requirementId = requirementId;
	}

	public int getInterviewMarks() {
		return interviewMarks;
	}
	public void setInterviewMarks(int interviewMarks) {
		this.interviewMarks = interviewMarks;
	}
	public String getToj() {
		return toj;
	}
	public void setToj(String toj) {
		this.toj = toj;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getCandidateStatus() {
		return candidateStatus;
	}
	public void setCandidateStatus(int candidateStatus) {
		this.candidateStatus = candidateStatus;
	}
	public String getInterviewId() {
		return interviewId;
	}
	public void setInterviewId(String interviewId) {
		this.interviewId = interviewId;
	}
	
	
	

}
