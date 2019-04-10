package com.cts.InterviewSchedulingManagement.service;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;

public interface AddCandidateRequirementService {
	
	public String addCandidateRequirement(CandidateRequirement candidateRequirement);
	
	public String setModeOfInterview(CandidateRequirement candidateRequirement);

}
