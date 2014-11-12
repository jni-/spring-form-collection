package ca.ulaval.glo4003.spring_form_collection.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ca.ulaval.glo4003.spring_form_collection.web.viewmodels.Calculation;
import ca.ulaval.glo4003.spring_form_collection.web.viewmodels.CalculationsForm;

@Controller
public class ListOfObjectsController {
	// This could have been dynamic, but it's faster this way.
	// Notice that it is only used to display the form (GET), the POST is abstract of this, 
	// so the point is proven anyways.
	private static final int NUMBER_OF_CALCULATION = 4;

	@ModelAttribute("calculationsForm")
	public CalculationsForm calculationsForm() {
		CalculationsForm form = new CalculationsForm();
		for (int i = 0; i < NUMBER_OF_CALCULATION; i++) {
			form.calculations.add(new Calculation());
		}
		return form;
	}

	@RequestMapping(value = "/list-of-objects", method = RequestMethod.GET)
	public String listOfObjects() {
		return "list-of-objects";
	}

	@RequestMapping(value = "/list-of-objects", method = RequestMethod.POST)
	public String computeResults(@ModelAttribute("calculationsForm") CalculationsForm calculationsForm) {
		for (Calculation calculation : calculationsForm.calculations) {
			if (operandsAreSpecified(calculation)) {
				calculation.result = calculation.leftOperand + calculation.rightOperand;
			}
		}
		return "list-of-objects";
	}

	private boolean operandsAreSpecified(Calculation calculation) {
		return calculation.leftOperand != null && calculation.rightOperand != null;
	}

}
