package kr.co.goott.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SurveyController {
	
	@RequestMapping(value = "survey/survey.choose", method =  RequestMethod.GET )
	public String step() {
		
		return "surveyForm";

	}
	
	@RequestMapping(value = "survey/survey.choose", method =  RequestMethod.POST )
	public String step2(HttpServletRequest req) {
		
		
		System.out.println(req.getParameter("a"));
		System.out.println(req.getParameter("b"));
		req.setAttribute("img",req.getParameter("a") );
		req.setAttribute("img",req.getParameter("b") );
		
		
		return "Submitted";

	}
	
	
}
