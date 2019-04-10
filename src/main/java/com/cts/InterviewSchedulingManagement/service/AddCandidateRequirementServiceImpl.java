package com.cts.InterviewSchedulingManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.dao.AddCandidateRequirementDAO;

@Service("addCandidateRequirementService")
@Transactional
public class AddCandidateRequirementServiceImpl implements  AddCandidateRequirementService{
 
	@Autowired
	AddCandidateRequirementDAO addCandidateRequirementDAO;
	
	@Override
	public String addCandidateRequirement(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		return addCandidateRequirementDAO.addCandidateRequirement(candidateRequirement);
		
	}

	@Override
	public String setModeOfInterview(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		return addCandidateRequirementDAO.setModeOfInterview(candidateRequirement);
	}
	
}
