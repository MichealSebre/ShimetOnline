package com.shimitonline.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("admin/login")
public class LoignController {
     @RequestMapping(method=RequestMethod.GET)
	  public String index() {
		  return "admin.login.index";
	  }
     
     @RequestMapping(value="process", method=RequestMethod.POST)
	  public String process() {
		  return "redirect:/admin/dashboard";
	  }
}
