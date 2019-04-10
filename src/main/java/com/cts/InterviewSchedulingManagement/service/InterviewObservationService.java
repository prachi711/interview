package com.cts.InterviewSchedulingManagement.service;

import java.util.List;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.bean.InterviewObservation;
import com.cts.InterviewSchedulingManagement.bean.InterviewSchedule;

public interface InterviewObservationService {
	
	public List<CandidateRequirement> getAllSchedule();
	public List<InterviewSchedule> getNameById(int requirementId);
	public String scheduleObservation(InterviewObservation interviewObservation);
	public String interviewResult(InterviewObservation interviewObservation);
}
