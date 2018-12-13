package com.kce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
   @RequestMapping(value="/",method = RequestMethod.GET )
   public String printWelcome(ModelMap model) {
      model.addAttribute("message", "MVC Framework!");
      return "Welcome";
   }
   @RequestMapping(value="/welcome",method = RequestMethod.GET )
   public ModelAndView printHello() {   
      return new ModelAndView("Welcome","message", "Spring MVC Framework!");
   }
}
