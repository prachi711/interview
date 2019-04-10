package com.cts.InterviewSchedulingManagement.dao;

import com.cts.InterviewSchedulingManagement.bean.Candidate;

public interface LoginDAO {
	
	public String authenticateCandidate(Candidate candidate);
	public String getUserType(Candidate candidate);
	public int getCandidateNumber(Candidate candidate);
}
