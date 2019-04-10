package com.cts.InterviewSchedulingManagement.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;

@Repository("addCandidateRequirementDAO")
@Transactional
public class AddCandidateRequirementDAOImpl implements AddCandidateRequirementDAO {

	@Autowired
	SessionFactory sessionFactory=null;
	
	@Override
	public String addCandidateRequirement(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		System.out.println("add");
		sessionFactory.getCurrentSession().save(candidateRequirement);
		System.out.println("add1");
		System.out.println(candidateRequirement.getRequirementId());
		System.out.println(candidateRequirement.getMinExperience());
		
		return "success";
		
		
	}

	@Override
	public String setModeOfInterview(CandidateRequirement candidateReq) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		if(candidateReq.getRequiredVacancies()<=3 &&candidateReq.getMinExperience()<=3)
		{
			candidateReq.setModeOfInterview("OnlineTest");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()<=3 &&candidateReq.getMinExperience()<=6 && candidateReq.getMinExperience()>3)
		{
			candidateReq.setModeOfInterview("InPerson");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()<=3 &&candidateReq.getMinExperience()>6)
		{
			candidateReq.setModeOfInterview("Telephonic");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()>3 && candidateReq.getRequiredVacancies()<=5 &&candidateReq.getMinExperience()<=3)
		{
			candidateReq.setModeOfInterview("OnlineTest");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()>3 &&candidateReq.getRequiredVacancies()<=5 &&candidateReq.getMinExperience()<=6 &&candidateReq.getMinExperience()>3)
		{
			candidateReq.setModeOfInterview("OnlineTest");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()>3 &&candidateReq.getRequiredVacancies()<=5 &&candidateReq.getMinExperience()>6)
		{
			candidateReq.setModeOfInterview("InPerson");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		
		return "success";
	}
	
	

}
