package com.hcl.air.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcl.air.domain.Deal;
import com.hcl.air.domain.Flight;
import com.hcl.air.forms.Form;
import com.hcl.air.service.LocationService;
import com.hcl.air.validator.SearchValidator;

@Controller
public class LocationController {
	private Logger logger = LoggerFactory.getLogger(LocationController.class);

	@Autowired
	private LocationService locationService;
	private SearchValidator validator;

	public SearchValidator getValidator() {
		return validator;
	}

	@Autowired
	public void setValidator(SearchValidator validator) {
		this.validator = validator;
	}

	@RequestMapping(value = "searchResultsJson", method = RequestMethod.GET)
	public @ResponseBody
	List<Flight> searchResultsJson(@RequestParam String leavingFrom,
			@RequestParam String goingTo, @RequestParam String startDate,
			@RequestParam String endDate) {
		Form form = new Form();

		form.setOrigin(leavingFrom);
		form.setDestination(goingTo);
		form.setStartDate(startDate);
		form.setReturnDate(endDate);
		
		return locationService.selectFlights(form);
	}

	@RequestMapping(value = "deals/{code}", method = RequestMethod.GET)
	public @ResponseBody
	List<Deal> deals(@PathVariable String code) {
		
		return locationService.selectDeals(code);
	}
}
