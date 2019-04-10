package com.cts.InterviewSchedulingManagement.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.InterviewSchedulingManagement.bean.Candidate;
import com.cts.InterviewSchedulingManagement.service.LoginService;
import com.cts.InterviewSchedulingManagement.service.LoginServiceImpl;



@Controller
public class LoginController {
	
	@RequestMapping(value="Login.html", method=RequestMethod.GET)
	public String getLoginPage()
	{
		return "Login";
	}
	@RequestMapping(value="hirerHome.html", method=RequestMethod.GET)
	public String getHrHomePage()
	{
		return "hirerHome";
	}
	@RequestMapping(value="CandidateHome.html", method=RequestMethod.GET)
	public String getCandidatePage()
	{
		return "CandidateHome";
	}
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="Login.html", method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Candidate candidate, HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
		
		if("success".equals(loginService.authenticateCandidate(candidate)))
		{
			
			
			if(loginService.getUserType(candidate).equals("CANDIDATE"))
				{
		
			    httpSession.setAttribute("candidate",candidate);
				modelAndView.setViewName("CandidateHome");
				}
				else
				{
					if((loginService.getUserType(candidate)).equals("HIRER"))
					{
						//System.out.println(loginService.getCandidateNumber(candidate));
				    httpSession.setAttribute("candidate",candidate);
				    httpSession.setAttribute("candidateId", loginService.getCandidateNumber(candidate));
				    modelAndView.setViewName("hirerHome");
					}
				}
		
		}
		else
		{
			System.out.println("4");
			modelAndView.setViewName("Login");
		}
		
		return modelAndView;	
	}
	

}
