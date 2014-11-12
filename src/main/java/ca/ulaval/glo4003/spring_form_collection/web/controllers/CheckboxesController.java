package ca.ulaval.glo4003.spring_form_collection.web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ca.ulaval.glo4003.spring_form_collection.web.viewmodels.ProjectsForm;

@Controller
public class CheckboxesController {
	
	@ModelAttribute("selectedProjects")
	public ProjectsForm selectedProjects() {
		return new ProjectsForm();
	}

	@ModelAttribute("availableProjects")
	public List<String> availableProjects() {
		return Arrays .asList("Project 1", "Project 2", "Project 3", "Project 4");
	}

	@RequestMapping(value = "/checkboxes", method = RequestMethod.GET)
	public String checkboxes() {
		return "checkboxes";
	}

	@RequestMapping(value = "/checkboxes", method = RequestMethod.POST)
	public String checkboxes(
			@ModelAttribute("selectedProjects") ProjectsForm selectedProjects) {
		return "checkboxes";
	}

	@RequestMapping(value = "/checkboxes-manual", method = RequestMethod.GET)
	public String checkboxesManual() {
		return "checkboxes-manual";
	}

	@RequestMapping(value = "/checkboxes-manual", method = RequestMethod.POST)
	public String checkboxesManual(
			@ModelAttribute("selectedProjects") ProjectsForm selectedProjects) {
		return "checkboxes-manual";
	}
}
