package com.hcl.air.forms;

import java.util.List;

import com.hcl.air.domain.Deal;
import com.hcl.air.domain.Flight;

public class Form {

	private String origin;
	private String destination;
	private String numberOfPassengers;
	private String startDate;
	private String returnDate;
	private Integer selectedFlight;
	private String selectedDestination;
	private Integer[] selectedDeals;
	private List<Deal> deals;
	private Flight flight;
	private String userId;
	
	public String getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(String numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public String getSelectedDestination() {
		return selectedDestination;
	}
	public void setSelectedDestination(String selectedDestination) {
		this.selectedDestination = selectedDestination;
	}
	
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public Integer getSelectedFlight() {
		return selectedFlight;
	}
	public void setSelectedFlight(Integer selectedFlight) {
		this.selectedFlight = selectedFlight;
	}
	
	public Integer[] getSelectedDeals() {
		return selectedDeals;
	}
	public void setSelectedDeals(Integer[] selectedDeals) {
		this.selectedDeals = selectedDeals;
	}
	
	public List<Deal> getDeals() {
		return deals;
	}
	public void setDeals(List<Deal> deals) {
		this.deals = deals;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
