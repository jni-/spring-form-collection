package ca.ulaval.glo4003.spring_form_collection.web.viewmodels;

import java.util.LinkedList;
import java.util.List;

public class CalculationsForm {

	public List<Calculation> calculations = new LinkedList<>();

	public List<Calculation> getCalculations() {
		return calculations;
	}

	public void setCalculations(List<Calculation> calculations) {
		this.calculations = calculations;
	}
}
