package com.cts.InterviewSchedulingManagement.dao;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;

public interface EditCandidateRequirementDAO {
	
	public String editCandidateRequirement(CandidateRequirement candidateRequirement);
	
	public String setModeOfInterview(CandidateRequirement candidateRequirement);

}
