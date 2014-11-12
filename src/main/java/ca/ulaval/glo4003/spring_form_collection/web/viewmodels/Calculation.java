package ca.ulaval.glo4003.spring_form_collection.web.viewmodels;

public class Calculation {
	
	public Integer leftOperand;
	public Integer rightOperand;
	
	// Of course this could be a computed field. This is just to showcase 
	// handling a list of objects.
	public Integer result;

	public Integer getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(Integer leftOperand) {
		this.leftOperand = leftOperand;
	}

	public Integer getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(Integer rightOperand) {
		this.rightOperand = rightOperand;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}
}
