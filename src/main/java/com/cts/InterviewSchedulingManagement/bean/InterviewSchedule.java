package com.cts.InterviewSchedulingManagement.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class InterviewSchedule {
	
	@Column
	int requirementId;
	@Column
	String candidateName;
	@Column
	String qualification;
	@Column
	String rank;
	@Column
	String venue;
	
	@Id
	@Column
	String interviewId;
	
	
	public InterviewSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InterviewSchedule(int requirementId, String candidateName, String qualification, String rank,
			String venue, String interviewId) {
		super();
		this.requirementId = requirementId;
		this.candidateName = candidateName;
		this.qualification = qualification;
		this.rank = rank;
		this.venue = venue;
		this.interviewId = interviewId;
	}

	public int getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(int requirementId) {
		this.requirementId = requirementId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getInterviewId() {
		return interviewId;
	}
	public void setInterviewId(String interviewId) {
		this.interviewId = interviewId;
	}
	

}
