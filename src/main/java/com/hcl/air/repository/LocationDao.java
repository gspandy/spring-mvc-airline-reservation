package com.hcl.air.repository;

import java.util.List;

import com.hcl.air.domain.Deal;
import com.hcl.air.domain.Flight;
import com.hcl.air.domain.Location;
import com.hcl.air.forms.Form;

public interface LocationDao {
	
  Location selectById(long id);

  List<Location> selectAll();

  Long insert(Location location);

  void update(Location location);

  void delete(Location location);
  
  List<Flight> selectFlights(Form form);
  
  Flight selectFlightById(Integer id);
  
  List<Deal> selectDeals(String code);
  
  List<Deal> selectDealById(List id);
}
