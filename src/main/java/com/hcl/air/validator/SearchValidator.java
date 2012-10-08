package com.hcl.air.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hcl.air.forms.Form;

@Component
public class SearchValidator implements Validator {
	
	public boolean supports(Class<?> c) {
		return Form.class.isAssignableFrom(c);
	}
	
	public void validate(Object command, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startDate",
				"field.startDate.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "returnDate",
				"field.endDate.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "numberOfPassengers",
				"field.passengers.empty");
		
		Form usrBean = (Form) command;		
		if (usrBean.getNumberOfPassengers().equalsIgnoreCase("0") ||
			Integer.valueOf(usrBean.getNumberOfPassengers())<=0)
			errors.rejectValue("numberOfPassengers", "field.passengers.zero");			
		if (usrBean.getOrigin().equalsIgnoreCase(usrBean.getDestination()))
			errors.rejectValue("origin", "field.airports.same");
	}	
}