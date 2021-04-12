package com.web.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Courses {
	@RequestMapping("courses")
	public String course(@RequestParam("cname")String coursename, HttpServletRequest req) {
		//System.out.println("Courses class - Course method");
		req.setAttribute("cname", coursename);
		System.out.println("Course name chosen: "+coursename);
		return "myFile";
	}
}
