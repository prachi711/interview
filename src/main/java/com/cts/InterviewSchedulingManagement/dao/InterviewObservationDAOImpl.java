package com.cts.InterviewSchedulingManagement.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.InterviewSchedulingManagement.bean.Candidate;
import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.bean.InterviewObservation;
import com.cts.InterviewSchedulingManagement.bean.InterviewSchedule;

@Repository("interviewObservationDAO")
@Transactional
public class InterviewObservationDAOImpl implements InterviewObservationDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public String scheduleObservation(InterviewObservation interviewObservation) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		sessionFactory.getCurrentSession().save(interviewObservation);
		
	
		return "success";
	}
	
	
	
	public List<CandidateRequirement> getAllSchedule() {
		// TODO Auto-generated method stub
		 TypedQuery<CandidateRequirement> query = sessionFactory.getCurrentSession().createQuery("from CandidateRequirement");
		 
	      return query.getResultList();
	}
	
	public List<InterviewSchedule> getNameById(int requirementId) {
		// TODO Auto-generated method stub
		try{
			Session session = sessionFactory.getCurrentSession();
			String query = "from InterviewSchedule where requirementId = ? ";
			Query<InterviewSchedule> query2 = null;
			query2=session.createQuery(query);
			query2.setParameter(0,requirementId);   
			List<InterviewSchedule> candidate= query2.getResultList();
			if(candidate!=null)
			{
				
			return candidate;
			}
			else
			{
				
				return null;
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;

	}

	
	/*@Override
	public Candidate getCandidate(String id) {
		System.out.println(id);
		try{
			Session session = sessionFactory.getCurrentSession();
			String query = "from Candidate where emailId = ? ";
			Query<Candidate> query2 = null;
			query2=session.createQuery(query);
			query2.setParameter(0,id);   
			Candidate candidate= query2.getSingleResult();
			System.out.println(candidate);
			if(candidate!=null)
			{
				
			return candidate;
			}
			else
			{
				
				return null;
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
	}*/
	
	public String interviewResult(InterviewObservation interviewObservation)
	{
		int marks=interviewObservation.getInterviewMarks();
		
		//if()
		
		
		return null;
	}
	


}
