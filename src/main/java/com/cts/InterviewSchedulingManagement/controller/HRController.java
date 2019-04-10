package com.cts.InterviewSchedulingManagement.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.InterviewSchedulingManagement.bean.Candidate;
import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.bean.InterviewObservation;
import com.cts.InterviewSchedulingManagement.bean.InterviewSchedule;
import com.cts.InterviewSchedulingManagement.service.AddCandidateRequirementService;
import com.cts.InterviewSchedulingManagement.service.EditCandidateRequirementService;
import com.cts.InterviewSchedulingManagement.service.InterviewObservationService;
import com.cts.InterviewSchedulingManagement.service.InterviewScheduleService;



@Controller
public class HRController {
	
	

	@Autowired
	InterviewScheduleService interviewScheduleService;
	
	@Autowired
	AddCandidateRequirementService addCandidateRequirementService;
	
	@Autowired
	EditCandidateRequirementService editCandidateRequirementService;
	
	@Autowired
	InterviewObservationService interviewObservationService ;
	
	@RequestMapping(value="addCandidateRequirement.html", method=RequestMethod.GET)
	public String getAddCandidateReqPage()
	{
		return "addCandidateReq";
	}
	@RequestMapping(value="listCandidateReq.html", method=RequestMethod.GET)
	public String getListCandidateReqPage()
	{
		return "listCandidateReq";
	}
	@RequestMapping(value="alreadyScheduled.html", method=RequestMethod.GET)
	public String getAlreadyScheduledPage()
	{
		return "alreadyScheduled";
	}
	
	@RequestMapping(value="editCandidateReq.html", method=RequestMethod.GET)
	public String getEditCandidateReqPage()
	{
		return "editCandidateReq";
	}
	@RequestMapping(value="maxCandidateExceeded.html", method=RequestMethod.GET)
	public String getMaxCandidateExceededPage()
	{
		return "maxCandidateExceeded";
	}
	//working
	@RequestMapping(value="interviewSchedule.html", method=RequestMethod.GET)
	public String getinterviewSchedulePage(Model model,HttpSession httpSession)
	{
		List<CandidateRequirement> candidateRequirement =interviewScheduleService.getAllSchedule();
		httpSession.setAttribute("CandidateRequirement",candidateRequirement);
		return "interviewSchedule";
	}
	
	//working
	@RequestMapping(value="updateList2", method=RequestMethod.GET)
	public String updateList2(Model model,HttpSession httpSession, @RequestParam("order") int order)
	{
		List<CandidateRequirement> candidateRequirement =interviewScheduleService.getAllSchedule();
		int requirementId = order;
		httpSession.setAttribute("reqId", requirementId);
		String qualification = interviewScheduleService.getQualification(requirementId);
		httpSession.setAttribute("qualification",qualification);
		return "interviewSchedule";
	}
	
	
		@RequestMapping(value="updateList3", method=RequestMethod.GET)
		public String updateList3(Model model,HttpSession httpSession, @RequestParam("qualification1") String qualification1)
		{
			String filterByQualification = qualification1;
			
			
			httpSession.setAttribute("Candidate",interviewScheduleService.getNameById(filterByQualification));
			

			return "interviewSchedule";
		}
	
		@RequestMapping(value="updateList4", method=RequestMethod.GET)
		public String updateList4(Model model,HttpSession httpSession, @RequestParam("emailId") String emailId)
		{
			String getEmailId = emailId;
			httpSession.setAttribute("emailId",emailId);
			
		

			return "interviewSchedule";
		}
		
		@RequestMapping(value="interviewObservation.html", method=RequestMethod.GET)
		public String getinterviewObservationPage(Model model,HttpSession httpSession)
		{
			List<CandidateRequirement> candidateRequirement =interviewObservationService.getAllSchedule();
			httpSession.setAttribute("CandidateRequirement",candidateRequirement);
			return "interviewObservation";
		}
		 
		
		@RequestMapping(value="updateList5", method=RequestMethod.GET)
		public String updateList5(Model model,HttpSession httpSession, @RequestParam("order") int order)
		{
			List<CandidateRequirement> candidateRequirement =interviewObservationService.getAllSchedule();
			int requirementId = order;
			httpSession.setAttribute("reqId", requirementId);
			
			httpSession.setAttribute("candidateName",interviewObservationService.getNameById(requirementId));
			return "interviewObservation";
		}
		
		@RequestMapping(value="updateList6", method=RequestMethod.GET)
		public String updateList6(Model model,HttpSession httpSession, @RequestParam("candidateName") String candidateName)
		{
			
			httpSession.setAttribute("candidateName",candidateName);
			return "interviewObservation";
		}
		
	//done
	@RequestMapping(value="addCandidateReq.html", method=RequestMethod.POST)
	public ModelAndView addCandidateRequirement(@ModelAttribute CandidateRequirement candidateReq ,HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("@");
		if("success".equals(addCandidateRequirementService.addCandidateRequirement(candidateReq)))
		{
			
			addCandidateRequirementService.setModeOfInterview(candidateReq);
			
			modelAndView.setViewName("hirerHome");
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value="listCandidateReq.html", method=RequestMethod.POST)
	public ModelAndView listCandidateRequirement(@ModelAttribute CandidateRequirement candidateReq ,HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
		
		return modelAndView;
	}
	////done
	@RequestMapping(value="editCandidateReq.html", method=RequestMethod.POST)
	public ModelAndView editCandidateRequirement(@ModelAttribute CandidateRequirement candidateReq ,HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("@");
		if("success".equals(editCandidateRequirementService.editCandidateRequirement(candidateReq)))
		{
			
			editCandidateRequirementService.setModeOfInterview(candidateReq);
			
			modelAndView.setViewName("hirerHome");
		}
		
		return modelAndView;
	}
	

	//done
	@RequestMapping(value="interviewSchedule.html", method=RequestMethod.POST)
	public ModelAndView interviewSchedule(@ModelAttribute InterviewSchedule interviewSchedule ,HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
	
		  try {
			Candidate can = new Candidate();
		CandidateRequirement candidateRequirement=new CandidateRequirement();
		
	    String interviewId=httpSession.getAttribute("reqId")+":"+httpSession.getAttribute("emailId");
	    int req=Integer.parseInt(""+httpSession.getAttribute("reqId"));
		
		candidateRequirement=interviewScheduleService.getRequirement(req);
		
		interviewSchedule.setInterviewId(interviewId);
		interviewSchedule.setRequirementId(req);
		
		
		Date date1=interviewScheduleService.closingDate(req);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	     Date date = new Date();  
	    String date2=formatter.format(date);
	  
	    Date date3 = formatter.parse(date2);
		
	    
	    
	    int maxNoCan=candidateRequirement.getMaxNoCan();
	    
	    maxNoCan=interviewScheduleService.getMaxNoCan(req);
	    
	    int reqVac=interviewScheduleService.getMaxNoCan(req);
	   
	    
	    
	   if("true".equals(interviewScheduleService.checkStatus(interviewSchedule.getInterviewId())))
        {
	    	if (date1.compareTo(date3) > 0)
	    	{
              if(maxNoCan<=(3*reqVac))
              {
            	 
            	  if("success".equals(interviewScheduleService.scheduleInterview(interviewSchedule)))
            	  {
		     
            		  	maxNoCan=maxNoCan+1;
            		    candidateRequirement.setMaxNoCan(maxNoCan);
            		    System.out.println(candidateRequirement.getMaxNoCan());
            		    interviewScheduleService.setMaxNoCan(candidateRequirement);
            		    
            		  modelAndView.setViewName("hirerHome");
            	  }
            	  else
            	  {
            		  return modelAndView;
            	  }
	    	
              }
              else
              {
            	  modelAndView.setViewName("MaxCandidateExceeded");
              }
	    	
           }
           else
           {
        	   modelAndView.setViewName("dateExpired");
           }
	   }
          
        else
	    {
	    	modelAndView.setViewName("alreadyScheduled");
	    }
          
	    } catch (ParseException e)
	    {
				// TODO Auto-generated catch block
	    	
				e.printStackTrace();
	     }
	
		
		 
		 
		
		  return modelAndView;
	}
	
	@RequestMapping(value="interviewObservation.html", method=RequestMethod.POST)
	public ModelAndView interviewObservation(@ModelAttribute InterviewObservation interviewObservation ,HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
		  String interviewId=httpSession.getAttribute("reqId")+":"+httpSession.getAttribute("candidateName");
		  interviewObservation.setInterviewId(interviewId);
		
		  if("success".equals(interviewObservationService.scheduleObservation(interviewObservation)))
		  {
			  
		  }
		
		return modelAndView;
	}
	
	
	

}
