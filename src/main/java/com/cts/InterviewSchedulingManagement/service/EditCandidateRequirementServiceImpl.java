package com.cts.InterviewSchedulingManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.dao.EditCandidateRequirementDAO;

@Service("editCandidateRequirementService")
@Transactional
public class EditCandidateRequirementServiceImpl implements EditCandidateRequirementService{
	
	@Autowired
	EditCandidateRequirementDAO editCandidateRequirementDAO;

	@Override
	public String editCandidateRequirement(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		
		return editCandidateRequirementDAO.editCandidateRequirement(candidateRequirement);
	}

	@Override
	public String setModeOfInterview(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		return editCandidateRequirementDAO.setModeOfInterview(candidateRequirement);
	}

}
