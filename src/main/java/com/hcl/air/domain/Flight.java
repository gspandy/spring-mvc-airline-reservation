package com.hcl.air.domain;

public class Flight {
	  
	private Long id;
	private String airline;
	private String startAirport;
	private String startTime;
	private String endAirport;
	private String endTime;
	private int stops;
	
	private String returnStartAirport;
	private String returnStartTime;
	private String returnEndAirport;
	private String returnEndTime;
	private int returnStops;
	
	private int price;
	
	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public Long getId() {
	    return id;
	}
	
	public void setId(Long id) {
	    this.id = id;
	}
	public String getStartAirport() {
		return startAirport;
	}

	public void setStartAirport(String startAirport) {
		this.startAirport = startAirport;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndAirport() {
		return endAirport;
	}

	public void setEndAirport(String endAirport) {
		this.endAirport = endAirport;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getStops() {
		return stops;
	}

	public void setStops(int stops) {
		this.stops = stops;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getReturnStartAirport() {
		return returnStartAirport;
	}

	public void setReturnStartAirport(String returnStartAirport) {
		this.returnStartAirport = returnStartAirport;
	}

	public String getReturnStartTime() {
		return returnStartTime;
	}

	public void setReturnStartTime(String returnStartTime) {
		this.returnStartTime = returnStartTime;
	}

	public String getReturnEndAirport() {
		return returnEndAirport;
	}

	public void setReturnEndAirport(String returnEndAirport) {
		this.returnEndAirport = returnEndAirport;
	}

	public String getReturnEndTime() {
		return returnEndTime;
	}

	public void setReturnEndTime(String returnEndTime) {
		this.returnEndTime = returnEndTime;
	}

	public int getReturnStops() {
		return returnStops;
	}

	public void setReturnStops(int returnStops) {
		this.returnStops = returnStops;
	}
	  
	  
}
