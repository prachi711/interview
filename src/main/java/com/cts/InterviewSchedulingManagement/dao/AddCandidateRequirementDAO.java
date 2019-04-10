package com.cts.InterviewSchedulingManagement.dao;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;

public interface AddCandidateRequirementDAO {
	
	public String addCandidateRequirement(CandidateRequirement candidateRequirement);
	
	public String setModeOfInterview(CandidateRequirement candidateRequirement);


}
