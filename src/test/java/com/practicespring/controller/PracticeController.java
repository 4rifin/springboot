package com.practicespring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PracticeController {

	
	  @RequestMapping(value = "/")
	  public String show(HttpServletRequest request, HttpServletResponse response) {
		  System.out.println("TEsTBoroo");
		  return "index";

	  }
}
