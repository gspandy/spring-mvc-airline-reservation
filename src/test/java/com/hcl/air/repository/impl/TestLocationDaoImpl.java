package com.hcl.air.repository.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.hcl.air.domain.Deal;
import com.hcl.air.domain.Flight;
import com.hcl.air.domain.Location;
import com.hcl.air.forms.Form;
import com.hcl.air.repository.LocationDao;

@ContextConfiguration("classpath:applicationContext.xml")
@TransactionConfiguration(transactionManager = "transactionManager1")
public class TestLocationDaoImpl extends AbstractTransactionalJUnit4SpringContextTests {
  private static final String CODE = "JFK";
  private static final String NAME = "John F Kennedy Intl";
  private static final String CITY = "New York";
  private static final String COUNTRY = "USA";

  @Autowired
  private LocationDao locationDao;

  @Autowired
  @Qualifier("dataSource1")
  @Override
  public void setDataSource(DataSource dataSource) {
    super.setDataSource(dataSource);
  }

  @Before
  public void setup() {
    deleteFromTables("airdb.location");

    Location location = null;

    location = new Location();
    location.setCode(CODE);
    location.setName(NAME);
    location.setCity(CITY);
    location.setCountry(COUNTRY);
    assertNotNull(locationDao.insert(location));
  }

  @Test
  public void testSelectAllLocations() {
    List<Location> locations = locationDao.selectAll();    
    assertEquals(true, locations.size()>0);
  }

  @Test
  public void testSelectLocationById() {
    List<Location> locations = locationDao.selectAll();

    Location location = locationDao.selectById(locations.get(0).getId());
    assertEquals(CODE, location.getCode());
    assertEquals(NAME, location.getName());
    assertEquals(CITY, location.getCity());
    assertEquals(COUNTRY, location.getCountry());
  }

  @Test
  public void testUpdateLocation() {
	  List<Location> locations = locationDao.selectAll();

    Location location = locations.get(0);
    final String code = "TST";
    final String name = "Test Name";
    final String city = "Timbaktu";
    final String country = "USA";
    
    location.setCode(code);
    location.setName(name);    
    location.setCity(city);
    location.setCountry(country);
    locationDao.update(location);
    location = locationDao.selectById(location.getId());
    assertEquals(code, location.getCode());
    assertEquals(name, location.getName());
    assertEquals(city, location.getCity());
    assertEquals(country, location.getCountry());
  	}
  	
  @Test
  public void testSelectFlights() {
	Form form = new Form();	
	List<Flight> flights = locationDao.selectFlights(form);    
	assertEquals(true, flights.size()>=0);
  }

  @Test
  public void testSelectDeals() {
	Form form = new Form();
	String id = "LHR";
	List<Deal> deals = locationDao.selectDeals(id);    
	assertEquals(true, deals.size()>=0);
  }
  
  }
