package com.cts.InterviewSchedulingManagement.service;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;

public interface EditCandidateRequirementService {
	
    public String editCandidateRequirement(CandidateRequirement candidateRequirement);
	
	public String setModeOfInterview(CandidateRequirement candidateRequirement);

}
