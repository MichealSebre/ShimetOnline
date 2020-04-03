package com.shimetonline.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@RequestMapping("home")
public class HomeController {

	@RequestMapping (method =  RequestMethod.GET)
	  public String index() {
		
		  return "home.index";  
	  }
}

