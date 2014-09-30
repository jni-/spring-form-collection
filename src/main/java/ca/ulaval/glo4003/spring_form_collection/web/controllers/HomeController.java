package ca.ulaval.glo4003.spring_form_collection.web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	
	
}
